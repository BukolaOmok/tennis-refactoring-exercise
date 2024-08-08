
public class TennisGame3 implements TennisGame {

    private int player1Score; // Changed player1 score variable for clarity
    private int player2Score; // Changed player2 score variable for clarity
    private String player1Name; // Changed player1 name variable for clarity
    private String player2Name; // changed player2 name variable for clarity

    public TennisGame3(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    // decomposed this method - added isNormalRound() differentScore() and deuceScore()
    public String getScore() {
        if (isNormalRound()) {
            return differentScore();
        } else {
            return deuceScore();
        }
    }

    private boolean isNormalRound() {
       return player1Score < 4 && player2Score < 4 && !(player1Score + player2Score == 6);
    }

    private String differentScore() {
        String[] scoreName = new String[]{"Love", "Fifteen", "Thirty", "Forty"};
        String score = scoreName[player1Score];
        return (player1Score == player2Score) ? score + "-All" : score + "-" + scoreName[player2Score];
    }

    private String deuceScore() {
        if (player1Score == player2Score) {
            return "Deuce";
        }
        String leadingPlayer = player1Score > player2Score ? player1Name : player2Name;
        return ((player1Score-player2Score)*(player1Score-player2Score) == 1) ? "Advantage " + leadingPlayer : "Win for " + leadingPlayer;
    }

    public void wonPoint(String playerName) {
        // Followed best practice by using "equals()" to compare instead of "=="
        if (playerName.equals(player1Name)) {
            player1Score += 1;
        } else
            player2Score += 1;
        
    }

}
