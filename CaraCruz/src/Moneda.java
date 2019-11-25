import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class Moneda {
    private JPanel panelMain;
    private JPanel imagenPanel;
    private JPanel resultadosPanel;
    private JPanel botonesPanel;
    private JLabel imagen;
    private JButton butTirar;
    private JTextField txtRepetir;
    private JButton butRepetir;
    private JTextField Tirada;
    private JTextField txtTirada;
    private JTextField Cara;
    private JTextField Cruz;
    private JTextField txtCara;
    private JTextField txtCruz;
    private JTextField caraP;
    private JTextField cruzP;
    private JTextField txtCaraP;
    private JTextField txtCruzP;
    private boolean cara;
    private int intCara, intCruz;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Moneda");
        frame.setContentPane(new Moneda().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public Moneda ()
    {
        butTirar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    tirarMoneda();
                    ponerImagen();

                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        });
        butRepetir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    if(txtRepetir.getText() == null)
                        butRepetir.setEnabled(false);

                    else if(txtRepetir.getText() !=null)
                        butRepetir.setEnabled(true);
                    repetirTirada();

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public void tirarMoneda() throws IOException {
        var min=0;
        var max=2;
        var random =
                Math.floor(Math.random() * (+max - +min)) + +min;

        if(random == 1)
        {
            cara = true;
            intCara++;
            txtTirada.setText("Cara");
            txtCara.setText(String.valueOf(intCara));
        }

        else if(random== 0)
        {
            cara = false;
            intCruz++;
            txtTirada.setText("Cruz");
            txtCruz.setText(String.valueOf(intCruz));
        }
        porcentajes();
    }

    public void ponerImagen() throws IOException {

        ImageIcon imgCruz = new ImageIcon(ImageIO.read(new File("./src/Cruz.jpg")).getScaledInstance(400,400, Image.SCALE_FAST));
        ImageIcon imgCara = new ImageIcon(ImageIO.read(new File("./src/Cara.jpg")).getScaledInstance(400,400, Image.SCALE_FAST));

        if(cara) imagen.setIcon(imgCara);
        if(!cara) imagen.setIcon(imgCruz);
    }

    public void repetirTirada() throws IOException {
        for(int i = 0; i < Integer.valueOf(txtRepetir.getText()); i++)
        {
            tirarMoneda();
        }
    }

    public void porcentajes()
    {
        txtCaraP.setText(calcPorcentajes(intCara, intCruz, false) + "%");
        txtCruzP.setText(calcPorcentajes(intCara,intCruz,true) + "%");
    }

    public  double calcPorcentajes (int calcCara, int calcCruz, boolean cruz)
    {
        if (cruz) return (((double)calcCruz)/((double)calcCara+calcCruz)*100);
        else if (!cruz) return (((double)calcCara)/((double)calcCara+calcCruz)*100);
        return Double.MIN_VALUE;
    }
}
