import java.util.Arrays;
import java.util.Scanner;

class practice
{
    public static void main(String[] args) {
        int[] a = new int[3];
        Scanner scan = new Scanner(System.in);
        for (int i = 0 ; i < 3; i++)
        {
            System.out.print("Enter digit no. "+ (i+1)+" :");
            a[i] = scan.nextInt();
        }
        for(int i = 0; i < 3; i++)
        {
            int[] temp = new int[3];
            temp[0] = a[i];
            for(int j = 0; j < 3;j++)
            {
                if(j != i) {
                    temp[1] = a[j];
                    for(int k = 0 ; k < 3; k++)
                    {
                        if(k != i && k != j) {

                        temp[2] = a[k];
                        System.out.println(Arrays.toString(temp));}
                    }
            }

            }
        }

    }

}