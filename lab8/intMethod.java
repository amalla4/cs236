import java.util.*;

public class intMethod {

    //method 1
    public static String getString(Scanner scan, String in){
        System.out.println(in); //printing string prompt from the method call in main
        scan = new Scanner(System.in); //creating new scanner to clear out the scanner??? method 6 calls not working properly
        String userIn = scan.nextLine();
        return userIn;
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

    //method 3 - call getInt method and check if input int is in range
    public static int getInt_inRange(Scanner scan, String in, int max, int min){
        int input_int = getInt(scan, in); //calling method 2

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
        System.out.println(in);
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

    //method 6 - to test all the methods 
    public static void testMethod(Scanner scan, String in){
        System.out.println(in);
        //1
        String itemName = getString(scan, "Enter name of item: ");
        System.out.println("Item name entered " + itemName);
        //2
        String colorName1 = getString(scan, "Enter the name of a color: ");
        System.out.println("Color entered: " + colorName1);
        //3
        String colorName2 = getString(scan, "Enter another color: ");
        System.out.println("Second color entered: " + colorName2);
        //4
        int maxNumber = getInt(scan, "What is the max number of "+itemName+ " someone can have?");
        System.out.println("Max item entered: " + maxNumber);
        //5
        int minNumber = getInt(scan, "What is the min number of "+itemName+ " someone can have?");
        System.out.println("Min item entered: " + minNumber);

        //6
        double maxPrice= getDouble(scan, "What is the max price for " +itemName+ "?" );
        //7 
        double minPrice= getDouble(scan, "What is the min price for "+itemName+ "?");

        //for random numbers, color
        Random random = new Random(); 
        String[] arr = {colorName1, colorName2};
        String color_name = arr[random.nextInt(arr.length)];                        //to get a color from array arr                        
        int random_num = random.nextInt(maxNumber - minNumber + 1) + minNumber;     //get a random number in the range(max,min) 

        //8,9 - ask how many items they want, check if they are in range
        int numItems = getInt_inRange(scan,"We have "+random_num+" "+color_name+" " +itemName+", how many would you like to buy?",random_num,minNumber);
        System.out.println("Desired amount of " +itemName+ " for purchase: " + numItems);

        //10 - call method5 to ask how much willing to pay (min,max) price
        double itemPrice = getDouble_inRange(scan, "How much are you willing to pay for each "+itemName+"?", maxPrice, minPrice);

        //11 - calculate final price owed 
        double totalPrice = itemPrice*numItems;
        System.out.println("Total cost for "+numItems+" "+color_name+" " +itemName+" at $"+itemPrice+ " each is $"+totalPrice);

    }
    
    //========================================= MAIN =================================================//
    //===========================================*===================================================//

    public static void main(String[] args) {

        int number = 0;
        Scanner scan = new Scanner(System.in);

        while(number != -1) {
        System.out.println();
        System.out.println("Please use numbers 1-6 to select the methods, or enter -1 to exit");
        //type validation 
       while (!scan.hasNextInt()){
            scan.nextLine();
            System.out.println("Invalid input type, please enter integer values between 1-6 or -1 to exit");
        }
        number = scan.nextInt();

        //range validation
         while (!(number >= 0 && number < 7) && (number != -1)){
            scan.nextLine();
            System.out.println("Invalid Range! please use int values 1-6 for programs or, -1 to exit.");
            number = scan.nextInt();
        }

        switch(number){
            case -1:
            System.out.println("Exiting program...." );
            System.exit(0);

            case 1:
            //method 1 - pass any string input
            String line = getString(scan, "Enter string: ");
            System.out.println("String entered was: " + line);
            break;

            case 2:
            //method 2 - get input of type int
            int line2 = getInt(scan, "Enter int: ");
            System.out.println("Int entered was: " + line2);
            break;

            case 3:
            //method 3- check if input int is in range (max,min)
            System.out.println("Enter a max value:");
            int max = scan.nextInt();
            System.out.println("Enter a min value:");
            int min = scan.nextInt();
            int line3 = getInt_inRange(scan, "Enter int value within (max,min): ", max, min);
            System.out.println("Success!Input is in range! Integer value entered: " + line3 );
            break;

            case 4:
            //method4 - to get valid double input 
            double line4 = getDouble(scan, "Enter double: ");
            System.out.println("Double entered was: " + line4);
            break;

            case 5:
            //method5 - method5 calls method4 and checks if input double is in range (max,min)
            System.out.println("Enter a max value(double):"); 
            double maxDouble = scan.nextDouble();
            System.out.println("Enter a min value(double):");
            double minDouble = scan.nextDouble();
            double line5 = getDouble_inRange(scan, "Enter double value within (max,min): ", maxDouble, minDouble);
            System.out.println("Input is in range! Double value entered: " + line5);
            break;

            case 6:
            //method 6 - intended to test the other methods! kind of using our methods to make a mad-lib
            testMethod(scan, "**** METHOD 6 ****");
            break;
        }
    }

    }

}

