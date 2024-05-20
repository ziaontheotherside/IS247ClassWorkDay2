package Chapter11ObjectOriented.Challenge1.Solution;

public class Main {
    public static void main(String[] args) {
        Employee emp1=new Employee("shiva","USA",10000,30);
        System.out.println("Salary before raise: " +emp1.salary);
        emp1.raiseSlary();
        System.out.println("Salary after raise :" +emp1.salary);
    }
}
