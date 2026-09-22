public class exp162 {
    public static void main(String args[]){
        dog d1 = new dog();
        d1.eat();
        d1.legs =4;
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
    int legs;
}

class dog extends Mammal{
    String bread;
}
