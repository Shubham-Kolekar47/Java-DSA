public class exp165 {
    public static void main(String args[]){
        deer d1 = new deer();
        d1.eat();
    }
}

class Animal{
    void eat(){
        System.out.println("eats anything");
    }
}

class deer extends Animal{
    void eat(){
        System.out.println("eats grass");
    }
}