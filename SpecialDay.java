import java.util.Scanner;
public class SpecialDay {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        int month = input.nextInt();
        int day = input.nextInt();
        if (month == 2 && day == 18){
            System.out.println("Special");
        } else if (month == 2){
            if (day<18){
                System.out.println("Before");
            } else if (day>18){
                System.out.println("After");
            }
        } else if (month < 2){
            System.out.println("Before");
        } else if (month > 2){
            System.out.println("After");
        }
    }
}
