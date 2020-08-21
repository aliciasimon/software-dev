import java.util.*;

public class Sandbox {
    static Scanner scan = new Scanner(System.in);
    public static void main(String [] args){
        System.out.println("Hello, world");
        
        // Program that asks for user's name
        System.out.print("What is your name? ");
        String name = scan.nextLine();
        System.out.printf("Hello %s\n",name);
    }
}