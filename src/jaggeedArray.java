import java.util.*;
public class jaggeedArray {

    public static void main(String args[])
    {
        //jagged array means row size is fixed but column size is varry

        int arr[][]=new int[3][];
        arr[0]=new int[3];
        arr[1]=new int[4];
        arr[2]=new int[2];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j]=(int)(Math.random()*100);
            }
        }
        for(int a[]:arr)
        {
            for(int b:a)
            {
                System.out.print(b+" ");
            }
            System.out.println();
        }
    }
}
