import java.util.Scanner;
class count_vowels_consonants{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toUpperCase();
        int c=0;
        int c1=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || 
            s.charAt(i)=='O' || s.charAt(i)=='U'){
                c++;
            }
            else{
            c1++;
        }
        }
        System.out.println("vowels:" + c);
        System.out.println("consonants:" +c1);
    }
}
