import java.util.Scanner;

public class ExpandingDailySpecialsFinal {

    public static void main(String[] args) {

        String specials;
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a day of the week excluding weekends (Monday thru Friday only!)");

        specials = input.next();

        String coffee = "";
        double price = 0;
        int amount = 0;
        double discount = 0;
        double bigDiscount = 0;

        boolean saturday = specials.equals("Saturday") , sunday = specials.equals("Sunday") ;
        
        while (saturday || sunday) {
            System.out.println("Please enter a weekday, not weekend!");
            specials = input.next();


            switch (specials) {

                case "Monday" -> {
                    coffee = "Latte";
                    price = 4.95;
                    discount = 4.45;
                    bigDiscount = 3.96;
                    System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
                    System.out.println("How many " + coffee + "s would you like to order?");
                    amount = input.nextInt();


                }

                case "Tuesday" -> {
                    coffee = "Frapp";
                    price = 5.95;
                    discount = 5.35;
                    bigDiscount = 4.76;
                    System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
                    System.out.println("How many " + coffee + "'s would you like to order?");
                    amount = input.nextInt();

                }

                case "Wednesday" -> {
                    coffee = "Cappuccino";
                    price = 4.35;
                    discount = 3.91;
                    bigDiscount = 3.48;
                    System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
                    System.out.println("How many " + coffee + "'s would you like to order?");
                    amount = input.nextInt();

                }

                case "Thursday" -> {
                    coffee = "Regular Joe";
                    price = 2.95;
                    discount = 2.65;
                    bigDiscount = 2.36;
                    System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
                    System.out.println("How many " + coffee + "'s would you like to order?");
                    amount = input.nextInt();

                }

                case "Friday" -> {
                    coffee = "Green Tea Latte";
                    price = 6.95;
                    discount = 6.25;
                    bigDiscount = 5.56;
                    System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
                    System.out.println("How many " + coffee + "'s would you like to order?");
                    amount = input.nextInt();

                }
            }


            if (amount == 0) {
                System.out.println("Guess you don't like " + coffee + "s!");
            } else if (amount == 1) {
                System.out.println("Looks like you'll only be ordering " + amount + " " + coffee + "!");
            } else if (amount <= 4) {
                System.out.println(amount + " " + coffee + "s have been ordered totalling");
                System.out.printf("%.2f", price * amount);
            } else if (amount <= 9){
                System.out.println(amount + " " + coffee + "s have been ordered, giving you a 10% group discount totalling: ");
                System.out.printf("%.2f", discount * amount);
            } else {
                System.out.println(amount + " " + coffee + "s have been ordered, giving you a 20% group discount totalling: ");
                System.out.printf("%.2f", bigDiscount * amount);
            }




        }
    }
}

