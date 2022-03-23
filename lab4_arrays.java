import java.util.Scanner;
import java.util.Arrays;

public class lab4_arrays{
    public static void main (String[] args){

        int records = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("How many records would you like to enter (max 5): ");
        records = sc.nextInt();

        while(records>5){
            System.out.println("Please enter a number Integer value (1-5): ");
            records = sc.nextInt();
        }
        
        String array[] = new String[records];
        char array2[] = new char[records];

        System.out.println("Input the " + records + " names now: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.next();
        }

        System.out.println("Input the letter grade for the " + records + " students now: ");
        for (int i = 0; i < array2.length; i++) {
            array2[i] = sc.next().charAt(0);
        }

        System.out.println("Records: " + records);
        for (int i = 0; i < array.length; i++){
            System.out.printf("%s%8s\n" ,array[i], array2[i]);
            //System.out.printf("%s\n", array2[i]);
        }

        //System.out.println("The names in the arrays are " + Arrays.toString(array));
        //System.out.println("The grades for the students are " + Arrays.toString(array2));

    }

}

