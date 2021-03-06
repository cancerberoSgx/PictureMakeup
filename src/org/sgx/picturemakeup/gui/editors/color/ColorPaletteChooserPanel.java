package org.sgx.picturemakeup.gui.editors.color;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.colorchooser.*;

/**
 * of sun tut:
 *  ColorChooserDemo.java is a 1.4 application that requires no other files.
 * @author sgx
 *
 */
public class ColorPaletteChooserPanel extends JPanel
                              implements ChangeListener {

   
	private static final long serialVersionUID = 1L;
	protected JColorChooser tcc;
    protected JLabel banner;
    JButton accept;//, cancel;
    public ColorPaletteChooserPanel() {
        super(new BorderLayout());

        //Set up the banner at the top of the window
        banner = new JLabel("select a color from the palette",
                            JLabel.CENTER);
//        banner.setForeground(Color.yellow);
//        banner.setBackground(Color.blue);
        banner.setOpaque(true);
//        banner.setFont(new Font("SansSerif", Font.BOLD, 24));
//        banner.setPreferredSize(new Dimension(100, 65));

        JPanel bannerPanel = new JPanel(new BorderLayout());
        bannerPanel.add(banner, BorderLayout.CENTER);
//        bannerPanel.setBorder(BorderFactory.createTitledBorder("Banner"));

        //Set up color chooser for setting text color
        tcc = new JColorChooser(banner.getForeground());
        tcc.getSelectionModel().addChangeListener(this);
        tcc.setBorder(BorderFactory.createTitledBorder(
                                             "Choose Text Color"));

        JButton accept = new JButton("Accept"), cancel=new JButton("Cancel");
        accept.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}        	
        });
        cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}        	
        });
        add(bannerPanel, BorderLayout.CENTER);
        add(tcc, BorderLayout.PAGE_END);
    }

    public void stateChanged(ChangeEvent e) {
        Color newColor = tcc.getColor();
        banner.setForeground(newColor);
    }

    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
        //Make sure we have nice window decorations.
        JFrame.setDefaultLookAndFeelDecorated(true);

        //Create and set up the window.
        JFrame frame = new JFrame("ColorChooserDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create and set up the content pane.
        JComponent newContentPane = new ColorPaletteChooserPanel();
        newContentPane.setOpaque(true); //content panes must be opaque
        frame.setContentPane(newContentPane);

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}