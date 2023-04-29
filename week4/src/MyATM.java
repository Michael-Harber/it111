public class MyATM {

    public static void main(String[]args) {

        int withdrawl, amount;
        withdrawl = 40;
        amount = 200;

        while(amount != 0){
         amount -= withdrawl;
//           amount = amount - withdrawl;
//            System.out.println("Your present amount after the withdrawl is " +amount+ " dollars");

            if(amount == 0){
                System.out.println("You have no money!!");
            } else {
                System.out.println("Your present amount after the withdrawl is " +amount+ " dollars");
            }

        } //end while loop

    }
}
