package Interesting;

import java.util.Scanner;

/**
 * Created by Caffrey on 2017/3/17.
 */
public class Main {
    int[] num = {0,1,2,3};
    static int[] worldt = new int[10000];
    static int N=0;

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        //nexti(0);
        long a=((N-2)*(N-1)/2)%1000000007;
        System.out.print(a);

    }
    public static int nexti(int a)
    {

       if(a<N)
        {
            for(int j=0;j<4;j++)
            {
                worldt[a]=j;
                a++;
                nexti(a);
            }
        }
        else if(a==N)
       {
          // System.out.print("bbbbbb");
           for(int i=0;i<N;i++)
           {
               System.out.print(worldt[i]);
           }
           System.out.print("\t");
       }
        return 0;
    }
}
