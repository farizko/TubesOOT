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
public class ToolBarExtensionPanel extends JPanel{
    private static final int N_HEIGHT = 600;//pembuatan konstanta N_HEIGHT dengan nilai 600
    private static final int N_WIDTH = 100;//pembuatan konstanta N_WIDTH dengan nilai 100
    private final int padding = 0;//pembuatan konstanta padding dengan nilai 0
    
    public ToolBarExtensionPanel(){
        super();
        initDimension();//pemanggilan prosedur initDimension()
        initLayout();//prosedur initLayout()
    }
    
    private void initDimension(){
        Dimension dimension = new Dimension(N_WIDTH, N_HEIGHT);//penginisiasian objek dimension dengan parameter N_WIDTH dan N_HEIGHT
        setPreferredSize(dimension);//pemanggilan prosedur setPreferredSize dengan parameter dimension
    }
    
    private void initLayout(){
        FlowLayout layout = new FlowLayout();//penginisiasian objek layout 
        layout.setHgap(padding);//pemanggilan prosedur setHgap dengan parameter padding
        layout.setVgap(padding);//pemanggilan prosedur setVgap dengan parameter padding
        setLayout(layout);//pemanggilan prosedur setLayout dengan parameter layout
    }
   
    /**
     * @return the HEIGHT
     */
    public int getNHeight() {
        return N_HEIGHT;
    }

    /**
     * @return the WIDTH
     */
    public int getNWidth() {
        return N_WIDTH;
    }
    
    
}
