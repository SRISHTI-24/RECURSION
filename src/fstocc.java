import java.util.Scanner;
class search
{
    public static int fsearch(int a[], int n, int j,  int k)
    {
        if(j>n)
            return -1;
        if(a[n]==k)
            return n;
        if(a[j]==k)
            return j;
        return fsearch(a,n-1, j+1, k);
    }
}
public class fstocc {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        int k = s.nextInt();
        int pos;
        pos = search.fsearch(a,n-1,0,k);
        if(pos!=-1)
        System.out.println(pos);
        else
            System.out.println("not found");
    }
}
