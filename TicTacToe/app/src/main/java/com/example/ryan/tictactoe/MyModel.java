package com.example.ryan.tictactoe;

public class MyModel {
    private char board[]={'0','1','2','3','4','5','6','7','8'};
    private char player='O';
    private char move='9';

    public MyModel() { }

    public boolean setMove(char c) {     // Return true on valid move
        int at = c-'0';
        move = c;
        if(at < 0  || at > 8 || board[at] == 'X' || board[at] == 'O')
            return false;

        board [at] = player;

        if(player == 'X')
            player = 'O';
        else
            player = 'X';
        return true;
    }

    public boolean getWin() {               // Return win state
        return
                (board[0]==board[3] && board[3]==board[6]) ||
                        (board[1]==board[4] && board[4]==board[7]) ||
                        (board[2]==board[5] && board[5]==board[8]) ||
                        (board[0]==board[1] && board[1]==board[2]) ||
                        (board[3]==board[4] && board[4]==board[5]) ||
                        (board[6]==board[7] && board[7]==board[8]) ||
                        (board[0]==board[4] && board[4]==board[8]) ||
                        (board[2]==board[4] && board[4]==board[6]);
    }

    public char getMove() { return move; }

    public char [] getBoard() { return board; }

    public char getPlayer() { return player; }

    public boolean getGameOver() {
        if(getWin()) return true;
        for(int i=0; i<9; i++)
            if(board[i] != 'X' && board[i] != 'O') return false;
        return true;
    }
}