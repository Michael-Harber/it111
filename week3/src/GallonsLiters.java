public class GallonsLiters {

    public static void main(String[] args) {

        double gal, lit;
        int counter = 1;

        for (gal = 1; gal <= 100; gal = gal + 3) {
            lit = gal * 3.785;



                if (gal <= 1) {
                    System.out.printf("%.2f", lit);
                    System.out.println(" Liters = " + gal + " Gallon");
                } else {
                    System.out.printf("%.2f", lit);
                    System.out.println(" Liters = " + gal + " Gallons");
                    counter += 1;

                 if (counter >= 5){
                     System.out.println( );
                     counter = 0;

                 }

                }


            }

        }
    }




