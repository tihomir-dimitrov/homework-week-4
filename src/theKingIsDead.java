import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class theKingIsDead {
    public static void main(String[] args) {

        char[][] gameBoard = {
                {'=', '=', '=', '=', '=', '=', '=', '=',},
                {'X', '+', 'X', '+', 'X', '+', 'X'},
                {'=', '=', '=', '=', '=', '=', '=', '=',},
                {'X', '+', 'X', '+', 'X', '+', 'x'},
                {'=', '=', '=', '=', '=', '=', '=', '=',},
                {'X', '+', 'X', '+', 'X', '+', 'X'},
                {'=', '=', '=', '=', '=', '=', '=', '=',},
                {'X', '+', 'X', '+', 'X', '+', 'X'},
                {'=', '=', '=', '=', '=', '=', '=', '=',},
                {'X', '+', 'X', '+', 'X', '+', 'X'},
                {'=', '=', '=', '=', '=', '=', '=', '=',},
        };
        printGameBoard(gameBoard);
        Scanner scan = new Scanner(System.in);
        System.out.println("Place you pawn: ");
        int pos = scan.nextInt();
        System.out.println(pos);
    }

    public static void printGameBoard(char[][] gameBoard) {
        for (char[] row : gameBoard) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public class Spot {
        private Piece piece;
        private int x;
        private int y;

        public Spot(int x, int y, Piece piece) {
            this.setPiece(piece);
            this.setX(x);
            this.setY(y);
        }

        public Piece getPiece() {
            return this.piece;
        }

        public void setPiece(Piece p) {
            this.piece = p;
        }

        public int getX() {
            return this.x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return this.y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }

    public abstract class Piece {

        private boolean killed = false;
        private boolean white = false;

        public Piece(boolean white) {
            this.setWhite(white);
        }

        public Piece(int x, int y, boolean isWhite) {
        }

        public boolean isWhite() {
            return this.white == true;
        }

        public void setWhite(boolean white) {
            this.white = white;
        }

        public boolean isKilled() {
            return this.killed == true;
        }

        public void setKilled(boolean killed) {
            this.killed = killed;
        }

        public abstract boolean canMove(char[][] gameBoard, Spot start, Spot end);
    }

    public class gameBoard {
        Spot[][] boxes;

        public gameBoard() {
            this.Board();
        }

        public Spot getBox(int x, int y) throws Exception {

            if (x < 1 || x > 6 || y < 1 || y > 6) {
                throw new Exception("Index out of bound");
            }

            return boxes[x][y];
        }
        public void Board() {

            // white pawns
            boxes[1][1] = new Spot(0, 0, new Dw(true);
            boxes[1][2] = new Spot(0, 0, new M(true));
            boxes[1][3] = new Spot(0, 0, new K(true));
            boxes[1][4] = new Spot(0, 0, new Q(true));
            boxes[1][5] = new Spot(0, 0, new D(true));
            boxes[1][6] = new Spot(0, 2, new Dw(true));

            // black pawns
            boxes[6][1] = new Spot(7, 0, new Dw(true));
            boxes[6][2] = new Spot(0, 0, new M(true));
            boxes[6][3] = new Spot(0, 0, new K(true));
            boxes[6][4] = new Spot(0, 0, new Q(true));
            boxes[6][5] = new Spot(0, 0, new D(true));
            boxes[6][6] = new Spot(6, 1, new Dw(true));

            for (int i = 2; i < 6; i++) {
                for (int j = 0; j < 8; j++) {
                    boxes[i][j] = new Spot(i, j, null);
                }
            }
        }
            public class PlayerOne {
                public boolean whiteSide;

                public boolean White() { return this.whiteSide == true;
                }
            }

            public abstract class PlayerTwo {
                public boolean blackSide;

                public boolean Black() {
                    return this.blackSide == true;
                }
            }

        private void Dw(gameBoard board, ArrayList<Spot> moves) {
            int x = getBox(x);
            int y = getBox(y);

    }
}
}