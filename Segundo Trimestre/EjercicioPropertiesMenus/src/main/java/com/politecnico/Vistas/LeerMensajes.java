package com.politecnico.Vistas;

import com.politecnico.Data.DataTransfer;
import com.politecnico.Data.DataTransferAPersona;
import com.politecnico.modelo.Persona;

import javax.swing.*;

public class LeerMensajes {
    private JPanel PanelPrincipal;
    private JLabel msjLbl;
    private JLabel remitentesLbl;
    private JList personasList;
    private DefaultListModel<Persona> modeloPersonas;
    private JTextArea mensajeTxt;

    public JPanel getPanelPrincipal() {
        return PanelPrincipal;
    }

    private void createUIComponents() {
        personasList = new JList();
        modeloPersonas = new DefaultListModel<>();
        personasList.setModel(modeloPersonas);
        personasList.setCellRenderer(new RenderPersona());
    }

    public void crearPersonas()
    {
        DataTransfer datos = new DataTransfer();
        LogIn logIn = new LogIn(datos);
        Persona persona = DataTransferAPersona.transformar(datos);
        modeloPersonas.addElement(persona);

    }
}
