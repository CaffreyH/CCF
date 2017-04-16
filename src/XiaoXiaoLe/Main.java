package XiaoXiaoLe;

import java.util.Scanner;

/**
 * Created by Caffrey on 2017/3/18.
 */
public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        int[][] map = new int[rows][columns];
        int[][] map2 = new int[rows][columns];
        int find = 0;
        for(int i = 0;i<rows;i++)
            {
                for(int j=0;j<columns;j++)
                {
                    map2[i][j]=map[i][j]=scanner.nextInt();
                }
            }
/*
        for(int i = 0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                System.out.print(map2[i][j]+ " ");
            }
            System.out.print("\n");
        }*/
        for(int i = 0;i<rows;i++)
        {
            for(int j=0;j<columns-2;j++)
            {
                int same = 0;
                for(int k = j+1; k<columns   &&   map[i][j]==map[i][k]  ;k++)
                {
                    same++;
                    if(same>=2)
                    {
                        map[i][k-1]=0;
                        map[i][k]=0;
                        find =1;
                    }
                    if(  (k>columns-2 || map[i][j]!=map[i][k+1]) && find==1)
                    {
                        map[i][j]=0;
                    }
                    find=0;
                }
            }
        }

        for(int j=0;j<columns;j++)
        {
            for(int i = 0;i<rows-2;i++)
            {
                int same = 0;
                for(int k = i+1; k<rows  &&  map2[i][j]==map2[k][j] ;k++)
                {
                    same++;
                    if(same>=2)
                    {
                        map2[k-1][j]=0;
                        map2[k][j]=0;
                        find=1;
                    }
                    if(  ( k>rows-2 || map2[i][j]!=map2[k+1][j]  ) && find==1)
                    {
                        map2[i][j]=0;
                    }
                    find=0;

                }
            }
        }
/*
        for(int i = 0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                System.out.print(map[i][j]+ " ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        for(int i = 0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                System.out.print(map2[i][j]+ " ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");*/

        for(int i = 0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                if(map2[i][j]!=map[i][j])
                {
                    map[i][j]=0;
                }
                System.out.print(map[i][j]+" ");
            }
            System.out.print("\n");
        }

    }
}
