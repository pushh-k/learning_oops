// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class Student{
    int Id;
    String Name;
    Student(int Id, String Name){
        this.Id=Id;
        this.Name=Name;
    } void display(){
         System.out.println("Id:"+Id);
         System.out.println("Name:"+Name);
        
    }
}


class Main {
    public static void main(String[] args) {
        Student s1=new Student(1, "xyz");
        s1.display();
    }
}



