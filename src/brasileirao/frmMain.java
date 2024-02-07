package brasileirao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;

public class frmMain {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmMain window = new frmMain();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public frmMain() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnuRegisters = new JMenu("Registers");
		menuBar.add(mnuRegisters);
		
		JMenuItem mnuTeams = new JMenuItem("Teams");
		mnuTeams.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T, InputEvent.CTRL_DOWN_MASK));
		mnuRegisters.add(mnuTeams);
		
		JMenuItem mnuPlayers = new JMenuItem("Players");
		mnuPlayers.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, InputEvent.CTRL_DOWN_MASK));
		mnuRegisters.add(mnuPlayers);
		
		JMenuItem mnuChampionships = new JMenuItem("Championships");
		mnuChampionships.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK));
		mnuRegisters.add(mnuChampionships);
		
		JMenu mnuMatches = new JMenu("Matches");
		menuBar.add(mnuMatches);
		
		JMenuItem mnuGames = new JMenuItem("Games");
		mnuGames.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, InputEvent.CTRL_DOWN_MASK));
		mnuMatches.add(mnuGames);
	}

}
