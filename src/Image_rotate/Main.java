package Image_rotate;

import java.util.Scanner;

/**
 * Created by Caffrey on 2017/3/20.
 */
public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        int[][] data = new int[rows][columns];
        int[][] newdata = new int[columns][rows];

        for(int i=0;i< rows; i++)
        {
            for(int j=0;j<columns;j++)
            {
                data[i][j] = scanner.nextInt();
            }
        }

        for(int i=columns-1;i>= 0; i--)
        {
            for(int j=0;j<rows;j++)
            {
                System.out.print(data[j][i]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}
