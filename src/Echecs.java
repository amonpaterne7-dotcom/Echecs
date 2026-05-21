public class Echecs {

    static class Position {
        int row, column;
        Position(int row, int column) {
            this.row = row;
            this.column = column;
        }
    }

    static class Piece {
        Position position = new Position(1, 1);
    }

    static class Rock extends Piece {
        boolean isValidMove(Position p) {
            return p.row == position.row || p.column == position.column;
        }
    }

    static class Bishop extends Piece {
        boolean isValidMove(Position p) {
            return Math.abs(p.row - position.row) == Math.abs(p.column - position.column);
        }
    }

    static class Queen extends Piece {
        boolean isValidMove(Position p) {
            return p.row == position.row
                    || p.column == position.column
                    || Math.abs(p.row - position.row) == Math.abs(p.column - position.column);
        }
    }

    public static void main(String[] args) {
        Queen queen = new Queen();
        queen.position = new Position(4, 4);
        System.out.println(queen.isValidMove(new Position(4, 7))); // true
        System.out.println(queen.isValidMove(new Position(2, 6))); // false
    }
}
