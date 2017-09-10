import java.util.Scanner;
public class HappyOrSad {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        String line = input.nextLine();
        int happy = (line.length() - line.replace(":-)", "").length())/3;
        int sad = (line.length() - line.replace(":-(", "").length())/3;
        if (happy > sad){
            System.out.println("happy");
        } else if (happy < sad){
            System.out.println("sad");
        } else if ((happy == 0) && (sad == 0)){
            System.out.print("none");
        } else if (happy == sad){
            System.out.print("unsure");
        }
    }
}
