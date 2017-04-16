package Mediant;

import java.util.Scanner;

/**
 * Created by Caffrey on 2017/3/16.
 */
public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] num = new int[1001];
        for(int i = 0; i<1000; i++)
        {
            num[i]=0;
        }

        for(int i = 0; i<N; i++)
        {
            num[scanner.nextInt()]++;
        }
        for(int i = 0; i<6; ++i)
        {
            System.out.print(num[i+1]);
        }

        for(int j = 1;j<1000 ;j++)
        {
            int min=0,max=0;
            if(num[j]>0)
            {
                System.out.print("aaa");
                for(int k = 1;k<1000;k++)
                {
                    if (k<j)
                    {
                        for( int a=1;num[k]>0;num[k]-- )
                        {
                            min++;
                            System.out.print(min);
                        }
                    }
                    else if(k>j)
                    {
                        for( int a=1;num[k]>0;num[k]-- )
                        {
                            max++;
                            System.out.print(max);
                        }
                    }
                }
                if( min == max) // min!= 0 && max !=0 &&
                {
                    System.out.print(j);
                    System.out.print("hhh");
                }
/*               for(int k=1; k<j;k++)
               {
                   if(num[k]>0)
                   {
                       num[k]--;
                       min++;
                       System.out.print(min);
                   }
               }
               for(int k=j+1;k<1000;k++)
               {
                   if(num[k]>0)
                   {
                       num[k]--;
                       max++;
                   }
               }*/

                System.out.print("kkk");

            }

        }


    }
}
