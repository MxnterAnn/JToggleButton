package jtogglebutton;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Vista extends JFrame {

    ButtonGroup grupo = new ButtonGroup();
    JToggleButton boton = new JToggleButton("PRESIONAME");
    JToggleButton opcionA = new JToggleButton("Opción A");
    JToggleButton opcionB = new JToggleButton("Opción B");
    JToggleButton opcionC = new JToggleButton("Opción C");
    JLabel etiqueta = new JLabel(" PULSA EL BOTON PARA COMENZAR ");

    public Vista() {
        super("El JToggleButton");
        setLocation(100, 100);
        setSize(700, 130);
        setLayout(new GridLayout());
        add(boton);
        add(etiqueta);
        grupo.add(opcionA);
        grupo.add(opcionB);
        grupo.add(opcionC);
        add(opcionA);
        add(opcionB);
        add(opcionC);
        boton.addItemListener(new ElListener());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    class ElListener implements ItemListener {

        public void itemStateChanged(ItemEvent evt) {
            if (boton.isSelected()) {
                boton.setBackground(Color.green);
                etiqueta.setForeground(Color.blue);
                etiqueta.setText("El botón esta activado");
            } else {
                boton.setBackground(Color.pink);
                etiqueta.setForeground(Color.black);
                etiqueta.setText("El botón no esta activo");
            }
        }
    }

    public static void main(String[] arg) {
        Vista app = new Vista();
        app.setVisible(true);
    }
}
