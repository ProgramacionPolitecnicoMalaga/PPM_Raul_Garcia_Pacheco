package com.politecnico.Vistas;

import com.politecnico.Data.DataTransfer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LogIn extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JLabel mensajeLbl;
    private JTextField nombreTxt;
    private JTextField contraseñaTxt;
    private JLabel nombreLbl;
    private JLabel contraseñaLbl;
    private DataTransfer datos;

    public LogIn(DataTransfer datos) {
        this.datos = datos;
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    public JPanel getPanelPrincipal()
    {
        return contentPane;
    }

    private void onOK() {
        datos.put("nombre",nombreTxt.getText());
        datos.put("contraseña", contraseñaTxt.getText());
        JFrame frame = new JFrame("Principal");
        frame.setPreferredSize(new Dimension(600,300));
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        frame.setContentPane(new Principal().getPanelPrincipal());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        System.out.println(datos.datos);
        dispose();
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }

   /* public static void main(String[] args) {
        LogIn dialog = new LogIn();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }*/
}
