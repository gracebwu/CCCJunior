import java.util.Scanner;
public class Rovarspraket {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        String text = input.nextLine();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i<text.length(); i++){
            if (Character.toString( text.charAt(i) ).matches("[bcdfghjklmnpqrstvwxyz]")) {
                char a = text.charAt(i);
                int result = (alphabet.indexOf(a) - alphabet.indexOf('a'));
                int result2 = 0;
                char b = 'a';
                char[] vowels = {'e', 'i', 'o', 'u'};
                for (int j=0; j<4; j++){
                    result2 = (alphabet.indexOf(a) - alphabet.indexOf(vowels[j]));
                    result2 = Math.abs(result2);
                    if (result2<result){
                        result = result2;
                        b = vowels[j];
                    }
                    result2 = (alphabet.indexOf(vowels[j]) - alphabet.indexOf(a));
                    result2 = Math.abs(result2);
                    if (result2<result) {
                        result = result2;
                        b = vowels[j];
                    }
                }
                char c = ++a;
                if (text.charAt(i) == 'z') {
                    c = 'z';
                    System.out.println(c);
                } else if (Character.toString(a++).matches("[aeiou]")) {
                    c = ++c;
                }
                sb = sb.append(text.charAt(i)).append(b).append(c);
            } else{
                sb = sb.append(Character.toString( text.charAt(i) ));
            }
        }
        System.out.println(sb);
    }
}
