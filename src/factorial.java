import java.util.Scanner;
class factofn
{
    public static int fact(int n)
    {
        if(n==0)
            return 1;
        return n * fact(n-1);
    }
}
public class factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int f = factofn.fact(n);
        System.out.println(f);
    }
}
