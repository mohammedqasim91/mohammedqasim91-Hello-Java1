import java.time.Duration;
import java.util.Arrays;

public class Loops {
    public static void main(String[] args) {
        int[] pages = {1, 2, 3};
        System.out.println(Arrays.toString( pages));

        int[] moreNumbers = new int[6];
        System.out.println(Arrays.toString(moreNumbers));


        String[] names = new String[5];
        names[0] = "Mohammed";
        names[0] = "Ali";
        names[0] = "Fatema";

        names[1] = "James";
        names[2] = "Richard";
        names[3] = "Mary";
        names[4] = "Rymond";
        System.out.println(Arrays.toString( names));

        System.out.println("The arrays is of length: "+ names.length);
        System.out.println("The first element of the array is: "+ names[0]);

        // Loop For

        System.out.println("================");


        System.out.println("For i loop");
        for (int i = 0; i <3 ; i++) {
            System.out.println("Hello");
            System.out.println("i value is: " + i);
        }

        for (int i = 0; i < names.length ; i++) {
            if (names[i].equals("Rymond")){
                System.out.println(names[i].toUpperCase());
            }  else if (names[i].equals("Ali")) {
                continue;
            }   else {
                System.out.println(names[i]);
            }
        }

        //ToDo : bug fixed

        String[] days = {"Monday", "tUESDay", "wEDNESDAY"};
        for (String day : days) {
            String oldDay = day.toLowerCase();
            String newDay = Character.toUpperCase(day.charAt(0))
                    + day.substring(1).toLowerCase();

            System.out.println("Old Value : " + oldDay);
            System.out.println("New Value : " + newDay);
        }

        for ( int counter = 10; counter >= 0; counter--) {
            System.out.println(counter);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Time to Start working on The lab!!");

        System.out.println("For each loop");
        for (String name :names){
            System.out.println(name);
            if (name.equals("Rymond")){
                System.out.println(name.toUpperCase());
            }  else if (name.equals("Ali")) {
               continue;
            }   else {
                System.out.println(name);
            }
        }

        for (int page : pages){
            System.out.println(page);
        }

        // While For

        System.out.println("================");

        System.out.println("While loop");
        int index = 10;
        while (index < 3){
            System.out.println(index);
            index++;   // index = index +1  // index +=1;

        }

        System.out.println("Do While loop");
        int index2 = 10;
        do {
            System.out.println(index2);
            index2 += 1;
        }   while (index2 < 3);

    }
}
