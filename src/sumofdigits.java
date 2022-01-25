import java.util.Scanner;
class sumofd
{
    public static int sod(int x)
    {
        if(x/10==0)
            return x;
        return ((x%10)+sod(x/10));
    }
}
public class sumofdigits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum = sumofd.sod(n);
        System.out.println(sum);
    }
}
