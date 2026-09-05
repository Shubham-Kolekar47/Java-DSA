public class exp156 {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        p1.color = "Yellow";
        System.out.println(p1.getColor());
    }
}

class Pen{
    Private String color;
    Private int tip;

    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }

    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}
