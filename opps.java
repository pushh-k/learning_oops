// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class Student{
    int Id;
    String Name;
    Student(int Id, String Name){
        this.Id=Id;
        this.Name=Name;
    }
    void display(){
         System.out.println("Id:"+Id);
         System.out.println("Name:"+Name);
        
    }
        void setter(String newName) {
        this.Name = newName;
        }
}


class Main {
    public static void main(String[] args) {
        Student s1=new Student(1, "Pushkar");
        Student s2=new Student(1, "Hello");
        Student s3=new Student(1, "World");
        Student s4=new Student(1, "coding");
        s1.display();
        s1.setter("MS");
        s1.display();
        s2.display();
        s3.display();
        s4.display();
       
        
    }
}