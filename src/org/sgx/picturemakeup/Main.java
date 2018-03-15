package org.sgx.picturemakeup;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import org.sgx.picturemakeup.gui.ImageEditorFrame;

public class Main {

	public static void main(String[] argv) {

		ImageEditorFrame frame = new ImageEditorFrame();
		frame.setVisible(true);
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		frame.setSize(800, 600);
		frame.getImg().setSize(200, 200);
		frame.getjSplitPane().setDividerLocation(300);

	}

}
