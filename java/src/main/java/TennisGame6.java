public class TennisGame6 implements TennisGame {
    private final String player1Name;
    private final String player2Name;
    private int player1Score;
    private int player2Score;

    public TennisGame6(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    @Override
    public void wonPoint(String playerName) {
        if (playerName.equals(player1Name)) // change to player1Name for readability and removed the hard coded "player1" string
            player1Score++;
        else
            player2Score++;

    }

    public String getScore() {
        if (isDeuce()) {
            return deuceScore();
        } else if (isEndGame()) {
            return endGameScore();
        } else {
            return regularScore();
        }
    }

    private boolean isDeuce() {
        return player1Score == player2Score;
    }

    private boolean isEndGame() {
        return player1Score >= 4 || player2Score >= 4;
    }

    private String deuceScore() {
        return switch (player1Score) {
            case 0:
                yield "Love-All";
            case 1:
                yield "Fifteen-All";
            case 2:
                yield "Thirty-All";
            default:
                yield "Deuce";
        };
    }

    private String endGameScore() {
        if (player1Score - player2Score == 1) {
            return "Advantage " + player1Name;
        } else if (player1Score - player2Score == -1) {
            return "Advantage " + player2Name;
        } else if (player1Score - player2Score >= 2) {
            return "Win for " + player1Name;
        } else {
            return "Win for " + player2Name;
        }
    }

    private String regularScore() {
        String score1 = switch (player1Score) {
            case 0 -> "Love";
            case 1 -> "Fifteen";
            case 2 -> "Thirty";
            default -> "Forty";
        };

        String score2 = switch (player2Score) {
            case 0 -> "Love";
            case 1 -> "Fifteen";
            case 2 -> "Thirty";
            default -> "Forty";
        };

        return score1 + "-" + score2;
    }
}




