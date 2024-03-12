import java.util.Scanner;

class replace_string_index{
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String str = scanner.nextLine();
    int index = scanner.nextInt();
    char c = scanner.next().charAt(0);
     if (index < 0 || index >= str.length()) {
            System.out.println("Invalid index.");
            return;
        }
        String s = String.valueOf(c);
        String newstring = str.substring(0,index) + s + str.substring(index+1);
        System.out.println(newstring);
    }
}
