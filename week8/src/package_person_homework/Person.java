package package_person_homework;

public class Person {

    String name;

    int age;

    int car;

    boolean violations;

    double creditScore;

    public void display() {
        System.out.println("Customer Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Car Year: " + car);
        System.out.println("Violations: " + violations);
        System.out.println("Credit Score: " + creditScore);
    }

    public double getRate(double monthlyRate) {
        if (violations == true && creditScore <= 700) {
            monthlyRate = 500.00;
        } else {
            monthlyRate = 200.00;
        }
        return monthlyRate;
    }



    public int carAge(int carRate) {
        if (car >= 2016) {
           carRate = 100;
        } else {
            carRate = 50;
        }
        return carRate;
    }


}
