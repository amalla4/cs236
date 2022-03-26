import java.util.Scanner;

public class intMethod {

    //method 1
    public static String getString(Scanner scan, String in){
        System.out.println(in); //printing string prompt from the method call in main
        in = scan.nextLine();
        return in;
    }

    //method 2
    public static int getInt(Scanner scan, String in){
        System.out.println(in);
        while(!scan.hasNextInt()){
            System.out.println("Invalid entry! Enter integer: ");
            scan.next();  
        }
        int input = scan.nextInt();
        return input;
    }

    /*public static int getIntRange(Scanner scan, String in, int max, int min){
        System.out.print(in);
        while(!scan.hasNextInt()){
            System.out.println("Invalid entry! Enter integer between " + max + " and " + min + " :");
            scan.next();  
        }
        int input = scan.nextInt();
        while(!(min <= input && input <= max)) {
            System.out.println("Invalid entry! Enter integer between " + max + " and " + min + " :");
            while(!scan.hasNextInt()){
                System.out.println("Invalid entry! Enter integer between " + max + " and " + min + " :");
                scan.next();  
            }
            input = scan.nextInt();
        }
        return input;
    }*/

    //method 3 - call getInt method and check if input int is in range
    public static int getInt_inRange(Scanner scan, String in, int max, int min){
        int input_int = getInt(scan, in);
        if (input_int>=min && input_int<=max){    //if value in range 
            return input_int;     //return the value 
        }
        else{
            System.out.println("Error: The value needs to be between "+min+" and "+max+".");
            input_int=getInt(scan,in);   //else ask for input again
        } 
        return input_int;
    }

    //method 4 - get a valid double 
    public static double getDouble(Scanner scan, String in){
        System.out.print(in);
        while(!scan.hasNextDouble()){
            System.out.println("Invalid entry! Enter any double: ");
            scan.next();  
        }
        double inputDouble = scan.nextDouble();
        return inputDouble;
    }

    //method 5 - call getDouble method and check if input double is in range
    public static double getDouble_inRange(Scanner scan, String in, double max, double min){
        double input_double = getDouble(scan, in);
        if (input_double>=min && input_double<=max){    //if value in range 
            return input_double;     //return the value 
        }
        else{
            System.out.println("Error: The value needs to be between "+min+" and "+max+".");
            input_double=getDouble(scan,in);   //else ask for input again
        } 
        return input_double;
    }

    //method 6 
    public static void testMethod(Scanner scan, String in){
        System.out.println(in);

        String nullItem = getString(scan, "");
        System.out.println(nullItem);
        String itemName = getString(scan, "Enter name of item: ");
        //String in = scan.nextLine();
        System.out.println("Item name entered " + itemName);
        //System.out.println();
        String colorName = getString(scan, "Enter the name of a color: ");
        //String in2 = scan.nextLine();
        System.out.println("Color entered: " + colorName);
        String colorName2 = getString(scan, "Enter another color: ");
        //String in3 = scan.nextLine();
        System.out.println("Second color entered: " + colorName2);
        
        int maxNumber = getInt(scan, "What is the max number of "+itemName+ " someone can have?");
        int minNumber = getInt(scan, "What is the min number of "+itemName+ " someone can have?");

    }
    

    public static void main(String[] args) {
        int input = 0;
        Scanner scan = new Scanner(System.in);

        //method 1 - pass any string input
        String line = getString(scan, "Enter string: ");
        System.out.println("String entered was: " + line);
        System.out.println();

        //method 2 - get input of type int
        int line2 = getInt(scan, "Enter int: ");
        System.out.println("Int entered was: " + line2);
        System.out.println();

        //method 3- check if input int is in range (max,min)
        System.out.println("Enter a max value:");
        int max = scan.nextInt();
        System.out.println("Enter a min value:");
        int min = scan.nextInt();
        int line3 = getInt_inRange(scan, "Enter int value within (max,min): ", max, min);
        System.out.println("Success!Input is in range! Integer value entered: " + line3 );
        System.out.println();

        //method4 - to get valid double input 
        double line4 = getDouble(scan, "Enter double: ");
        System.out.println("Double entered was: " + line4);
        System.out.println();

        //method5 - to call method4 and check if input double is in range (max,min)
        System.out.println("Enter a max value(double):");
        double maxDouble = scan.nextDouble();
        System.out.println("Enter a min value(double):");
        double minDouble = scan.nextDouble();
        double line5 = getDouble_inRange(scan, "Enter double value within (max,min): ", maxDouble, minDouble);
        System.out.println("Success!Input is in range! Double value entered: " + line5);
        System.out.println();

        //method 6 - intended to test the other methods! kind of using our methods to make a mad-lib
        //System.out.println();
        testMethod(scan, "**** METHOD 6 ****");

    }
}
