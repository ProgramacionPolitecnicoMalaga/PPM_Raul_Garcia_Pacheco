package com.politecnico;

import com.politecnico.Data.DataTransfer;
import com.politecnico.Vistas.LogIn;
import com.politecnico.Vistas.Principal;

import javax.swing.*;
import javax.xml.crypto.Data;
import java.awt.*;
import java.sql.SQLException;

public class App 
{
    public static void main( String[] args ) throws SQLException {
        DataTransfer datos = new DataTransfer();
        JFrame frame = new JFrame("LogIn");
        frame.setPreferredSize(new Dimension(600,300));
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        frame.setContentPane(new LogIn(datos).getPanelPrincipal());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
