package com.politecnico.Vistas;

import com.politecnico.modelo.Persona;

import javax.swing.*;
import java.awt.*;

public class RenderPersona implements ListCellRenderer<Persona> {
    private JPanel panelMain;
    private JLabel nombreLbl;


    @Override
    public Component getListCellRendererComponent(JList<? extends Persona> list, Persona value, int index, boolean isSelected, boolean cellHasFocus) {
        nombreLbl.setText(value.getNombre());
        Color fondoPanel = Color.WHITE;
        panelMain.setBackground(fondoPanel);
        return panelMain;
    }
}
