import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String sub = sc.nextLine();
        if(str.contains(sub)) {
            int a = str.indexOf(sub);
            int b = str.lastIndexOf(sub);
            if(b > (a + sub.length() -1)){
                String s = str.substring((a+sub.length()),b);
                System.out.println(s);
            }
            else{
                System.out.println("Not applicable");
            }
        }
        else{
            System.out.println("Not applicable");
        }
    }
}