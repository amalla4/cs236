import java.util.Scanner;

public class GPAStanding{

    public static void main (String[] args){

        //initializing variables
        int credits = 0;
        int semester = 0;
        double gpa = 0;

        Scanner scan = new Scanner (System.in);
       
        System.out.println("Please enter the number of credits taken each semester: ");
        while(!scan.hasNextInt()){
            scan.next();
            System.out.println("Please enter a number Integer value (usually 1-23): ");
        }
        credits = scan.nextInt(); 
 
        System.out.println("Please enter the number of semesters completed: ");
        while(!scan.hasNextInt()){
            scan.next();
            System.out.println("Please enter a number Integer value for the number of semesters: ");
        }
        semester = scan.nextInt();

        System.out.println("Please enter your GPA: ");
        while(!scan.hasNextDouble()){
            scan.next();
            System.out.println("Please enter a number double value. (1.0-4.0): ");
        }
        gpa = scan.nextDouble();
     
        //============================================================================================
        //freshman, 0-29 credit hours; sophomore, 30-59 credit hours; junior, 60-89 credit hours; and. senior, 90 or more credit hours

        System.out.println("You entered the number of credits per semester as " + credits + " & the number of semesters as " + semester + " with a GPA of " + gpa);

        double standing = credits * semester;
        System.out.println("The total number of credits comes out to " + standing);

        if(standing >= 0 && standing <= 29){
            System.out.println("You are a freshman per credits completed.");
        } else if (standing >= 30 && standing <= 59){
            System.out.println("You are a sophomore per credits completed.");
        }else if (standing >= 60 && standing <= 89){
            System.out.println("You are a junior per credits completed.");
        }else if (standing >= 60 && standing <= 89){
            System.out.println("You are a senior per credits completed.");
        }
        
        //================================================================================================
        //Fixing the values so it works in the switch statements
        if(credits >= 12) credits = 12; 
    
        switch(credits){
            case 12:
                System.out.println("You are a full time student.");
            break;
            case 11:
            case 10:
            case 9:
                System.out.println("You are a three-quarter student.");
            break;
            case 8:
            case 7:
            case 6:
            System.out.println("You are a half-time student.");
            break;
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
            System.out.println("You are less than half time student.");
            break;
            default:
                System.out.println("Please enter credits from 1 - 12 or higher.");
        }

        //================================================================================================
        /* GPA 1.50+ 1-29.5 credits
        GPA 1.75+ 30-59.5 credits
        GPA 2.0+ 60+ credits*/

        if((standing <= 29) && (gpa >= 1.50 )){
            System.out.println("GPA is in good standing.");

        } else if ((standing <= 29) && (gpa <=1.50 )){
            System.out.println("You are not in good standing. GPA needs to be improved.");

        }else if ((standing <= 59 && standing >=29) && (gpa >=1.75)){
            System.out.println("GPA in good standing.");

        }else if ((standing <= 59 && standing >=29) && (gpa <=1.75 )){
            System.out.println("You are not in good standing. GPA needs to be improved.");

        }else if ((standing >= 60) && (gpa >=2.0)){
            System.out.println("GPA is in good standing");

        }else if ((standing >= 60) && (gpa >=2.0)){
            System.out.println("You are not in good standing. GPA needs to be improved.");
        }
        
    }

}