import java.util.Scanner;

public class Game {

    public static void main(String[] args) {

        Cell cell = new Cell();
        Scanner scanner = new Scanner(System.in);
        CellStatus turn = CellStatus.X;
        int rest = 9;

        while (rest > 0) {
            System.out.println(turn + " turn");
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            if (Math.min(x, y) < 0 || Math.max(x, y) > 2 || cell.getCell(x, y) != CellStatus.EMPTY) {
                System.out.println("Invalid, try again!");
                cell.getBoard();
                continue;
            }
            --rest;
            cell.setCell(x, y, turn);
            if (turn == CellStatus.O)
                turn = CellStatus.X;
            else
                turn = CellStatus.O;
            cell.getBoard();
            if (cell.checkEndgame() == true) {
                return;
            }
        }
        System.out.print("Draw!");
    }
}
