package Bigest_rectangle;

import java.util.Scanner;

/**
 * Created by Caffrey on 2017/3/17.
 */
public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] hight = new int[10001];
        int n = 1, h = 0, s = 0,s_max=0;
        for(int i=0; i<N;i++)
        {
            hight[i]=scanner.nextInt();
        }

        for(int i=0;i<N;i++)
        {
            h=hight[i];
            for(int j=i+1;j<N;j++)
            {
                if(h <= hight[j])
                {
                    n++;
                }
                else
                {
                    h=hight[j];
                    n++;
                }
                s=h*n;
                if(s>s_max)
                {
                    s_max=s;
                }
            }
            n=1;
        }
        System.out.print(s_max);
    }
}
