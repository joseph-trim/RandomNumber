import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

        public static void main(String[] args) {
            Random random = new Random();

            int randomNumber = random.nextInt(100);
            System.out.print("Generating random number... Generated... ");

            Scanner reader = new Scanner(System.in);

            for (int i = 0; i < 5; i++) {
                System.out.print("\nGuess the number: ");
                int number = reader.nextInt();
                if(number < randomNumber){
                    System.out.print("\nYour number is lower than the generated number.");
                } else if(number > randomNumber) {
                    System.out.print("\nYour number is higher than the generated number.");
                } else if (number == randomNumber){
                    System.out.print("\nYou won. Your prize is still nothing but have this <3");
                    break;
                }
                if(i == 4){
                    System.out.print("\nYou lose. You don't get a prize :C");
                    break;
                }
            }

        }

}

