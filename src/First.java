import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = Integer.parseInt(s);
        for(int i=0;i<n;i++){
            String S[] = sc.nextLine().split(" ");
            try{
                double a = Double.parseDouble(S[0]);
                double b = Double.parseDouble(S[1]);
                double c = a/b;
                System.out.println(c);
            }catch (ArithmeticException e){
                System.out.println("Divide by zero");
            }
        }
    }
}