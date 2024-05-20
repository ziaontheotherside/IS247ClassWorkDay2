package Chapter11ObjectOriented;

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
    void raiseSlary(){
        this.salary=salary+5000;
    }
}
