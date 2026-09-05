public class exp158 {
    public static void main(String args[]){
        Student s1= new Student();
        Student s2= new Student("Shubham");
        Student s3= new Student(123);
        //Student s4= new Student("sun",223); this will give an error cause their is o constructor that has these 2 parameters
        
    }
}

class Student {
    String name;
    int roll;

    Student(){
        System.out.println("constructor is called...");
    }
    Student(String name){
        this.name = name;
    }
    Student(int roll){
        this.roll = roll;
    }
}
