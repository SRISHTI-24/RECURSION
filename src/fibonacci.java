import java.util.Scanner;
class fbncci
{
    public static int fabn(int x)
    {
        int sum;
        if(x==0)
        {
            return 0;
        }
        else if(x==1)
        {
            return 1;
        }
        sum = fabn(x-1)+fabn(x-2);
        return sum;

    }
}
public class fibonacci {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n = s.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println(fbncci.fabn(i));
        }
    }
}
