public class User {


    private int userScore;
    private String currentWord;
    private int playerNumber;
    private int turnPriority;

    public void setUserScore(int newScore){
        userScore = newScore;
    }

    public void setCurrentWord(String newWord){
        currentWord = newWord;
    }

    public void setPlayerNumber(int newPlayerNumber){
        playerNumber = newPlayerNumber;
    }

    public void setTurnPriority(int newPriority) {
        turnPriority = newPriority;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public int getUserScore() {
        return userScore;
    }

    public int getTurnPriority() {
        return turnPriority;
    }

    public String getCurrentWord() {
        return currentWord;
    }
}
