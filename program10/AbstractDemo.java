abstract class Phone {
    void on() {
        System.out.println("Turning on Phone");
    }

    abstract void playMusic(); //to be implemented by the one who extends it.
}

class SmartPhone extends Phone {
    void playMusic() {
        System.out.println("Playing music on SmartPhone");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        // Phone obj = new Phone(); error: Phone is abstract; cannot be instantiated.

        // even if phone has no undelcared method but it cannot have objects as it is
        // considered as an abstract class.

        SmartPhone obj = new SmartPhone();
        obj.playMusic();
    }
}
