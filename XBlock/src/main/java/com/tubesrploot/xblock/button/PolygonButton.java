/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tubesrploot.xblock.button;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import org.jhotdraw.draw.BezierFigure;
import org.jhotdraw.draw.tool.BezierTool;
/**
 *
 * @author USER
 */
public class PolygonButton extends JButton implements ActionListener{
    private static final int N_HEIGHT = 40;//inisiasi dimensi tinggi
    private static final int N_WIDTH = 40;//inisiasi dimensi lebar
    private PolygonToolBar toolbar;
    //mengatur tampilan button
    public PolygonButton(){
        super();
        this.toolbar = new PolygonToolBar();
        setToolTipText("polygon button");//menampilkan popup text
        setIcon(new ImageIcon("polygon.png"));//memberikan gambar pada button
        initDimension();
        
    }
    //pengimplementasian listener
    private void initDimension(){
        Dimension dimension = new Dimension(N_WIDTH, N_HEIGHT);//mengatur dimensi objek sesuai parameter input
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
        //pemasangan objek dalam canvas
        CanvasPanel canvas = (CanvasPanel) getParent().getParent().getParent().getParent().getComponent(1);
        canvas.getEditor().setTool(new BezierTool(new BezierFigure(true)));
    }    
}
