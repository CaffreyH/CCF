package Date;

import java.util.Scanner;

/**
 * Created by Caffrey on 2017/3/19.
 */
public class Main {
   public static void main(String[] args)
   {
       Scanner scanner = new Scanner(System.in);
       int year = scanner.nextInt();
       int number = scanner.nextInt();
       int run = 0;
       int muqian=0;
       int[] month = {0,31,28,31,30,31,30,31,31,30,31,30,31};
       if(year%4==0  && year%100!=0)
       {
           run=1;
       }
       if(run==1)
       {
           month[2]=29;
       }
       for(int i=0;i<13;i++)
       {
           if(i!=0)
           {
               muqian = muqian + month[i-1];     //muqian  用来存放已经过去的月有多少天
           }
           for(int j=1;j<=month[i];j++)
           {
               if(muqian + j ==number)
               {
                  System.out.print(i+"\n");
                  System.out.print(j);
               }
           }
       }
   }
}
