import java.util.Scanner;
class prodnos
{
    public static int prod(int a[], int n, int j)
    {
        if(j>n)
            return 1;
        return a[j]*prod(a,n,j+1);
    }
}
public class prodofnos {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =  s.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = s.nextInt();
        }
        int p = prodnos.prod(a,n-1,0);
        System.out.println(p);
    }
}
