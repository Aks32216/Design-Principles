import java.util.*;

public class Game {
    private Board board;
    private Deque<Player> players;

    Game(int size){
        players=new LinkedList<>();
        board=new Board(size);
        Player player1=new Player("P1",new PieceO());
        Player player2=new Player("P2",new PieceX());

        players.add(player1);
        players.add(player2);
    }

    public String startGame(){
        Boolean isNoWinner=true;
        while(isNoWinner){
            Player nextPlayer = players.pollFirst();

            List<Pair> availableCells = board.getFreeCells();

            if(availableCells.isEmpty()){
                isNoWinner=false;
                continue;
            }

            Scanner scn = new Scanner(System.in);
            System.out.println("Player: "+nextPlayer.getName()+", enter your choice");
            String choice = scn.nextLine();
            String[] grids= choice.split(",");
            int row=Integer.parseInt(grids[0]);
            int col=Integer.parseInt(grids[1]);

            if(!board.setCell(row,col,nextPlayer.getPiece())){
                System.out.println("Wrong cell selected. Try again");
                continue;
            }
            players.addLast(nextPlayer);

            if(isThereWinner()){
                return nextPlayer.getName();
            }
        }
        return "Tie";
    }

    public boolean isThereWinner(int row, int column, PieceType pieceType) {

        boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        //need to check in row
        for(int i=0;i<board.getSize();i++) {

            if(board[row][i] == null || board[row][i].pieceType != PieceType) {
                rowMatch = false;
            }
        }

        //need to check in column
        for(int i=0;i<gameBoard.size;i++) {

            if(gameBoard.board[i][column] == null || board[i][column].pieceType != pieceType) {
                columnMatch = false;
            }
        }

        //need to check diagonals
        for(int i=0, j=0; i<gameBoard.size;i++,j++) {
            if (gameBoard.board[i][j] == null || gameBoard.board[i][j].pieceType != pieceType) {
                diagonalMatch = false;
            }
        }

        //need to check anti-diagonals
        for(int i=0, j=gameBoard.size-1; i<gameBoard.size;i++,j--) {
            if (gameBoard.board[i][j] == null || gameBoard.board[i][j].pieceType != pieceType) {
                antiDiagonalMatch = false;
            }
        }

        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;
    }

}
