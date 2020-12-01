package gameoflife.models;

public class Board {
    private static int _xSize = 10;
    private static int _ySize = 10;
    private Cell [][] cells = new Cell[_xSize][_ySize];
    public Board(){
        for(int i=0;i< _xSize;i++) {
            for(int j=0;j<_ySize;j++){
               cells[i][j] = new Cell();
            }
        }
    }
}
