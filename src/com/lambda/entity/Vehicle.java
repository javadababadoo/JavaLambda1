/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lambda.entity;

import java.util.Arrays;

/**
 *
 * @author Sebastian Molano - nebulae.com.co
 */
public class Vehicle {
    
private Integer modelYear;
private String vehicleManufacturerName;
private String vehMfrCode;
private String representedTestVehMake;
private String representedTestVehModel;
private String testVehicleID;
private String testVehConfigurationNumber;
private String testVehDisplacement;
private String actualTestedTestgroup;
private String vehicleType;
private Integer ratedHorsepower;
private String numberofCylindersandRotors;
private String engineCode;
private String testedTransmissionTypeCode;
private String testedTransmissionType;
private Integer numberofGears;
private String transmissionLockup;
private String driveSystemCode;
private String driveSystemDescription;
private String transmissionOverdriveCode;
private String transmissionOverdriveDesc;
private String equivalentTestWeight;
private String axleRatio;
private String nVRatio;
private String shiftIndicatorLightUseCd;
private String shiftIndicatorLightUseDesc;
private String testNumber;
private String testOriginator;
private String analyticallyDerivedFE;
private String aDFETestNumber;
private String aDFETotalRoadLoadHP;
private String aDFEEquivTestWeight;
private String aDFENVRatio;
private String testProcedureCd;
private String testProcedureDescription;
private String testFuelTypeCd;
private String testFuelTypeDescription;
private String testCategory;
private String thc;
private String co;
private String co2;
private String nox;
private String pm;
private String ch4;
private String nTowO;
private String rndAdjFe;
private String feUnit;
private String feBag1;
private String feBag2;
private String feBag3;
private String feBag4;
private String dtInertiaWorkRatioRating;
private String dtAbsoluteSpeedChangeRatg;
private String dtEnergyEconomyRating;
private String targetCoefA;
private String targetCoefB;
private String targetCoefC;
private String setCoefA;
private String setCoefB;
private String setCoefC;
private String aftertreatmentDeviceCd;
private String aftertreatmentDeviceDesc;
private String policeEmergencyVehicle;
private String averagingGroupID;
private String averagingWeightingFactor;
private String averagingMethodCd;
private String avergingMethodDesc;

    public Vehicle(String[] row) {        
        int i=0;        
        
        this.modelYear = Integer.parseInt(row[i++].replace("\"", ""));
        this.vehicleManufacturerName = row[i++].replace("\"", "");
        this.vehMfrCode = row[i++].replace("\"", "");
        this.representedTestVehMake = row[i++].replace("\"", "");
        this.representedTestVehModel = row[i++].replace("\"", "");
        this.testVehicleID = row[i++].replace("\"", "");
        this.testVehConfigurationNumber = row[i++].replace("\"", "");
        this.testVehDisplacement = row[i++].replace("\"", "");
        this.actualTestedTestgroup = row[i++].replace("\"", "");
        this.vehicleType = row[i++].replace("\"", "");
        try {
            this.ratedHorsepower = Integer.parseInt(row[i++].replace("\"", ""));
        } catch (Exception e) {
            this.ratedHorsepower = 0;
            System.out.println("WARN: "+vehicleManufacturerName+" "+representedTestVehModel+": malformated ratedHorsepower:"+row[i-1]);
        }
        this.numberofCylindersandRotors = row[i++].replace("\"", "");
        this.engineCode = row[i++].replace("\"", "");
        this.testedTransmissionTypeCode = row[i++].replace("\"", "");
        this.testedTransmissionType = row[i++].replace("\"", "");
        try {
            this.numberofGears = Integer.parseInt(row[i++].replace("\"", ""));
        } catch (Exception e) {
            this.numberofGears = 0;
            System.out.println("WARN: "+vehicleManufacturerName+" "+representedTestVehModel+": malformated numberofGears:"+row[i-1]);
        }
        this.transmissionLockup = row[i++].replace("\"", "");
        this.driveSystemCode = row[i++].replace("\"", "");
        this.driveSystemDescription = row[i++].replace("\"", "");
        this.transmissionOverdriveCode = row[i++].replace("\"", "");
        this.transmissionOverdriveDesc = row[i++].replace("\"", "");
        this.equivalentTestWeight = row[i++].replace("\"", "");
        this.axleRatio = row[i++].replace("\"", "");
        this.nVRatio = row[i++].replace("\"", "");
        this.shiftIndicatorLightUseCd = row[i++].replace("\"", "");
        this.shiftIndicatorLightUseDesc =row[i++].replace("\"", "");
        this.testNumber = row[i++].replace("\"", "");
        this.testOriginator = row[i++].replace("\"", "");
        this.analyticallyDerivedFE = row[i++].replace("\"", "");
        this.aDFETestNumber = row[i++].replace("\"", "");
        this.aDFETotalRoadLoadHP = row[i++].replace("\"", "");
        this.aDFEEquivTestWeight = row[i++].replace("\"", "");
        this.aDFENVRatio = row[i++].replace("\"", "");
        this.testProcedureCd = row[i++].replace("\"", "");
        this.testProcedureDescription = row[i++].replace("\"", "");
        this.testFuelTypeCd = row[i++].replace("\"", "");
        this.testFuelTypeDescription = row[i++].replace("\"", "");
        this.testCategory = row[i++].replace("\"", "");
        this.thc = row[i++].replace("\"", "");
        this.co = row[i++].replace("\"", "");
        this.co2 = row[i++].replace("\"", "");
        this.nox = row[i++].replace("\"", "");
        this.pm = row[i++].replace("\"", "");
        this.ch4 = row[i++].replace("\"", "");
        this.nTowO = row[i++].replace("\"", "");
        this.rndAdjFe = row[i++].replace("\"", "");
        this.feUnit = row[i++].replace("\"", "");
        this.feBag1 = row[i++].replace("\"", "");
        this.feBag2 = row[i++].replace("\"", "");
        this.feBag3 = row[i++].replace("\"", "");
        this.feBag4 = row[i++].replace("\"", "");
        this.dtInertiaWorkRatioRating = row[i++].replace("\"", "");
        this.dtAbsoluteSpeedChangeRatg = row[i++].replace("\"", "");
        this.dtEnergyEconomyRating = row[i++].replace("\"", "");
        this.targetCoefA = row[i++].replace("\"", "");
        this.targetCoefB = row[i++].replace("\"", "");
        this.targetCoefC = row[i++].replace("\"", "");
        this.setCoefA = row[i++].replace("\"", "");
        this.setCoefB = row[i++].replace("\"", "");
        this.setCoefC = row[i++].replace("\"", "");
        this.aftertreatmentDeviceCd = row[i++].replace("\"", "");
        this.aftertreatmentDeviceDesc = row[i++].replace("\"", "");
        this.policeEmergencyVehicle = row[i++].replace("\"", "");
        this.averagingGroupID = row[i++].replace("\"", "");
        this.averagingWeightingFactor = row[i++].replace("\"", "");
        this.averagingMethodCd = row[i++].replace("\"", "");
        this.avergingMethodDesc = row[i++].replace("\"", "");
    }

    /**
     * @return the modelYear
     */
    public Integer getModelYear() {
        return modelYear;
    }

    /**
     * @param modelYear the modelYear to set
     */
    public void setModelYear(Integer modelYear) {
        this.modelYear = modelYear;
    }

    /**
     * @return the vehicleManufacturerName
     */
    public String getVehicleManufacturerName() {
        return vehicleManufacturerName;
    }

    /**
     * @param vehicleManufacturerName the vehicleManufacturerName to set
     */
    public void setVehicleManufacturerName(String vehicleManufacturerName) {
        this.vehicleManufacturerName = vehicleManufacturerName;
    }

    /**
     * @return the vehMfrCode
     */
    public String getVehMfrCode() {
        return vehMfrCode;
    }

    /**
     * @param vehMfrCode the vehMfrCode to set
     */
    public void setVehMfrCode(String vehMfrCode) {
        this.vehMfrCode = vehMfrCode;
    }

    /**
     * @return the representedTestVehMake
     */
    public String getRepresentedTestVehMake() {
        return representedTestVehMake;
    }

    /**
     * @param representedTestVehMake the representedTestVehMake to set
     */
    public void setRepresentedTestVehMake(String representedTestVehMake) {
        this.representedTestVehMake = representedTestVehMake;
    }

    /**
     * @return the representedTestVehModel
     */
    public String getRepresentedTestVehModel() {
        return representedTestVehModel;
    }

    /**
     * @param representedTestVehModel the representedTestVehModel to set
     */
    public void setRepresentedTestVehModel(String representedTestVehModel) {
        this.representedTestVehModel = representedTestVehModel;
    }

    /**
     * @return the testVehicleID
     */
    public String getTestVehicleID() {
        return testVehicleID;
    }

    /**
     * @param testVehicleID the testVehicleID to set
     */
    public void setTestVehicleID(String testVehicleID) {
        this.testVehicleID = testVehicleID;
    }

    /**
     * @return the testVehConfigurationNumber
     */
    public String getTestVehConfigurationNumber() {
        return testVehConfigurationNumber;
    }

    /**
     * @param testVehConfigurationNumber the testVehConfigurationNumber to set
     */
    public void setTestVehConfigurationNumber(String testVehConfigurationNumber) {
        this.testVehConfigurationNumber = testVehConfigurationNumber;
    }

    /**
     * @return the testVehDisplacement
     */
    public String getTestVehDisplacement() {
        return testVehDisplacement;
    }

    /**
     * @param testVehDisplacement the testVehDisplacement to set
     */
    public void setTestVehDisplacement(String testVehDisplacement) {
        this.testVehDisplacement = testVehDisplacement;
    }

    /**
     * @return the actualTestedTestgroup
     */
    public String getActualTestedTestgroup() {
        return actualTestedTestgroup;
    }

    /**
     * @param actualTestedTestgroup the actualTestedTestgroup to set
     */
    public void setActualTestedTestgroup(String actualTestedTestgroup) {
        this.actualTestedTestgroup = actualTestedTestgroup;
    }

    /**
     * @return the vehicleType
     */
    public String getVehicleType() {
        return vehicleType;
    }

    /**
     * @param vehicleType the vehicleType to set
     */
    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    /**
     * @return the ratedHorsepower
     */
    public Integer getRatedHorsepower() {
        return ratedHorsepower;
    }

    /**
     * @param ratedHorsepower the ratedHorsepower to set
     */
    public void setRatedHorsepower(Integer ratedHorsepower) {
        this.ratedHorsepower = ratedHorsepower;
    }

    /**
     * @return the numberofCylindersandRotors
     */
    public String getNumberofCylindersandRotors() {
        return numberofCylindersandRotors;
    }

    /**
     * @param numberofCylindersandRotors the numberofCylindersandRotors to set
     */
    public void setNumberofCylindersandRotors(String numberofCylindersandRotors) {
        this.numberofCylindersandRotors = numberofCylindersandRotors;
    }

    /**
     * @return the engineCode
     */
    public String getEngineCode() {
        return engineCode;
    }

    /**
     * @param engineCode the engineCode to set
     */
    public void setEngineCode(String engineCode) {
        this.engineCode = engineCode;
    }

    /**
     * @return the testedTransmissionTypeCode
     */
    public String getTestedTransmissionTypeCode() {
        return testedTransmissionTypeCode;
    }

    /**
     * @param testedTransmissionTypeCode the testedTransmissionTypeCode to set
     */
    public void setTestedTransmissionTypeCode(String testedTransmissionTypeCode) {
        this.testedTransmissionTypeCode = testedTransmissionTypeCode;
    }

    /**
     * @return the testedTransmissionType
     */
    public String getTestedTransmissionType() {
        return testedTransmissionType;
    }

    /**
     * @param testedTransmissionType the testedTransmissionType to set
     */
    public void setTestedTransmissionType(String testedTransmissionType) {
        this.testedTransmissionType = testedTransmissionType;
    }

    /**
     * @return the numberofGears
     */
    public Integer getNumberofGears() {
        return numberofGears;
    }

    /**
     * @param numberofGears the numberofGears to set
     */
    public void setNumberofGears(Integer numberofGears) {
        this.numberofGears = numberofGears;
    }

    /**
     * @return the transmissionLockup
     */
    public String getTransmissionLockup() {
        return transmissionLockup;
    }

    /**
     * @param transmissionLockup the transmissionLockup to set
     */
    public void setTransmissionLockup(String transmissionLockup) {
        this.transmissionLockup = transmissionLockup;
    }

    /**
     * @return the driveSystemCode
     */
    public String getDriveSystemCode() {
        return driveSystemCode;
    }

    /**
     * @param driveSystemCode the driveSystemCode to set
     */
    public void setDriveSystemCode(String driveSystemCode) {
        this.driveSystemCode = driveSystemCode;
    }

    /**
     * @return the driveSystemDescription
     */
    public String getDriveSystemDescription() {
        return driveSystemDescription;
    }

    /**
     * @param driveSystemDescription the driveSystemDescription to set
     */
    public void setDriveSystemDescription(String driveSystemDescription) {
        this.driveSystemDescription = driveSystemDescription;
    }

    /**
     * @return the transmissionOverdriveCode
     */
    public String getTransmissionOverdriveCode() {
        return transmissionOverdriveCode;
    }

    /**
     * @param transmissionOverdriveCode the transmissionOverdriveCode to set
     */
    public void setTransmissionOverdriveCode(String transmissionOverdriveCode) {
        this.transmissionOverdriveCode = transmissionOverdriveCode;
    }

    /**
     * @return the transmissionOverdriveDesc
     */
    public String getTransmissionOverdriveDesc() {
        return transmissionOverdriveDesc;
    }

    /**
     * @param transmissionOverdriveDesc the transmissionOverdriveDesc to set
     */
    public void setTransmissionOverdriveDesc(String transmissionOverdriveDesc) {
        this.transmissionOverdriveDesc = transmissionOverdriveDesc;
    }

    /**
     * @return the equivalentTestWeight
     */
    public String getEquivalentTestWeight() {
        return equivalentTestWeight;
    }

    /**
     * @param equivalentTestWeight the equivalentTestWeight to set
     */
    public void setEquivalentTestWeight(String equivalentTestWeight) {
        this.equivalentTestWeight = equivalentTestWeight;
    }

    /**
     * @return the axleRatio
     */
    public String getAxleRatio() {
        return axleRatio;
    }

    /**
     * @param axleRatio the axleRatio to set
     */
    public void setAxleRatio(String axleRatio) {
        this.axleRatio = axleRatio;
    }

    /**
     * @return the nVRatio
     */
    public String getnVRatio() {
        return nVRatio;
    }

    /**
     * @param nVRatio the nVRatio to set
     */
    public void setnVRatio(String nVRatio) {
        this.nVRatio = nVRatio;
    }

    /**
     * @return the shiftIndicatorLightUseCd
     */
    public String getShiftIndicatorLightUseCd() {
        return shiftIndicatorLightUseCd;
    }

    /**
     * @param shiftIndicatorLightUseCd the shiftIndicatorLightUseCd to set
     */
    public void setShiftIndicatorLightUseCd(String shiftIndicatorLightUseCd) {
        this.shiftIndicatorLightUseCd = shiftIndicatorLightUseCd;
    }

    /**
     * @return the shiftIndicatorLightUseDesc
     */
    public String getShiftIndicatorLightUseDesc() {
        return shiftIndicatorLightUseDesc;
    }

    /**
     * @param shiftIndicatorLightUseDesc the shiftIndicatorLightUseDesc to set
     */
    public void setShiftIndicatorLightUseDesc(String shiftIndicatorLightUseDesc) {
        this.shiftIndicatorLightUseDesc = shiftIndicatorLightUseDesc;
    }

    /**
     * @return the testNumber
     */
    public String getTestNumber() {
        return testNumber;
    }

    /**
     * @param testNumber the testNumber to set
     */
    public void setTestNumber(String testNumber) {
        this.testNumber = testNumber;
    }

    /**
     * @return the testOriginator
     */
    public String getTestOriginator() {
        return testOriginator;
    }

    /**
     * @param testOriginator the testOriginator to set
     */
    public void setTestOriginator(String testOriginator) {
        this.testOriginator = testOriginator;
    }

    /**
     * @return the analyticallyDerivedFE
     */
    public String getAnalyticallyDerivedFE() {
        return analyticallyDerivedFE;
    }

    /**
     * @param analyticallyDerivedFE the analyticallyDerivedFE to set
     */
    public void setAnalyticallyDerivedFE(String analyticallyDerivedFE) {
        this.analyticallyDerivedFE = analyticallyDerivedFE;
    }

    /**
     * @return the aDFETestNumber
     */
    public String getaDFETestNumber() {
        return aDFETestNumber;
    }

    /**
     * @param aDFETestNumber the aDFETestNumber to set
     */
    public void setaDFETestNumber(String aDFETestNumber) {
        this.aDFETestNumber = aDFETestNumber;
    }

    /**
     * @return the aDFETotalRoadLoadHP
     */
    public String getaDFETotalRoadLoadHP() {
        return aDFETotalRoadLoadHP;
    }

    /**
     * @param aDFETotalRoadLoadHP the aDFETotalRoadLoadHP to set
     */
    public void setaDFETotalRoadLoadHP(String aDFETotalRoadLoadHP) {
        this.aDFETotalRoadLoadHP = aDFETotalRoadLoadHP;
    }

    /**
     * @return the aDFEEquivTestWeight
     */
    public String getaDFEEquivTestWeight() {
        return aDFEEquivTestWeight;
    }

    /**
     * @param aDFEEquivTestWeight the aDFEEquivTestWeight to set
     */
    public void setaDFEEquivTestWeight(String aDFEEquivTestWeight) {
        this.aDFEEquivTestWeight = aDFEEquivTestWeight;
    }

    /**
     * @return the aDFENVRatio
     */
    public String getaDFENVRatio() {
        return aDFENVRatio;
    }

    /**
     * @param aDFENVRatio the aDFENVRatio to set
     */
    public void setaDFENVRatio(String aDFENVRatio) {
        this.aDFENVRatio = aDFENVRatio;
    }

    /**
     * @return the testProcedureCd
     */
    public String getTestProcedureCd() {
        return testProcedureCd;
    }

    /**
     * @param testProcedureCd the testProcedureCd to set
     */
    public void setTestProcedureCd(String testProcedureCd) {
        this.testProcedureCd = testProcedureCd;
    }

    /**
     * @return the testProcedureDescription
     */
    public String getTestProcedureDescription() {
        return testProcedureDescription;
    }

    /**
     * @param testProcedureDescription the testProcedureDescription to set
     */
    public void setTestProcedureDescription(String testProcedureDescription) {
        this.testProcedureDescription = testProcedureDescription;
    }

    /**
     * @return the testFuelTypeCd
     */
    public String getTestFuelTypeCd() {
        return testFuelTypeCd;
    }

    /**
     * @param testFuelTypeCd the testFuelTypeCd to set
     */
    public void setTestFuelTypeCd(String testFuelTypeCd) {
        this.testFuelTypeCd = testFuelTypeCd;
    }

    /**
     * @return the testFuelTypeDescription
     */
    public String getTestFuelTypeDescription() {
        return testFuelTypeDescription;
    }

    /**
     * @param testFuelTypeDescription the testFuelTypeDescription to set
     */
    public void setTestFuelTypeDescription(String testFuelTypeDescription) {
        this.testFuelTypeDescription = testFuelTypeDescription;
    }

    /**
     * @return the testCategory
     */
    public String getTestCategory() {
        return testCategory;
    }

    /**
     * @param testCategory the testCategory to set
     */
    public void setTestCategory(String testCategory) {
        this.testCategory = testCategory;
    }

    /**
     * @return the thc
     */
    public String getThc() {
        return thc;
    }

    /**
     * @param thc the thc to set
     */
    public void setThc(String thc) {
        this.thc = thc;
    }

    /**
     * @return the co
     */
    public String getCo() {
        return co;
    }

    /**
     * @param co the co to set
     */
    public void setCo(String co) {
        this.co = co;
    }

    /**
     * @return the co2
     */
    public String getCo2() {
        return co2;
    }

    /**
     * @param co2 the co2 to set
     */
    public void setCo2(String co2) {
        this.co2 = co2;
    }

    /**
     * @return the nox
     */
    public String getNox() {
        return nox;
    }

    /**
     * @param nox the nox to set
     */
    public void setNox(String nox) {
        this.nox = nox;
    }

    /**
     * @return the pm
     */
    public String getPm() {
        return pm;
    }

    /**
     * @param pm the pm to set
     */
    public void setPm(String pm) {
        this.pm = pm;
    }

    /**
     * @return the ch4
     */
    public String getCh4() {
        return ch4;
    }

    /**
     * @param ch4 the ch4 to set
     */
    public void setCh4(String ch4) {
        this.ch4 = ch4;
    }

    /**
     * @return the nTowO
     */
    public String getnTowO() {
        return nTowO;
    }

    /**
     * @param nTowO the nTowO to set
     */
    public void setnTowO(String nTowO) {
        this.nTowO = nTowO;
    }

    /**
     * @return the rndAdjFe
     */
    public String getRndAdjFe() {
        return rndAdjFe;
    }

    /**
     * @param rndAdjFe the rndAdjFe to set
     */
    public void setRndAdjFe(String rndAdjFe) {
        this.rndAdjFe = rndAdjFe;
    }

    /**
     * @return the feUnit
     */
    public String getFeUnit() {
        return feUnit;
    }

    /**
     * @param feUnit the feUnit to set
     */
    public void setFeUnit(String feUnit) {
        this.feUnit = feUnit;
    }

    /**
     * @return the feBag1
     */
    public String getFeBag1() {
        return feBag1;
    }

    /**
     * @param feBag1 the feBag1 to set
     */
    public void setFeBag1(String feBag1) {
        this.feBag1 = feBag1;
    }

    /**
     * @return the feBag2
     */
    public String getFeBag2() {
        return feBag2;
    }

    /**
     * @param feBag2 the feBag2 to set
     */
    public void setFeBag2(String feBag2) {
        this.feBag2 = feBag2;
    }

    /**
     * @return the feBag3
     */
    public String getFeBag3() {
        return feBag3;
    }

    /**
     * @param feBag3 the feBag3 to set
     */
    public void setFeBag3(String feBag3) {
        this.feBag3 = feBag3;
    }

    /**
     * @return the feBag4
     */
    public String getFeBag4() {
        return feBag4;
    }

    /**
     * @param feBag4 the feBag4 to set
     */
    public void setFeBag4(String feBag4) {
        this.feBag4 = feBag4;
    }

    /**
     * @return the dtInertiaWorkRatioRating
     */
    public String getDtInertiaWorkRatioRating() {
        return dtInertiaWorkRatioRating;
    }

    /**
     * @param dtInertiaWorkRatioRating the dtInertiaWorkRatioRating to set
     */
    public void setDtInertiaWorkRatioRating(String dtInertiaWorkRatioRating) {
        this.dtInertiaWorkRatioRating = dtInertiaWorkRatioRating;
    }

    /**
     * @return the dtAbsoluteSpeedChangeRatg
     */
    public String getDtAbsoluteSpeedChangeRatg() {
        return dtAbsoluteSpeedChangeRatg;
    }

    /**
     * @param dtAbsoluteSpeedChangeRatg the dtAbsoluteSpeedChangeRatg to set
     */
    public void setDtAbsoluteSpeedChangeRatg(String dtAbsoluteSpeedChangeRatg) {
        this.dtAbsoluteSpeedChangeRatg = dtAbsoluteSpeedChangeRatg;
    }

    /**
     * @return the dtEnergyEconomyRating
     */
    public String getDtEnergyEconomyRating() {
        return dtEnergyEconomyRating;
    }

    /**
     * @param dtEnergyEconomyRating the dtEnergyEconomyRating to set
     */
    public void setDtEnergyEconomyRating(String dtEnergyEconomyRating) {
        this.dtEnergyEconomyRating = dtEnergyEconomyRating;
    }

    /**
     * @return the targetCoefA
     */
    public String getTargetCoefA() {
        return targetCoefA;
    }

    /**
     * @param targetCoefA the targetCoefA to set
     */
    public void setTargetCoefA(String targetCoefA) {
        this.targetCoefA = targetCoefA;
    }

    /**
     * @return the targetCoefB
     */
    public String getTargetCoefB() {
        return targetCoefB;
    }

    /**
     * @param targetCoefB the targetCoefB to set
     */
    public void setTargetCoefB(String targetCoefB) {
        this.targetCoefB = targetCoefB;
    }

    /**
     * @return the targetCoefC
     */
    public String getTargetCoefC() {
        return targetCoefC;
    }

    /**
     * @param targetCoefC the targetCoefC to set
     */
    public void setTargetCoefC(String targetCoefC) {
        this.targetCoefC = targetCoefC;
    }

    /**
     * @return the setCoefA
     */
    public String getSetCoefA() {
        return setCoefA;
    }

    /**
     * @param setCoefA the setCoefA to set
     */
    public void setSetCoefA(String setCoefA) {
        this.setCoefA = setCoefA;
    }

    /**
     * @return the setCoefB
     */
    public String getSetCoefB() {
        return setCoefB;
    }

    /**
     * @param setCoefB the setCoefB to set
     */
    public void setSetCoefB(String setCoefB) {
        this.setCoefB = setCoefB;
    }

    /**
     * @return the setCoefC
     */
    public String getSetCoefC() {
        return setCoefC;
    }

    /**
     * @param setCoefC the setCoefC to set
     */
    public void setSetCoefC(String setCoefC) {
        this.setCoefC = setCoefC;
    }

    /**
     * @return the aftertreatmentDeviceCd
     */
    public String getAftertreatmentDeviceCd() {
        return aftertreatmentDeviceCd;
    }

    /**
     * @param aftertreatmentDeviceCd the aftertreatmentDeviceCd to set
     */
    public void setAftertreatmentDeviceCd(String aftertreatmentDeviceCd) {
        this.aftertreatmentDeviceCd = aftertreatmentDeviceCd;
    }

    /**
     * @return the aftertreatmentDeviceDesc
     */
    public String getAftertreatmentDeviceDesc() {
        return aftertreatmentDeviceDesc;
    }

    /**
     * @param aftertreatmentDeviceDesc the aftertreatmentDeviceDesc to set
     */
    public void setAftertreatmentDeviceDesc(String aftertreatmentDeviceDesc) {
        this.aftertreatmentDeviceDesc = aftertreatmentDeviceDesc;
    }

    /**
     * @return the policeEmergencyVehicle
     */
    public String getPoliceEmergencyVehicle() {
        return policeEmergencyVehicle;
    }

    /**
     * @param policeEmergencyVehicle the policeEmergencyVehicle to set
     */
    public void setPoliceEmergencyVehicle(String policeEmergencyVehicle) {
        this.policeEmergencyVehicle = policeEmergencyVehicle;
    }

    /**
     * @return the averagingGroupID
     */
    public String getAveragingGroupID() {
        return averagingGroupID;
    }

    /**
     * @param averagingGroupID the averagingGroupID to set
     */
    public void setAveragingGroupID(String averagingGroupID) {
        this.averagingGroupID = averagingGroupID;
    }

    /**
     * @return the averagingWeightingFactor
     */
    public String getAveragingWeightingFactor() {
        return averagingWeightingFactor;
    }

    /**
     * @param averagingWeightingFactor the averagingWeightingFactor to set
     */
    public void setAveragingWeightingFactor(String averagingWeightingFactor) {
        this.averagingWeightingFactor = averagingWeightingFactor;
    }

    /**
     * @return the averagingMethodCd
     */
    public String getAveragingMethodCd() {
        return averagingMethodCd;
    }

    /**
     * @param averagingMethodCd the averagingMethodCd to set
     */
    public void setAveragingMethodCd(String averagingMethodCd) {
        this.averagingMethodCd = averagingMethodCd;
    }

    /**
     * @return the avergingMethodDesc
     */
    public String getAvergingMethodDesc() {
        return avergingMethodDesc;
    }

    /**
     * @param avergingMethodDesc the avergingMethodDesc to set
     */
    public void setAvergingMethodDesc(String avergingMethodDesc) {
        this.avergingMethodDesc = avergingMethodDesc;
    }

    @Override
    public String toString() {
        return representedTestVehModel;
    }

    

    
}
