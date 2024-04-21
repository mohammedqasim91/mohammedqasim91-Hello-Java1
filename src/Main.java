import java.util.Locale;

public class Main {
    public static void main(String[] args) {
       String myFavoriteTea = "Oolong tea";
       int amountOfTeaSpoonsToUse = 2;
       System.out.println("My favorite tea is " + myFavoriteTea);
       System.out.println("I use " + amountOfTeaSpoonsToUse + " tea spoons of " + myFavoriteTea);
       boolean isTeaBrewed = true;
       if (!isTeaBrewed == true) {
           System.out.println("Let brew some tea!");
       } else  {
           System.out.println("Great time to sip a bit of it");
       }

       double teaPrice = 14;

       if (teaPrice < 7.5) {
           System.out.println("Its on discount lets buy it!");
       } else if (teaPrice <= 10.99 ) {
           System.out.println("It agood price we can buy it!");
       } else if (teaPrice < 10.00 && teaPrice < 13.50) {
           System.out.println("mmm it a bit overpriced!");
       } else {
           System.out.println("waaay to overpriced");
       }


    }

}