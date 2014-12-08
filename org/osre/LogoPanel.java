package org.osre;

import org.osre.*;

import java.awt.*;
import javax.swing.*;
import java.lang.*;
import java.net.URL;

class LogoPanel extends JPanel {

    private Image img;

    public LogoPanel() {
	URL url = LogoPanel.class.getResource("/org/osre/logo2.jpg");
	img = new ImageIcon(url).getImage();
	Dimension size = new Dimension(img.getWidth(null),img.getHeight(null));
	setPreferredSize(size);
	setMinimumSize(size);
	setMaximumSize(size);
	setSize(size);
	setLayout(null);
    }
	

    public void paintComponent(Graphics g) {
	//	URL url = LogoPanel.class.getResource("/org/osre/logo2.jpg");
	//	Image image = new ImageIcon(url).getImage();
	g.drawImage(img,0,0,this);
    }
}
