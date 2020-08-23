/**
 * @(#)StudentHelpApplication.java
 *
 *
 * @author David Tormey
 * @version 1.00 2020/3/8
 */

package StudentHelpApplication;

import java.util.Scanner;


public class StudentHelpApplication {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String choice = "";
        do {
            System.out.print("Please Enter Student Id : ");
            String id = input.nextLine();
            EducationLevel edu = new EducationLevel(id);
			Subjects sub = new Subjects(id);




			System.out.println(sub.toString());
			System.out.println(edu.toString());
            System.out.print("Press Y to Check Again : ");
            choice = input.nextLine();

        } while (choice.toUpperCase().compareTo("Y") == 0);

    }

}
