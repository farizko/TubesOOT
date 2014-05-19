/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tubesrploot.xblock.panel;
//import library yang dibutuhkan 
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

/**
 *
 * @author Isjhar-pc
 */
public class MainToolBarRowPanel extends JPanel{
    private final int nWidth;//pembuatan konstanta nWidth
    private final int nHeight = 40;//pembuatan konstanta nHeigth dengan nilai 40
    private final int padding = 5;//pembuatan konstanta padding dengan nilai 5
    private FlowLayout layout;//pembuatan objek layout
    
    public MainToolBarRowPanel(int width){
        nWidth = width;//pemberian konstanta nWidth dengan variabel width
        initDimension();//pemanggilan prosedur initDimension()
        setBorder(BorderFactory.createLineBorder(Color.black));//pemanggilan prosedur setBorder dengan parameter BorderFactory.createLineBorder(Color.black)
        initLayout();//pemanggilan prosedur initLayout()
    }
    
    private void initDimension(){
        Dimension dimension = new Dimension(nWidth, nHeight);//penginisiasian objek dimension dengan parameter nWidth dan nHeight
        setPreferredSize(dimension);//pemanggilan prosedur setPreferredSize dengan parameter dimension
    }
    
    private void initLayout(){
        layout = new FlowLayout();//penginisiasian objek layout
        layout.setHgap(padding);//pemanggilan prosedur setHgap dengan parameter padding
        layout.setVgap(padding);//pemanggilan prosedur setVgap dengan parameter padding
        setLayout(layout);//pemanggilan prosedur setLayout dengan parameter layout
    }
    
}
