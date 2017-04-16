package Interesting;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long a=(jiecheng(N-2)*(N-2)*(N-1)/4)%1000000007;
        System.out.print(a);
    }
    public static int jiecheng(int a)
    {
        if(a==1)
        {
            return 1;
        }
        else return a*jiecheng(a-1);
    }
}