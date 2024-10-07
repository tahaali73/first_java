import java.util.Scanner;

public class I {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       double sum=0.0;
       int n =0;
       while(scanner.hasNextDouble()){
         double x = scanner.nextDouble();
         sum = sum + x;
         n++;    
       }
       System.out.println(sum/n);
       scanner.close();
    }

}