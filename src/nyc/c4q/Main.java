package nyc.c4q;

public class Main {

    public static void main(String[] args) {
        Hangman hangman = new Hangman();
        boolean notDone = true;
        while  (notDone){
        while (hangman.getMisses() < 5){
            hangman.printCurrentWord();
            hangman.promptPlayer("Enter a letter: ");
            hangman.readLetter();
            hangman.checkLetter();
            if(hangman.guessedSuccessfully()){
                break;
            }
            System.out.println(Drawing.get(hangman.getMisses()));
            System.out.println("Misses -> " +hangman.getMisses());
        }
        if(hangman.guessedSuccessfully()){
            System.out.println("Success");
        } else {
            System.out.println("The answer was " + hangman.getSecretWord());
        }
            prompt("Do you want to play again?");
            boolean isValidInput;
            do{
            String userAnswer = getInput();
            userAnswer = userAnswer.toLowerCase();
            if (userAnswer is yes || y ){

            } else if (userAnswer is no || n){

            }else{
                prompt("Try again!");
            }
            } while (isValidInput == false )
        }
    }
}