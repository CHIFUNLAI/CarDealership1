package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Vehicle {

    //Class Level Variables - Protect the data
    private int vehicleId;
    private String vehicleName;
    private String vehicleType;
    private int vehicleYear;
    private int vehiclePrice;

    //Constructor Method
    public Vehicle(int _vehicleId, String _vehicleName,  String _vehicleType, int _vehicleYear, int _vehiclePrice){
        this.vehicleId = _vehicleId;
        this.vehicleName = _vehicleName;
        this.vehicleType = _vehicleType;
        this.vehicleYear = _vehicleYear;
        this.vehiclePrice = _vehiclePrice;
    }

    //Setters and Getters
    public int getvehicleId() { return vehicleId; }
    public void setvehicleId(int _vehicleId) {this.vehicleId = _vehicleId;}

    public String getvehicleName() { return vehicleName; }
    public void setvehicleName(String _vehicleName) {this.vehicleName = _vehicleName;}

    public String getvehicleType() { return vehicleType; }
    public void setvehicleType(String _vehicleType) {this.vehicleType = _vehicleType;}

    public int getvehicleYear() { return vehicleYear; }
    public void setvehicleYear(int _vehicleYear) {this.vehicleYear = _vehicleYear;}

    public int getvehiclePrice() {return vehiclePrice; }
    public void setvehiclePrice(int _vehiclePrice) {this.vehiclePrice = _vehiclePrice;}

    public static void listVehicle(ArrayList<Vehicle> vList) {
        for (Vehicle vehicle: vList) {
            System.out.println("Vehicle ID " + vehicle.getvehicleId());
            System.out.println("Car Name: " + vehicle.getvehicleName());
            System.out.println("Car Type: " + vehicle.getvehicleType());
            System.out.println("Car Year: " + vehicle.getvehicleYear());
            System.out.println("Price: " + vehicle.getvehiclePrice());
        }
    }

}

