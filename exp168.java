public class exp168 {
    public static void main(String[] args) {
        Mustang myHorse = new Mustang();
    }
}

abstract class Animal{
    String color;

    Animal(){
        System.out.println("Animal constructor called...");
    }
    void eat(){
        System.out.println("animal eats");
    }

    abstract void walk();
}

class horse extends Animal{
    horse(){
        System.out.println("horse constructor called");
    }
    void changeColor(){
        color = "dark brown";
    }
    void walk(){
        System.out.println("walks in 4 legs");
    }
}

class Mustang extends horse{
    Mustang(){
        System.out.println("Mustang constructor is called");
    }
}
