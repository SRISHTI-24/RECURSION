import java.util.Scanner;
class powern
{

    public static int powerx(int x, int n)
    {
        if(n==0)
            return 1;
        else if(n==1)
            return x;
        else
            return x*powerx(x,n-1);

    }
}
public class POW1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int n = s.nextInt();
        System.out.println(powern.powerx(x,n));

    }
}
