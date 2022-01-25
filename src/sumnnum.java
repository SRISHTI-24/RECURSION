import java.util.Scanner;
class sumofn
{
    public static int sumn(int x)
    {
        if(x==0)
            return 0;
        return x + sumn(x-1);
    }
}
public class sumnnum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int s1 = sumofn.sumn(n);
        System.out.println(s1);
    }
}
