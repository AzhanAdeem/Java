
// =========== ================ =========== The driver class of the app;
//package Canvas;

import java.util.*;
import java.util.Vector;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

// =============================================   Drawing app 

import javax.swing.ImageIcon;

public class myCanvas {
    public static void main(String[] args) {

        // //===============================   jFrame

        // int wid = 500;
        // int hei = 500;

        // JFrame frame = new JFrame();

        // frame.setVisible(true);
        // frame.setSize(wid,hei);
        // frame.setResizable(false);
        // frame.setTitle("Canvas");
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // ImageIcon logo = new ImageIcon("bloob.jpg");
        // frame.setIconImage.(logo.get());
        
        // =============================   Cjecking vector Implementation 
        // If I am using the java predefined vector class.
        // Vector<Double> vector1 = new Vector<>();
        // vector1.add(0, 45.0097);
        // (  .add ) for adding a new entry ( .set ) for replacing an existing entry;

        // If I am using my own vector class.
        MyVector vector2 = new MyVector();
        vector2.setVector(0, 45.0097);

        System.out.println(vector2);

        System.out.println(vector2.hashCode());

    }

}