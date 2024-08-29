import java.util.*;
class NumberGuesser {
    public static void main(String[] args) {
            final int MAX_ROUNDS = 3;
            final int MAX_ATTEMPTS = 10;
        System.out.println("Hello!!!");
        System.out.println("WELCOME TO NUMBER GUESSING GAME");
        System.out.println("choose a option 1.PLAY A GAME\n" + "2.EXIT");
        Scanner sc = new Scanner(System.in);
        int choose = sc.nextInt();
        if(choose==1){
            Random rand = new Random();
            int totalScore = 0;
            try{
                for(int i=1;i<=MAX_ROUNDS;i++){
                    System.out.printf("\nRound = %d\n", i);
                    int number_guessing = rand.nextInt(101);
                    int attempts = 0;
                    while (attempts < MAX_ATTEMPTS) {
                        System.out.println("Enter your guess in between 1 to 100: ");
                        int number_guessed = sc.nextInt();
                        if(number_guessed>100){
                            System.out.println("limit exceeded guess range is from 1 to 100");
                            number_guessed = sc.nextInt();
                        }
                        attempts = attempts + 1;

                        if (number_guessed == number_guessing) {
                            int score = MAX_ATTEMPTS - attempts;
                            totalScore = totalScore + score;
                            System.out.printf("Hurray! Number Guessed Successfully. Attempts = %d. Round Score = %d\n",
                                    attempts, score);
                            break;
                        }

                        else if (number_guessed < number_guessing) {
                            System.out.printf("The number is greater than %d. Attempts Left = %d.\n", number_guessed,
                                    MAX_ATTEMPTS - attempts);
                        }

                        else {
                            System.out.printf("The number is less than %d. Attempts Left = %d.\n", number_guessed,
                                    MAX_ATTEMPTS - attempts);
                        }

                    }
                    if(MAX_ATTEMPTS == attempts){
                        System.out.printf("\nRounds Completed = %d\n", i);
                        System.out.println("Attempts = 0");
                        System.out.println("YOU HAVE FINISHED YOUR CHANCES\n" + "HERE'S THE CORRECT ANSWER:"+ number_guessing);
                    }
                }
                System.out.printf("Game Over. Total Score = %d\n", totalScore);
            }
            catch(Exception _){
                System.out.println("ENTER ONLY NUMBERS PLEASE");
            }
        }
        else{
            System.exit(0);
        }
    }
}