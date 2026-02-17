interface Phone {
    void turnOn();
    void setAlarm();
}

interface SmartPhone extends Phone {
    void playMusic();
}

class Samsung implements SmartPhone{
    //  In Java, all interface methods are implicitly public.
    // So when a class implements an interface, the implemented methods must also be public.
    //one cannot reduce the visibility.

    public void turnOn(){
        System.out.println("Samsung turned on");
    }
    
    public void setAlarm(){
        System.out.println("Setting Alarm on Samsung");
    }

    public void playMusic(){
        System.out.println("Playing Music on samsung");
    }
}

public class InterfaceDemo1 {
    public static void main(String args[]){
        Samsung galaxy = new Samsung();
        galaxy.playMusic();


        //eg2
        // C obj = new C();
        // obj.eat();
    }    
}
