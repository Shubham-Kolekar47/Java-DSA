public class exp163 {
    public static void main(String args[]){
        dog d1 = new dog();
        d1.eat();
        d1.legs=4;
        System.out.println(d1.legs);
    }
}

class Animal{//base class
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breath(){
        System.out.println("breathes");
    }
}

class Mammal extends Animal{
    void walks(){
        System.out.println("walks");
    }
}

class fish extends Animal{
    void swim(){
        System.out.println("swims");
    }
}

class bird extends Animal{
    void fly(){
        System.out.println("flies");
    }
}
