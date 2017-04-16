package Train_ticket;

import java.util.Scanner;

/**
 * Created by Caffrey on 2017/3/14.
 */
public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] input  = new int[101];
        int enough = 1;
        for(int i =0;i<N;i++)
        {
            input[i]=scanner.nextInt();
        }
        int[][] seat = new int[20][5];
        for(int i=0;i<20;i++)
        {
            for(int j =0;j<5;j++)
            {
                seat[i][j]=1;
            }
          //  System.out.print("\n");
        }

        for(int i = 0;i<N;i++)
        {
            if(enough==1)
            {
                for(int j=0;j<20;j++)
                {
                    int last = seat[j][0]+seat[j][1]+seat[j][2]+seat[j][3]+seat[j][4];
                    if(last >= input[i]) {
                        for (int k = 0; k < input[i]; k++) {
                            seat[j][5 - last + k] = 0;
                            System.out.print((j * 5) + 5 - last + k + 1 + " ");
                        }
                        System.out.print("\n");
                        break;
                    }
                    if(j==20)
                    {
                        enough=0;
                        break;
                    }
                }

            }

            else
            {
                for(;input[i]>0;)
                {
                    for (int a = 0; a <= 19; a++)
                    {
                        for (int b = 0; b <= 4; b++)
                        {

                            if (seat[a][b] == 1) {
                                seat[a][b] = 0;
                                input[i]--;
                                System.out.print((a * 5) + b + 1 + " ");
                                break;
                            }
                        break;
                        }
                        break;
                    }
                }
                System.out.print("\n");
            }

        }


/*
        for(int i=0;i<=19;i++)
        {
            for(int j =0;j<=4;j++)
            {
             System.out.print(seat[i][j]);
            }
           System.out.print("\n");
        }
*/


    }
}
