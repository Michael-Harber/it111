package package_person_homework;

public class PersonDetails {

    public static void main(String[]args){
         Person firstPerson;
         Person secondPerson;

         firstPerson = new Person();
         secondPerson = new Person();


        firstPerson.name = "Cathy";
        firstPerson.age = 33;
        firstPerson.car = 2010;
        firstPerson.violations = false;
        firstPerson.creditScore = 690;


        secondPerson.name = "Kendall";
        secondPerson.age = 22;
        secondPerson.car = 2019;
        secondPerson.violations = true;
        secondPerson.creditScore = 670;

        double monthlyRate = 0;
        double adjustedRate = 0;
        int carRate = 0;

        firstPerson.display();
        System.out.println(firstPerson.getRate(monthlyRate) + firstPerson.carAge(carRate) + " dollars");

        System.out.println();

        secondPerson.display();
        System.out.println(secondPerson.getRate(monthlyRate) + secondPerson.carAge(carRate) + " dollars");




    }




}
