package Chapter11ObjectOriented.Challenge1.Solution;

public class Employee {
    String name;
    String location;
    double salary;
    int age;

    Employee(String name,String location,double salary,int age){
        this.name=name;
        this.age=age;
        this.location=location;
        this.salary=salary;
    }
    void raiseSalary(){
        this.salary=salary+5000;
    }
}
