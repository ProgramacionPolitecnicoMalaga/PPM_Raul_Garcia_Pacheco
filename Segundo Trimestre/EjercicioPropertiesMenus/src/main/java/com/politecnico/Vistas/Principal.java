package com.politecnico.Vistas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Principal {
    private JPanel PanelPrincipal;
    private JPanel PanelIntercambio;
    private JMenuBar principalMb;
    private JMenu accionMn;
    private JMenuItem leerIt;
    private JMenuItem escribirIt;

    public JPanel getPanelPrincipal()
    {
        return PanelPrincipal;
    }

    public Principal()
    {
        MandarMensajes mandarMensajes = new MandarMensajes();
        LeerMensajes leerMensajes = new LeerMensajes();
        PanelIntercambio.add(leerMensajes.getPanelPrincipal(), "leer");
        PanelIntercambio.add(mandarMensajes.getPanelPrincipal(), "escribir");

        leerIt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout layout = (CardLayout) PanelIntercambio.getLayout();
                layout.show(PanelIntercambio, "leer");
            }
        });

        escribirIt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout layout = (CardLayout) PanelIntercambio.getLayout();
                layout.show(PanelIntercambio, "escribir");
            }
        });
    }
}
