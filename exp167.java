public class exp167 {
    public static void main(String[] args) {
        horse h1 = new horse();
        h1.eat();
        h1.walk();
        System.out.println(h1.color);

        chicken c1 = new chicken();
        c1.eat();
        c1.walk();
    }
}

abstract class Animal{
    String color;

    Animal(){
        color = "peach";
    }
    void eat(){
        System.out.println("animal eats");
    }

    abstract void walk();
}

class horse extends Animal{
    void changeColor(){
        color = "dark brown";
    }
    void walk(){
        System.out.println("walks in 4 legs");
    }
}

class chicken extends Animal{
    void changeColor(){
        color = "black";
    }
    void walk(){
        System.out.println("walks on 2 legs");
    }
}