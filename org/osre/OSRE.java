package org.osre;
import org.osre.*;

import java.io.*;
import javax.swing.SwingUtilities;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.tree.*;
import java.awt.Insets;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.GridBagLayout;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JMenu;
import javax.swing.JTextArea;
import javax.swing.JMenuItem;
import javax.swing.JDialog;
import javax.swing.WindowConstants;
import java.awt.Point;
import java.awt.Rectangle;
import java.net.*;
import javax.print.*;
	
public class OSRE extends JFrame {
			
    private static final long serialVersionUID = 1L;
	    
    private JPanel jContentPane = null;
    private JTabbedPane jTabbedPane = null;
    private JPanel tabPanel = null;
    private JMenuBar osreMenuBar = null;
    private JMenu osreMenu = null;
    private JMenuItem osreFileMenuItem = null;
    private JPanel hazPanel = null;
    private JPanel vulPanel = null;
    private JPanel damPanel = null;
    private JPanel lossPanel = null;
    private JPanel hazInputPanel = null;
    private JLabel hazSiteInputLabel = null;
    private JComboBox hazSiteInputComboBox = null;
    private JLabel hazMeasureInputLabel = null;
    private JComboBox hazMeasureInputComboBox = null;
    private JLabel hazVarLabel = null;
    private JPanel hazDataPanel = null;
    private JPanel hazImportPanel = null;
    private JPanel hazPlotPanel = null;
    private JScrollPane hazDataScrollPane = null;
    private JTable hazDataTable = null;
    private JButton hazImportButton = null;
    private JPanel vulSelectPanel = null;
    private JPanel vulDataPanel = null;
    private JLabel vulSelectLabel = null;
    private JPanel vulInputPanel = null;
    private JPanel vulPlotPanel = null;
    private JScrollPane vulDataScrollPane = null;
    private JTable vulDataTable = null;
    private JLabel vulVarLabel = null;
    private JPanel damCfPanel = null;
    private JPanel damDataPanel = null;
    private JPanel damInputPanel = null;
    private JLabel damSiteLabel = null;
    private JLabel damAssetLabel = null;
    private JScrollPane damDataScrollPane = null;
    private JTable damDataTable = null;
    private JPanel damPlotPanel = null;
    private JPanel lossPlotPanel = null;
    private JPanel lossDataPanel = null;
    private JPanel lossInputPanel = null;
    private JLabel assetValueLabel = null;
    private JTextField assetValueInputTextfield = null;
    private JComboBox assetValueInputComboBox = null;
    private JPanel hazCurvePanel = null;
    private JLabel damInputSiteLabel = null;
    private JPanel vulCurvePanel = null;
    private JPanel damCurvePanel = null;
    private JPanel lossCurvePanel = null;

    private JRadioButton jRadioButton = null;
    private JRadioButton jRadioButton1 = null;
    private ButtonGroup group = null;
    private Language lang = new Language();
    private String[] langText = lang.getLangText(1);
	
    private JTree vulSelectTree = null;
    private JScrollPane vulTreeScrollPane = null;
    private JLabel vulShowAssetLabel = null;
    private JScrollPane vulShowAssetScrollPane = null;
    private JPanel vulShowAssetPanel = null;
    private JLabel jLabel15 = null;
    
    private int areaNum,measureNum,assetNum;
    
    private JLabel damInputAssetLabel = null;
    private double hazVar, vulVar;
    
    private JComboBox hazVarComboBox = null;  
    private JComboBox vulVarComboBox = null;  
    private JLabel damHazLabel = null;
    private JLabel damHazVarLabel = null;
    private JLabel damHazVarValueLabel = null;
    private JLabel damVulVarLabel = null;
    private JLabel damVulVarValueLabel = null;
    private JLabel damVulLabel = null;
    private JPanel damSelectPanel = null;
    private JCheckBox damCfCheck1 = null;
    private JCheckBox damCfCheck10 = null;
    private JCheckBox damCfCheck20 = null;
    private JCheckBox damCfCheck30 = null;
    private JCheckBox damCfCheck40 = null;
    private JCheckBox damCfCheck50 = null;
    private JCheckBox damCfCheck60 = null;
    private JCheckBox damCfCheck70 = null;
    private JCheckBox damCfCheck80 = null;
    private JCheckBox damCfCheck90 = null;
    private JCheckBox damCfCheck99 = null;
    private JButton damCfPlotButton = null;

    private JScrollPane lossDataScrollPane = null;
    private JTable lossDataTable = null;
    private JPanel lossStatePanel = null;
    private JLabel lossHazLabel = null;
    private JLabel lossHazVarLabel = null;
    private JLabel lossHazVarValueLabel = null;
    private JLabel lossSiteLabel = null;
    private JLabel lossInputSiteLabel = null;
    private JLabel lossVulLabel = null;
    private JLabel lossVulVarLabel = null;
    private JLabel lossVulVarValueLabel = null;
    private JLabel lossAssetLabel = null;
    private JLabel lossInputAssetLabel = null;
    private JPanel lossSelectPanel = null;
    private JCheckBox lossCfCheck1 = null;
    private JCheckBox lossCfCheck10 = null;
    private JCheckBox lossCfCheck20 = null;
    private JCheckBox lossCfCheck30 = null;
    private JCheckBox lossCfCheck40 = null;
    private JCheckBox lossCfCheck50 = null;
    private JCheckBox lossCfCheck60 = null;
    private JCheckBox lossCfCheck70 = null;
    private JCheckBox lossCfCheck80 = null;
    private JCheckBox lossCfCheck90 = null;
    private JCheckBox lossCfCheck99 = null;
    private JButton lossCfPlotButton = null;

    private double[][] hazMatrix;
    private double[][] vulMatrix;
    private double[][] pdfMatrix;
    private boolean damFlag = false;

    private JMenu osreAboutMenu = null;
    private JMenu osreHelpMenu = null;
    private JPanel topLogoPanel = null;
    private JTextArea topTextArea = null;
    private JPanel vulImportPanel = null;
    private JButton vulImportButton = null;
    private JLabel hazNaviLabel = null;
    private JPanel topAccountPanel = null;

    private JMenuItem osreAboutMenuItem = null;
    private JMenuItem osreLicenseMenuItem = null;
    private JDialog aboutDialog = null;
    private JDialog licenseDialog = null;
    private JPanel aboutContentPane = null;
    private JPanel licenseContentPane = null;
    private JDialog helpDialog = null;
    private JPanel helpContentPane = null;
    private JDialog damCalcDialog = null;
    private JPanel damCalcContentPane = null;
    private JMenuItem osreHelpMenuItem = null;

    private JLabel vulMeasureTextLabel = null;
    private JLabel vulMeasureLabel = null;
    private RegexDocument regexDoc = null;
    private JEditorPane aboutPane = null;
    private JScrollPane aboutScrollPane = null;
    private JEditorPane licensePane = null;
    private JScrollPane licenseScrollPane = null;
    private JEditorPane helpPane = null;
    private JScrollPane helpScrollPane = null;  

    /**
     * This method initializes jTabbedPane	
     * 		
     * @return javax.swing.JTabbedPane	
     */
    private JTabbedPane getJTabbedPane() {
	if (jTabbedPane == null) {
	    jTabbedPane = new JTabbedPane();
	    jTabbedPane.setPreferredSize(new Dimension(790, 537));
	    jTabbedPane.setFont(new Font("Dialog", Font.BOLD, 14));
	    jTabbedPane.setBackground(Color.white);
	    jTabbedPane.addTab("Top", null, getTabPanel(), null);
	    jTabbedPane.addTab("1.Hazard", null, getHazPanel(), null);
	    jTabbedPane.addTab("2.Vulnerability", null, getVulPanel(), null);
	    jTabbedPane.addTab("3.Damage", null, getDamPanel(), null);
	    jTabbedPane.addTab("4.Loss", null, getLossPanel(), null);
	}		
	return jTabbedPane;
    }
    
    /**
     * This method initializes tabPanel	
     * 	
     * @return javax.swing.JPanel	
     */
    private JPanel getTabPanel() {
	if (tabPanel == null) {
	    GridBagConstraints gridBagConstraints14 = new GridBagConstraints();
	    gridBagConstraints14.gridx = 2;
	    gridBagConstraints14.gridy = 2;
	    GridBagConstraints gridBagConstraints47 = new GridBagConstraints();
	    gridBagConstraints47.insets = new Insets(0, 0, 0, 0);
	    gridBagConstraints47.gridx = 2;
	    gridBagConstraints47.gridy = 1;
	    gridBagConstraints47.gridwidth = 1;
	    gridBagConstraints47.gridheight = 1;
	    GridBagConstraints gridBagConstraints46 = new GridBagConstraints();
	    gridBagConstraints46.insets = new Insets(0, 0, 0, 0);
	    gridBagConstraints46.gridx = 1;
	    gridBagConstraints46.gridy = 0;
	    gridBagConstraints46.gridheight = 1;
	    GridBagConstraints gridBagConstraints45 = new GridBagConstraints();
	    gridBagConstraints45.insets = new Insets(0, 0, 0, 0);
	    gridBagConstraints45.gridx = 0;
	    gridBagConstraints45.gridy = 0;
	    gridBagConstraints45.gridheight = 1;
	    tabPanel = new JPanel();
	    tabPanel.setFont(new Font("Dialog", Font.PLAIN, 14));
	    tabPanel.setLayout(new GridBagLayout());
	    tabPanel.add(getJRadioButton(), gridBagConstraints45);
	    tabPanel.add(getJRadioButton1(), gridBagConstraints46);
	    tabPanel.add(getTopLogoPanel(), gridBagConstraints47);
	    tabPanel.add(getTopAccountPanel(), gridBagConstraints14);
	    
	    group = new ButtonGroup();
	    group.add(jRadioButton);
	    group.add(jRadioButton1);
	    
	}
	return tabPanel;
    }
    
    private JRadioButton getJRadioButton() {
	if(jRadioButton == null) {
	    jRadioButton = new JRadioButton("",true);
	    jRadioButton.setText("English");
	    jRadioButton.setPreferredSize(new Dimension(70, 30));
	    jRadioButton.setVisible(false);
	    jRadioButton.addActionListener(new JRadioButtonListener());
	}
	return jRadioButton;
    }

    private JRadioButton getJRadioButton1() {
	if(jRadioButton1 == null) {
	    jRadioButton1 = new JRadioButton();
	    jRadioButton1.setText("日本語");
	    jRadioButton1.setPreferredSize(new Dimension(70, 30));
	    jRadioButton1.setVisible(false);
	    jRadioButton1.addActionListener(new JRadioButton1Listener());
	}
	return jRadioButton1;
    }
	     
    /**
     * This method initializes osreMenuBar	
     * 	
     * @return javax.swing.JMenuBar	
     */
    private JMenuBar getOsreMenuBar() {
	if (osreMenuBar == null) {
	    osreMenuBar = new JMenuBar();
	    osreMenuBar.setEnabled(false);
	    osreMenuBar.add(getOsreMenu());
	    osreMenuBar.add(getOsreAboutMenu());
	    osreMenuBar.add(getOsreHelpMenu());
	}
	return osreMenuBar;
    }
    
    /**
     * This method initializes osreMenu	
     * 	
     * @return javax.swing.JMenu	
     */
    private JMenu getOsreMenu() {
	if (osreMenu == null) {
	    osreMenu = new JMenu();
	    osreMenu.setText("File");
	    osreMenu.setFont(new Font("Dialog", Font.BOLD, 12));
	    osreMenu.setEnabled(true);
	    osreMenu.add(getOsreFileMenuItem());
	}
	return osreMenu;	
    }
	    
    /**
     * This method initializes osreFileMenuItem	
     * 	
     * @return javax.swing.JMenuItem	
     */
    private JMenuItem getOsreFileMenuItem() {
	if (osreFileMenuItem == null) {
	    osreFileMenuItem = new JMenuItem();
	    osreFileMenuItem.setText("Quit");
	    osreFileMenuItem.setFont(new Font("Dialog", Font.BOLD, 12));
	    osreFileMenuItem.setMnemonic(KeyEvent.VK_X);
	    osreFileMenuItem.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
			System.exit(0);
		    }
		});
	}
	return osreFileMenuItem;
    }
    
    /**
     * This method initializes hazPanel	
     * 	
     * @return javax.swing.JPanel	
     */
    private JPanel getHazPanel() {
	if (hazPanel == null) {
	    GridBagConstraints gridBagConstraints12 = new GridBagConstraints();
	    gridBagConstraints12.gridx = 2;
	    gridBagConstraints12.fill = GridBagConstraints.NONE;
	    gridBagConstraints12.gridheight = 3;
	    gridBagConstraints12.insets = new Insets(0, 8, 0, 0);
	    gridBagConstraints12.gridy = 0;
	    GridBagConstraints gridBagConstraints11 = new GridBagConstraints();
	    gridBagConstraints11.gridx = 0;
	    gridBagConstraints11.anchor = GridBagConstraints.CENTER;
	    gridBagConstraints11.gridy = 2;
	    GridBagConstraints gridBagConstraints10 = new GridBagConstraints();
	    gridBagConstraints10.gridx = 0;
	    gridBagConstraints10.gridy = 1;
	    GridBagConstraints gridBagConstraints9 = new GridBagConstraints();
	    gridBagConstraints9.insets = new Insets(1, 5, 0, 2);
	    gridBagConstraints9.gridy = 0;
	    gridBagConstraints9.anchor = GridBagConstraints.CENTER;
	    gridBagConstraints9.gridx = 0;
	    hazPanel = new JPanel();
	    hazPanel.setBorder(BorderFactory.createLineBorder(Color.gray, 1));
	    hazPanel.setBackground(Color.white);
	    hazPanel.setLayout(new GridBagLayout());
	    hazPanel.add(getHazInputPanel(), gridBagConstraints9);
	    hazPanel.add(getHazDataPanel(), gridBagConstraints10);
	    hazPanel.add(getHazImportPanel(), gridBagConstraints11);
	    hazPanel.add(getHazPlotPanel(), gridBagConstraints12);
	}
	return hazPanel;
    }
    
    /**
     * This method initializes vulPanel	
     * 	
     * @return javax.swing.JPanel	
     */
    private JPanel getVulPanel() {
	if (vulPanel == null) {
	    GridBagConstraints gridBagConstraints26 = new GridBagConstraints();
	    gridBagConstraints26.gridx = 0;
	    gridBagConstraints26.gridy = 3;
	    GridBagConstraints gridBagConstraints23 = new GridBagConstraints();
	    gridBagConstraints23.gridx = 1;
	    gridBagConstraints23.gridheight = 3;
	    gridBagConstraints23.gridy = 1;
	    GridBagConstraints gridBagConstraints22 = new GridBagConstraints();
	    gridBagConstraints22.gridx = 0;
	    gridBagConstraints22.anchor = GridBagConstraints.WEST;
	    gridBagConstraints22.gridy = 2;
	    GridBagConstraints gridBagConstraints19 = new GridBagConstraints();
	    gridBagConstraints19.gridx = 1;
	    gridBagConstraints19.gridy = 0;
	    GridBagConstraints gridBagConstraints8 = new GridBagConstraints();
	    gridBagConstraints8.gridx = 0;
	    gridBagConstraints8.gridwidth = 1;
	    gridBagConstraints8.gridheight = 2;
	    gridBagConstraints8.anchor = GridBagConstraints.WEST;
	    gridBagConstraints8.gridy = 0;
	    vulPanel = new JPanel();
	    vulPanel.setBackground(Color.white);
	    vulPanel.setLayout(new GridBagLayout());
	    vulPanel.setFont(new Font("Dialog", Font.PLAIN, 12));
	    vulPanel.setPreferredSize(new Dimension(100, 100));
	    vulPanel.add(getVulSelectPanel(), gridBagConstraints8);
	    vulPanel.add(getVulDataPanel(), gridBagConstraints19);
	    vulPanel.add(getVulInputPanel(), gridBagConstraints22);
	    vulPanel.add(getVulPlotPanel(), gridBagConstraints23);
	    vulPanel.add(getVulImportPanel(), gridBagConstraints26);
	}
	return vulPanel;
    }
    
    /**
     * This method initializes damPanel	
     * 	
     * @return javax.swing.JPanel	
     */
    private JPanel getDamPanel() {
	if (damPanel == null) {
	    GridBagConstraints gridBagConstraints41 = new GridBagConstraints();
	    gridBagConstraints41.gridx = 1;
	    gridBagConstraints41.gridheight = 2;
	    gridBagConstraints41.fill = GridBagConstraints.BOTH;
	    gridBagConstraints41.insets = new Insets(0, 20, 0, 0);
	    gridBagConstraints41.gridy = 1;
	    GridBagConstraints gridBagConstraints13 = new GridBagConstraints();
	    gridBagConstraints13.anchor = GridBagConstraints.SOUTH;
	    gridBagConstraints13.gridx = 2;
	    gridBagConstraints13.gridy = 1;
	    gridBagConstraints13.gridwidth = 1;
	    gridBagConstraints13.gridheight = 2;
	    gridBagConstraints13.insets = new Insets(0, 20, 0, 0);
	    GridBagConstraints gridBagConstraints33 = new GridBagConstraints();
	    gridBagConstraints33.gridx = 0;
	    gridBagConstraints33.gridheight = 1;
	    gridBagConstraints33.gridwidth = 3;
	    gridBagConstraints33.gridy = 0;
	    GridBagConstraints gridBagConstraints32 = new GridBagConstraints();
	    gridBagConstraints32.gridx = 0;
	    gridBagConstraints32.insets = new Insets(0, 0, 0, 0);
	    gridBagConstraints32.gridy = 2;
	    GridBagConstraints gridBagConstraints31 = new GridBagConstraints();
	    gridBagConstraints31.gridx = 0;
	    gridBagConstraints31.anchor = GridBagConstraints.WEST;
	    gridBagConstraints31.gridy = 1;
	    damPanel = new JPanel();
	    damPanel.setLayout(new GridBagLayout());
	    damPanel.setFont(new Font("Dialog", Font.PLAIN, 12));
	    damPanel.setBackground(Color.white);
	    damPanel.add(getDamCfPanel(), gridBagConstraints31);
	    damPanel.add(getDamDataPanel(), gridBagConstraints32);
	    damPanel.add(getDamPlotPanel(), gridBagConstraints13);
	    damPanel.add(getDamInputPanel(), gridBagConstraints33);
	    damPanel.add(getDamSelectPanel(), gridBagConstraints41);
	}
	return damPanel;
    }
    
    /**
     * This method initializes lossPanel	
     * 	
     * @return javax.swing.JPanel	
     */
    private JPanel getLossPanel() {
	if (lossPanel == null) {
	    GridBagConstraints gridBagConstraints28 = new GridBagConstraints();
	    gridBagConstraints28.gridheight = 2;
	    gridBagConstraints28.gridy = 1;
	    gridBagConstraints28.fill = GridBagConstraints.VERTICAL;
	    gridBagConstraints28.insets = new Insets(0, 20, 0, 0);
	    gridBagConstraints28.gridx = 1;
	    GridBagConstraints gridBagConstraints6 = new GridBagConstraints();
	    gridBagConstraints6.gridx = 0;
	    gridBagConstraints6.gridwidth = 3;
	    gridBagConstraints6.gridy = 0;
	    GridBagConstraints gridBagConstraints25 = new GridBagConstraints();
	    gridBagConstraints25.anchor = GridBagConstraints.EAST;
	    gridBagConstraints25.gridx = 0;
	    gridBagConstraints25.gridy = 1;
	    gridBagConstraints25.insets = new Insets(0, 0, 0, 0);
	    GridBagConstraints gridBagConstraints43 = new GridBagConstraints();
	    gridBagConstraints43.gridx = 2;
	    gridBagConstraints43.gridheight = 2;
	    gridBagConstraints43.insets = new Insets(0, 20, 0, 0);
	    gridBagConstraints43.gridy = 1;
	    GridBagConstraints gridBagConstraints42 = new GridBagConstraints();
	    gridBagConstraints42.gridx = 0;
	    gridBagConstraints42.gridy = 2;
	    lossPanel = new JPanel();
	    lossPanel.setLayout(new GridBagLayout());
	    lossPanel.setFont(new Font("Dialog", Font.PLAIN, 12));
	    lossPanel.setBackground(Color.white);
	    lossPanel.add(getLossPlotPanel(), gridBagConstraints43);
	    lossPanel.add(getLossInputPanel(), gridBagConstraints25);
	    lossPanel.add(getLossDataPanel(), gridBagConstraints42);
	    lossPanel.add(getLossStatePanel(), gridBagConstraints6);
	    lossPanel.add(getLossSelectPanel(), gridBagConstraints28);
	}
	return lossPanel;
    }
    
    /**
     * This method initializes hazInputPanel	
     * 	
     * @return javax.swing.JPanel	
     */
    private JPanel getHazInputPanel() {
	if (hazInputPanel == null) {
	    GridBagConstraints gridBagConstraints111 = new GridBagConstraints();
	    gridBagConstraints111.gridx = 0;
	    gridBagConstraints111.gridwidth = 2;
	    gridBagConstraints111.fill = GridBagConstraints.HORIZONTAL;
	    gridBagConstraints111.gridy = 0;
	    hazNaviLabel = new JLabel();
	    hazNaviLabel.setText("Select Prefecture, Hazard Measure and σ");
	    hazNaviLabel.setHorizontalTextPosition(SwingConstants.CENTER);
	    hazNaviLabel.setHorizontalAlignment(SwingConstants.CENTER);
	    hazNaviLabel.setFont(new Font("Dialog", Font.BOLD, 14));
	    hazNaviLabel.setPreferredSize(new Dimension(80, 40));
	    GridBagConstraints gridBagConstraints110 = new GridBagConstraints();
	    gridBagConstraints110.fill = GridBagConstraints.NONE;
	    gridBagConstraints110.gridx = 1;
	    gridBagConstraints110.gridy = 3;
	    gridBagConstraints110.anchor = GridBagConstraints.WEST;
	    gridBagConstraints110.weightx = 1.0;
	    GridBagConstraints gridBagConstraints7 = new GridBagConstraints();
	    gridBagConstraints7.gridx = 5;
	    gridBagConstraints7.gridwidth = 2;
	    gridBagConstraints7.insets = new Insets(0, 0, 20, 0);
	    gridBagConstraints7.gridy = 3;
	    GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
	    gridBagConstraints5.gridx = 0;
	    gridBagConstraints5.insets = new Insets(0, 0, 0, 0);
	    gridBagConstraints5.anchor = GridBagConstraints.EAST;
	    gridBagConstraints5.gridy = 3;
	    hazVarLabel = new JLabel();
	    hazVarLabel.setText("     σ  ");
	    hazVarLabel.setPreferredSize(new Dimension(40, 40));
	    hazVarLabel.setFont(new Font("Dialog", Font.BOLD, 14));
	    GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
	    gridBagConstraints4.fill = GridBagConstraints.NONE;
	    gridBagConstraints4.gridy = 2;
	    gridBagConstraints4.weightx = 1.0;
	    gridBagConstraints4.gridwidth = 1;
	    gridBagConstraints4.anchor = GridBagConstraints.WEST;
	    gridBagConstraints4.insets = new Insets(0, 0, 0, 0);
	    gridBagConstraints4.gridx = 1;
	    GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
	    gridBagConstraints3.gridx = 0;
	    gridBagConstraints3.gridwidth = 1;
	    gridBagConstraints3.fill = GridBagConstraints.NONE;
	    gridBagConstraints3.anchor = GridBagConstraints.EAST;
	    gridBagConstraints3.insets = new Insets(0, 0, 0, 0);
	    gridBagConstraints3.ipadx = 0;
	    gridBagConstraints3.gridy = 2;
	    hazMeasureInputLabel = new JLabel();
	    hazMeasureInputLabel.setText("Hazard Measure");
	    hazMeasureInputLabel.setPreferredSize(new Dimension(120, 40));
	    hazMeasureInputLabel.setFont(new Font("Dialog", Font.BOLD, 14));
	    GridBagConstraints gridBagConstraints1 = new GridBagConstraints();
	    gridBagConstraints1.fill = GridBagConstraints.NONE;
	    gridBagConstraints1.gridy = 1;
	    gridBagConstraints1.weightx = 1.0;
	    gridBagConstraints1.gridwidth = 1;
	    gridBagConstraints1.insets = new Insets(0, 0, 0, 0);
	    gridBagConstraints1.anchor = GridBagConstraints.WEST;
	    gridBagConstraints1.weighty = 0.0D;
	    gridBagConstraints1.gridx = 1;
	    GridBagConstraints gridBagConstraints = new GridBagConstraints();
	    gridBagConstraints.gridx = 0;
	    gridBagConstraints.gridwidth = 1;
	    gridBagConstraints.insets = new Insets(0, 0, 0, 0);
	    gridBagConstraints.gridheight = 1;
	    gridBagConstraints.fill = GridBagConstraints.NONE;
	    gridBagConstraints.anchor = GridBagConstraints.EAST;
	    gridBagConstraints.gridy = 1;
	    hazSiteInputLabel = new JLabel();
	    hazSiteInputLabel.setText("Prefecture");
	    hazSiteInputLabel.setPreferredSize(new Dimension(85, 40));
	    hazSiteInputLabel.setFont(new Font("Dialog", Font.BOLD, 14));
	    hazInputPanel = new JPanel();
	    hazInputPanel.setLayout(new GridBagLayout());
	    hazInputPanel.setPreferredSize(new Dimension(300, 250));
	    hazInputPanel.setBackground(Color.white);
	    hazInputPanel.add(hazSiteInputLabel, gridBagConstraints);
	    hazInputPanel.add(getHazSiteInputComboBox(), gridBagConstraints1);
	    hazInputPanel.add(hazMeasureInputLabel, gridBagConstraints3);
	    hazInputPanel.add(getHazMeasureInputComboBox(), gridBagConstraints4);
	    hazInputPanel.add(hazVarLabel, gridBagConstraints5);
	    hazInputPanel.add(getHazVarComboBox(), gridBagConstraints110);
	    hazInputPanel.add(hazNaviLabel, gridBagConstraints111);
	}
	return hazInputPanel;
    }
    
    /**
     * This method initializes hazSiteInputComboBox	
     * 	
     * @return javax.swing.JComboBox	
     */
    private JComboBox getHazSiteInputComboBox() {
	if (hazSiteInputComboBox == null) {
	    hazSiteInputComboBox = new JComboBox();
	    hazSiteInputComboBox.setPreferredSize(new Dimension(125, 25));
	    hazSiteInputComboBox.addItem("");   
	    hazSiteInputComboBox.addItem("北海道(Hokkaido)");
	    hazSiteInputComboBox.addItem("青森(Aomori)");
	    hazSiteInputComboBox.addItem("岩手(Iwate)");
	    hazSiteInputComboBox.addItem("宮城(Miyagi)");
	    hazSiteInputComboBox.addItem("秋田(Akita)");
	    hazSiteInputComboBox.addItem("山形(Yamagata)");
	    hazSiteInputComboBox.addItem("福島(Fukushima)");
	    hazSiteInputComboBox.addItem("茨城(Ibaraki)");
	    hazSiteInputComboBox.addItem("栃木(Tochigi)");
	    hazSiteInputComboBox.addItem("群馬(Gumma)");
	    hazSiteInputComboBox.addItem("埼玉(Saitama)");
	    hazSiteInputComboBox.addItem("千葉(Chiba)");
	    hazSiteInputComboBox.addItem("東京(Tokyo)");
	    hazSiteInputComboBox.addItem("神奈川(Kanagawa)");
	    hazSiteInputComboBox.addItem("山梨(Yamanashi)");
	    hazSiteInputComboBox.addItem("新潟(Nigata)");
	    hazSiteInputComboBox.addItem("長野(Nagano)");
	    hazSiteInputComboBox.addItem("静岡(Shizuoka)");
	    hazSiteInputComboBox.addItem("愛知(Aichi)");
	    hazSiteInputComboBox.addItem("岐阜(Gifu)");
	    hazSiteInputComboBox.addItem("三重(Mie)");
	    hazSiteInputComboBox.addItem("富山(Toyama)");
	    hazSiteInputComboBox.addItem("石川(Ishikawa)");
	    hazSiteInputComboBox.addItem("福井(Fukui)");
	    hazSiteInputComboBox.addItem("滋賀(Shiga)");
	    hazSiteInputComboBox.addItem("京都(Kyoto)");
	    hazSiteInputComboBox.addItem("奈良(Nara)");
	    hazSiteInputComboBox.addItem("大阪(Osaka)");
	    hazSiteInputComboBox.addItem("和歌山(Wakayama)");
	    hazSiteInputComboBox.addItem("兵庫(Hyogo)");
	    hazSiteInputComboBox.addItem("岡山(Okayama)");
	    hazSiteInputComboBox.addItem("広島(Hiroshima)");
	    hazSiteInputComboBox.addItem("鳥取(Tottori)");
	    hazSiteInputComboBox.addItem("島根(Shimane)");
	    hazSiteInputComboBox.addItem("山口(Yamaguchi)");
	    hazSiteInputComboBox.addItem("香川(Kagawa)");
	    hazSiteInputComboBox.addItem("徳島(Tokushima)");
	    hazSiteInputComboBox.addItem("愛媛(Ehime)");
	    hazSiteInputComboBox.addItem("高知(Kochi)");
	    hazSiteInputComboBox.addItem("福岡(Fukuoka)");
	    hazSiteInputComboBox.addItem("佐賀(Saga)");
	    hazSiteInputComboBox.addItem("長崎(Nagasaki)");
	    hazSiteInputComboBox.addItem("大分(Oita)");
	    hazSiteInputComboBox.addItem("熊本(Kumamoto)");
	    hazSiteInputComboBox.addItem("宮崎(Miyazaki)");
	    hazSiteInputComboBox.addItem("鹿児島(Kagoshima)");
	    hazSiteInputComboBox.addItem("沖縄(Okinawa)");
	    hazSiteInputComboBox.addItemListener(new siteInputComboBoxListener());
	}
	return hazSiteInputComboBox;
    }
    
    /**
     * This method initializes hazMeasureInputComboBox	
     * 	
     * @return javax.swing.JComboBox	
     */
    private JComboBox getHazMeasureInputComboBox() {
	if (hazMeasureInputComboBox == null) {
	    hazMeasureInputComboBox = new JComboBox();
	    hazMeasureInputComboBox.setPreferredSize(new Dimension(100, 25));
	    hazMeasureInputComboBox.addItem("");
	    hazMeasureInputComboBox.addItem("JMA");
	    hazMeasureInputComboBox.addItem("PGV");
	    hazMeasureInputComboBox.addItem("PGA");
	    hazMeasureInputComboBox.addItem("MMI");
	    hazMeasureInputComboBox.addItemListener(new measureInputComboBoxListener());
	}
	return hazMeasureInputComboBox;
    }
    
    /**
     * This method initializes hazVarComboBox	
     * 	
     * @return javax.swing.JComboBox	
     */
    private JComboBox getHazVarComboBox() {
	if (hazVarComboBox == null) {
	    hazVarComboBox = new JComboBox();
	    hazVarComboBox.setPreferredSize(new Dimension(80, 25));
	    hazVarComboBox.addItem("0.01");
	    hazVarComboBox.addItem("0.1");
	    hazVarComboBox.addItem("0.2");
	    hazVarComboBox.addItem("0.3");
	    hazVarComboBox.addItem("0.4");
	    hazVarComboBox.addItem("0.5");
	    hazVarComboBox.addItem("0.6");
	    hazVarComboBox.addItem("0.7");
	    hazVarComboBox.addItem("0.8");
	    hazVarComboBox.addItem("0.9");
	    hazVarComboBox.addItem("0.99");
	    hazVarComboBox.setSelectedItem("0.2");
	    hazVarComboBox.addItemListener(new hazardVarComboBoxListener());
	}
	return hazVarComboBox;
    }

    /**
     * This method initializes hazDataPanel	
     * 	
     * @return javax.swing.JPanel	
     */
    private JPanel getHazDataPanel() {
	if (hazDataPanel == null) {
	    GridBagConstraints gridBagConstraints15 = new GridBagConstraints();
	    gridBagConstraints15.fill = GridBagConstraints.BOTH;
	    gridBagConstraints15.gridy = 0;
	    gridBagConstraints15.weightx = 1.0;
	    gridBagConstraints15.weighty = 1.0;
	    gridBagConstraints15.gridx = 0;
	    hazDataPanel = new JPanel();
	    hazDataPanel.setLayout(new GridBagLayout());
	    hazDataPanel.setPreferredSize(new Dimension(300, 200));
	    hazDataPanel.setBorder(BorderFactory.createLineBorder(Color.gray, 1));
	    hazDataPanel.add(getHazDataScrollPane(), gridBagConstraints15);
	}
	return hazDataPanel;
    }
    
    /**
     * This method initializes hazImportPanel	
     * 	
     * @return javax.swing.JPanel	
     */
    private JPanel getHazImportPanel() {
	if (hazImportPanel == null) {
	    GridBagConstraints gridBagConstraints18 = new GridBagConstraints();
	    gridBagConstraints18.gridx = 0;
	    gridBagConstraints18.gridwidth = 1;
	    gridBagConstraints18.gridy = 1;
	    GridBagConstraints gridBagConstraints17 = new GridBagConstraints();
	    gridBagConstraints17.gridx = 2;
	    gridBagConstraints17.insets = new Insets(0, 30, 20, 0);
	    gridBagConstraints17.gridy = 0;
	    GridBagConstraints gridBagConstraints16 = new GridBagConstraints();
	    gridBagConstraints16.gridx = 0;
	    gridBagConstraints16.insets = new Insets(0, 0, 20, 30);
	    gridBagConstraints16.gridy = 0;
	    hazImportPanel = new JPanel();
	    hazImportPanel.setLayout(new GridBagLayout());
	    hazImportPanel.setPreferredSize(new Dimension(300, 50));
	    hazImportPanel.setBackground(Color.white);
	    hazImportPanel.add(getHazImportButton(), gridBagConstraints18);
	}
	return hazImportPanel;
    }
    
    /**
     * This method initializes hazPlotPanel	
     * 	
     * @return javax.swing.JPanel	
     */
    private JPanel getHazPlotPanel() {
	if (hazPlotPanel == null) {
	    hazPlotPanel = new JPanel();
	    hazPlotPanel.setLayout(new BorderLayout());
	    hazPlotPanel.setPreferredSize(new Dimension(450, 480));
	    hazPlotPanel.setBackground(Color.white);
	    hazPlotPanel.setBorder(BorderFactory.createLineBorder(Color.gray, 1));
	}		
	return hazPlotPanel;
    }
	        
    private JPanel getHazCurvePanel(int measure,double[][] hazMatrix,double hazVar) {
       	damHazVarValueLabel.setText((String)hazVarComboBox.getSelectedItem());
	lossHazVarValueLabel.setText((String)hazVarComboBox.getSelectedItem());
	
	if (hazCurvePanel == null) {
	    HazDrawPanel dp = new HazDrawPanel(measure,hazMatrix,hazVar);
	    hazCurvePanel = dp.getPanel();
	}
	return hazCurvePanel;
    }
    
    /**
     * This method initializes hazDataScrollPane	
     * 	
     * @return javax.swing.JScrollPane	
     */
    private JScrollPane getHazDataScrollPane() {
	if (hazDataScrollPane == null) {
	    hazDataScrollPane = new JScrollPane();
	    hazDataScrollPane.setViewportView(getHazDataTable());
	}
	return hazDataScrollPane;
    }
    
    /**
     * This method initializes hazDataTable	
     * 	
     * @return javax.swing.JTable	
     */
    private JTable getHazDataTable() {
	if (hazDataTable == null) {
	    hazDataTable = new JTable();
	}
	return hazDataTable;
    }   
    
    /**
     * This method initializes hazImportButton	
     * 	
     * @return javax.swing.JButton	
     */
    private JButton getHazImportButton() {
	if (hazImportButton == null) {
	    hazImportButton = new JButton();
	    hazImportButton.setText("Import Hazard Format");
	    hazImportButton.setPreferredSize(new Dimension(250, 26));
	    hazImportButton.setVisible(false);
	}
	return hazImportButton;
    }
    
    /**
     * This method initializes vulSelectPanel	
     * 	
     * @return javax.swing.JPanel	
     */
    private JPanel getVulSelectPanel() {
	if (vulSelectPanel == null) {
	    vulSelectLabel = new JLabel();
	    vulSelectLabel.setText("Choose Asset");
	    vulSelectPanel = new JPanel();
	    vulSelectPanel.setBackground(Color.white);
	    vulSelectPanel.setLayout(new BoxLayout(vulSelectPanel, BoxLayout.Y_AXIS));
	    vulSelectPanel.setPreferredSize(new Dimension(350, 390));
	    vulSelectPanel.add(vulSelectLabel);
	    vulSelectPanel.add(getVulTreeScrollPane());
	    vulSelectPanel.setBorder(BorderFactory.createLineBorder(Color.gray, 1));
	    vulSelectPanel.add(getVulShowAssetPanel());
	}
	return vulSelectPanel;
    }
	    
    /**
     * This method initializes vulDataPanel	
     * 	
     * @return javax.swing.JPanel	
     */
    private JPanel getVulDataPanel() {
	if (vulDataPanel == null) {
	    GridBagConstraints gridBagConstraints24 = new GridBagConstraints();
	    gridBagConstraints24.fill = GridBagConstraints.BOTH;
	    gridBagConstraints24.gridy = 0;
	    gridBagConstraints24.weightx = 1.0;
	    gridBagConstraints24.weighty = 1.0;
	    gridBagConstraints24.gridx = 0;
	    vulDataPanel = new JPanel();
	    vulDataPanel.setBackground(Color.white);
	    vulDataPanel.setLayout(new GridBagLayout());
	    vulDataPanel.setPreferredSize(new Dimension(200, 150));
	    vulDataPanel.add(getVulDataScrollPane(), gridBagConstraints24);
	}
	return vulDataPanel;
    }
    
    private JScrollPane getVulTreeScrollPane() {
	if (vulTreeScrollPane == null) {
	    vulTreeScrollPane = new JScrollPane();
	    vulTreeScrollPane.setViewportView(getVulSelectTree());
	}
	return vulTreeScrollPane;
    }
    
    private JPanel getVulShowAssetPanel() {
	if (vulShowAssetPanel == null) {
	    vulShowAssetPanel = new JPanel();
	    vulShowAssetPanel.setPreferredSize(new Dimension(70,70));
	    jLabel15 = new JLabel();
	    jLabel15.setText("");
	    vulShowAssetPanel.setLayout(new BorderLayout());
	    vulShowAssetPanel.add(jLabel15, BorderLayout.NORTH);
	    vulShowAssetPanel.add(getVulShowAssetScrollPane(), BorderLayout.CENTER);
	}
	return vulShowAssetPanel;
    }
    
    private JScrollPane getVulShowAssetScrollPane() {
	if (vulShowAssetScrollPane == null) {
	    vulShowAssetScrollPane = new JScrollPane();
	    vulShowAssetLabel = new JLabel();
	    vulShowAssetLabel.setText("");
	    vulShowAssetScrollPane.setViewportView(vulShowAssetLabel);
	}
	return vulShowAssetScrollPane;
    }
    
    private JTree getVulSelectTree() {
	if (vulSelectTree == null) {
	    MutableTreeNode assets = new DefaultMutableTreeNode("ASSETS");  
	    MutableTreeNode usa = new DefaultMutableTreeNode("ATC-13");
	    MutableTreeNode jpn = new DefaultMutableTreeNode("JAPANESE");
	    assets.insert(usa, 0);
	    assets.insert(jpn, 1);
	    
	    MutableTreeNode buildings = new DefaultMutableTreeNode("BUILDINGS");
	    usa.insert(buildings, 0);
	    //Building
	    buildings.insert(new DefaultMutableTreeNode("Wood Frame (Low Rise)"), 0);
	    buildings.insert(new DefaultMutableTreeNode("Light Metal (Low Rise)"), 1);
	    //Unreinforce Masonry
	    MutableTreeNode unreinforced = new DefaultMutableTreeNode("Unreinforced Masonry");
	    buildings.insert(unreinforced,2);
	    MutableTreeNode bear = new DefaultMutableTreeNode("Bearing Wall");
	    MutableTreeNode load = new DefaultMutableTreeNode("with Load Bearing Frame");
	    unreinforced.insert(bear, 0);
	    unreinforced.insert(load, 1);
	    bear.insert(new DefaultMutableTreeNode("Low Rise"), 0);
	    bear.insert(new DefaultMutableTreeNode("Medium Rise"), 1);
	    load.insert(new DefaultMutableTreeNode("Low Rise"), 0);
	    load.insert(new DefaultMutableTreeNode("Medium Rise"), 1);
	    load.insert(new DefaultMutableTreeNode("High Rise"), 2); 
	    //RC Shear Wall
	    MutableTreeNode rcShear = new DefaultMutableTreeNode("RC Shear Wall");
	    buildings.insert(rcShear,3);
	    MutableTreeNode rcwithMoment = new DefaultMutableTreeNode("with Moment-Resisting Frame");
	    MutableTreeNode rcwithoutMoment = new DefaultMutableTreeNode("without Moment-Resisting Frame");
	    rcShear.insert(rcwithMoment, 0);
	    rcShear.insert(rcwithoutMoment, 1);
	    rcwithMoment.insert(new DefaultMutableTreeNode("Low Rise"), 0);
	    rcwithMoment.insert(new DefaultMutableTreeNode("Medium Rise"), 1);
	    rcwithMoment.insert(new DefaultMutableTreeNode("High Rise"), 2);
	    rcwithoutMoment.insert(new DefaultMutableTreeNode("Low Rise"), 0);
	    rcwithoutMoment.insert(new DefaultMutableTreeNode("Medium Rise"), 1);
	    rcwithoutMoment.insert(new DefaultMutableTreeNode("High Rise"), 2); 
	    //Reinforced Masonry
	    MutableTreeNode reinforced = new DefaultMutableTreeNode("Reinforced Masonry Shear Wall");
	    buildings.insert(reinforced,4);
	    MutableTreeNode withMoment = new DefaultMutableTreeNode("with Moment-Resisting Frame");
	    MutableTreeNode withoutMoment = new DefaultMutableTreeNode("without Moment-Resisting Frame");
	    reinforced.insert(withMoment, 0);
	    reinforced.insert(withoutMoment, 1);
	    withMoment.insert(new DefaultMutableTreeNode("Low Rise"), 0);
	    withMoment.insert(new DefaultMutableTreeNode("Medium Rise"), 1);
	    withMoment.insert(new DefaultMutableTreeNode("High Rise"), 2);
	    withoutMoment.insert(new DefaultMutableTreeNode("Low Rise"), 0);
	    withoutMoment.insert(new DefaultMutableTreeNode("Medium Rise"), 1);
	    withoutMoment.insert(new DefaultMutableTreeNode("High Rise"), 2); 
	    //Braced Steel
	    MutableTreeNode braced = new DefaultMutableTreeNode("Braced Steel Frames");
	    buildings.insert(braced,5);
	    braced.insert(new DefaultMutableTreeNode("Low Rise"), 0);
	    braced.insert(new DefaultMutableTreeNode("Medium Rise"), 1);
	    braced.insert(new DefaultMutableTreeNode("High Rise"), 2);
	    //Moment-Resisting
	    MutableTreeNode moResist = new DefaultMutableTreeNode("Moment-Resisting Steel Frame");
	    buildings.insert(moResist,6);
	    MutableTreeNode perimeter = new DefaultMutableTreeNode("Perimeter Frame");
	    MutableTreeNode distributed = new DefaultMutableTreeNode("Distributed Frame");
	    moResist.insert(perimeter, 0);
	    moResist.insert(distributed, 1);
	    MutableTreeNode steel = new DefaultMutableTreeNode("Steel");
	    MutableTreeNode steel1 = new DefaultMutableTreeNode("Steel");
	    MutableTreeNode ductile = new DefaultMutableTreeNode("Ductile Concrete");;
	    MutableTreeNode nonDuctile = new DefaultMutableTreeNode("Non-Ductile Concrete");
	    perimeter.insert(steel, 0);
	    distributed.insert(steel1, 0);
	    distributed.insert(ductile,1);
	    distributed.insert(nonDuctile, 2);
	    steel.insert(new DefaultMutableTreeNode("Low Rise"), 0);
	    steel.insert(new DefaultMutableTreeNode("Medium Rise"), 1);
	    steel.insert(new DefaultMutableTreeNode("High Rise"), 2);
	    steel1.insert(new DefaultMutableTreeNode("Low Rise"), 0);
	    steel1.insert(new DefaultMutableTreeNode("Medium Rise"), 1);
	    steel1.insert(new DefaultMutableTreeNode("High Rise"), 2);
	    ductile.insert(new DefaultMutableTreeNode("Low Rise"), 0);
	    ductile.insert(new DefaultMutableTreeNode("Medium Rise"), 1);
	    ductile.insert(new DefaultMutableTreeNode("High Rise"), 2);
	    nonDuctile.insert(new DefaultMutableTreeNode("Low Rise"), 0);
	    nonDuctile.insert(new DefaultMutableTreeNode("Medium Rise"), 1);
	    nonDuctile.insert(new DefaultMutableTreeNode("High Rise"), 2);
	    //Precast Concrete
	    MutableTreeNode precast = new DefaultMutableTreeNode("Precast Concrete");
	    buildings.insert(precast, 7);
	    precast.insert(new DefaultMutableTreeNode("Low Rise"), 0);
	    precast.insert(new DefaultMutableTreeNode("Medium Rise"), 1);
	    precast.insert(new DefaultMutableTreeNode("High Rise"), 2);
	    //Others
	    buildings.insert(new DefaultMutableTreeNode("Long-Span (Low Rise)"), 8);
	    buildings.insert(new DefaultMutableTreeNode("Tilt-Up (Low Rise)"), 9);
	    buildings.insert(new DefaultMutableTreeNode("Mobile Homes"), 10);
	    //BRIDGES
	    MutableTreeNode bridges = new DefaultMutableTreeNode("BRIDGES");
	    usa.insert(bridges, 1);
	    MutableTreeNode conventional = new DefaultMutableTreeNode("Conventional");
	    MutableTreeNode major = new DefaultMutableTreeNode("Major");
	    bridges.insert(conventional, 0);
	    bridges.insert(major, 1);
	    conventional.insert(new DefaultMutableTreeNode("Multiple Simple Span"), 0);
	    conventional.insert(new DefaultMutableTreeNode("Continous/Monolithic"), 1);
	    //PIPELINES
	    MutableTreeNode pipelines = new DefaultMutableTreeNode("PIPELINES");
	    usa.insert(pipelines, 2);
	    pipelines.insert(new DefaultMutableTreeNode("Underground"), 0);
	    pipelines.insert(new DefaultMutableTreeNode("At Grade"), 1);
	    //DAMS
	    MutableTreeNode dams = new DefaultMutableTreeNode("DAMS");
	    usa.insert(dams, 3);
	    dams.insert(new DefaultMutableTreeNode("Concrete"), 0);
	    dams.insert(new DefaultMutableTreeNode("Earth and rock fill"), 1);
	    //TUNNELS
	    MutableTreeNode tunnels = new DefaultMutableTreeNode("TUNNELS");
	    usa.insert(tunnels, 4);
	    tunnels.insert(new DefaultMutableTreeNode("Alluvium"), 0);
	    tunnels.insert(new DefaultMutableTreeNode("Rock"), 1);
	    tunnels.insert(new DefaultMutableTreeNode("Cut and Cover"), 2);
	    //TANK
	    MutableTreeNode tank = new DefaultMutableTreeNode("STORAGE TANK");
	    usa.insert(tank, 5);
	    MutableTreeNode ug = new DefaultMutableTreeNode("Underground");
	    MutableTreeNode og = new DefaultMutableTreeNode("On Ground");
	    MutableTreeNode ev = new DefaultMutableTreeNode("Elevated");
	    tank.insert(ug, 0);
	    tank.insert(og, 1);
	    tank.insert(ev, 2);
	    ug.insert(new DefaultMutableTreeNode("Liquid"), 0);
	    ug.insert(new DefaultMutableTreeNode("Solid"), 1);
	    og.insert(new DefaultMutableTreeNode("Liquid"), 0);
	    og.insert(new DefaultMutableTreeNode("Solid"), 1);
	    ev.insert(new DefaultMutableTreeNode("Liquid"), 0);
	    ev.insert(new DefaultMutableTreeNode("Solid"), 1);
	    //WAYS
	    MutableTreeNode ways = new DefaultMutableTreeNode("ROADWAYS and PAVEMENTS");
	    usa.insert(ways, 6);
	    ways.insert(new DefaultMutableTreeNode("Railroad"), 0);
	    ways.insert(new DefaultMutableTreeNode("Highways"), 1);
	    ways.insert(new DefaultMutableTreeNode("Runways"), 2);
	    //CHIMNEY
	    MutableTreeNode chimney = new DefaultMutableTreeNode("CHIMNEY");
	    usa.insert(chimney, 7);
	    chimney.insert(new DefaultMutableTreeNode("Masonry"), 0);
	    chimney.insert(new DefaultMutableTreeNode("Concrete"), 1);
	    chimney.insert(new DefaultMutableTreeNode("Steel"), 2);
	    //CRANES
	    MutableTreeNode cranes = new DefaultMutableTreeNode("CRANES");
	    usa.insert(cranes, 8);
	    //CONVEYOR
	    MutableTreeNode conveyor = new DefaultMutableTreeNode("CONVEYOR SYSTEMS");
	    usa.insert(conveyor, 9);
	    //TOWERS
	    MutableTreeNode towers = new DefaultMutableTreeNode("TOWERS");
	    usa.insert(towers, 10);
	    MutableTreeNode electrical = new DefaultMutableTreeNode("Electrical Transmisson Line");
	    electrical.insert(new DefaultMutableTreeNode("Conventional (less than 100' high)"), 0);
	    electrical.insert(new DefaultMutableTreeNode("Major (more than 100' high)"), 1);
	    towers.insert(electrical, 0);
	    towers.insert(new DefaultMutableTreeNode("Broadcast"), 1);
	    towers.insert(new DefaultMutableTreeNode("Observation"), 2);
	    towers.insert(new DefaultMutableTreeNode("Offshore"), 3);
	    //OTHERS
	    MutableTreeNode others = new DefaultMutableTreeNode("OTHER STRUCTURES");
	    usa.insert(others, 11);
	    others.insert(new DefaultMutableTreeNode("Canals"), 0);
	    others.insert(new DefaultMutableTreeNode("Earth Retaining Structures (over 20' high)"), 1);
	    others.insert(new DefaultMutableTreeNode("Waterfront Structure"), 2);
	    //EQUIPMENTS
	    MutableTreeNode equip = new DefaultMutableTreeNode("EQUIPMENTS");
	    usa.insert(equip, 12);
	    equip.insert(new DefaultMutableTreeNode("Residential"), 0);
	    equip.insert(new DefaultMutableTreeNode("Office (Furnuture, Computers, etc.)"), 1);
	    equip.insert(new DefaultMutableTreeNode("Electrical"), 2);
	    equip.insert(new DefaultMutableTreeNode("Mechanical"), 3);
	    equip.insert(new DefaultMutableTreeNode("High Technology & Laboratory"), 4);
	    equip.insert(new DefaultMutableTreeNode("Trains, Trucks, Airplanes & other vehicles"), 5);
	    //Japanese
	    MutableTreeNode jpnBuildings = new DefaultMutableTreeNode("BUILDINGS");
	    jpn.insert(jpnBuildings, 0);
	    //Building
	    MutableTreeNode jpnWood = new DefaultMutableTreeNode("Wood Frame");
	    MutableTreeNode jpnRC = new DefaultMutableTreeNode("Reinforced Concrete");
	    MutableTreeNode jpnSteel = new DefaultMutableTreeNode("Steel Frame");
	    MutableTreeNode jpnLightSteel = new DefaultMutableTreeNode("Light Steel Frame");
	    jpnBuildings.insert(jpnWood, 0);
	    jpnBuildings.insert(jpnRC, 1);
	    jpnBuildings.insert(jpnSteel, 2);
	    jpnBuildings.insert(jpnLightSteel, 3);
	    //Wood Frame
	    MutableTreeNode consPre1950Wood = new DefaultMutableTreeNode("Constructed on -1950");
	    MutableTreeNode cons1950Wood = new DefaultMutableTreeNode("Constructed on 1951-1960");
	    MutableTreeNode cons1960Wood = new DefaultMutableTreeNode("Constructed on 1961-1970");
	    MutableTreeNode cons1970Wood = new DefaultMutableTreeNode("Constructed on 1971-1980");
	    MutableTreeNode consPost1981Wood = new DefaultMutableTreeNode("Constructed on 1981-");
	    MutableTreeNode allWood = new DefaultMutableTreeNode("All");
	    jpnWood.insert(consPre1950Wood,0);
	    jpnWood.insert(cons1950Wood,1);
	    jpnWood.insert(cons1960Wood,2);
	    jpnWood.insert(cons1970Wood,3);
	    jpnWood.insert(consPost1981Wood,4);
	    jpnWood.insert(allWood,5);
	    //RC
	    MutableTreeNode consPre1971RC = new DefaultMutableTreeNode("Constructed on -1971");
	    MutableTreeNode cons1971RC = new DefaultMutableTreeNode("Constructed on 1972-1981");
	    MutableTreeNode consPost1982RC = new DefaultMutableTreeNode("Constructed on 1982-");
	    MutableTreeNode allRC = new DefaultMutableTreeNode("All");
	    jpnRC.insert(consPre1971RC,0);
	    jpnRC.insert(cons1971RC,1);
	    jpnRC.insert(consPost1982RC,2);
	    jpnRC.insert(allRC,3);
	    //Steel
	    MutableTreeNode consPre1981Steel = new DefaultMutableTreeNode("Constructed on -1981");
	    MutableTreeNode consPost1982Steel = new DefaultMutableTreeNode("Constructed on 1982-");
	    MutableTreeNode allSteel = new DefaultMutableTreeNode("All");
	    jpnSteel.insert(consPre1981Steel,0);
	    jpnSteel.insert(consPost1982Steel,1);
	    jpnSteel.insert(allSteel,2);
	    //Light Steel
	    MutableTreeNode allLightSteel = new DefaultMutableTreeNode("All");
	    jpnLightSteel.insert(allLightSteel, 0);
	    DefaultTreeModel model = new DefaultTreeModel(assets);
	    vulSelectTree = new JTree(model);
	    TreeSelectionModel treSel = vulSelectTree.getSelectionModel();
	    treSel.setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
	    vulSelectTree.addTreeSelectionListener(new JTreeListener());
	}
	return vulSelectTree;
    }
	    
    /**
     * This method initializes vulInputPanel	
     * 	
     * @return javax.swing.JPanel	
     */
    private JPanel getVulInputPanel() {
	if (vulInputPanel == null) {
	    GridBagConstraints gridBagConstraints53 = new GridBagConstraints();
	    gridBagConstraints53.gridx = 1;
	    gridBagConstraints53.gridy = 0;
	    vulMeasureLabel = new JLabel();
	    vulMeasureLabel.setText("");
	    vulMeasureLabel.setPreferredSize(new Dimension(80, 20));
	    GridBagConstraints gridBagConstraints49 = new GridBagConstraints();
	    gridBagConstraints49.gridx = 0;
	    gridBagConstraints49.anchor = GridBagConstraints.CENTER;
	    gridBagConstraints49.insets = new Insets(0, 5, 0, 0);
	    gridBagConstraints49.gridy = 0;
	    vulMeasureTextLabel = new JLabel();
	    vulMeasureTextLabel.setText("Hazard Measure:");
	    vulMeasureTextLabel.setPreferredSize(new Dimension(100, 20));
	    GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
	    gridBagConstraints2.fill = GridBagConstraints.NONE;
	    gridBagConstraints2.gridy = 0;
	    gridBagConstraints2.weightx = 1.0;
	    gridBagConstraints2.anchor = GridBagConstraints.WEST;
	    gridBagConstraints2.gridx = 3;
	    GridBagConstraints gridBagConstraints29 = new GridBagConstraints();
	    gridBagConstraints29.gridx = 2;
	    gridBagConstraints29.insets = new Insets(0, 20, 0, 10);
	    gridBagConstraints29.gridy = 0;
	    vulVarLabel = new JLabel();
	    vulVarLabel.setText("σ");
	    vulVarLabel.setPreferredSize(new Dimension(10, 30));
	    vulInputPanel = new JPanel();
	    vulInputPanel.setBackground(Color.white);
	    vulInputPanel.setLayout(new GridBagLayout());
	    vulInputPanel.setPreferredSize(new Dimension(350, 50));
	    vulInputPanel.add(vulVarLabel, gridBagConstraints29);
	    vulInputPanel.add(getVulVarComboBox(), gridBagConstraints2);
	    vulInputPanel.add(vulMeasureTextLabel, gridBagConstraints49);
	    vulInputPanel.add(vulMeasureLabel, gridBagConstraints53);
	}
	return vulInputPanel;
    }

    /**
     * This method initializes vulPlotPanel	
     * 	
     * @return javax.swing.JPanel	
     */
    private JPanel getVulPlotPanel() {
	if (vulPlotPanel == null) {
	    vulPlotPanel = new JPanel();
	    vulPlotPanel.setLayout(new BorderLayout());
	    vulPlotPanel.setPreferredSize(new Dimension(420, 340));
	    vulPlotPanel.setBackground(Color.white);
	    vulPlotPanel.setBorder(BorderFactory.createLineBorder(Color.gray, 1));
	}
	return vulPlotPanel;
    }

    private JPanel getVulCurvePanel(int m,double[][] vulMatrix,double vulVar) {
	damVulVarValueLabel.setText((String)vulVarComboBox.getSelectedItem());
	lossVulVarValueLabel.setText((String)vulVarComboBox.getSelectedItem());
	if (vulCurvePanel == null) {
 	    VulDrawPanel dp = new VulDrawPanel(m,vulMatrix,vulVar);
	    vulCurvePanel = dp.getPanel();
	}
	return vulCurvePanel;
    }
	
    /**
     * This method initializes vulDataScrollPane	
     * 	
     * @return javax.swing.JScrollPane	
     */
    private JScrollPane getVulDataScrollPane() {
	if (vulDataScrollPane == null) {
	    vulDataScrollPane = new JScrollPane();
	    vulDataScrollPane.setViewportView(getVulDataTable());
	}
	return vulDataScrollPane;
    }
    
    /**
     * This method initializes vulDataTable	
     * 	
     * @return javax.swing.JTable	
     */
    private JTable getVulDataTable() {
	if (vulDataTable == null) {
	    vulDataTable = new JTable();
	}
	return vulDataTable;
    }
    
    /**
     * This method initializes damCfPanel	
     * 	
     * @return javax.swing.JPanel	
     */
    private JPanel getDamCfPanel() {
	if (damCfPanel == null) {
	    damAssetLabel = new JLabel();
	    damAssetLabel.setText("Asset");
	    damAssetLabel.setPreferredSize(new Dimension(40, 30));
	    damAssetLabel.setFont(new Font("Dialog", Font.BOLD, 14));
	    damSiteLabel = new JLabel();
	    damSiteLabel.setText("Site");
	    damSiteLabel.setPreferredSize(new Dimension(30, 30));
	    damSiteLabel.setFont(new Font("Dialog", Font.BOLD, 14));
	    damCfPanel = new JPanel();
	    damCfPanel.setLayout(new GridBagLayout());
	    damCfPanel.setPreferredSize(new Dimension(200, 150));
	    damCfPanel.setBackground(Color.white);
	    damInputSiteLabel = new JLabel();
	    damInputSiteLabel.setPreferredSize(new Dimension(20, 30));
	    damInputSiteLabel.setHorizontalTextPosition(SwingConstants.TRAILING);
	    damInputSiteLabel.setText("");
	    damInputAssetLabel = new JLabel();
	    damInputAssetLabel.setPreferredSize(new Dimension(20, 30));
	    damInputAssetLabel.setText("");
	}
	return damCfPanel;
    }
    
    /**
     * This method initializes damDataPanel	
     * 	
     * @return javax.swing.JPanel	
     */
    private JPanel getDamDataPanel() {
	if (damDataPanel == null) {
	    GridBagConstraints gridBagConstraints40 = new GridBagConstraints();
	    gridBagConstraints40.fill = GridBagConstraints.BOTH;
	    gridBagConstraints40.gridy = 0;
	    gridBagConstraints40.weightx = 1.0;
	    gridBagConstraints40.weighty = 1.0;
	    gridBagConstraints40.gridx = 0;
	    damDataPanel = new JPanel();
	    damDataPanel.setLayout(new GridBagLayout());
	    damDataPanel.setPreferredSize(new Dimension(200, 250));
	    damDataPanel.add(getDamDataScrollPane(), gridBagConstraints40);
	}
	return damDataPanel;
    }
    
    /**
     * This method initializes damInputPanel	
     * 	
     * @return javax.swing.JPanel	
     */
    private JPanel getDamInputPanel() {
	if (damInputPanel == null) {
	    GridBagConstraints gridBagConstraints39 = new GridBagConstraints();
	    gridBagConstraints39.gridx = 0;
	    gridBagConstraints39.anchor = GridBagConstraints.EAST;
	    gridBagConstraints39.gridy = 1;
	    damVulLabel = new JLabel();
	    damVulLabel.setText("Vulnerability");
	    damVulLabel.setPreferredSize(new Dimension(90, 30));
	    damVulLabel.setFont(new Font("Dialog", Font.BOLD, 14));
	    GridBagConstraints gridBagConstraints37 = new GridBagConstraints();
	    gridBagConstraints37.gridx = 2;
	    gridBagConstraints37.gridy = 1;
	    damVulVarValueLabel = new JLabel();
	    damVulVarValueLabel.setText("");
	    damVulVarValueLabel.setPreferredSize(new Dimension(25, 30));
	    GridBagConstraints gridBagConstraints36 = new GridBagConstraints();
	    gridBagConstraints36.gridx = 1;
	    gridBagConstraints36.insets = new Insets(0, 15, 0, 0);
	    gridBagConstraints36.gridy = 1;
	    damVulVarLabel = new JLabel();
	    damVulVarLabel.setText("σ=");
	    damVulVarLabel.setPreferredSize(new Dimension(15, 30));
	    damHazVarValueLabel = new JLabel();
	    damHazVarValueLabel.setText("");
	    damHazVarValueLabel.setPreferredSize(new Dimension(25, 30));
	    GridBagConstraints gridBagConstraints35 = new GridBagConstraints();
	    gridBagConstraints35.gridx = 1;
	    gridBagConstraints35.insets = new Insets(0, 15, 0, 0);
	    gridBagConstraints35.gridy = 0;
	    damHazVarLabel = new JLabel();
	    damHazVarLabel.setText("σ=");
	    damHazVarLabel.setPreferredSize(new Dimension(15, 30));
	    GridBagConstraints gridBagConstraints27 = new GridBagConstraints();
	    gridBagConstraints27.gridx = 0;
	    gridBagConstraints27.anchor = GridBagConstraints.EAST;
	    gridBagConstraints27.gridy = 0;
	    damHazLabel = new JLabel();
	    damHazLabel.setText("Hazard");
	    damHazLabel.setFont(new Font("Dialog", Font.BOLD, 14));
	    damHazLabel.setPreferredSize(new Dimension(50, 30));
	    GridBagConstraints gridBagConstraints34 = new GridBagConstraints();
	    gridBagConstraints34.fill = GridBagConstraints.HORIZONTAL;
	    gridBagConstraints34.gridwidth = 1;
	    gridBagConstraints34.gridx = 5;
	    gridBagConstraints34.gridy = 1;
	    gridBagConstraints34.weightx = 1.0;
	    gridBagConstraints34.insets = new Insets(0, 10, 0, 0);
	    GridBagConstraints gridBagConstraints30 = new GridBagConstraints();
	    gridBagConstraints30.anchor = GridBagConstraints.EAST;
	    gridBagConstraints30.gridx = 4;
	    gridBagConstraints30.gridy = 1;
	    gridBagConstraints30.insets = new Insets(0, 20, 0, 0);
	    GridBagConstraints gridBagConstraints21 = new GridBagConstraints();
	    gridBagConstraints21.fill = GridBagConstraints.HORIZONTAL;
	    gridBagConstraints21.gridwidth = 1;
	    gridBagConstraints21.gridx = 5;
	    gridBagConstraints21.gridy = 0;
	    gridBagConstraints21.weightx = 1.0;
	    gridBagConstraints21.insets = new Insets(0, 10, 0, 0);
	    GridBagConstraints gridBagConstraints20 = new GridBagConstraints();
	    gridBagConstraints20.anchor = GridBagConstraints.EAST;
	    gridBagConstraints20.gridx = 4;
	    gridBagConstraints20.gridy = 0;
	    gridBagConstraints20.fill = GridBagConstraints.NONE;
	    gridBagConstraints20.insets = new Insets(0, 20, 0, 0);
	    damInputPanel = new JPanel();
	    damInputPanel.setLayout(new GridBagLayout());
	    damInputPanel.setPreferredSize(new Dimension(780, 80));
	    damInputPanel.setBackground(Color.white);
	    damInputPanel.add(damHazLabel, gridBagConstraints27);
	    damInputPanel.add(damHazVarLabel, gridBagConstraints35);
	    damInputPanel.add(damHazVarValueLabel, new GridBagConstraints());
	    damInputPanel.add(damSiteLabel, gridBagConstraints20);
	    damInputPanel.add(damInputSiteLabel, gridBagConstraints21);
	    damInputPanel.add(damVulLabel, gridBagConstraints39);
	    damInputPanel.add(damVulVarLabel, gridBagConstraints36);
	    damInputPanel.add(damVulVarValueLabel, gridBagConstraints37);
	    damInputPanel.add(damAssetLabel, gridBagConstraints30);
	    damInputPanel.add(damInputAssetLabel, gridBagConstraints34);
	}
	return damInputPanel;
    }
        
    /**
     * This method initializes damDataScrollPane	
     * 	
     * @return javax.swing.JScrollPane	
     */
    private JScrollPane getDamDataScrollPane() {
	if (damDataScrollPane == null) {
	    damDataScrollPane = new JScrollPane();
	    damDataScrollPane.setViewportView(getDamDataTable());
	}
	return damDataScrollPane;
    }
    
    /**
     * This method initializes damDataTable	
     * 	
     * @return javax.swing.JTable	
     */
    private JTable getDamDataTable() {
	if (damDataTable == null) {
	    damDataTable = new JTable();
	    DefaultTableModel defaultTableModel = new DefaultTableModel();
	    damDataTable.setModel(defaultTableModel);
	}
	return damDataTable;
    }
    
    /**
     * This method initializes damPlotPanel	
     * 	
     * @return javax.swing.JPanel	
     */
    private JPanel getDamPlotPanel() {
	if (damPlotPanel == null) {
	    damPlotPanel = new JPanel();
	    damPlotPanel.setLayout(new BorderLayout());
	    damPlotPanel.setPreferredSize(new Dimension(420, 420));
	    damPlotPanel.setBackground(Color.white);
	    damPlotPanel.setBorder(BorderFactory.createLineBorder(Color.gray, 1));
	}
	return damPlotPanel;
    }
  
    private JPanel getDamCurvePanel(double[][] hazMatrix, double[][] vulMatrix, double[][] pdfMatrix, boolean[] check) {
	if (damCurvePanel == null) {
	    DamDrawPanel dp = new DamDrawPanel(hazMatrix,vulMatrix,pdfMatrix,check);
	    damCurvePanel = dp.getPanel();
	}
	return damCurvePanel;
    }

    /**
     * This method initializes lossPlotPanel	
     * 	
     * @return javax.swing.JPanel	
     */
    private JPanel getLossPlotPanel() {
	if (lossPlotPanel == null) {
	    lossPlotPanel = new JPanel();
	    lossPlotPanel.setLayout(new BorderLayout());
	    lossPlotPanel.setPreferredSize(new Dimension(420, 420));
	    lossPlotPanel.setBackground(Color.white);
	    lossPlotPanel.setBorder(BorderFactory.createLineBorder(Color.gray, 1));
	}
	return lossPlotPanel;
    }
    
    /**
     * This method initializes lossDataPanel	
     * 	
     * @return javax.swing.JPanel	
     */
    private JPanel getLossDataPanel() {
	if (lossDataPanel == null) {
	    GridBagConstraints gridBagConstraints44 = new GridBagConstraints();
	    gridBagConstraints44.fill = GridBagConstraints.BOTH;
	    gridBagConstraints44.gridy = 0;
	    gridBagConstraints44.weightx = 1.0;
	    gridBagConstraints44.weighty = 1.0;
	    gridBagConstraints44.gridx = 0;
	    GridBagConstraints gridBagConstraints38 = new GridBagConstraints();
	    gridBagConstraints38.fill = GridBagConstraints.NONE;
	    gridBagConstraints38.gridy = 0;
	    gridBagConstraints38.weightx = 1.0;
	    gridBagConstraints38.weighty = 1.0;
	    gridBagConstraints38.gridx = 0;
	    lossDataPanel = new JPanel();
	    lossDataPanel.setLayout(new GridBagLayout());
	    lossDataPanel.setPreferredSize(new Dimension(200, 250));
	    lossDataPanel.setBackground(Color.white);
	    lossDataPanel.add(getLossDataScrollPane(), gridBagConstraints44);
	}
	return lossDataPanel;
    }
    
    /**
     * This method initializes lossInputPanel	
     * 	
     * @return javax.swing.JPanel	
     */
    private JPanel getLossInputPanel() {
	if (lossInputPanel == null) {
	    GridBagConstraints gridBagConstraints52 = new GridBagConstraints();
	    gridBagConstraints52.fill = GridBagConstraints.VERTICAL;
	    gridBagConstraints52.gridy = 1;
	    gridBagConstraints52.weightx = 1.0;
	    gridBagConstraints52.anchor = GridBagConstraints.WEST;
	    gridBagConstraints52.gridx = 1;
	    GridBagConstraints gridBagConstraints51 = new GridBagConstraints();
	    gridBagConstraints51.fill = GridBagConstraints.BOTH;
	    gridBagConstraints51.gridy = 1;
	    gridBagConstraints51.weightx = 1.0;
	    gridBagConstraints51.gridwidth = 1;
	    gridBagConstraints51.insets = new Insets(0, 30, 0, 0);
	    gridBagConstraints51.gridx = 0;
	    GridBagConstraints gridBagConstraints50 = new GridBagConstraints();
	    gridBagConstraints50.gridx = 0;
	    gridBagConstraints50.gridwidth = 1;
	    gridBagConstraints50.anchor = GridBagConstraints.WEST;
	    gridBagConstraints50.insets = new Insets(10, 20, 5, 0);
	    gridBagConstraints50.gridy = 0;
	    assetValueLabel = new JLabel();
	    assetValueLabel.setText("Asset Value");
	    assetValueLabel.setFont(new Font("Dialog", Font.BOLD, 14));
	    lossInputPanel = new JPanel();
	    lossInputPanel.setLayout(new GridBagLayout());
	    lossInputPanel.setPreferredSize(new Dimension(200, 150));
	    lossInputPanel.setBackground(Color.white);
	    lossInputPanel.add(assetValueLabel, gridBagConstraints50);
	    lossInputPanel.add(getAssetValueInputTextfield(), gridBagConstraints51);
	    lossInputPanel.add(getAssetValueInputComboBox(), gridBagConstraints52);
	}
	return lossInputPanel;
    }
    
    /**
     * This method initializes assetValueInputTextfield	
	 * 	
	 * @return javax.swing.JTextField	
	 */
    private JTextField getAssetValueInputTextfield() {
	if (assetValueInputTextfield == null) {
	    regexDoc = new RegexDocument();
	    assetValueInputTextfield = new JTextField(regexDoc,"",50);
	}
	return assetValueInputTextfield;
    }
    
    /**
     * This method initializes assetValueInputComboBox	
     * 	
     * @return javax.swing.JComboBox	
     */
    private JComboBox getAssetValueInputComboBox() {
	if (assetValueInputComboBox == null) {
	    assetValueInputComboBox = new JComboBox();
	    assetValueInputComboBox.setPreferredSize(new Dimension(50, 25));
	    assetValueInputComboBox.addItem("$");
	    assetValueInputComboBox.addItem("円");    
	}
	return assetValueInputComboBox;
    }
    
    /**
     * This method initializes vulVarComboBox	
     * 	
     * @return javax.swing.JComboBox	
     */
    private JComboBox getVulVarComboBox() {
	if (vulVarComboBox == null) {
	    vulVarComboBox = new JComboBox();
	    vulVarComboBox.setPreferredSize(new Dimension(80, 25));
	    vulVarComboBox.addItem("0.01");
	    vulVarComboBox.addItem("0.1");
	    vulVarComboBox.addItem("0.2");
	    vulVarComboBox.addItem("0.3");
	    vulVarComboBox.addItem("0.4");
	    vulVarComboBox.addItem("0.5");
	    vulVarComboBox.addItem("0.6");
	    vulVarComboBox.addItem("0.7");
	    vulVarComboBox.addItem("0.8");
	    vulVarComboBox.addItem("0.9");
	    vulVarComboBox.addItem("0.99");
	    vulVarComboBox.setSelectedItem("0.2");
	    vulVarComboBox.addItemListener(new vulVarComboBoxListener());
	}
	return vulVarComboBox;
    }
    
    /**
     * This method initializes damSelectPanel	
     * 	
     * @return javax.swing.JPanel	
     */
    private JPanel getDamSelectPanel() {
	if (damSelectPanel == null) {
	    GridBagConstraints gridBagConstraints78 = new GridBagConstraints();
	    gridBagConstraints78.gridx = 0;
	    gridBagConstraints78.gridwidth = 1;
	    gridBagConstraints78.gridy = 0;
	    GridBagConstraints gridBagConstraints66 = new GridBagConstraints();
	    gridBagConstraints66.gridx = 0;
	    gridBagConstraints66.gridy = 11;
	    GridBagConstraints gridBagConstraints65 = new GridBagConstraints();
	    gridBagConstraints65.gridx = 0;
	    gridBagConstraints65.gridy = 10;
	    GridBagConstraints gridBagConstraints64 = new GridBagConstraints();
	    gridBagConstraints64.gridx = 0;
	    gridBagConstraints64.gridy = 9;
	    GridBagConstraints gridBagConstraints63 = new GridBagConstraints();
	    gridBagConstraints63.gridx = 0;
	    gridBagConstraints63.gridy = 8;
	    GridBagConstraints gridBagConstraints62 = new GridBagConstraints();
	    gridBagConstraints62.gridx = 0;
	    gridBagConstraints62.gridy = 7;
	    GridBagConstraints gridBagConstraints61 = new GridBagConstraints();
	    gridBagConstraints61.gridx = 0;
	    gridBagConstraints61.gridy = 6;
	    GridBagConstraints gridBagConstraints60 = new GridBagConstraints();
	    gridBagConstraints60.gridx = 0;
	    gridBagConstraints60.gridy = 5;
	    GridBagConstraints gridBagConstraints59 = new GridBagConstraints();
	    gridBagConstraints59.gridx = 0;
	    gridBagConstraints59.gridy = 4;
	    GridBagConstraints gridBagConstraints58 = new GridBagConstraints();
	    gridBagConstraints58.gridx = 0;
	    gridBagConstraints58.gridy = 3;
	    GridBagConstraints gridBagConstraints57 = new GridBagConstraints();
	    gridBagConstraints57.gridx = 0;
	    gridBagConstraints57.gridy = 2;
	    GridBagConstraints gridBagConstraints56 = new GridBagConstraints();
	    gridBagConstraints56.gridx = 0;
	    gridBagConstraints56.gridy = 1;
	    damSelectPanel = new JPanel();
	    damSelectPanel.setLayout(new GridBagLayout());
	    damSelectPanel.setPreferredSize(new Dimension(100, 100));
	    damSelectPanel.setBackground(Color.white);
	    damSelectPanel.setBorder(BorderFactory.createLineBorder(Color.gray, 1));
	    damSelectPanel.add(getDamCfCheck1(), gridBagConstraints56);
	    damSelectPanel.add(getDamCfCheck10(), gridBagConstraints57);
	    damSelectPanel.add(getDamCfCheck20(), gridBagConstraints58);
	    damSelectPanel.add(getDamCfCheck30(), gridBagConstraints59);
	    damSelectPanel.add(getDamCfCheck40(), gridBagConstraints60);
	    damSelectPanel.add(getDamCfCheck50(), gridBagConstraints61);
	    damSelectPanel.add(getDamCfCheck60(), gridBagConstraints62);
	    damSelectPanel.add(getDamCfCheck70(), gridBagConstraints63);
	    damSelectPanel.add(getDamCfCheck80(), gridBagConstraints64);
	    damSelectPanel.add(getDamCfCheck90(), gridBagConstraints65);
	    damSelectPanel.add(getDamCfCheck99(), gridBagConstraints66);
	    damSelectPanel.add(getDamCfPlotButton(), gridBagConstraints78);
	}
	return damSelectPanel;
    }
    
    /**
     * This method initializes damCfCheck1	
     * 	
     * @return javax.swing.JCheckBox	
     */
    private JCheckBox getDamCfCheck1() {
	if (damCfCheck1 == null) {
	    damCfCheck1 = new JCheckBox();
	    damCfCheck1.setText("1%");
	    damCfCheck1.setBackground(Color.white);
	}
	return damCfCheck1;
    }
    
    /**
     * This method initializes damCfCheck10	
     * 	
     * @return javax.swing.JCheckBox	
     */
    private JCheckBox getDamCfCheck10() {
	if (damCfCheck10 == null) {
	    damCfCheck10 = new JCheckBox();
	    damCfCheck10.setText("10%");
	    damCfCheck10.setBackground(Color.white);
	}
	return damCfCheck10;
    }
    
    /**
     * This method initializes damCfCheck20	
     * 	
     * @return javax.swing.JCheckBox	
     */
    private JCheckBox getDamCfCheck20() {
	if (damCfCheck20 == null) {
	    damCfCheck20 = new JCheckBox();
	    damCfCheck20.setText("20%");
	    damCfCheck20.setBackground(Color.white);
	}
	return damCfCheck20;
    }
    
    /**
     * This method initializes damCfCheck30	
     * 	
     * @return javax.swing.JCheckBox	
     */
    private JCheckBox getDamCfCheck30() {
	if (damCfCheck30 == null) {
	    damCfCheck30 = new JCheckBox();
	    damCfCheck30.setText("30%");
	    damCfCheck30.setBackground(Color.white);
	}
	return damCfCheck30;
    }
    
    /**
     * This method initializes damCfCheck40	
     * 	
     * @return javax.swing.JCheckBox	
     */
    private JCheckBox getDamCfCheck40() {
	if (damCfCheck40 == null) {
	    damCfCheck40 = new JCheckBox();
	    damCfCheck40.setText("40%");
	    damCfCheck40.setBackground(Color.white);
	}
	return damCfCheck40;
    }
    
    /**
     * This method initializes damCfCheck50	
     * 	
     * @return javax.swing.JCheckBox	
     */
    private JCheckBox getDamCfCheck50() {
	if (damCfCheck50 == null) {
	    damCfCheck50 = new JCheckBox();
	    damCfCheck50.setSelected(true);
	    damCfCheck50.setBackground(Color.white);
	    damCfCheck50.setText("50%");
	    damCfCheck50.setEnabled(false);
	}
	return damCfCheck50;
    }
    
    /**
     * This method initializes damCfCheck60	
     * 	
     * @return javax.swing.JCheckBox	
     */
    private JCheckBox getDamCfCheck60() {
	if (damCfCheck60 == null) {
	    damCfCheck60 = new JCheckBox();
	    damCfCheck60.setText("60%");
	    damCfCheck60.setBackground(Color.white);
	}
	return damCfCheck60;
    }
    
    /**
     * This method initializes damCfCheck70	
     * 	
     * @return javax.swing.JCheckBox	
     */
    private JCheckBox getDamCfCheck70() {
	if (damCfCheck70 == null) {
	    damCfCheck70 = new JCheckBox();
	    damCfCheck70.setText("70%");
	    damCfCheck70.setBackground(Color.white);
	}
	return damCfCheck70;
    }
    
    /**
     * This method initializes damCfCheck80	
     * 	
     * @return javax.swing.JCheckBox	
     */
    private JCheckBox getDamCfCheck80() {
	if (damCfCheck80 == null) {
	    damCfCheck80 = new JCheckBox();
	    damCfCheck80.setText("80%");
	    damCfCheck80.setBackground(Color.white);
	}
	return damCfCheck80;
    }
    
    /**
     * This method initializes damCfCheck90	
     * 	
     * @return javax.swing.JCheckBox	
     */
    private JCheckBox getDamCfCheck90() {
	if (damCfCheck90 == null) {
	    damCfCheck90 = new JCheckBox();
	    damCfCheck90.setText("90%");
	    damCfCheck90.setBackground(Color.white);
	}
	return damCfCheck90;
    }
    
    /**
     * This method initializes damCfCheck99	
     * 	
     * @return javax.swing.JCheckBox	
     */
    private JCheckBox getDamCfCheck99() {
	if (damCfCheck99 == null) {
	    damCfCheck99 = new JCheckBox();
	    damCfCheck99.setText("99%");
	    damCfCheck99.setBackground(Color.white);
	}
	return damCfCheck99;
    }
    
    /**
     * This method initializes damCfPlotButton	
     * 	
     * @return javax.swing.JButton	
     */
    private JButton getDamCfPlotButton() {
	if (damCfPlotButton == null) {
	    damCfPlotButton = new JButton();
	    damCfPlotButton.setText("Plot");
	    damCfPlotButton.addActionListener(new damCfPlotButtonListener());
	}
	return damCfPlotButton;
    }

    /**
     * This method initializes lossDataScrollPane	
     * 	
     * @return javax.swing.JScrollPane	
     */
    private JScrollPane getLossDataScrollPane() {
	if (lossDataScrollPane == null) {
	    lossDataScrollPane = new JScrollPane();
	    lossDataScrollPane.setViewportView(getLossDataTable());
	}
	return lossDataScrollPane;
    }
    
    /**
     * This method initializes lossDataTable	
     * 	
     * @return javax.swing.JTable	
     */
    private JTable getLossDataTable() {
	if (lossDataTable == null) {
	    lossDataTable = new JTable();
	}
	return lossDataTable;
    }
    
    /**
     * This method initializes lossStatePanel	
     * 	
     * @return javax.swing.JPanel	
     */
    private JPanel getLossStatePanel() {
	if (lossStatePanel == null) {
	    GridBagConstraints gridBagConstraints341 = new GridBagConstraints();
	    gridBagConstraints341.fill = GridBagConstraints.HORIZONTAL;
	    gridBagConstraints341.gridwidth = 1;
	    gridBagConstraints341.gridx = 5;
	    gridBagConstraints341.gridy = 1;
	    gridBagConstraints341.weightx = 1.0;
	    gridBagConstraints341.insets = new Insets(0, 10, 0, 0);
	    lossInputAssetLabel = new JLabel();
	    lossInputAssetLabel.setPreferredSize(new Dimension(20, 25));
	    lossInputAssetLabel.setText("");
	    GridBagConstraints gridBagConstraints301 = new GridBagConstraints();
	    gridBagConstraints301.anchor = GridBagConstraints.EAST;
	    gridBagConstraints301.gridx = 4;
	    gridBagConstraints301.gridy = 1;
	    gridBagConstraints301.insets = new Insets(0, 20, 0, 0);
	    lossAssetLabel = new JLabel();
	    lossAssetLabel.setFont(new Font("Dialog", Font.BOLD, 14));
	    lossAssetLabel.setText("Asset");
	    lossAssetLabel.setPreferredSize(new Dimension(40, 30));
	    GridBagConstraints gridBagConstraints371 = new GridBagConstraints();
	    gridBagConstraints371.gridx = 2;
	    gridBagConstraints371.gridy = 1;
	    lossVulVarValueLabel = new JLabel();
	    lossVulVarValueLabel.setPreferredSize(new Dimension(25, 30));
	    lossVulVarValueLabel.setText("");
	    GridBagConstraints gridBagConstraints361 = new GridBagConstraints();
	    gridBagConstraints361.insets = new Insets(0, 15, 0, 0);
	    gridBagConstraints361.gridy = 1;
	    gridBagConstraints361.gridx = 1;
	    lossVulVarLabel = new JLabel();
	    lossVulVarLabel.setPreferredSize(new Dimension(15, 30));
	    lossVulVarLabel.setText("\u03c3=");
	    GridBagConstraints gridBagConstraints391 = new GridBagConstraints();
	    gridBagConstraints391.anchor = GridBagConstraints.EAST;
	    gridBagConstraints391.gridy = 1;
	    gridBagConstraints391.gridx = 0;
	    lossVulLabel = new JLabel();
	    lossVulLabel.setFont(new Font("Dialog", Font.BOLD, 14));
	    lossVulLabel.setText("Vulnerability");
	    lossVulLabel.setPreferredSize(new Dimension(90, 30));
	    GridBagConstraints gridBagConstraints211 = new GridBagConstraints();
	    gridBagConstraints211.fill = GridBagConstraints.HORIZONTAL;
	    gridBagConstraints211.gridwidth = 1;
	    gridBagConstraints211.gridx = 5;
	    gridBagConstraints211.gridy = 0;
	    gridBagConstraints211.weightx = 1.0;
	    gridBagConstraints211.insets = new Insets(0, 10, 0, 0);
	    lossInputSiteLabel = new JLabel();
	    lossInputSiteLabel.setPreferredSize(new Dimension(20, 30));
	    lossInputSiteLabel.setText("");
	    lossInputSiteLabel.setHorizontalTextPosition(SwingConstants.TRAILING);
	    GridBagConstraints gridBagConstraints201 = new GridBagConstraints();
	    gridBagConstraints201.anchor = GridBagConstraints.EAST;
	    gridBagConstraints201.insets = new Insets(0, 20, 0, 0);
	    gridBagConstraints201.gridx = 4;
	    gridBagConstraints201.gridy = 0;
	    gridBagConstraints201.fill = GridBagConstraints.NONE;
	    lossSiteLabel = new JLabel();
	    lossSiteLabel.setFont(new Font("Dialog", Font.BOLD, 14));
	    lossSiteLabel.setText("Site");
	    lossSiteLabel.setPreferredSize(new Dimension(30, 30));
	    lossHazVarValueLabel = new JLabel();
	    lossHazVarValueLabel.setPreferredSize(new Dimension(25, 30));
	    lossHazVarValueLabel.setText("");
	    GridBagConstraints gridBagConstraints351 = new GridBagConstraints();
	    gridBagConstraints351.insets = new Insets(0, 15, 0, 0);
	    gridBagConstraints351.gridy = 0;
	    gridBagConstraints351.gridx = 1;
	    lossHazVarLabel = new JLabel();
	    lossHazVarLabel.setPreferredSize(new Dimension(15, 30));
	    lossHazVarLabel.setText("\u03c3=");
	    GridBagConstraints gridBagConstraints271 = new GridBagConstraints();
	    gridBagConstraints271.anchor = GridBagConstraints.EAST;
	    gridBagConstraints271.gridy = 0;
	    gridBagConstraints271.gridx = 0;
	    lossHazLabel = new JLabel();
	    lossHazLabel.setFont(new Font("Dialog", Font.BOLD, 14));
	    lossHazLabel.setText("Hazard");
	    lossHazLabel.setPreferredSize(new Dimension(50, 30));
	    lossStatePanel = new JPanel();
	    lossStatePanel.setLayout(new GridBagLayout());
	    lossStatePanel.setBackground(Color.white);
	    lossStatePanel.setPreferredSize(new Dimension(780, 80));
	    lossStatePanel.add(lossHazLabel, gridBagConstraints271);
	    lossStatePanel.add(lossHazVarLabel, gridBagConstraints351);
	    lossStatePanel.add(lossHazVarValueLabel, new GridBagConstraints());
	    lossStatePanel.add(lossSiteLabel, gridBagConstraints201);
	    lossStatePanel.add(lossInputSiteLabel, gridBagConstraints211);
	    lossStatePanel.add(lossVulLabel, gridBagConstraints391);
	    lossStatePanel.add(lossVulVarLabel, gridBagConstraints361);
	    lossStatePanel.add(lossVulVarValueLabel, gridBagConstraints371);
	    lossStatePanel.add(lossAssetLabel, gridBagConstraints301);
	    lossStatePanel.add(lossInputAssetLabel, gridBagConstraints341);
	}
	return lossStatePanel;
    }
    
    /**
     * This method initializes lossSelectPanel	
     * 	
     * @return javax.swing.JPanel	
     */
    private JPanel getLossSelectPanel() {
	if (lossSelectPanel == null) {
	    GridBagConstraints gridBagConstraints781 = new GridBagConstraints();
	    gridBagConstraints781.gridwidth = 1;
	    gridBagConstraints781.gridy = 0;
	    gridBagConstraints781.gridx = 0;
	    GridBagConstraints gridBagConstraints661 = new GridBagConstraints();
	    gridBagConstraints661.gridx = 0;
	    gridBagConstraints661.gridy = 11;
	    GridBagConstraints gridBagConstraints651 = new GridBagConstraints();
	    gridBagConstraints651.gridx = 0;
	    gridBagConstraints651.gridy = 10;
	    GridBagConstraints gridBagConstraints641 = new GridBagConstraints();
	    gridBagConstraints641.gridx = 0;
	    gridBagConstraints641.gridy = 9;
	    GridBagConstraints gridBagConstraints631 = new GridBagConstraints();
	    gridBagConstraints631.gridx = 0;
	    gridBagConstraints631.gridy = 8;
	    GridBagConstraints gridBagConstraints621 = new GridBagConstraints();
	    gridBagConstraints621.gridx = 0;
	    gridBagConstraints621.gridy = 7;
	    GridBagConstraints gridBagConstraints611 = new GridBagConstraints();
	    gridBagConstraints611.gridx = 0;
	    gridBagConstraints611.gridy = 6;
	    GridBagConstraints gridBagConstraints601 = new GridBagConstraints();
	    gridBagConstraints601.gridx = 0;
	    gridBagConstraints601.gridy = 5;
	    GridBagConstraints gridBagConstraints591 = new GridBagConstraints();
	    gridBagConstraints591.gridx = 0;
	    gridBagConstraints591.gridy = 4;
	    GridBagConstraints gridBagConstraints581 = new GridBagConstraints();
	    gridBagConstraints581.gridx = 0;
	    gridBagConstraints581.gridy = 3;
	    GridBagConstraints gridBagConstraints571 = new GridBagConstraints();
	    gridBagConstraints571.gridx = 0;
	    gridBagConstraints571.gridy = 2;
	    GridBagConstraints gridBagConstraints561 = new GridBagConstraints();
	    gridBagConstraints561.gridx = 0;
	    gridBagConstraints561.gridy = 1;
	    lossSelectPanel = new JPanel();
	    lossSelectPanel.setLayout(new GridBagLayout());
	    lossSelectPanel.setBackground(Color.white);
	    lossSelectPanel.setPreferredSize(new Dimension(100, 100));
	    lossSelectPanel.setBorder(BorderFactory.createLineBorder(Color.gray, 1));
	    lossSelectPanel.add(getLossCfCheck1(), gridBagConstraints561);
	    lossSelectPanel.add(getLossCfCheck10(), gridBagConstraints571);
	    lossSelectPanel.add(getLossCfCheck20(), gridBagConstraints581);
	    lossSelectPanel.add(getLossCfCheck30(), gridBagConstraints591);
	    lossSelectPanel.add(getLossCfCheck40(), gridBagConstraints601);
	    lossSelectPanel.add(getLossCfCheck50(), gridBagConstraints611);
	    lossSelectPanel.add(getLossCfCheck60(), gridBagConstraints621);
	    lossSelectPanel.add(getLossCfCheck70(), gridBagConstraints631);
	    lossSelectPanel.add(getLossCfCheck80(), gridBagConstraints641);
	    lossSelectPanel.add(getLossCfCheck90(), gridBagConstraints651);
	    lossSelectPanel.add(getLossCfCheck99(), gridBagConstraints661);
	    lossSelectPanel.add(getLossCfPlotButton(), gridBagConstraints781);
	}
	return lossSelectPanel;
    }
    
    /**
     * This method initializes lossCfCheck1	
     * 	
     * @return javax.swing.JCheckBox	
     */
    private JCheckBox getLossCfCheck1() {
	if (lossCfCheck1 == null) {
	    lossCfCheck1 = new JCheckBox();
	    lossCfCheck1.setBackground(Color.white);
	    lossCfCheck1.setText("1%");
	}
	return lossCfCheck1;
    }
    
    /**
     * This method initializes lossCfCheck10	
     * 	
     * @return javax.swing.JCheckBox	
     */
    private JCheckBox getLossCfCheck10() {
	if (lossCfCheck10 == null) {
	    lossCfCheck10 = new JCheckBox();
	    lossCfCheck10.setBackground(Color.white);
	    lossCfCheck10.setText("10%");
	}
	return lossCfCheck10;
    }
    
    /**
     * This method initializes lossCfCheck20	
     * 	
     * @return javax.swing.JCheckBox	
     */
    private JCheckBox getLossCfCheck20() {
	if (lossCfCheck20 == null) {
	    lossCfCheck20 = new JCheckBox();
	    lossCfCheck20.setBackground(Color.white);
	    lossCfCheck20.setText("20%");
	}
	return lossCfCheck20;
    }
    
    /**
     * This method initializes lossCfCheck30	
     * 	
     * @return javax.swing.JCheckBox	
     */
    private JCheckBox getLossCfCheck30() {
	if (lossCfCheck30 == null) {
	    lossCfCheck30 = new JCheckBox();
	    lossCfCheck30.setBackground(Color.white);
	    lossCfCheck30.setText("30%");
	}
	return lossCfCheck30;
    }
    
    /**
     * This method initializes lossCfCheck40	
     * 	
     * @return javax.swing.JCheckBox	
     */
    private JCheckBox getLossCfCheck40() {
	if (lossCfCheck40 == null) {
	    lossCfCheck40 = new JCheckBox();
	    lossCfCheck40.setBackground(Color.white);
	    lossCfCheck40.setText("40%");
	}
	return lossCfCheck40;
    }
    
    /**
     * This method initializes lossCfCheck50	
     * 	
     * @return javax.swing.JCheckBox	
     */
    private JCheckBox getLossCfCheck50() {
	if (lossCfCheck50 == null) {
	    lossCfCheck50 = new JCheckBox();
	    lossCfCheck50.setBackground(Color.white);
	    lossCfCheck50.setText("50%");
	    lossCfCheck50.setSelected(true);
	    lossCfCheck50.setEnabled(false);
	}
	return lossCfCheck50;
    }
    
    /**
     * This method initializes lossCfCheck60	
     * 	
     * @return javax.swing.JCheckBox	
     */
    private JCheckBox getLossCfCheck60() {
	if (lossCfCheck60 == null) {
	    lossCfCheck60 = new JCheckBox();
	    lossCfCheck60.setBackground(Color.white);
	    lossCfCheck60.setText("60%");
	}
	return lossCfCheck60;
    }
    
    /**
     * This method initializes lossCfCheck70	
     * 	
     * @return javax.swing.JCheckBox	
     */
    private JCheckBox getLossCfCheck70() {
	if (lossCfCheck70 == null) {
	    lossCfCheck70 = new JCheckBox();
	    lossCfCheck70.setBackground(Color.white);
	    lossCfCheck70.setText("70%");
	}
	return lossCfCheck70;
    }
    
    /**
     * This method initializes lossCfCheck80	
     * 	
     * @return javax.swing.JCheckBox	
     */
    private JCheckBox getLossCfCheck80() {
	if (lossCfCheck80 == null) {
	    lossCfCheck80 = new JCheckBox();
	    lossCfCheck80.setBackground(Color.white);
	    lossCfCheck80.setText("80%");
	}
	return lossCfCheck80;
    }
    
    /**
     * This method initializes lossCfCheck90	
     * 	
     * @return javax.swing.JCheckBox	
     */
    private JCheckBox getLossCfCheck90() {
	if (lossCfCheck90 == null) {
	    lossCfCheck90 = new JCheckBox();
	    lossCfCheck90.setBackground(Color.white);
	    lossCfCheck90.setText("90%");
	}
	return lossCfCheck90;
    }
    
    /**
     * This method initializes lossCfCheck99	
     * 	
     * @return javax.swing.JCheckBox	
     */
    private JCheckBox getLossCfCheck99() {
	if (lossCfCheck99 == null) {
	    lossCfCheck99 = new JCheckBox();
	    lossCfCheck99.setBackground(Color.white);
	    lossCfCheck99.setText("99%");
	}
	return lossCfCheck99;
    }
    
    /**
     * This method initializes lossCfPlotButton	
     * 	
     * @return javax.swing.JButton	
     */
    private JButton getLossCfPlotButton() {
	if (lossCfPlotButton == null) {
	    lossCfPlotButton = new JButton();
	    lossCfPlotButton.setText("Plot");
	    lossCfPlotButton.addActionListener(new lossCfPlotButtonListener());
	}
	return lossCfPlotButton;
    }

    private JPanel getLossCurvePanel(double[][] hazMatrix, double[][] vulMatrix, double[][] pdfMatrix, boolean[] check) {
	if (lossCurvePanel == null) {
	    String unit = (String)assetValueInputComboBox.getSelectedItem();
	    double value = Double.parseDouble(assetValueInputTextfield.getText());
	    LossDrawPanel dp = new LossDrawPanel(hazMatrix,vulMatrix,pdfMatrix,check,unit,value);
	    lossCurvePanel = dp.getPanel();
	}
	return lossCurvePanel;
    }   
  
    /**
     * This method initializes osreAboutMenu	
     * 	
     * @return javax.swing.JMenu	
     */
    private JMenu getOsreAboutMenu() {
	if (osreAboutMenu == null) {
	    osreAboutMenu = new JMenu();
	    osreAboutMenu.setText("About");
	    osreAboutMenu.setFont(new Font("Dialog", Font.BOLD, 12));
	    osreAboutMenu.setEnabled(true);
	    osreAboutMenu.add(getOsreAboutMenuItem());
	    osreAboutMenu.add(getOsreLicenseMenuItem());
	}
	return osreAboutMenu;
    }
    
    /**
     * This method initializes osreHelpMenu	
     * 	
     * @return javax.swing.JMenu	
     */
    private JMenu getOsreHelpMenu() {
	if (osreHelpMenu == null) {
	    osreHelpMenu = new JMenu();
	    osreHelpMenu.setText("Help");
	    osreHelpMenu.setFont(new Font("Dialog", Font.BOLD, 12));
	    osreHelpMenu.setEnabled(true);
	    osreHelpMenu.add(getOsreHelpMenuItem());
	}
	return osreHelpMenu;
    }
    
    /**
     * This method initializes topLogoPanel	
     * 	
     * @return javax.swing.JPanel	
     */
    private JPanel getTopLogoPanel() {
	if (topLogoPanel == null) {
	    topLogoPanel = new JPanel();
	    topLogoPanel.setLayout(new BorderLayout());
	    topLogoPanel.setPreferredSize(new Dimension(700, 400));
	    topLogoPanel.setBorder(BorderFactory.createLineBorder(Color.black,1));
	    topLogoPanel.add(getLogo());
	}
	return topLogoPanel;
    }
    
    private LogoPanel logo = null;
    private LogoPanel getLogo() {
	if (logo == null) {
	    logo = new LogoPanel();
	}
	return logo;
    }
    
    /**
     * This method initializes topTextArea	
     * 	
     * @return javax.swing.JTextArea	
     */
    private JTextArea getTopTextArea() {
	if (topTextArea == null) {
	    topTextArea = new JTextArea();
	    topTextArea.setPreferredSize(new Dimension(400, 200));
	    topTextArea.setVisible(false);
	}
	return topTextArea;
    }
    
    /**
     * This method initializes vulImportPanel	
     * 	
     * @return javax.swing.JPanel	
     */
    private JPanel getVulImportPanel() {
	if (vulImportPanel == null) {
	    GridBagConstraints gridBagConstraints181 = new GridBagConstraints();
	    gridBagConstraints181.gridwidth = 1;
	    gridBagConstraints181.gridy = 1;
	    gridBagConstraints181.gridx = 0;
	    vulImportPanel = new JPanel();
	    vulImportPanel.setLayout(new GridBagLayout());
	    vulImportPanel.setBackground(Color.white);
	    vulImportPanel.setPreferredSize(new Dimension(350, 50));
	    vulImportPanel.add(getVulImportButton(), gridBagConstraints181);
	}
	return vulImportPanel;
    }
    
    /**
     * This method initializes vulImportButton	
     * 	
     * @return javax.swing.JButton	
     */
    private JButton getVulImportButton() {
	if (vulImportButton == null) {
	    vulImportButton = new JButton();
	    vulImportButton.setPreferredSize(new Dimension(250, 26));
	    vulImportButton.setText("Import Vulnerability Format");
	    vulImportButton.setVisible(false);
	}
	return vulImportButton;
    }
    
    /**
     * This method initializes topAccountPanel	
     * 	
     * @return javax.swing.JPanel	
     */
    private JPanel getTopAccountPanel() {
	if (topAccountPanel == null) {
	    GridBagConstraints gridBagConstraints48 = new GridBagConstraints();
	    gridBagConstraints48.fill = GridBagConstraints.NONE;
	    gridBagConstraints48.gridy = -1;
	    gridBagConstraints48.weightx = 1.0;
	    gridBagConstraints48.weighty = 1.0;
	    gridBagConstraints48.gridx = -1;
	    topAccountPanel = new JPanel();
	    topAccountPanel.setLayout(new GridBagLayout());
	    topAccountPanel.setPreferredSize(new Dimension(500, 300));
	    topAccountPanel.add(getTopTextArea(), gridBagConstraints48);
	}
	return topAccountPanel;
    }
    
    /**
     * This method initializes osreAboutMenuItem	
     * 	
     * @return javax.swing.JMenuItem	
     */
    private JMenuItem getOsreAboutMenuItem() {
	if (osreAboutMenuItem == null) {
	    osreAboutMenuItem = new JMenuItem();
	    osreAboutMenuItem.setText("About us");
	    osreAboutMenuItem.setFont(new Font("Dialog", Font.BOLD, 12));
	    osreAboutMenuItem.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
			if(aboutDialog != null) aboutDialog = null;
			getAboutDialog();
		    }
		});
	}
	return osreAboutMenuItem;
    }
    
    /**
     * This method initializes aboutDialog	
     * 	
     * @return javax.swing.JDialog	
     */
    private JDialog getAboutDialog() {
	if (aboutDialog == null) {
	    aboutDialog = new JDialog(this);
	    aboutDialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	    aboutDialog.setPreferredSize(new Dimension(300, 200));
	    aboutDialog.setBounds(new Rectangle(200, 200, 400, 300));
	    aboutDialog.setTitle("About us");
	    aboutDialog.setVisible(true);
	    aboutDialog.setContentPane(getAboutContentPane());
	}
	return aboutDialog;
    }

    /**
     * This method initializes aboutContentPane	
     * 	
     * @return javax.swing.JPanel	
     */
    private JPanel getAboutContentPane() {
	if (aboutContentPane == null) {
	    aboutContentPane = new JPanel();
	    aboutContentPane.setLayout(new BorderLayout());
	    aboutContentPane.add(getAboutScrollPane());
	}
	return aboutContentPane;
    }

    private JEditorPane getAboutPane() {
	if (aboutPane == null) {
	    aboutPane = new JEditorPane();
	    try {
		URL url = OSRE.class.getResource("/org/osre/about.html");
		aboutPane.setEditable(false);
		aboutPane.setPage(url);
	    }
	    catch (IOException ioe) {
		System.out.println("Exception");
	    }
	}
	return aboutPane;
    }

    /**
     * This method initializes aboutScrollPane	
     * 	
     * @return javax.swing.JScrollPane	
     */
    private JScrollPane getAboutScrollPane() {
	if (aboutScrollPane == null) {
	    aboutScrollPane = new JScrollPane();
	    aboutScrollPane.setViewportView(getAboutPane());
	}
	return aboutScrollPane;
    }

    /**
     * This method initializes osreLicenseMenuItem	
     * 	
     * @return javax.swing.JMenuItem	
     */
    private JMenuItem getOsreLicenseMenuItem() {
	if (osreLicenseMenuItem == null) {
	    osreLicenseMenuItem = new JMenuItem();
	    osreLicenseMenuItem.setText("License");
	    osreLicenseMenuItem.setFont(new Font("Dialog", Font.BOLD, 12));
	    osreLicenseMenuItem.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
			if(licenseDialog != null) licenseDialog = null;
			getLicenseDialog();
		    }
		});
	}
	return osreLicenseMenuItem;
    }
    
    /**
     * This method initializes licenseDialog	
     * 	
     * @return javax.swing.JDialog	
     */
    private JDialog getLicenseDialog() {
	if (licenseDialog == null) {
	    licenseDialog = new JDialog(this);
	    licenseDialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	    licenseDialog.setPreferredSize(new Dimension(300, 200));
	    licenseDialog.setBounds(new Rectangle(200, 200, 400, 300));
	    licenseDialog.setTitle("License");
	    licenseDialog.setVisible(true);
	    licenseDialog.setContentPane(getLicenseContentPane());
	}
	return licenseDialog;
    }
    
    /**
     * This method initializes licenseContentPane	
     * 	
     * @return javax.swing.JPanel	
     */
    private JPanel getLicenseContentPane() {
	if (licenseContentPane == null) {
	    licenseContentPane = new JPanel();
	    licenseContentPane.setLayout(new BorderLayout());
	    licenseContentPane.add(getLicenseScrollPane());
	}
	return licenseContentPane;
    }

    private JEditorPane getLicensePane() {
	if (licensePane == null) {
	    licensePane = new JEditorPane();
	    try {
		URL url = OSRE.class.getResource("/org/osre/license.html");
		licensePane.setEditable(false);
		licensePane.setPage(url);
		licensePane.addHyperlinkListener(new licenseLinkListener());
	    }
	    catch (IOException ioe) {
		System.out.println("Exception");
	    }
	}
	return licensePane;
    }

    /**
     * This method initializes licenseScrollPane	
     * 	
     * @return javax.swing.JScrollPane	
     */
    private JScrollPane getLicenseScrollPane() {
	if (licenseScrollPane == null) {
	    licenseScrollPane = new JScrollPane();
	    licenseScrollPane.setViewportView(getLicensePane());
	}
	return licenseScrollPane;
    }
     
    /**
     * This method initializes helpDialog	
     * 	
     * @return javax.swing.JDialog	
    */
    private JDialog getHelpDialog() {
	if (helpDialog == null) {
	    helpDialog = new JDialog(this);
	    helpDialog.setPreferredSize(new Dimension(300, 200));
	    helpDialog.setTitle("Help");
	    helpDialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	    helpDialog.setBounds(new Rectangle(200, 200, 400, 300));
	    helpDialog.setVisible(true);
	    helpDialog.setContentPane(getHelpContentPane());
	}
	return helpDialog;
    }
    
    /**
     * This method initializes helpContentPane	
     * 	
     * @return javax.swing.JPanel	
     */
    private JPanel getHelpContentPane() {
	if (helpContentPane == null) {
	    helpContentPane = new JPanel();
	    helpContentPane.setLayout(new BorderLayout());
	    helpContentPane.add(getHelpScrollPane());
	}
	return helpContentPane;
    }

    private JEditorPane getHelpPane() {
	if (helpPane == null) {
	    helpPane = new JEditorPane();
	    try {
		URL url = OSRE.class.getResource("/org/osre/help.html");
		helpPane.setEditable(false);
		helpPane.setPage(url);
		helpPane.addHyperlinkListener(new helpLinkListener());
	    }
	    catch (IOException ioe) {
		System.out.println("Exception");
	    }
	}
	return helpPane;
    }

    /**
     * This method initializes helpScrollPane	
     * 	
     * @return javax.swing.JScrollPane	
     */
    private JScrollPane getHelpScrollPane() {
	if (helpScrollPane == null) {
	    helpScrollPane = new JScrollPane();
	    helpScrollPane.setViewportView(getHelpPane());
	}
	return helpScrollPane;
    }
    
    /**
     * This method initializes damCalcDialog	
     * 	
     * @return javax.swing.JDialog	
     */
    private JDialog getDamCalcDialog() {
	if (damCalcDialog == null) {
	    damCalcDialog = new JDialog();
	    damCalcDialog.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
	    damCalcDialog.setTitle("Damage Calculation");
	    damCalcDialog.setPreferredSize(new Dimension(300, 200));
	    damCalcDialog.setVisible(false);
	    damCalcDialog.setBounds(new Rectangle(300, 300, 200, 200));
	    damCalcDialog.setContentPane(getDamCalcContentPane());
	}
	return damCalcDialog;
    }
    
    /**
     * This method initializes damCalcContentPane	
     * 	
     * @return javax.swing.JPanel	
     */
    private JPanel getDamCalcContentPane() {
	if (damCalcContentPane == null) {
	    damCalcContentPane = new JPanel();
	    damCalcContentPane.setLayout(new BorderLayout());
	}
	return damCalcContentPane;
    }
    
    /**
     * This method initializes osreHelpMenuItem	
     * 	
     * @return javax.swing.JMenuItem	
     */
    private JMenuItem getOsreHelpMenuItem() {
	if (osreHelpMenuItem == null) {
	    osreHelpMenuItem = new JMenuItem();
	    osreHelpMenuItem.setText("Help");
	    osreHelpMenuItem.setFont(new Font("Dialog", Font.BOLD, 12));
	    osreHelpMenuItem.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
			if(helpDialog != null) helpDialog = null;
			getHelpDialog();
		    }
		});
	}
	return osreHelpMenuItem;
    }
    
    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO 自動生成されたメソッド・スタブ
	SwingUtilities.invokeLater(new Runnable() {
		public void run() {
		    OSRE thisClass = new OSRE();
		    thisClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    thisClass.setVisible(true);
		}
	    });
    }
    
    /**
     * This is the default constructor
     */
    public OSRE() {
	super();
	initialize();
    }
    
    /**
     * This method initializes this
     * 
     * @return void
     */
    private void initialize() {
	this.setSize(800, 600);
	this.setJMenuBar(getOsreMenuBar());
	this.setContentPane(getJContentPane());
	this.setTitle("OSRE-Open Source Risk Engine");
    }
    
    /**
     * This method initializes jContentPane
     * 
     * @return javax.swing.JPanel
     */
    private JPanel getJContentPane() {
	if (jContentPane == null) {
	    jContentPane = new JPanel();
	    jContentPane.setLayout(new FlowLayout());
	    jContentPane.add(getJTabbedPane(), null);
	}
	return jContentPane;
    }
    
    public int setAreaNumber() {
	areaNum = 0;
	String area = this.getArea();
	
	for(int i=0;i<48;i++) {
	    if(area == (String)hazSiteInputComboBox.getItemAt(i)) areaNum = i;
	}
	
	return areaNum;
    }
    
    public String getArea() {
	String area = (String)hazSiteInputComboBox.getSelectedItem();
	return area;
    }
    
    public int setMeasureNumber() {
	measureNum = 0;
	String measure = (String)hazMeasureInputComboBox.getSelectedItem();
	
	for(int i=0;i<5;i++) {
	    if(measure == (String)hazMeasureInputComboBox.getItemAt(i)) measureNum = i;
	}
	return measureNum;
    }
    
    public double setHazVar() {
	hazVar = Double.parseDouble((String)hazVarComboBox.getSelectedItem());
	return hazVar;
    }

    public double setVulVar() {
	vulVar = Double.parseDouble((String)vulVarComboBox.getSelectedItem());
       	return vulVar;
    }

    public double[][] setHazard(int area,int measure) {
	Hazard haz = new Hazard(area,measure);
	hazMatrix = haz.makeHazardMedian();
	damFlag = true;
	return hazMatrix;
    }

    public double[][] setVulnerability(int asset, int measure) {
	Vulnerability vul = new Vulnerability(asset,measure);
	vulMatrix = vul.makeVulMedian();
	damFlag = true;
	return vulMatrix;
    }

    public double[][] setDamage(double[][] hazMatrix, double[][] vulMatrix, double hazVar, double vulVar) {
	Ppro_2 prob1 = new Ppro_2();
	pdfMatrix = prob1.Pcurve(hazMatrix,vulMatrix,hazVar,vulVar);
	damFlag = false;
	return pdfMatrix;
    }

    class JRadioButtonListener implements ActionListener {
	
	public void actionPerformed(ActionEvent ae) {
	    if(jRadioButton.isSelected() == true) {
		langText = lang.getLangText(1);
		hazSiteInputLabel.setText(langText[0]);
	    }
	}
    }
    
    class JRadioButton1Listener implements ActionListener {
	
	public void actionPerformed(ActionEvent ae) {
	    if(jRadioButton1.isSelected() == true) {
		langText = lang.getLangText(2);
		hazSiteInputLabel.setText(langText[0]);
	    }
	}
    }
    
    class siteInputComboBoxListener implements ItemListener {
	
	public void itemStateChanged(ItemEvent ie) {
	    int area = setAreaNumber();
	    int measure = setMeasureNumber();
	    double hazVar = setHazVar();
	    
	    if(hazCurvePanel != null) hazCurvePanel.setVisible(false);
	    	    
	    if(area > 0 && measure > 0) {
		hazCurvePanel = null;
		hazMatrix = setHazard(areaNum,measureNum);
		hazPlotPanel.add(getHazCurvePanel(measure,hazMatrix,hazVar),BorderLayout.CENTER);      
		DefaultTableModel defaultTableModel = new DefaultTableModel();
		hazDataTable.setModel(defaultTableModel);
		defaultTableModel.addColumn("hazard");
		defaultTableModel.addColumn("Pr_exc");
		defaultTableModel.addColumn("avg.interval(yrs)");
		for(int i=0; i<1001; i++) {
		    String s = String.format("%.3f", hazMatrix[i][0]);
		    String s1 = String.format("%.10f", hazMatrix[i][1]);
		    String s2 = String.format("%.10f", 1/hazMatrix[i][1]);
		    Object[] row = {(Object)(s),(Object)(s1),(Object)(s2)};
		    defaultTableModel.addRow(row);
		}  	   
	    }
	    damInputSiteLabel.setText(getArea());
	    lossInputSiteLabel.setText(getArea());   
	}
    }
 
    class measureInputComboBoxListener implements ItemListener {
	
	public void itemStateChanged(ItemEvent ie) {
	    int area = setAreaNumber();
	    int measure = setMeasureNumber();
	    double hazVar = setHazVar();

	    if(hazCurvePanel != null) hazCurvePanel.setVisible(false);
	    if(vulCurvePanel != null) vulCurvePanel.setVisible(false);   
   
	    if(area > 0 && measure > 0 ) {
		hazCurvePanel = null;
		hazMatrix = setHazard(areaNum,measureNum);
		hazPlotPanel.add(getHazCurvePanel(measure,hazMatrix,hazVar),BorderLayout.CENTER);     
		DefaultTableModel defaultTableModel = new DefaultTableModel();
		hazDataTable.setModel(defaultTableModel);
		defaultTableModel.addColumn("hazard");
		defaultTableModel.addColumn("Pr_exc");
		defaultTableModel.addColumn("avg.interval(yrs)");
		for(int i=0; i<1001; i++) {
		    String s = String.format("%.3f", hazMatrix[i][0]);
		    String s1 = String.format("%.10f", hazMatrix[i][1]);
		    String s2 = String.format("%.10f", 1/hazMatrix[i][1]);
		    Object[] row = {(Object)(s),(Object)(s1),(Object)(s2)};
		    defaultTableModel.addRow(row);
		}  	   
	    }
	    vulMeasureLabel.setText((String)hazMeasureInputComboBox.getSelectedItem());
	}
    }

    class hazardVarComboBoxListener implements ItemListener {
	
	public void itemStateChanged(ItemEvent ie) {
	    int area = setAreaNumber();
	    int measure = setMeasureNumber();
	    double hazVar = setHazVar();

	    if(hazCurvePanel != null) hazCurvePanel.setVisible(false);
	    
	    if(area > 0 && measure > 0) {
		hazCurvePanel = null;
		hazMatrix = setHazard(areaNum,measureNum);
		hazPlotPanel.add(getHazCurvePanel(measure,hazMatrix,hazVar),BorderLayout.CENTER);      
		DefaultTableModel hazardTableModel = new DefaultTableModel();
		hazDataTable.setModel(hazardTableModel);

	       	hazardTableModel.addColumn("hazard");
		hazardTableModel.addColumn("Pr_exc");
		hazardTableModel.addColumn("avg.interval[yrs]");

		for(int i=0; i<1001; i++) {
		    String s = String.format("%.3f", hazMatrix[i][0]);
		    String s1 = String.format("%.10f", hazMatrix[i][1]);
		    String s2 = String.format("%.10f", 1/hazMatrix[i][1]);
		    Object[] row = {(Object)(s),(Object)(s1),(Object)(s2)};
		    hazardTableModel.addRow(row);
		}
	    }
	}
    }
    
    class JTreeListener implements TreeSelectionListener {
	
	public void valueChanged(TreeSelectionEvent tse) {

	    int measure = setMeasureNumber();
	    double vulVar = setVulVar();
	    
	    TreePath path = tse.getPath();
	    Object[] pathroot = path.getPath();
	    vulShowAssetLabel.setText(path.toString());
	    jLabel15.setText("You chose ...");
	    damInputAssetLabel.setText(path.toString());
	    lossInputAssetLabel.setText(path.toString());        
	    
	    AssetLink link = new AssetLink();
	    for(int i=0;i<link.assets.length;i++) {
		if(path.toString().equals(link.assets[i])) {
		    vulShowAssetLabel.setText(path.toString());
		    jLabel15.setText("You chose ...");
		    damInputAssetLabel.setText(path.toString());
		    lossInputAssetLabel.setText(path.toString());        
		    System.out.println(i);
		    assetNum = i+1;
		}
	    }

	    vulMatrix = setVulnerability(assetNum,measure);
	    
	    if(vulCurvePanel != null) vulCurvePanel.setVisible(false);
	    
	    if(assetNum > 0 && measure > 0) {
		vulCurvePanel = null;
		vulPlotPanel.add(getVulCurvePanel(measureNum,vulMatrix,vulVar),BorderLayout.CENTER);
	     
		DefaultTableModel defaultTableModel = new DefaultTableModel();
		vulDataTable.setModel(defaultTableModel);
		//デフォルトの列見出しを追加する
		defaultTableModel.addColumn("hazard");
		defaultTableModel.addColumn("MDF [%]");
		for(int i=0; i<1001; i++) {
		    String s = String.format("%.8f", vulMatrix[i][0]);
		    String s1 = String.format("%.8f", vulMatrix[i][1]);
		    Object[] row = {(Object)(s),(Object)(s1)};
		    defaultTableModel.addRow(row);
		}   
	    }

	}
    }
        
    class vulVarComboBoxListener implements ItemListener {
	public void itemStateChanged(ItemEvent ie) {
	    int measure = setMeasureNumber();
	    double vulVar = setVulVar();

	    vulMatrix = setVulnerability(assetNum,measure);

	    if(vulCurvePanel != null) vulCurvePanel.setVisible(false);
	    if(assetNum > 0 && measure > 0) {
		vulCurvePanel = null;
		vulPlotPanel.add(getVulCurvePanel(measure,vulMatrix,vulVar),BorderLayout.CENTER);
		DefaultTableModel defaultTableModel = new DefaultTableModel();
		vulDataTable.setModel(defaultTableModel);
		//デフォルトの列見出しを追加する
		defaultTableModel.addColumn("hazard");
		defaultTableModel.addColumn("MDF [%]");
		for(int i=0; i<1001; i++) {
		    String s = String.format("%.8f", vulMatrix[i][0]);
		    String s1 = String.format("%.8f", vulMatrix[i][1]);
		    Object[] row = {(Object)(s),(Object)(s1)};
		    defaultTableModel.addRow(row);
		}   
	    }
       	}
    }  
    
    class damCfPlotButtonListener implements ActionListener {
	public void actionPerformed(ActionEvent ae) {
	    int area = setAreaNumber();
	    int measure = setMeasureNumber();
	    hazVar = Double.parseDouble((String)hazVarComboBox.getSelectedItem());
	    vulVar = Double.parseDouble((String)vulVarComboBox.getSelectedItem());   
	    if(damFlag == true) {

		if(damCalcDialog != null) damCalcDialog = null;
		getDamCalcDialog();
	    	
		pdfMatrix = setDamage(hazMatrix,vulMatrix,hazVar,vulVar);

	    }
	    
	    damCalcDialog = null;

	    boolean[] cfCheck = new boolean[11];
	    cfCheck[0] = damCfCheck1.isSelected();
	    cfCheck[1] = damCfCheck10.isSelected();
	    cfCheck[2] = damCfCheck20.isSelected();
	    cfCheck[3] = damCfCheck30.isSelected();
	    cfCheck[4] = damCfCheck40.isSelected();
	    cfCheck[5] = damCfCheck50.isSelected();
	    cfCheck[6] = damCfCheck60.isSelected();
	    cfCheck[7] = damCfCheck70.isSelected();
	    cfCheck[8] = damCfCheck80.isSelected();
	    cfCheck[9] = damCfCheck90.isSelected();
	    cfCheck[10] = damCfCheck99.isSelected();

	    if(damCurvePanel != null) damCurvePanel.setVisible(false);    
	    if(area > 0 && measure > 0) {
		damCurvePanel = null;
		damPlotPanel.add(getDamCurvePanel(hazMatrix,vulMatrix,pdfMatrix,cfCheck),BorderLayout.CENTER);
		DefaultTableModel defaultTableModel = new DefaultTableModel();
		damDataTable.setModel(defaultTableModel);
		defaultTableModel.addColumn("MDF [%]");
		defaultTableModel.addColumn("Pr_exc");
		for(int i=0; i<1001; i++) {
		    String s = String.format("%.8f", vulMatrix[i][1]);
		    String s1 = String.format("%.8f", hazMatrix[i][1]);
		    Object[] row = {(Object)(s),(Object)(s1)};
		    defaultTableModel.addRow(row);
		}
	    }
	}
    }
    
    class lossCfPlotButtonListener implements ActionListener {
	public void actionPerformed(ActionEvent ae) {
	    int area = setAreaNumber();
	    int measure = setMeasureNumber();
	    hazVar = Double.parseDouble((String)hazVarComboBox.getSelectedItem());
	    vulVar = Double.parseDouble((String)vulVarComboBox.getSelectedItem());   
	    if(damFlag == true) {
		pdfMatrix = setDamage(hazMatrix,vulMatrix,hazVar,vulVar);
	    }
	    
	    boolean[] cfCheck = new boolean[11];
	    cfCheck[0] = lossCfCheck1.isSelected();
	    cfCheck[1] = lossCfCheck10.isSelected();
	    cfCheck[2] = lossCfCheck20.isSelected();
	    cfCheck[3] = lossCfCheck30.isSelected();
	    cfCheck[4] = lossCfCheck40.isSelected();
	    cfCheck[5] = lossCfCheck50.isSelected();
	    cfCheck[6] = lossCfCheck60.isSelected();
	    cfCheck[7] = lossCfCheck70.isSelected();
	    cfCheck[8] = lossCfCheck80.isSelected();
	    cfCheck[9] = lossCfCheck90.isSelected();
	    cfCheck[10] = lossCfCheck99.isSelected();

	    if(lossCurvePanel != null) lossCurvePanel.setVisible(false);    
	    if(area > 0 && measure > 0) {
		lossCurvePanel = null;
		lossPlotPanel.add(getLossCurvePanel(hazMatrix,vulMatrix,pdfMatrix,cfCheck),BorderLayout.CENTER);
		double value = Double.parseDouble(assetValueInputTextfield.getText());
		DefaultTableModel defaultTableModel = new DefaultTableModel();
		lossDataTable.setModel(defaultTableModel);
		defaultTableModel.addColumn("Loss ["+(String)assetValueInputComboBox.getSelectedItem()+"]");
		defaultTableModel.addColumn("Pr_exc");
		for(int i=0; i<1001; i++) {
		    String s = String.format("%.8f", vulMatrix[i][1]*value/100);
		    String s1 = String.format("%.8f", hazMatrix[i][1]);
		    Object[] row = {(Object)(s),(Object)(s1)};
		    defaultTableModel.addRow(row);
		}
	    }
	}
    }

    class licenseLinkListener implements HyperlinkListener {
	public void hyperlinkUpdate(HyperlinkEvent ev) {  
	    if (ev.getEventType() == HyperlinkEvent.EventType.ACTIVATED){
		try{
		    URL u = ev.getURL(); 
		    URL url = OSRE.class.getResource("/org/osre/"+u.toString());
		    URI uri = url.toURI();
                    Desktop.getDesktop().browse(uri);
		} 
		catch(IOException ioe) {
		    ioe.printStackTrace();
		}
		catch(URISyntaxException use) {
		    use.printStackTrace();
		}
	    }
	}
    }

    class helpLinkListener implements HyperlinkListener {
	public void hyperlinkUpdate(HyperlinkEvent ev) {  
	    if (ev.getEventType() == HyperlinkEvent.EventType.ACTIVATED){
		try{
		    URL u = ev.getURL(); 
		    Desktop.getDesktop().browse(new URI(u.toString()));
		} 
		catch(IOException ioe) {
		    ioe.printStackTrace();
		}
		catch(URISyntaxException use) {
		    use.printStackTrace();
		}
	    }
	}
    }


}  //  @jve:decl-index=0:visual-constraint="10,10"

