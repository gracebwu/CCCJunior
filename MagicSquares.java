import java.util.Scanner;
public class MagicSquares {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        int [][] box = new int[4][4];
        for(int i = 0; i<4; i++){
            for(int j=0; j<4; j++){
                box[i][j]= input.nextInt();
            }
        }
        int total = 0;
        int total2 = 0;
        for(int i=0; i<4; i++){
            total+= box[i][0];
        }
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                total2 += box[i][j];
                }
            if (total != total2){
                System.out.println("not magic");
                return;
            }
                total2 = 0;
        }
        System.out.println("magic");
    }
}