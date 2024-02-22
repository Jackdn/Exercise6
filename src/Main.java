import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Please type a string");
        try {
            String str= input.nextLine();
            System.out.println(str);
        }catch (Exception e){
            System.out.println("That's not a string!");
        }
        System.out.println("Please type an integer");
        try{
            Integer in=input.nextInt();
            System.out.println(in);
        }catch (InputMismatchException e){
            System.out.println("That's not an integer!");
        }
        System.out.println("Please type a double");
        try{
            Double dub= input.nextDouble();
            System.out.println(dub);
        }catch (InputMismatchException e){
            System.out.println("that's not a double!");
        }

    }
}