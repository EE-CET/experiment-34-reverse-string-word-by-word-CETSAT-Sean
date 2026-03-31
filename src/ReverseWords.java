import java.util.Scanner;
public class ReverseWords {
        static Scanner sc = new Scanner(System.in);
        public static void main(String[] args) {
                String s = sc.nextLine();
                s = s.trim();
                String[] words = s.split("\\s+");
                for(int i=words.length-1; i>=0; i--){
                        System.out.print(words[i]);
                        if(i != 0){
                                System.out.print(" ");
                        }
                }
        }
}
