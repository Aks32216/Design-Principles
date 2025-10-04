import java.util.ArrayList;
import java.util.List;

public class Board {
    public int size;
    public Piece[][] board;

    Board(int size){
        this.size=size;
        board=new Piece[size][size];
    }

    public int getSize(){
        return this.size;
    }

    public Boolean setCell(int row,int col,Piece piece){
        if(row<0 || col<0 || row>=size || col>=size || board[row][col]!=null){
            return false;
        }
        board[row][col]=piece;
    }

    public void displayBoard(){
        for(int i=0;i<size;++i){
            System.out.println("| ");
            for(int j=0;j<size;++j){
                System.out.println(board[i][j].getPieceType() + " | ");
            }
        }
    }

    public List<Pair> getFreeCells(){
        List<Pair> freeCell=new ArrayList<>();
        for(int i=0;i<size;++i){
            for(int j=0;j<size;++j){
                if(board[i][j]==null){
                    freeCell.add(new Pair(i,j));
                }
            }
        }
        return freeCell;
    }
}
