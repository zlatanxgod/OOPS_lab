import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        String[] names = new String[]{"January","February","March","April", "May", "June", "July","August","September","October","November","December"};
        Scanner scan = new Scanner(System.in);
        System.out.print("Please Enter a no. between 1-12 :");
        int key = scan.nextInt();
        System.out.println("This corresponds to month "+names[key -1]);
    }
}
