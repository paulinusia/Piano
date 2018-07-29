import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;



/* P: Create a GUI class that includes buttons for each sound file, every note, two metronome tempos, a stop button for the metronome tempos, and
 * 	  buttons for the history, clear history, and number of notes played
 * I: ActionListener, so when a button is clicked, the program will respond accordingly
 * P: Create buttons and pop-ups that will will react when commanded
 * O: The actions should occur when the buttons are pressed */

public class Keyboard extends Metronome{

//Creates JFrame window for the application	
	private JFrame KEYBOARD;
	

	
	//Launches the application
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					Keyboard window = new Keyboard();
					window.KEYBOARD.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	//Created the application.
	public Keyboard() {
		super();
		initialize();	}

	//Initializes contents of the frame
	private void initialize() {
		KEYBOARD = new JFrame();
		
		
		KEYBOARD.setFont(new Font("AR ESSENCE", Font.PLAIN, 18));
		KEYBOARD.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 15));
		KEYBOARD.getContentPane().setBackground(new Color(230, 230, 250));
		KEYBOARD.setBackground(new Color(255, 192, 203));
		KEYBOARD.setBounds(100, 100, 1044, 798);
		KEYBOARD.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		//loads new sound clip E FLAT key
		JButton eFlat = new JButton("Eb");
		eFlat.setBounds(496, 152, 45, 188);
		eFlat.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				//key.playMusic("eFlat");	}
			playMusic("eFlat");
			}
		});
		
		//loads new sound clip F SHARP key
		JButton fSharp = new JButton("F#");
		fSharp.setBounds(592, 152, 43, 188);
		fSharp.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				playMusic("fSharp");	}
		});
		
		//loads new sound clip G SHARP key
		JButton gSharp = new JButton("G#");
		gSharp.setBounds(152, 152, 43, 188);
		gSharp.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				playMusic("gSharp");	}
		});
		
		//loads new sound clip B FLAT key
		JButton bFlat = new JButton("Bb");
		bFlat.setBounds(239, 152, 43, 188);
		bFlat.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				playMusic("bFlat");	}
		});
		
		//loads new sound clip C SHARP key
		JButton cSharp = new JButton("C#");
		cSharp.setBounds(412, 152, 43, 188);
		cSharp.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				playMusic("cSharp");	}
		});
		
		//loads new sound clip A key
		JButton aKey = new JButton("a");
		aKey.setBounds(91, 349, 86, 303);
		aKey.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				playMusic("a");	}
		});		
		
		
		//loads new sound clip B key
		JButton bKey = new JButton("b");
		bKey.setBounds(177, 349, 86, 303);
		bKey.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playMusic("b");
				
			}
		});
		
		//loads new sound clip G key
				JButton gKey = new JButton("g");
				gKey.setBounds(607, 349, 86, 303);
				gKey.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						playMusic("g");	}
				});
				
				
				//loads new sound clip D key
				JButton dKey = new JButton("d");
				dKey.setBounds(349, 349, 86, 303);
				dKey.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						playMusic("d");	}
				});
				
				//loads new sound clip E key
				JButton eKey = new JButton("e");
				eKey.setBounds(435, 349, 86, 303);
				eKey.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						playMusic("e");	}
				});
			
				
				//loads new sound clip C key
				JButton cKey = new JButton("c");
				cKey.setBounds(263, 349, 86, 303);
				cKey.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						playMusic("c");	}
				});
				
				//loads new sound clip F key
				JButton fKey = new JButton("f");
				fKey.setBounds(521, 349, 86, 303);
				fKey.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						playMusic("f");	}
				});
		
		//SETS FONTS, COLOR, AND ALIGNMENT FOR ALL KEYS
		KEYBOARD.getContentPane().setLayout(null);
		cSharp.setVerticalAlignment(SwingConstants.TOP);
		cSharp.setForeground(Color.WHITE);
		cSharp.setFont(new Font("Agency FB", Font.BOLD, 10));
		cSharp.setBackground(Color.BLACK);
		KEYBOARD.getContentPane().add(cSharp);
		
		
		bFlat.setVerticalAlignment(SwingConstants.TOP);
		bFlat.setForeground(Color.WHITE);
		bFlat.setFont(new Font("Agency FB", Font.PLAIN, 9));
		bFlat.setBackground(Color.BLACK);
		KEYBOARD.getContentPane().add(bFlat);
		
		
		gSharp.setVerticalAlignment(SwingConstants.TOP);
		gSharp.setForeground(Color.WHITE);
		gSharp.setFont(new Font("Agency FB", Font.BOLD, 10));
		gSharp.setBackground(Color.BLACK);
		KEYBOARD.getContentPane().add(gSharp);
		
		
		fSharp.setVerticalAlignment(SwingConstants.TOP);
		fSharp.setForeground(Color.WHITE);
		fSharp.setFont(new Font("Agency FB", Font.BOLD, 10));
		fSharp.setBackground(Color.BLACK);
		KEYBOARD.getContentPane().add(fSharp);
		
		
		eFlat.setVerticalAlignment(SwingConstants.TOP);
		eFlat.setForeground(Color.WHITE);
		eFlat.setFont(new Font("Agency FB", Font.BOLD, 10));
		eFlat.setBackground(Color.BLACK);
		KEYBOARD.getContentPane().add(eFlat);
		
		
		aKey.setVerticalAlignment(SwingConstants.TOP);
		KEYBOARD.getContentPane().add(aKey);
		aKey.setForeground(Color .BLACK);
		aKey.setBackground(new Color(245, 245, 245));
		aKey.setFont(new Font("AR BONNIE", Font.BOLD, 20));
		
		
		bKey.setVerticalAlignment(SwingConstants.TOP);
		bKey.setForeground(Color.BLACK);
		bKey.setFont(new Font("AR BONNIE", Font.BOLD, 20));
		bKey.setBackground(new Color(245, 245, 245));
		KEYBOARD.getContentPane().add(bKey);
		
		
		gKey.setVerticalAlignment(SwingConstants.TOP);
		gKey.setForeground(Color.BLACK);
		gKey.setFont(new Font("AR BONNIE", Font.BOLD, 20));
		gKey.setBackground(new Color(245, 245, 245));
		KEYBOARD.getContentPane().add(gKey);
		
		
		eKey.setVerticalAlignment(SwingConstants.TOP);
		eKey.setForeground(Color.BLACK);
		eKey.setFont(new Font("AR BONNIE", Font.BOLD, 20));
		eKey.setBackground(new Color(245, 245, 245));
		KEYBOARD.getContentPane().add(eKey);
		
		
		dKey.setVerticalAlignment(SwingConstants.TOP);
		dKey.setForeground(Color.BLACK);
		dKey.setFont(new Font("AR BONNIE", Font.BOLD, 20));
		dKey.setBackground(new Color(245, 245, 245));
		KEYBOARD.getContentPane().add(dKey);
		
		
		fKey.setVerticalAlignment(SwingConstants.TOP);
		fKey.setForeground(Color.BLACK);
		fKey.setFont(new Font("AR BONNIE", Font.BOLD, 20));
		fKey.setBackground(new Color(245, 245, 245));
		KEYBOARD.getContentPane().add(fKey);
		
		
		cKey.setVerticalAlignment(SwingConstants.TOP);
		cKey.setForeground(Color.BLACK);
		cKey.setFont(new Font("AR BONNIE", Font.BOLD, 20));
		cKey.setBackground(new Color(245, 245, 245));
		KEYBOARD.getContentPane().add(cKey);
		
		
		
		
		
		//CREATES METRONOME BUTTON AND PROMPTS METRONOME TO PLAY BEAT WHEN CLICKED
		JButton metSTART = new JButton("4/4");
		metSTART.setBackground(new Color(240, 248, 255));
		metSTART.setBounds(754, 126, 72, 46);
		metSTART.setFont(new Font("Agency FB", Font.BOLD, 15));
		KEYBOARD.getContentPane().add(metSTART);
		
		metSTART.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playBeat("1_4");		}
		});
		
		
	
		
		//CREATES ANOTHER METRONOME BUTTON FOR A DIFFERENT TEMPO
		JButton four_four = new JButton("1/4");
		four_four.setBackground(new Color(240, 248, 255));
		four_four.setBounds(828, 126, 72, 46);
		four_four.setFont(new Font("Agency FB", Font.BOLD, 15));
		KEYBOARD.getContentPane().add(four_four);
		
		four_four.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playBeat("4_4");	}
		});
		
		
		//CREATES A BUTTON TO STOP METRONOMES FROM PLAYING
		JButton btnStop = new JButton("STOP");
		btnStop.setBackground(new Color(240, 248, 255));
		btnStop.setBounds(902, 126, 72, 46);
		btnStop.setFont(new Font("Agency FB", Font.BOLD, 14));
		KEYBOARD.getContentPane().add(btnStop);
		
		btnStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stopBeat();		}
		});
		
		
		//CREATES MAIN LABEL FOR PROGRAM
		JLabel lblKeyboard = new JLabel("KEYBOARD");
		lblKeyboard.setHorizontalAlignment(SwingConstants.CENTER);
		lblKeyboard.setForeground(new Color(25, 25, 112));
		lblKeyboard.setVerticalAlignment(SwingConstants.TOP);
		lblKeyboard.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblKeyboard.setBounds(0, 19, 1020, 61);
		KEYBOARD.getContentPane().add(lblKeyboard);
		
		
		
		
		//CREATES BUTTON TO SWITCH TO TAP SOUNDS
		JButton btnOctave = new JButton("TAP");
		btnOctave.setBackground(new Color(240, 248, 255));
		btnOctave.setBounds(754, 440, 97, 31);
		KEYBOARD.getContentPane().add(btnOctave);
		
		btnOctave.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				changeToClick();	}
		});
		

		
		
		
		//CREATES BUTTON TO SWITCH TO PIANO
		JButton btnPiano = new JButton("PIANO");
		btnPiano.setBackground(new Color(240, 248, 255));
		btnPiano.setBounds(868, 440, 106, 31);
		KEYBOARD.getContentPane().add(btnPiano);
		
		btnPiano.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				changeToPiano();			}
		});
	
		
		//CREATES BUTTON TO SWITCH TO MUSIC BOX NOISES
		JButton btnWobble = new JButton("BOX");
		btnWobble.setBackground(new Color(240, 248, 255));
		btnWobble.setBounds(754, 500, 97, 31);
		KEYBOARD.getContentPane().add(btnWobble);
		
		btnWobble.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				changeToBox();		}
		});
	
		//CREATES BUTTON TO SWITCH TO CHEMICAL LEAD
		JButton btnOboe = new JButton("WAAH");
		btnOboe.setBackground(new Color(240, 248, 255));
		btnOboe.setBounds(868, 500, 106, 31);
		KEYBOARD.getContentPane().add(btnOboe);
		
		btnOboe.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				changeToWah();		}
		});
		
		
		//CREATES BUTTON TO RETREIVE NUMBER OF NOTES
		JButton btnShowHistory = new JButton("NUMBER OF NOTES");
		btnShowHistory.setBackground(new Color(240, 248, 255));
		btnShowHistory.setBounds(754, 261, 220, 31);
		KEYBOARD.getContentPane().add(btnShowHistory);
		
		btnShowHistory.addMouseListener(new MouseAdapter() {
		
			public void mouseClicked(MouseEvent e) {
				JFrame parent = new JFrame();
				JOptionPane.showMessageDialog(parent, "Number of notes played:" + getNumberOfKeysPlayed());		}
		});
		
	
		
		
		//CREATES BUTTON TO RETRIEVE HISTORY
		JButton btnHistory = new JButton("HISTORY");
		btnHistory.setBackground(new Color(240, 248, 255));
		btnHistory.setBounds(754, 211, 220, 31);
		KEYBOARD.getContentPane().add(btnHistory);
		
		btnHistory.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				JFrame History = new JFrame();
				JOptionPane.showMessageDialog(History, "History of notes played: "+ /*key.getHistory() ); */
			getHistory());		}
		});
	
		
		
		//CREATES BUTTON TO CLEAR HISTORY
		JButton btnClearHistory = new JButton("CLEAR HISTORY");
		btnClearHistory.setBackground(new Color(240, 248, 255));
		btnClearHistory.setBounds(754, 311, 220, 31);
		KEYBOARD.getContentPane().add(btnClearHistory);
		
		btnClearHistory.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				clearHistory();
				clearNumberOfKeysPlayed();  }
		});
		
		//CREATES LABEL FOR SOUND LIBRARY SELECTION
		JLabel lblSoundLibrary = new JLabel("SOUND LIBRARY");
		lblSoundLibrary.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblSoundLibrary.setHorizontalAlignment(SwingConstants.CENTER);
		lblSoundLibrary.setBounds(754, 406, 220, 23);
		KEYBOARD.getContentPane().add(lblSoundLibrary);
		
		
		//CREATES LABEL FOR METRONOME SELECTION
		JLabel lblMetronome = new JLabel("METRONOME");
		lblMetronome.setHorizontalAlignment(SwingConstants.CENTER);
		lblMetronome.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblMetronome.setBounds(754, 77, 220, 40);
		KEYBOARD.getContentPane().add(lblMetronome);
		
	
		
		
		
		
		
		
		
		
		
	
		
	}
	}

