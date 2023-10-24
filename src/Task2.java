public class Task2 {

    public static void main(String[] args) {
        char initialColumn = 'd';
        int initialRow = 4;
        char targetColumn = 'b';
        int targetRow = 3;

        if (isValidKnightMove(initialColumn, initialRow, targetColumn, targetRow)) {
            System.out.println("Це допустимий хід для коня.");
        } else {
            System.out.println("Це не допустимий хід для коня.");
        }
    }

    public static boolean isValidKnightMove(char initialColumn, int initialRow, char targetColumn, int targetRow) {
        if (isOutsideBoard(initialColumn, initialRow) || isOutsideBoard(targetColumn, targetRow)) {
            return false;
        }

        int columnDifference = Math.abs(initialColumn - targetColumn);
        int rowDifference = Math.abs(initialRow - targetRow);

        return (columnDifference == 1 && rowDifference == 2) || (columnDifference == 2 && rowDifference == 1);
    }

    public static boolean isOutsideBoard(char column, int row) {
        return column < 'a' || column > 'h' || row < 1 || row > 8;
    }
}