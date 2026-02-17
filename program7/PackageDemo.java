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

