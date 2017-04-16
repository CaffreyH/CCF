package Sum_of_number;

import java.util.Scanner;

/**
 * Created by Caffrey on 2017/3/18.
 */
public class Main
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[] b = new int[100];
        int c = 0;
        for (int i = 0; a >= 1; i++)
        {
            b[i] = a % 10;
            a = a / 10;
        }
        for(int i = 0;i<100;i++)
        {
            c = c + b[i];
        }
        System.out.print(c);
    }
}
