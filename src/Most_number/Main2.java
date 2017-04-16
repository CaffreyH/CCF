package Most_number;
import java.util.*;
/**
 * Created by Caffrey on 2017/3/13.
 */
public class Main2 {
    public static void main(String[] args) {
        new Main2().run();
    }
    public void run()
    {
        Scanner scanner = new Scanner(System.in);
        int N  = scanner.nextInt();
        int[] count = new int[10001];
        for(int i = 0; i<N; ++i)
        {
            ++count[scanner.nextInt()];
        }
        int max = -1;
        int result = 0;
        for(int i = 0; i<=10000;++i)
        {
            if(count[i]>max)
            {
                max = count[i];
                result = i;
            }
        }
        System.out.print(result);
    }
}
