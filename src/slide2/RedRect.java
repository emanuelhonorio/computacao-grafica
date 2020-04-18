package slide2;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class RedRect extends Frame {
	
	private static final long serialVersionUID = 1L;

	public static void main(String[] args){
		new RedRect();
	}
	
	RedRect() {
		super("RedRect");
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		setSize (200, 100);
		add("Center", new CvRedRect());
		setVisible(true);
		
	}

}