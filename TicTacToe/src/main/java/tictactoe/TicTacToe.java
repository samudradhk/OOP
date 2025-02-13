/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tictactoe;
import java.util.Scanner;
/**
 *
 * @author Samudra Bryandhika P
 */
public class TicTacToe {
    private Board board;
    private Player player1,player2;
    private Scanner scanner;
    
    public TicTacToe(){
        board = new Board();
        player1 = new Player('O');
        player2 = new Player('X');
        scanner = new Scanner(System.in);
    }
    
    public void startGame(){
        System.out.println("Selamat Datang di TicTacToe");
        board.printBoard();
        Player currentPlayer = player1;
        
        while(true){
            System.out.print("Player " + currentPlayer.getsymbol() + " move[row][col]: ");
            int row = scanner.nextInt() -1;
            int col = scanner.nextInt() -1;
            
            if(board.makeMove(row, col, currentPlayer.getsymbol())){
                board.printBoard();
                if(board.checkWin(currentPlayer.getsymbol())){
                    System.out.println("Player "+ currentPlayer.getsymbol()+ " wins!!!");
                    break;
                }else if(board.isFull()){
                    System.out.println("tidak ada yang menang, silahkan coba lagi!!");
                    break;
                }
                currentPlayer = (currentPlayer == player1) ? player2 : player1;
            }else{
                System.out.println("langkah yang salah, silahkan coba lagi");
            }
        }
        scanner.close();
    }
}
