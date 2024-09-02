import java.util.Scanner;

public class GettingGreater {
    public static void main(String[] args) {
        Scanner chValue = new Scanner(System.in);

        System.out.println("Getting the Greater Value");
        System.out.print("Enter first character: ");
        char ch1 = chValue.next().charAt(0);
        
        System.out.print("Enter second character: ");
        char ch2 = chValue.next().charAt(0);

        chValue.close();

        int max = Math.max(ch1,ch2);
        System.out.println("----------------------------");
        System.out.println("The character with a greater value is: " + max);
        System.out.println("----------------------------");
        
        System.out.println("Showing ASCII Codes");
        System.out.println(ch1 + ": " + (int)ch1);
        System.out.println(ch2 + ": " + (int)ch2);
        }
    }

