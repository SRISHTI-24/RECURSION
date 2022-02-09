/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class summ
{
    public static void sm(int d, int n)
    {
        if(d<=0)
        {
            System.out.println(n);
            return;
        }
        n = (n*(n+1))/2;
        sm(d-1,n);

    }
}
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t>=1)
        {
            int d = s.nextInt();
            int n = s.nextInt();
            summ.sm(d,n);
            t=t-1;
        }// your code goes here
    }
}
