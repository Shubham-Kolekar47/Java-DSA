public class exp171 {
    public static void main(String[] args) {
        horse h1 = new horse();
        System.out.println(h1.color);
    }
}

class Animal{
    String color;
    Animal(){
        System.out.println("animal constructor is called");
    }
}

class horse extends Animal {
    horse(){
        super.color="brown";
        System.out.println("horse constructor is called");
    }
}