import java.util.Scanner;
public class TournamentSelection {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        int a = 0;
            for(int i = 0; i < 6; i++){
                String result = input.nextLine();
                if (result.equals("W")){
                    a += 1;
            }
        }

        if (a == 6 || a ==5){
            System.out.println("\n1");
        } else if (a == 3 || a == 4){
            System.out.println("\n2");
        } else if (a == 1 || a == 2){
            System.out.println("\n3");
        } else if (a == 0){
            System.out.println("\n-1");
        }
    }
}
