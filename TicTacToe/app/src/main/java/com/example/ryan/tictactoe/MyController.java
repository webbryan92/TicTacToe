package com.example.ryan.tictactoe;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Button;
import java.net.*;
import java.io.*;
import android.os.Handler;
import java.lang.String;

class MyController extends LinearLayout {

    String cpuMove = "";
    char cpuPos = ' ';
    final int buttons[] = {R.id.button0, R.id.button1, R.id.button2, R.id.button3, R.id.button4, R.id.button5,R.id.button6, R.id.button7, R.id.button8};


    private void sendServer(final String str, final MyModel myModel, final MyView myView) {
        new Thread(new Runnable() {
            public void run() {
                try {
                    Socket s = new Socket("149.160.10.2", 1490);
                    BufferedReader in = new BufferedReader(            // Socket input and output
                            new InputStreamReader(
                                    s.getInputStream() ) );
                    PrintStream out = new PrintStream(s.getOutputStream());
                    out.println(str);					// Write to Server
                    cpuMove = in.readLine();			// Read from Server
                    System.out.println(cpuMove);
                    cpuPos = cpuMove.charAt(0);
                    System.out.println(cpuPos);
                    myModel.setMove(cpuPos);
                    move = '5';
                    final Button b = (Button) view.findViewById(buttons[move-'0']);
                    b.setText("X");
                    /*if (myModel.getGameOver() == true) {
                        myView.setView("X Wins");
                    }*/

                    in.close();
                    out.close();                                                        // Close file
                    s.close();                                                          // Close connection
                }
                catch(Exception e) {
                    System.out.print(e+"");
                }
            }
        }).start();
    }


    public MyController(Activity activity, final MyModel myModel, final MyView myView) {
		super(activity, null);
		LayoutInflater layoutInflater = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View view = layoutInflater.inflate(R.layout.keyboard, this);
        int move;

 
		final Button button0 = (Button) view.findViewById(R.id.button0);
		button0.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
                if (myModel.getGameOver() != true) {
                    if (myModel.setMove('0')) {
                        button0.setText("O");
                    }
                    if (myModel.getGameOver() == true) {
                        myView.setView("O Wins");
                    }
                }
                if (myModel.getGameOver() != true) {

                    String board = new String(myModel.getBoard());
                    sendServer(board, myModel, myView);
                    System.out.println(board);
                }
			}
		});
		
		final Button button1 = (Button) view.findViewById(R.id.button1);
		button1.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
                if (myModel.getGameOver() != true) {
                    if (myModel.setMove('1')) {
                        char player = myModel.getPlayer();
                        String play = Character.toString(player);
                        button1.setText(play);
                        if(player == 'X'){
                            myView.setView("O's Turn");
                        }
                        else{
                            myView.setView("X's Turn");
                        }
                    }
                    if (myModel.getGameOver() == true) {
                        myView.setView(Character.toString(myModel.getPlayer()) + " Wins");
                    }
                }
			}
		}); 
		
		final Button button2 = (Button) view.findViewById(R.id.button2);
		button2.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
                if (myModel.getGameOver() != true) {
                    if (myModel.setMove('2')) {
                        char player = myModel.getPlayer();
                        String play = Character.toString(player);
                        button2.setText(play);
                        if(player == 'X'){
                            myView.setView("O's Turn");
                        }
                        else{
                            myView.setView("X's Turn");
                        }
                    }
                    if (myModel.getGameOver() == true) {
                        myView.setView(Character.toString(myModel.getPlayer()) + " Wins");
                    }
                }
			}
		}); 
		
		final Button button3 = (Button) view.findViewById(R.id.button3);
		button3.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
                if (myModel.getGameOver() != true) {
                    if (myModel.setMove('3')) {
                        char player = myModel.getPlayer();
                        String play = Character.toString(player);
                        button3.setText(play);
                        if(player == 'X'){
                            myView.setView("O's Turn");
                        }
                        else{
                            myView.setView("X's Turn");
                        }
                    }
                    if (myModel.getGameOver() == true) {
                        myView.setView(Character.toString(myModel.getPlayer()) + " Wins");
                    }
                }
			}
		}); 
		
		final Button button4 = (Button) view.findViewById(R.id.button4);
		button4.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
                if (myModel.getGameOver() != true) {
                    if (myModel.setMove('4')) {
                        char player = myModel.getPlayer();
                        String play = Character.toString(player);
                        button4.setText(play);
                        if(player == 'X'){
                            myView.setView("O's Turn");
                        }
                        else{
                            myView.setView("X's Turn");
                        }
                    }
                    if (myModel.getGameOver() == true) {
                        myView.setView(Character.toString(myModel.getPlayer()) + " Wins");
                    }
                }
			}
		}); 
		
		final Button button5 = (Button) view.findViewById(R.id.button5);
		button5.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
                if (myModel.getGameOver() != true) {
                    if (myModel.setMove('5')) {
                        char player = myModel.getPlayer();
                        String play = Character.toString(player);
                        button5.setText(play);
                        if(player == 'X'){
                            myView.setView("O's Turn");
                        }
                        else{
                            myView.setView("X's Turn");
                        }
                    }
                    if (myModel.getGameOver() == true) {
                        myView.setView(Character.toString(myModel.getPlayer()) + " Wins");
                    }
                }
			}
		}); 
		
		final Button button6 = (Button) view.findViewById(R.id.button6);
		button6.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
                if (myModel.getGameOver() != true) {
                    if (myModel.setMove('6')) {
                        char player = myModel.getPlayer();
                        String play = Character.toString(player);
                        button6.setText(play);
                        if(player == 'X'){
                            myView.setView("O's Turn");
                        }
                        else{
                            myView.setView("X's Turn");
                        }
                    }
                    if (myModel.getGameOver() == true) {
                        myView.setView(Character.toString(myModel.getPlayer()) + " Wins");
                    }
                }
			}
		}); 
		
		final Button button7 = (Button) view.findViewById(R.id.button7);
		button7.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
                if (myModel.getGameOver() != true) {
                    if (myModel.setMove('7')) {
                        char player = myModel.getPlayer();
                        String play = Character.toString(player);
                        button7.setText(play);
                        if(player == 'X'){
                            myView.setView("O's Turn");
                        }
                        else{
                            myView.setView("X's Turn");
                        }
                    }
                    if (myModel.getGameOver() == true) {
                        myView.setView(Character.toString(myModel.getPlayer()) + " Wins");
                    }
                }
			}
		}); 
		
		final Button button8 = (Button) view.findViewById(R.id.button8);
		button8.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
                if (myModel.getGameOver() != true) {
                    if (myModel.setMove('8')) {
                        char player = myModel.getPlayer();
                        String play = Character.toString(player);
                        button8.setText(play);
                        if(player == 'X'){
                            myView.setView("O's Turn");
                        }
                        else{
                            myView.setView("X's Turn");
                        }
                    }
                    if (myModel.getGameOver() == true) {
                        myView.setView(Character.toString(myModel.getPlayer()) + " Wins");
                    }
                }
            }
		});
	}
}
