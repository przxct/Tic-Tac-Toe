
public class Board {

    public CellStatus[][] cell = new CellStatus[3][3];

    public void getBoard() {
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                if (cell[i][j] == CellStatus.EMPTY)
                    System.out.print("[]");
                else
                    System.out.print('[' + cell[i][j].toString() + ']');
            }
            System.out.println();
        }
    }

}
