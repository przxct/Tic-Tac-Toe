public class Cell extends Board{

    public Cell() {
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                cell[i][j] = CellStatus.EMPTY;
            }
        }
    }

    public void setCell(int x, int y, CellStatus status) {
        cell[x][y] = status;
    }

    public CellStatus getCell(int x, int y) {
        return cell[x][y];
    }

    public boolean checkEndgame() {
        for (int i = 0; i < 3; ++i) {
            if (cell[i][0] == cell[i][1] && cell[i][1] == cell[i][2] && cell[i][0] != CellStatus.EMPTY) {
                if (cell[i][0] == CellStatus.X) {
                    System.out.println("X win!");
                }
                else {
                    System.out.println("Y win!");
                }
                return true;
            }
        }
        for (int i = 0; i < 3; ++i) {
            if (cell[0][i] == cell[1][i] && cell[1][i] == cell[2][i] && cell[0][i] != CellStatus.EMPTY) {
                if (cell[0][i] == CellStatus.X) {
                    System.out.println("X win!");
                }
                else {
                    System.out.println("Y win!");
                }
                return true;
            }
        }
        if (cell[0][0] == cell[1][1] && cell[1][1] == cell[2][2] && cell[0][0] != CellStatus.EMPTY) {
            if (cell[0][0] == CellStatus.X) {
                System.out.println("X win!");
            }
            else {
                System.out.println("Y win!");
            }
            return true;
        }
        if (cell[0][2] == cell[1][1] && cell[1][1] == cell[2][0] && cell[0][2] != CellStatus.EMPTY) {
            if (cell[0][2] == CellStatus.X) {
                System.out.println("X win!");
            }
            else {
                System.out.println("Y win!");
            }
            return true;
        }
        return false;
    }

}
