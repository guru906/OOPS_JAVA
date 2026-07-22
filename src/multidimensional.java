import java.util.*;
public class multidimensional {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
       int arr[][]=new int[4][4];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                arr[i][j]=(int)(Math.random()*100);
            }
        }
        for(int []a:arr)
        {
            for(int b:a)
            {
                System.out.print(b+" ");
            }
            System.out.println();
        }
    }
}
