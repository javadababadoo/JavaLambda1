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
//
        try (Stream<String> lines = Files.lines(Paths.get("c:/temp", "temp.csv"));) {
            vehicleList = lines.skip(1)
                    .map(line -> line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)"))
                    .map(lineArray -> new Vehicle(lineArray))
                    .collect(Collectors.toList());

            System.out.println("vehicleList -> " + vehicleList.size());

            System.out.println("");
            System.out.println("");
//            vehicleList.stream()
//                    .filter(vehicle -> vehicle.getVehicleType().trim().toLowerCase().equals("car"))
//                    .filter(vehicle -> vehicle.getRatedHorsepower()  >= 100 & vehicle.getRatedHorsepower() <= 160)
//                    .filter(vehicle -> vehicle.getDriveSystemDescription().contains("2-Wheel Drive, Rear"))
//                    .sorted((vehicle1, vehicle2) -> Integer.compare(vehicle1.getRatedHorsepower(), vehicle2.getRatedHorsepower())).
//                    .forEach(vehicle -> System.out.println(vehicle.getVehicleType() + " --- "+ vehicle.getVehicleManufacturerName() + " --- "+ vehicle.getRepresentedTestVehModel()+ " ---- "+ vehicle.getRatedHorsepower() + " --- "+ vehicle.getDriveSystemDescription()+ " --- "+ vehicle.getRatedHorsepower()));

//            System.out.println("");
//            System.out.println("");
//            System.out.println("====== Models per manufacturer ======");
//            vehicleList.stream().collect(Collectors.groupingBy(Vehicle::getVehicleManufacturerName)).forEach((manufacturer, vehicle1List) -> {
//                System.out.println(manufacturer + ": ");
//                vehicle1List.stream().
//                        .forEach(vehicle -> System.out.print(vehicle.getRepresentedTestVehModel()+", "));
//            });
//            System.out.println("");
//            System.out.println("");
//            System.out.println("====== Vehicles per number of gears ======");
//            vehicleList.stream().collect(Collectors.groupingBy(Vehicle::getNumberofGears, Collectors.counting())).forEach((key, value) -> System.out.println(key + " -> " + value));
            System.out.println("====== TOP 10  ======");
            vehicleList.stream()
                    .collect(Collectors.groupingBy(Vehicle::getVehicleManufacturerName))
                    .forEach((manufacturer, vehicles) -> System.out.println(manufacturer + " -> " + Arrays.toString(vehicles.stream().filter(distinctByKey((vehicle) -> vehicle.getRepresentedTestVehModel())).collect(Collectors.toList()).toArray())));

//            for (Vehicle vehicle : collect) {
//                //representedTestVehModel
//                System.out.println("Vehicle: " + vehicle.getTestedTransmissionType());
//            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static <T> Predicate<T> distinctByKey(Function<? super T, Object> keyExtractor) {
        Map<Object, Boolean> seen = new ConcurrentHashMap<>();
        return t -> seen.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
    }
}
