package Salary;

import java.util.Scanner;

/**
 * Created by Caffrey on 2017/3/16.
 */
public class Main {
    static double s1,s2,s3,s4,s5,s6,s7,s8,sz=0;
    double result = 0;

    public static double calculator(int a)
    {
        if(a<=1500&&a>0)
        {
            s1= a * 0.03;
        }
        else if( 1500< a && a <=4500)
        {
            s1 = 45;
            s2 = (a-1500)*0.1;
        }
        else if( 4500 < a && a<=9000)
        {
            s1 = 45;
            s2 = 300;
            s3 = (a-4500)*0.2;
        }
        else if( 9000 < a && a<=35000)
        {
            s1 = 45;
            s2 = 300;
            s3 = 900;
            s4 = (a-9000)*0.25;
        }
        else if( 35000 < a && a<=55000)
        {
            s1 = 45;
            s2 = 300;
            s3 = 900;
            s4 = 6500;
            s5 = (a-35000)*0.3;
        }
        else if( 55000 < a && a<=80000)
        {
            s1 = 45;
            s2 = 300;
            s3 = 900;
            s4 = 6500;
            s5 = 6000;
            s6 = (a-55000)*0.35;
        }
        else if( a>80000)
        {
            s1 = 45;
            s2 = 300;
            s3 = 900;
            s4 = 6500;
            s5 = 6000;
            s6 = 8750;
            s7 = (a-80000)*0.45;
        }
        sz = s1+s2+s3+s4+s5+s6+s7;
        return sz;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for(int i = 0; i<=100000;i++)
            if (i - calculator(i-3500) == N)
            {
                System.out.print(i);
            }

    }
}
