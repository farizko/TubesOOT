/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tubesrploot.xblock;

//pengimportan library yang dibutuhkan 
import com.tubesrploot.xblock.menubar.MainMenuBar;
import com.tubesrploot.xblock.button.CanvasPanel;
import com.tubesrploot.xblock.button.ToolBarExtensionPanel;
import com.tubesrploot.xblock.panel.ToolBarPanel;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import javax.swing.JFrame;
import org.jhotdraw.draw.DefaultDrawingView;
import org.jhotdraw.draw.DrawingView;

/**
 *
 * @author Isjhar-pc
 */
public class GUI {
    private static final int HEIGHT = 600;//inisiasi variabel HEIGHT sebagai konstanta
    private static final int ROOT_WIDTH = 800;//inisiasi variabel ROOT_WIDTH sebagai konstanta
    private int marginTop = 20;//pemberian nilai pada variabel marginTop
    
    public void initGUI(){
        Dimension dimensionRootPanel = new Dimension(ROOT_WIDTH, HEIGHT);//penginisiasian objek Dimension
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();//pemberian nilai pada variabel dim
        
        FlowLayout layout = new FlowLayout();//penginisiasian objeck layout
        DrawingView canvas = new DefaultDrawingView();//penginisiasian objek canvas
        JFrame frame = new JFrame("XBlock");//penginisiasian  frame dengna nama XBlock
        ToolBarPanel toolbarPanel1 = new ToolBarPanel();//penginisiasian objek toolbarPanel1
        ToolBarExtensionPanel toolbarPanel2 = new ToolBarExtensionPanel();//penginisiasian objek toolbarPanel2
        CanvasPanel canvasPanel = new CanvasPanel(canvas);//penginisiasian objek canvas
        MainMenuBar menuBar = new MainMenuBar();//penginisiasian objek menuBar
        
        // set layout
        layout.setHgap(0);
        layout.setVgap(0);
        
        //pengesetan semua objek kedalam frame 
        frame.setLayout(layout);
        frame.setSize(dimensionRootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(dim.width/2-frame.getSize().width/2, (dim.height/2-frame.getSize().height/2)-marginTop);
        frame.getContentPane().add(toolbarPanel1);
        frame.getContentPane().add(canvasPanel);
        frame.getContentPane().add(toolbarPanel2);
        frame.setResizable(false);
        frame.setJMenuBar(menuBar);
        frame.pack();
        
        //membuat frame muncul (visible) ketika di run
        frame.setVisible(true);        
    }
}
