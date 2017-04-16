package Array_Segment;

import java.util.Scanner;

/**
 * Created by Caffrey on 2017/3/18.
 */
public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] a = new int[N];
        int num = 0;
        for(int i = 0;i<N;i++)
        {
            a[i]=scanner.nextInt();
        }
        for(int j=0;j<N;j++)
        {
            if( j+1<N && a[j+1] == a[j])
            {

            }
            else
            {
                num++;
            }

        }
        System.out.print(num);
    }
}
