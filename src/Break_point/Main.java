package Break_point;

import java.util.Scanner;

/**
 * Created by Caffrey on 2017/3/17.
 */
public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int break_point = 0;
        int[] data = new int[1000];
        for(int i=0;i<N;i++)
        {
            data[i]=scanner.nextInt();
        }
        for(int i=0;i<N-2;i++)
        {
            int a = data[i] - data[i+1];
            int b = data[i+1] - data[i+2];
            if( a * b < 0)
            {
                break_point++;
            }
        }
        System.out.print(break_point);

    }
}
