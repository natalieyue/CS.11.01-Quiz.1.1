import java.util.Scanner;

/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: Natalie
*****************************************************************************************************
*/

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;
        String firstName;
        String favoriteFood;

        System.out.println("What is your age:\t");
        age = scanner.nextInt();

        System.out.println("What is your first name:\t");
        firstName = scanner.next();

        System.out.println("What is your favorite food:\t");
        favoriteFood = scanner.next();

        System.out.printf(" First name:%s\n Age:%d \n Favorite Food:%s",firstName,age,favoriteFood);
    }

}
