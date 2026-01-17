class Car extends Vehicle {
    String brand; 

    Car(String vehicleType, String fuelType, int vehicleNumber, String brand) {
        super(vehicleType, fuelType, vehicleNumber); 
        System.out.println("Car constructor called (hierarchy-Level 2)");
        this.brand = brand;
    }

    void showCarDetails() {
        super.showVehicleDetails();
        System.out.println("Brand: " + brand);
    }
}