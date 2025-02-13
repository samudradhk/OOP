/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tictactoe;
import java.util.Scanner;
/**
 *
 * @author Samudra Bryandhika P
 */
public class Board {
    private char[][] board;
    
    public Board(){
        board = new char[][]{
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
        };
    }
    
    public void printBoard(){
        System.out.println("Board:");
        for(int i = 0;i<3;i++){
            for(int j = 0;j<3;j++){
                System.out.print(" " + board[i][j]);
                if(j<2) System.out.print(" |");
            }
            System.out.println();
            if(i<2) System.out.println("---+---+---");
        }
    }
    
    public boolean makeMove(int row, int col, char player){
        if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ') {
            board[row][col] = player;
            return true;
        }
        return false;
    }
    
    public boolean checkWin(char player) {
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) ||
                (board[0][i] == player && board[1][i] == player && board[2][i] == player)) {
                return true;
            }
        }
        return (board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
               (board[0][2] == player && board[1][1] == player && board[2][0] == player);
    }
    
    public boolean isFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}
