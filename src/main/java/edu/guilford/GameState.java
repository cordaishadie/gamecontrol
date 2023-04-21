package edu.guilford;

public class GameState {
    // USe an enum for a game state with initializing, running, paused, and game over states
    public enum State {
        INITIALIZING, RUNNING, PAUSED, GAME_OVER
    }
    // enum is a collection of public static final values
    // behind the scenes, each one of these has an associated integer value, the ordinal value
    // the first one is 0, the second one is 1, etc.

    // Declare a method of type Sate to hold the current game state
    private State currentState;

    // Declare some other variables to hold the current score and the current level
    private int currentScore;
    private int currentLevel;

    // Declare a constuctor that initializes the game state to INITIALIZING
    public GameState() {
        currentState = State.INITIALIZING;
        // State.INITIALIZING is the INITIALIZING value of the enum State
        currentScore = 0;
        currentLevel = 1;
    }

    // Constructor to set all the values to user defined values
    public GameState(State currentState, int currentScore, int currentLevel) {
        this.currentState = currentState;
        this.currentScore = currentScore;
        this.currentLevel = currentLevel;
    }

    //Declare a method to get the current game state
    public State getCurrentState() {
        return currentState;
    }

    // Declare a method to set the current game state
    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    // Declare a method to get the current score
    public int getCurrentScore() {
        return currentScore;
    }

    // Declare a method to set the current score
    public void setCurrentScore(int currentScore) {
        this.currentScore = currentScore;
    }

    // Declare a method to get the current level
    public int getCurrentLevel() {
        return currentLevel;
    }

    // Declare a method to set the current level
    public void setCurrentLevel(int currentLevel) {
        this.currentLevel = currentLevel;
    }

    // Provide methods to start, pause, resume, and end the game
    public void startGame() {
        currentState = State.INITIALIZING;
        // currentStae is a variable of type State and can be set to any of the values in the enum State
        // curentState = 1; doesnt work because currentState is not an integer; it is a State variable
    }

    public void pauseGame() {
        currentState = State.PAUSED;
    }

    public void resumeGame() {
        currentState = State.RUNNING;
    }

    public void endGame() {
        currentState = State.GAME_OVER;
    }

    // Write a getBAnner method that uses a switch statement to generate a banner based on the value of currentState
    public String getBanner() {
        String banner = "";
        switch (currentState) {
            case INITIALIZING:
                banner = "Initializing...";
                break;
            case RUNNING:
                banner = "Running...";
                break;
            case PAUSED:
                banner = "Paused...";
                break;
            case GAME_OVER:
                banner = "Game Over!";
                break;
        }
        return banner;
    }
}
