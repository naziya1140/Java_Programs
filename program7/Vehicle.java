class Vehicle {
    String vehicleType;
    String fuelType;
    int vehicleNumber;

    Vehicle(String vehicleType, String fuelType, int vehicleNumber) {
        System.out.println("Vehicle constructor called (heirarchy-Level 1)");
        this.vehicleType = vehicleType;
        this.fuelType = fuelType;
        this.vehicleNumber = vehicleNumber;
    }

    void showVehicleDetails() {
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Vehicle Number: " + vehicleNumber);
    }
}
