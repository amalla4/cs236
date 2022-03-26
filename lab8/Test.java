import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        String lyric = "Chill till the next episode";
        Scanner s = new Scanner(lyric);
    
        System.out.print(s.next() + " "); //reads 'chill' from the lyrics
        testMethod(s); //method call exection moves to the method 
        System.out.print(s.next() + " "); //Finally, reads 'the' from string lyric
    }

    public static void testMethod(Scanner f){
        System.out.print(f.next() + " ");// reads 'till'
        f=new Scanner("THAT");           // f = 'THAT'
        System.out.print(f.next() + " ");// reads 'THAT' + end of function, exection transferred back to main
    }

     /*public static void getInt(int t) {
        int result = t % 2;
        if (result == 1 || result == -1) {
            System.out.println("User input is odd number");
        } else if (result == 0) {
            System.out.println("User input is even number");
        }
    }*/

}