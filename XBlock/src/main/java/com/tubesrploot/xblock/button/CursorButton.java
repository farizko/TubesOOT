/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tubesrploot.xblock.button;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import org.jhotdraw.draw.tool.SelectionTool;

/**
 *
 * @author Isjhar-pc
 */
public class CursorButton extends JButton implements ActionListener{
    private static final int N_HEIGHT = 40; //inisiasi dimensi tinggi
    private static final int N_WIDTH = 40; //inisiasi dimensi lebar
    private CursorToolBar toolbar;
    //mengatur tampilan button
    public CursorButton(){
        super();
        this.toolbar = new CursorToolBar();
        setToolTipText("cursor button"); //menampilkan popup text
        setIcon(new ImageIcon("cursor_arrow.png"));//memberikan gambar pada button
        initDimension();
    }
    
    //pengimplementasian listener
    public void setActionListener(){
        this.addActionListener(this);
    }
    private void initDimension(){
        Dimension dimension = new Dimension(N_WIDTH, N_HEIGHT); //mengatur dimensi objek sesuai parameter input
        setPreferredSize(dimension);
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
        //pemasangan objek dalam canvas
        CanvasPanel canvas = (CanvasPanel) getParent().getParent().getParent().getParent().getComponent(1);
        canvas.getEditor().setTool(new SelectionTool());
    }
    
    
}
