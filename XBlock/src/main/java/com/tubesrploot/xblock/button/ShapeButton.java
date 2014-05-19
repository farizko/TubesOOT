/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tubesrploot.xblock.button;

import com.tubesrploot.xblock.panel.ToolBarExtensionPanel;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author Isjhar-pc
 */
public class ShapeButton extends JButton implements ActionListener{
    private static final int N_HEIGHT = 40;//inisiasi dimensi tinggi
    private static final int N_WIDTH = 40;//inisiasi dimensi lebar
    private ShapeToolBar toolbar;
    private Dimension dimension;
    public ShapeButton(){
        super();
        this.toolbar = new ShapeToolBar();
        setToolTipText("shape button");//menampilkan popup text
        initDimension();
    }
    
     private void initDimension(){
        dimension = new Dimension(N_WIDTH, N_HEIGHT);//mengatur dimensi objek sesuai parameter input
        setPreferredSize(dimension);
    }
    
    public void setActionListener(){
        this.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        ToolBarExtensionPanel root = (ToolBarExtensionPanel) getParent().getParent().getParent().getParent().getComponent(2);
        toolbar.setNWidth(root.getNWidth());
        toolbar.setNHeight(root.getNHeight());
        toolbar.initDimension();
        root.removeAll();
        root.add(toolbar);
        root.validate();
        root.repaint();
    }
    
}
