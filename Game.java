import java.util.Random;
import java.util.Scanner;

public class Game {
    static void Gameplay() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello User:");
        System.out.println("Enter your choice: ");
        System.out.println("1 for paper\n2 for scissors\n3 for rock");
        int ch2 = sc.nextInt();
        if (ch2 != 1 && ch2 != 2 && ch2 != 3) {
            System.out.println("INVALID CHOICE BY USER:");
            Gameplayagain();

        } else {

            Random rd = new Random();
            int ComputerCh = rd.nextInt(1, 4);

            Display(ch2, ComputerCh);
            Checkwin(ch2, ComputerCh);
        }
        sc.close();

    }

    static void Gameplayagain() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Do You Want To Play Game Again..? (Y/N)");
        char ch = sc.next().charAt(0);
        if (ch == 'y' || ch == 'Y') {
            System.out.println("You Choose Play Again:");
            Gameplay();
        } else if (ch == 'n' || ch == 'N') {
            System.out.println("You Choose Exit");
            System.exit(0);
        } else {
            System.out.println("You Enter Invalid Keyword");
            System.exit(0);

        }
        sc.close();
    }

    static void Checkwin(int userinput, int computerinput) {

        if (userinput == computerinput) {
            System.out.println("It's an draw match:");
            Gameplayagain();
        } else if ((userinput == 1 && computerinput == 3) || (userinput == 2 && computerinput == 1)
                || (userinput == 3 && computerinput == 2)) {
            System.out.println("User Win Computer Loose");
            Gameplayagain();

        } else {
            System.out.println("Computer Win User Loose");
            Gameplayagain();
        }
    }

    static void Display(int userch, int compch) {
        if (userch == 1) {
            System.out.println("you choose an 'PAPER' ");
        } else if (userch == 2) {
            System.out.println("you choose 'SCISSORRS'");
        } else if (userch == 3) {
            System.out.println("you choose a 'ROCK'");
        } else {
            System.out.println("your choice 'INVALID'");
        }
        if (compch == 1) {
            System.out.println("computer choose an 'PAPER' ");
        } else if (compch == 2) {
            System.out.println("computer choose 'SCISSORS'");
        } else if (compch == 3) {
            System.out.println("computer choose a 'ROCK'");
        }

    }

    public static void main(String[] args) {
        Gameplay();

    }

}