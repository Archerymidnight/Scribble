import java.util.Scanner;

public class startMenu {


    public static void main(String[] args) {
        menu();
    }

    public static int printMenu() {
        Scanner s = new Scanner(System.in);
        boolean isInt;
        int value = 0;
        do {
            isInt = true;

            System.out.println("Please select an option");
            System.out.println();
            System.out.println("1: Start New Game");
            System.out.println("2: Load Game");
            System.out.println("3: Instructions For Play");
            System.out.println("0: Exit");
            try {
                value = s.nextInt();
            }catch(Exception e) {
                System.out.println("Unfortunately an error occurred. Please try entering your choice again");
                System.out.println();
                isInt = false;
            }
        }while(!isInt);

        return value;
    }

    public static void menu(){

        int choice;

        do {
            choice = printMenu();

            switch (choice) {

                case 1:
                    startGame();
                    break;
                case 2:
                    loadGame();
                    break;
                case 3:
                    ruleBook();
                    break;
                case 0:
                    exit();
            }
        }while(choice != 0);

    }

    public static void startGame(){

    }

    public static void loadGame(){

    }
    public static void ruleBook(){

        System.out.println("How Does The Game Start?\n");

        System.out.println("""
                The game commences with one of the players placing a first word on the centre of the gameboard.
                The order of play is decided by the order in which each player joined the game.
                Any word can be played as the first word, as long as it fits on the board.
                When placing the first word on the board, the following should be adhered to:
                1. The first word must be at least 2 letters long.
                2. One of the letters in the first word must sit on the centre square of the game board.
                There are various options you can consider here:
                The first letter of the word will be placed on the centre square.
                The last letter of the word will appear on the centre square.
                The (closest to) middle letter of the word should appear on the centre square.
                3. When placing the first word on the board, it can sit horizontally across the centre square,or vertically.
                NOTE: You can’t place words on the board diagonally at any point during the game.""");

        System.out.println();
        System.out.println("Taking A Turn In The Game");

        System.out.println("""
                Each player will be offered a turn of the game, one after another.
                On each player’s turn, the following should happen:
                1. The player should provide a word that they want to add onto the board. If a word is valid or not is left up to the honesty of the user.
                2. The player should intimate where on the board the word should be placed, and whether it should be placed vertically or horizontally.
                NOTE: there are certain rules about how words can be placed which are described below.
                3. After their word has been placed onto the board, the points for each letter they have used can be calculated and added to that player’s score.
                4. The turn of play can move to the next player.
                """);
        System.out.println();
        System.out.println("""
                When placing a new word on the board, it must build upon a word that is already there.
                Specifically, the first or last letter of the new word being added must coincide with a letter in a word that is already on the board.
                The new word is formed so that it reads correctly in either a horizontal or vertical direction.""");

        System.out.println();
        System.out.println("How Are Letter/Word Scores Calculated?");
        System.out.println("""
                A, E, I, O, U, L, N, S, T and R are worth ONE point
                D and G are worth TWO points
                B, C, M and P are worth THREE points
                F, H, V, W and Y are worth FOUR points
                K is worth FIVE points
                J and X are worth SIX points
                Q and Z are worth SEVEN points
                Every letter of a word is considered to be part of the word, including ones which are already on the board.
                For example, if the word SHIP was played with the last letter being a letter P already on the board, the score would be 1+4+1+3 or 9""");


    }

    public static void exit(){
        System.out.println("Thank you for playing!");
    }


}