package ifElseExamples;

import java.util.Scanner;

public class homeWork {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter pls month number: " );
        int type = sc.nextInt();
        sc.close();

        if (type == 1 || type == 2 || type == 12)
            System.out.println("winter");
        else if (type == 3 || type == 4 || type == 5 )
            System.out.println("spring");
        else if (type == 6 || type == 7 || type == 8 )
            System.out.println("summer");
        else if (type == 9 || type == 10 || type == 11 )
            System.out.println("autumn");

    }

}
