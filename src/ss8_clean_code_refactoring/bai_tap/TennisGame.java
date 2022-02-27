package ss8_clean_code_refactoring.bai_tap;

public class TennisGame {

    public static String getScore(String player1Name, String player2Name, int scorePlayer1, int scorePlayer2) {
        String score = "";
        int tempScore=0;
        if (scorePlayer1==scorePlayer2)
        {
            score = getDraw(scorePlayer1);
        }
        else if (scorePlayer1>=4 || scorePlayer2>=4)
        {
            score = getScorethan4(scorePlayer1, scorePlayer2);
        }
        else
        {
            score = getSorelowthan4(scorePlayer1, scorePlayer2, score);
        }

        return score;
    }

    private static String getSorelowthan4(int m_score1, int m_score2, String score) {
        int tempScore;
        for (int i = 1; i<3; i++)
        {
            if (i==1) tempScore = m_score1;
            else { score+="-"; tempScore = m_score2;}
            switch(tempScore)
            {
                case 0:
                    score+="Love";
                    break;
                case 1:
                    score+="Fifteen";
                    break;
                case 2:
                    score+="Thirty";
                    break;
                case 3:
                    score+="Forty";
                    break;
            }
        }
        return score;
    }

    private static String getScorethan4(int scorePlayer1, int scorePlayer2) {
        String score;
        int minusResult = scorePlayer1-scorePlayer2;
        if (minusResult==1) score ="Advantage player1";
        else if (minusResult ==-1) score ="Advantage player2";
        else if (minusResult>=2) score = "Win for player1";
        else score ="Win for player2";
        return score;
    }

    private static String getDraw(int m_score1) {
        String score;
        switch (m_score1)
        {
            case 0:
                score = "Love-All";
                break;
            case 1:
                score = "Fifteen-All";
                break;
            case 2:
                score = "Thirty-All";
                break;
            case 3:
                score = "Forty-All";
                break;
            default:
                score = "Deuce";
                break;

        }
        return score;
    }
}