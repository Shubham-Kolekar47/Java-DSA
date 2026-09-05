public class exp161 {
    public static void main(String args[]){
        fish f1 = new fish();
        f1.eat();
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

//derived class
class fish extends Animal{
    int fins;

    void swim(){
        System.out.println("Swimming");
    }
}
