package day18_ForLoop;

import java.util.Scanner;

public class EmailDomain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String email = "test@yahoo.com";
        //              0123456789
        int index1 = email.indexOf("@");
        int index2 = email.lastIndexOf(".");

        String domain = email.substring(index1 +1 , index2); // "gmail"

        System.out.println(domain);


    }

}
