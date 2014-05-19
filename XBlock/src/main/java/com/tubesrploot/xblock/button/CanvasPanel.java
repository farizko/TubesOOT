/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tubesrploot.xblock.button;

import com.tubesrploot.xblock.button.CursorButton;
import com.tubesrploot.xblock.button.LineButton;
import com.tubesrploot.xblock.button.RectangleButton;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import org.jhotdraw.draw.DefaultDrawing;
import org.jhotdraw.draw.DefaultDrawingEditor;
import org.jhotdraw.draw.Drawing;
import org.jhotdraw.draw.DrawingEditor;
import org.jhotdraw.draw.DrawingView;

/**
 *
 * @author Isjhar-pc
 */
public class CanvasPanel extends JScrollPane{
    private static final int N_HEIGHT = 600; //menginisiasi besar dimensi tinggi dari canvas
    private static final int N_WIDTH = 600; //menginisiasi besar dimensi lebar dari canvas
    private DrawingView canvas; //inisiasi variabel canvas 
    private DrawingEditor editor; //inisiasi variabel editor
    //mengatur tampilan dari canvas
    public CanvasPanel(DrawingView canvas){
        super(canvas.getComponent());
        this.canvas = canvas;
        initDimension(); //mengatur dimensi canvas
        setBorder(BorderFactory.createLineBorder(Color.black)); //membuat garis pinggir
        Drawing gambar = new DefaultDrawing(); //inisiai variabel gambar
        canvas.setDrawing(gambar); //memasukkan gambar ke dalam canvas
        editor = new DefaultDrawingEditor();
        editor.add(canvas); //menambahkan canvas kedalam editor
    }
    //mengatur dimensi canvas sesuai variabel yang sudah di inisiasi
    private void initDimension(){
        Dimension dimension = new Dimension(N_WIDTH, N_HEIGHT);
        setPreferredSize(dimension); //mengatur dimensi sesuai hasil inisiasi
    }
    //menampilkan editor
    public DrawingEditor getEditor(){
        return editor;
    }
   

   
}
