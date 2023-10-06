import java.util.Scanner;

//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//
//        int[] hash = new int[26];
//
//        for(int i=0; i<str.length(); i++){
//            hash[str.charAt(i) - 'a']++;
//        }
//        for(int i=0; i<26; i++){
//            if(hash[i] > 0){
//                System.out.println((char)(i+'a')+" "+hash[i]);
//            }
//        }
//    }
//}

class CharacterHashing{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        //precompute
        int[] hash = new int[26];
        for (int i=0; i<s.length(); i++){
            hash[s.charAt(i) - 'a']++;
        }
        int q = sc.nextInt();
        while(q-- > 0){
            char c = sc.next().charAt(0);

            //fetch
            System.out.println(hash[c - 'a']);
        }
    }
}