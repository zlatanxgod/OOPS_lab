import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        int[] array = new int[2];
        Scanner scan = new Scanner(System.in);
        int sum = 0;

        for( int i = 0 ; i < 2; i++)
        {
            int x = array[i];
            System.out.print("Enter digit no. "+(i+1)+" :");
            x = (scan.nextInt());
            x *= x;
            sum += x;
        }
        System.out.println("Sum of entered values :" + sum);
    }
}
