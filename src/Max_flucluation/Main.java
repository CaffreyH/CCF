package Max_flucluation;

import java.util.Scanner;

/**
 * Created by Caffrey on 2017/3/14.
 */
public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int[] in = new int[10001];
        int N = 0;
        int max =  0;
        int temp = 0;
        N = scanner.nextInt();
        for(int i=0;i<N;i++)
        {
            in[i]=scanner.nextInt();
        }
        for(int i =0;i<N-1;i++)
        {
            temp = Math.abs(in[i+1]-in[i]);

            if(temp>max)
            {
                max = temp;
            }
        }
        System.out.print(max);
    }
}
