/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lambda;

import com.lambda.entity.Vehicle;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author PC
 */
public class VehicleTest {

    private List<Vehicle> vehicleList;

    public void execute() {
        //Paths.get("c:/temp", "temp.csv") -- WINDOWS
        //Paths.get("/home/nesas-02/", "temp.csv") -- LINUX
        try (Stream<String> lines = Files.lines(Paths.get("/home/nesas-ing/Downloads", "16tstcar.csv"));) {
            vehicleList = lines.skip(1)
                    .map(line -> line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)"))
                    .map(lineArray -> new Vehicle(lineArray))
                    .collect(Collectors.toList());

            System.out.println("vehicleList -> " + vehicleList.size());

            System.out.println("");
            System.out.println("");
            System.out.println("===== Cars with horsepower between 100 and 160, rear wheel drive sorted by horsepower - 1=========");
            vehicleList.stream()
                    .filter(vehicle -> vehicle.getVehicleType().trim().toLowerCase().equals("car"))
                    .filter(vehicle -> vehicle.getRatedHorsepower() >= 100 & vehicle.getRatedHorsepower() <= 160)
                    .filter(vehicle -> vehicle.getDriveSystemDescription().contains("2-Wheel Drive, Rear"))
                    .sorted((vehicle1, vehicle2) -> Integer.compare(vehicle1.getRatedHorsepower(), vehicle2.getRatedHorsepower()))
                    .forEach(vehicle -> System.out.println(vehicle.getVehicleType() + " --- " + vehicle.getVehicleManufacturerName() + " --- " + vehicle.getRepresentedTestVehModel() + " ---- " + vehicle.getRatedHorsepower() + " --- " + vehicle.getDriveSystemDescription() + " --- " + vehicle.getRatedHorsepower()));

            System.out.println("");
            System.out.println("");
            System.out.println("====== Models per manufacturer - 2======");
            vehicleList.stream().collect(Collectors.groupingBy(Vehicle::getVehicleManufacturerName)).forEach((manufacturer, vehicle1List) -> {
                System.out.println(manufacturer + ": ");
                vehicle1List.stream()
                        .forEach(vehicle -> System.out.print(vehicle.getRepresentedTestVehModel() + ", "));
            });
            System.out.println("");
            System.out.println("");
            System.out.println("====== Vehicles per number of gears - 3======");
            vehicleList.stream().collect(Collectors.groupingBy(Vehicle::getNumberofGears, Collectors.counting())).forEach((key, value) -> System.out.println(key + " -> " + value));
            System.out.println("====== TOP 10  ======");
            vehicleList.stream()
                    .collect(Collectors.groupingBy(Vehicle::getVehicleManufacturerName))
                    .forEach((manufacturer, vehicles) -> System.out.println(manufacturer + " -> " + Arrays.toString(vehicles.stream().filter(distinctByKey((vehicle) -> vehicle.getRepresentedTestVehModel())).collect(Collectors.toList()).toArray())));

            System.out.println("");
            System.out.println("");
            System.out.println("====== TOP 10 - Vehicles with more horsepower - 4 ======");

            List<Vehicle> vehiclesRatedHorsePowerList = new ArrayList<>();

            vehicleList.stream().collect(Collectors.groupingBy(vehicle -> vehicle.getVehicleManufacturerName()))
                    .forEach((manufacturer, vehicles) -> vehicles.stream().collect(Collectors.maxBy((vehicle1, vehicle2) -> vehicle1.getRatedHorsepower() - vehicle2.getRatedHorsepower())).ifPresent((vehicleMaxHorsePower) -> vehiclesRatedHorsePowerList.add(vehicleMaxHorsePower)));
            vehiclesRatedHorsePowerList.stream().sorted((vehicleHP1, vehicleHP2) -> vehicleHP2.getRatedHorsepower() - vehicleHP1.getRatedHorsepower()).limit(10).forEach(vehicle -> System.out.println(vehicle.getVehicleManufacturerName() + " " + vehicle.getRepresentedTestVehModel() + " " + vehicle.getRatedHorsepower()));

            System.out.println("");
            System.out.println("");
            System.out.println("====== # Models per manufacturer - 5 ======");
            vehicleList.stream()
                    .collect(Collectors.groupingBy(Vehicle::getVehicleManufacturerName))
                    .forEach((manufacturer, vehicles)
                            -> vehicles.stream()
                            .collect(Collectors.groupingBy(Vehicle::getRepresentedTestVehModel, Collectors.counting()))
                            .forEach((key, value) -> System.out.println(manufacturer + ": " + key + " => " + value)));
            System.out.println("");
            System.out.println("");
            System.out.println("====== TOP 10 - Brands with more vehicles with 6-speed manual gearbox - 6 ======");

            vehicleList.stream()
                    .filter(vehicle -> vehicle.getTestedTransmissionType().trim().toLowerCase().equals("manual"))
                    .filter(vehicle -> vehicle.getNumberofGears() == 6)
                    .collect(Collectors.groupingBy(Vehicle::getVehicleManufacturerName, Collectors.counting()))
                    .entrySet().stream().
                    sorted((cantidad1, cantidad2) -> Long.compare(cantidad2.getValue(), cantidad1.getValue()))
                    .limit(10).forEach((valor) -> System.out.println(valor.getKey() + ": " + valor.getValue()));

    
            System.out.println("");
            System.out.println("");
            System.out.println("====== Vehicles with more rated horsepower ======");
            vehicleList.stream()
                    .collect(Collectors.groupingBy((vehicle) -> vehicle.getVehicleManufacturerName())).entrySet().stream()
                    .forEach(
                            (vehiclesByManufacturer) -> vehiclesByManufacturer.getValue().stream()
                            .collect(Collectors.groupingBy(vehicle -> Math.ceil(((double) vehicle.getRatedHorsepower() / 100d)) <= 3 ? Math.ceil(((double) vehicle.getRatedHorsepower() / 100d)) : 4))
                            .forEach((key, value) -> System.out.println(vehiclesByManufacturer.getKey() + " ======> " + key + " ---- " + value.size()))
                    );

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static <T> Predicate<T> distinctByKey(Function<? super T, Object> keyExtractor) {
        Map<Object, Boolean> seen = new ConcurrentHashMap<>();
        return t -> seen.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
    }
}
