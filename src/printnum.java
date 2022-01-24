import java.util.Scanner;
class print
{
    public static void printn(int n)
    {
        if(n==1)
        {
            System.out.println(1);
            return ;
        }
        else
        {
                printn(n-1);
                System.out.println(n);
        }
    }
}
public class printnum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        print.printn(n);
    }
}
