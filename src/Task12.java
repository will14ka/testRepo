import java.util.Scanner;

public class Task12 {
    static class TicTacToe {
        private char gameField[][] = new char[4][4];

        public TicTacToe() {
            for (int x = 0; x < 4; x++) {
                for (int y = 0; y < 4; y++) {
                    if (x == 0 || y == 0) {
                        gameField[x][y] = (char) ('0' + x + y);
                    } else {
                        gameField[x][y] = '_';
                    }
                }
                gameField[0][0] = ' ';
            }
        }
    }

    public static void main(String... args) {
        TicTacToe game = new TicTacToe();

        for (int line = 0; line < 4; line++) {
            for (int column = 0; column < 4; column++) {
                System.out.print(game.gameField[line][column]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }

        System.out.println(" \n");


//GAMEPLAY

        Scanner n = new Scanner(System.in);
        boolean gameOver = false;
        int countTurns = 0;

        String currPlayer = "Player1";
        char currSym = 'X';
        while (!gameOver) {

            boolean turnFinished = false;
            while (!turnFinished) {
                System.out.print(currPlayer + " please enter X Y:\n");

                int x = n.nextInt();
                int y = n.nextInt();

                if (x > 0 && x < 4 && y > 0 && y < 4) {

                    if (game.gameField[x][y] == 'X' || game.gameField[x][y] == 'O') {
                        System.out.print("This cell is already in use! Please try another\n");
                    } else {
                        turnFinished = true;
                        countTurns++;
                        game.gameField[x][y] = currSym;
                        for (int line = 0; line < 4; line++) {
                            for (int column = 0; column < 4; column++) {
                                System.out.print(game.gameField[line][column]);
                                System.out.print(" ");
                            }
                            System.out.println(" ");
                        }
                    }
                } else {

                    System.out.print("invalid data! Please try again\n");

                }
            }

            //CHECK

            //Diagonals
            int diagonal1 = game.gameField[1][1] + game.gameField[2][2] + game.gameField[3][3];
            int diagonal2 = game.gameField[3][1] + game.gameField[2][2] + game.gameField[1][3];

            if ((diagonal1 == currSym * 3) || (diagonal2 == currSym * 3)){
                System.out.println(currPlayer + " wins!");
                gameOver = true;
            }

            //horizontal
            for (int y = 1; y < 4; y++) {
                int horizontal = game.gameField[1][y] + game.gameField[2][y] + game.gameField[3][y];

                if (horizontal == currSym * 3) {
                    System.out.println(currPlayer + " wins!");
                    gameOver = true;
                    break;
                }
            }

            //vertical
            for (int x = 1; x < 4; x++) {
                int vertical = game.gameField[x][1] + game.gameField[x][2] + game.gameField[x][3];

                if (vertical == currSym * 3) {
                    System.out.println(currPlayer + " wins!");
                    gameOver = true;
                    break;
                }
            }

            //draw
            if (!gameOver && countTurns == 9) {
                System.out.println("NO WINNERS - THIS IS A DRAW");
                gameOver = true;
                break;
            }

            currPlayer = (currPlayer.equals("Player1")) ? "Player2" : "Player1";

            currSym = (currPlayer.equals("Player1")) ? 'X' : 'O';
        }
    }
}
