package Digit_sort;

import java.util.Scanner;

/**
 * Created by Caffrey on 2017/3/20.
 */
public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int max =0;
        int maxi=0;
        int[] data = new int[1001];
        for(int i=0;i<N;i++)
        {
            data[scanner.nextInt()]++;
        }

        for (int i=0;i<=N;i++)
        {
            for(int j=0;j<=1000;j++)
            {
                if(data[j]>max)
                {
                    max = data[j];
                    maxi =j;
                }
                if(j==1000  &&  max!=0)
                {
                    System.out.print(maxi+" "+max+"\n");
                    data[maxi] = 0;
                    max = 0 ;
                }
            }
        }

    }
}
