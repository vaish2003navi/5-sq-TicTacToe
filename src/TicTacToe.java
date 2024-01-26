import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TicTacToe implements ActionListener{
	
	Random random = new Random();
	JFrame frame = new JFrame();
	JPanel title_panel = new JPanel();
	JPanel button_panel = new JPanel();
	JLabel textfield = new JLabel();
	JButton[] buttons = new JButton[25];
	boolean player1_turn;
	
	TicTacToe(){
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 800);
		frame.getContentPane().setBackground(new Color(50, 50, 50));
		frame.setLayout(new BorderLayout());
		frame.setVisible(true);
		frame.setTitle("Tic-Tac-Toe");
		
		textfield.setBackground(new Color(152,255,179));
		textfield.setForeground(new Color(46,139,87));
		textfield.setFont(new Font("Andalus", Font.CENTER_BASELINE,75));
		textfield.setHorizontalAlignment(JLabel.CENTER);
		textfield.setText("TIC_tac_Toe");
		textfield.setOpaque(true);
		
		title_panel.setLayout(new BorderLayout());
		title_panel.setBounds(0,0,800,100);
		
		button_panel.setLayout(new GridLayout(5,5,5,5));
		button_panel.setBackground(new Color(155,155,155));
		
		for(int i=0; i<25; i++) {
			buttons[i] = new JButton();
			button_panel.add(buttons[i]);
			buttons[i].setFont(new Font("Andalus",Font.CENTER_BASELINE,75));
			//buttons[i].setMargin(new Insets(5,5,5,5));
			buttons[i].setFocusable(false);
			buttons[i].addActionListener(this);
			buttons[i].setBackground(new Color(46,139,87));
			buttons[i].setForeground(new Color(152,255,179));
		}
		
		title_panel.add(textfield);
		frame.add(title_panel,BorderLayout.NORTH);
		frame.add(button_panel);
		
		firstTurn();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		for(int i=0; i<25; i++) {
			if(e.getSource()==buttons[i]) {
				if(player1_turn) {
					if(buttons[i].getText()=="") {
						buttons[i].setForeground(new Color(152,255,179));
						buttons[i].setText("X");
						player1_turn=false;
						textfield.setText("O turn");
						check();
						
					}
				}
				else {
					if(buttons[i].getText()=="") {
						buttons[i].setForeground(new Color(179,255,152));
						buttons[i].setText("O");
						player1_turn=true;
						textfield.setText("X turn");
						check();
					}
				}
				
			}
		}
		
	}
	
	public void firstTurn() {
		
		try {
			Thread.sleep(1200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(random.nextInt(2)==0) {
			player1_turn=true;
			textfield.setText("X turn");
		}
		else {
			player1_turn = false;
			textfield.setText("O turn");
		}
	}
	
	public void check() {
		//For X
		if(	(buttons[0].getText()=="X")&&
			(buttons[1].getText()=="X")&&
			(buttons[2].getText()=="X")&&
			(buttons[3].getText()=="X")&&
			(buttons[4].getText()=="X")
			) {
			xWins(0, 1, 2, 3, 4);
		}
		if(	(buttons[5].getText()=="X")&&
			(buttons[6].getText()=="X")&&
			(buttons[7].getText()=="X")&&
			(buttons[8].getText()=="X")&&
			(buttons[9].getText()=="X")
			) {
			xWins(5, 6, 7, 8, 9);
			}
		if(	(buttons[10].getText()=="X")&&
			(buttons[11].getText()=="X")&&
			(buttons[12].getText()=="X")&&
			(buttons[13].getText()=="X")&&
			(buttons[14].getText()=="X")
			) {
			xWins(10, 11, 12, 13, 14);
			}
		if(	(buttons[15].getText()=="X")&&
			(buttons[16].getText()=="X")&&
			(buttons[17].getText()=="X")&&
			(buttons[18].getText()=="X")&&
			(buttons[19].getText()=="X")
			) {
			xWins(15, 16, 17, 18, 19);
			}
		if(	(buttons[20].getText()=="X")&&
			(buttons[21].getText()=="X")&&
			(buttons[22].getText()=="X")&&
			(buttons[23].getText()=="X")&&
			(buttons[24].getText()=="X")
			) {
			xWins(20, 21, 22, 23, 24);
			}
		if(	(buttons[0].getText()=="X")&&
			(buttons[5].getText()=="X")&&
			(buttons[10].getText()=="X")&&
			(buttons[15].getText()=="X")&&
			(buttons[20].getText()=="X")
			) {
			xWins(0, 5, 10, 15, 20);
			}
		if(	(buttons[1].getText()=="X")&&
			(buttons[6].getText()=="X")&&
			(buttons[11].getText()=="X")&&
			(buttons[16].getText()=="X")&&
			(buttons[21].getText()=="X")
			) {
			xWins(1, 6, 11, 16, 21);
			}
		if(	(buttons[2].getText()=="X")&&
			(buttons[7].getText()=="X")&&
			(buttons[12].getText()=="X")&&
			(buttons[17].getText()=="X")&&
			(buttons[22].getText()=="X")
			) {
			xWins(2, 7, 12, 17, 22);
			}
		if(	(buttons[3].getText()=="X")&&
			(buttons[8].getText()=="X")&&
			(buttons[13].getText()=="X")&&
			(buttons[18].getText()=="X")&&
			(buttons[23].getText()=="X")
			) {
			xWins(3, 8, 13, 18, 23);
			}
		if(	(buttons[4].getText()=="X")&&
			(buttons[9].getText()=="X")&&
			(buttons[14].getText()=="X")&&
			(buttons[19].getText()=="X")&&
			(buttons[24].getText()=="X")
			) {
			xWins(4, 9, 14, 19, 24);
			}
		if(	(buttons[0].getText()=="X")&&
			(buttons[6].getText()=="X")&&
			(buttons[12].getText()=="X")&&
			(buttons[18].getText()=="X")&&
			(buttons[24].getText()=="X")
			) {
			xWins(0, 6, 12, 18, 24);
			}
		if(	(buttons[4].getText()=="X")&&
			(buttons[8].getText()=="X")&&
			(buttons[12].getText()=="X")&&
			(buttons[16].getText()=="X")&&
			(buttons[20].getText()=="X")
			) {
			xWins(4, 8, 12, 16, 20);
			}
		// For O
		if(		(buttons[0].getText()=="O")&&
				(buttons[1].getText()=="O")&&
				(buttons[2].getText()=="O")&&
				(buttons[3].getText()=="O")&&
				(buttons[4].getText()=="O")
				) {
				oWins(0, 1, 2, 3, 4);
			}
			if(	(buttons[5].getText()=="O")&&
				(buttons[6].getText()=="O")&&
				(buttons[7].getText()=="O")&&
				(buttons[8].getText()=="O")&&
				(buttons[9].getText()=="O")
				) {
				oWins(5, 6, 7, 8, 9);
				}
			if(	(buttons[10].getText()=="O")&&
				(buttons[11].getText()=="O")&&
				(buttons[12].getText()=="O")&&
				(buttons[13].getText()=="O")&&
				(buttons[14].getText()=="O")
				) {
				oWins(10, 11, 12, 13, 14);
				}
			if(	(buttons[15].getText()=="O")&&
				(buttons[16].getText()=="O")&&
				(buttons[17].getText()=="O")&&
				(buttons[18].getText()=="O")&&
				(buttons[19].getText()=="O")
				) {
				oWins(15, 16, 17, 18, 19);
				}
			if(	(buttons[20].getText()=="O")&&
				(buttons[21].getText()=="O")&&
				(buttons[22].getText()=="O")&&
				(buttons[23].getText()=="O")&&
				(buttons[24].getText()=="O")
				) {
				oWins(20, 21, 22, 23, 24);
				}
			if(	(buttons[0].getText()=="O")&&
				(buttons[5].getText()=="O")&&
				(buttons[10].getText()=="O")&&
				(buttons[15].getText()=="O")&&
				(buttons[20].getText()=="O")
				) {
				oWins(0, 5, 10, 15, 20);
				}
			if(	(buttons[1].getText()=="O")&&
				(buttons[6].getText()=="O")&&
				(buttons[11].getText()=="O")&&
				(buttons[16].getText()=="O")&&
				(buttons[21].getText()=="O")
				) {
				oWins(1, 6, 11, 16, 21);
				}
			if(	(buttons[2].getText()=="O")&&
				(buttons[7].getText()=="O")&&
				(buttons[12].getText()=="O")&&
				(buttons[17].getText()=="O")&&
				(buttons[22].getText()=="O")
				) {
				oWins(2, 7, 12, 17, 22);
				}
			if(	(buttons[3].getText()=="O")&&
				(buttons[8].getText()=="O")&&
				(buttons[13].getText()=="O")&&
				(buttons[18].getText()=="O")&&
				(buttons[23].getText()=="O")
				) {
				oWins(3, 8, 13, 18, 23);
				}
			if(	(buttons[4].getText()=="O")&&
				(buttons[9].getText()=="O")&&
				(buttons[14].getText()=="O")&&
				(buttons[19].getText()=="O")&&
				(buttons[24].getText()=="O")
				) {
				oWins(4, 9, 14, 19, 24);
				}
			if(	(buttons[0].getText()=="O")&&
				(buttons[6].getText()=="O")&&
				(buttons[12].getText()=="O")&&
				(buttons[18].getText()=="O")&&
				(buttons[24].getText()=="O")
				) {
				oWins(0, 6, 12, 18, 24);
				}
			if(	(buttons[4].getText()=="O")&&
				(buttons[8].getText()=="O")&&
				(buttons[12].getText()=="O")&&
				(buttons[16].getText()=="O")&&
				(buttons[20].getText()=="O")
				) {
				oWins(4, 8, 12, 16, 20);
				}
	}
	
	public void xWins(int a, int b, int c, int d, int e) {
		buttons[a].setBackground(Color.GREEN);
		buttons[b].setBackground(Color.GREEN);
		buttons[c].setBackground(Color.GREEN);
		buttons[d].setBackground(Color.GREEN);
		buttons[e].setBackground(Color.GREEN);
		
		for(int i=0; i<25; i++) {
			buttons[i].setEnabled(false);
		}
		textfield.setText("X WINS");
	}
	public void oWins(int a, int b, int c, int d, int e) {
		buttons[a].setBackground(Color.GREEN);
		buttons[b].setBackground(Color.GREEN);
		buttons[c].setBackground(Color.GREEN);
		buttons[d].setBackground(Color.GREEN);
		buttons[e].setBackground(Color.GREEN);
		
		for(int i=0; i<25; i++) {
			buttons[i].setEnabled(false);
		}
		textfield.setText("O WINS");
	}
	

}
