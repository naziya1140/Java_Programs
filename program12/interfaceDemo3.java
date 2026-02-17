//This file is to show sets of all possible types of method and variable types. 

interface Vehicle{
    //An Interface cannot have constructor.

    int x = 10; //by default public staic final.

    //private Method
    private void aboutVehicle(){
        System.out.println("A vehicle is a machine designed for self-propulsion");
    }

    //default method
    default void run(){
        System.out.println("Every vehicle runs");
    }

    //static method
    static void about(){
        System.out.println("It has been created so that vehical can implement this class.");
    }

    abstract int mileage();//by default public.
    abstract int maxSpeed();
}

class Bike implements Vehicle{
    int speed, mileageVal;

    Bike(int speed, int mileageVal){
        this.speed = speed;
        this.mileageVal = mileageVal;
    }

    public int maxSpeed(){
        return speed;
    }

    public int mileage(){
        return mileageVal;
    }
}


public interface InterfaceDemo3 {
    //Above one is interface and we can have main method because it is both public and static ( follows criteria of methods of interface)
    public static void main(){
        Vehicle.about(); //calling static methods with the name of the vehicle.

        Bike yamahaBike = new Bike(180, 45);
        yamahaBike.run();
        System.out.println(yamahaBike.maxSpeed());
        System.out.println(yamahaBike.mileage());
    }
}