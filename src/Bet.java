public class Bet {

    public static int isGuessed(int score1,int score2,int guessedScore1, int guessedScore2){

        return (score1 == guessedScore1 && score2 == guessedScore2) ? 2:
                ((score1 >= score2 && guessedScore1 >= guessedScore2)
                        ||(score1 < score2 && guessedScore1 < guessedScore2))? 1 : 0;

    }

    public static void main(String[] args) {
        System.out.println(isGuessed(1,2,4,4));
    }

}
