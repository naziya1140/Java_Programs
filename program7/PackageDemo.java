class PackageDemo {
    public static void main(String[] args) {
        Mercedes m1 = new Mercedes("Car", "Petrol", 45655, "Mercedes", "Mercedes-Benz C-Class");
        m1.showMercedesDetails();

        // OUTPUT
        // Vehicle constructor called (heirarchy-Level 1)
        // Car constructor called (hierarchy-Level 2)
        // Mercedes constructor called (hierarchy-Level 3)
        // Vehicle Type: Car
        // Fuel Type: Petrol
        // Vehicle Number: 45655
        // Brand: Mercedes
        // Model: Mercedes-Benz C-Class
    }
}

class Mercedes extends Car {
    String model;

    Mercedes(String vehicleType, String fuelType, int vehicleNumber, String brand, String model) {
        super(vehicleType, fuelType, vehicleNumber, brand);
        System.out.println("Mercedes constructor called (hierarchy-Level 3)");
        this.model = model;
    }

    void showMercedesDetails() {
        super.showCarDetails();
        System.out.println("Model: " + model);
    }
}
