/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tubesrploot.xblock.panel;
//pengimportan library yang dibutuhkan
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JPanel;

/**
 *
 * @author Isjhar-pc
 */
 //pembuatan panel untuk button sebelah kiri
public class ToolBarPanel extends JPanel{
    private static final int N_HEIGHT = 600;//pemberian nilai konstanta N_HEIGHT dengan nilai 600
    private static final int N_WIDTH = 100;//pemberian nilai konstanta N_WIDTH dengan nilai 100
    
    public ToolBarPanel(){
        super();
        initDimension();//pemanggilan prosedur initDimension()
        initLayout();//pemanggilan prosedur initLayout()
        initComponent();//pemanggilan prosedur initComponent()
    }
    //pengaturan ukuran panel sebelah kiri
    private void initDimension(){
        Dimension dimension = new Dimension(N_WIDTH, N_HEIGHT);//penginisiasian objek dimension dengan parameter N_WIDTH dan N_HEIGHT
        setPreferredSize(dimension);//pemanggilan prosedur setPreferredSize dengan parameter dimension
    }
    //mengatur tata letak panel agar lebih rapi
    private void initLayout(){
        FlowLayout layout = new FlowLayout();//penginisiasian objek layout
        layout.setHgap(0);//pemanggilan prosedur setHgap dengan parameter 0
        layout.setVgap(0);//pemanggilan prosedur setVgap dengan parameter 0
        setLayout(layout);//pemanggilan prosedur setLayout dengan parameter layout
    }
    
    private void initComponent(){
        MainToolBar toolbar = new MainToolBar(N_WIDTH, N_HEIGHT);//penginisiasian objek toolbar dengan parameter N_WIDTH dan N_HEIGHT
        add(toolbar);//pemanggilan prosedur add dengan parameter toolbar
    }
}
