import java.util.Scanner;

public class TheatreSquare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter numbers");
        
        int n = scan.nextInt();
        int m = scan.nextInt();
        int a = scan.nextInt();
        System.out.println(countFlagstones(n, m, a));
        scan.close();
    }
    public static int countFlagstones( int n, int m, int a) {
int horizontal = n/a;
if(n%a!=0) horizontal++;
int vertical = m/a;
if(m%a!=0)vertical++;
        return horizontal*vertical;
        
    }
}