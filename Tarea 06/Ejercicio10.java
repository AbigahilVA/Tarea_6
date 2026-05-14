import javax.swing.*;
import java.awt.event.*;

public class Ejercicio10 extends JFrame implements ActionListener {

    private JTextField txtUsuario;
    private JTextField txtClave;
    private JLabel lblUsuario;
    private JLabel lblClave;
    private JButton btnVerificar;

    public Ejercicio10() {
        setLayout(null);

        lblUsuario = new JLabel("Usuario:");
        lblUsuario.setBounds(30, 30, 100, 30);
        add(lblUsuario);

        txtUsuario = new JTextField();
        txtUsuario.setBounds(100, 30, 150, 30);
        add(txtUsuario);

        lblClave = new JLabel("Clave:");
        lblClave.setBounds(30, 80, 100, 30);
        add(lblClave);

        txtClave = new JTextField();
        txtClave.setBounds(100, 80, 150, 30);
        add(txtClave);

        btnVerificar = new JButton("Verificar");
        btnVerificar.setBounds(90, 130, 100, 30);
        btnVerificar.addActionListener(this);
        add(btnVerificar);

        setTitle("Login");
        setBounds(100, 100, 320, 230);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String usuario = txtUsuario.getText();
        String clave = txtClave.getText();

        if (usuario.equals("juan") && clave.equals("abc123")) {
            setTitle("Correcto");
        } else {
            setTitle("Incorrecto");
        }
    }

    public static void main(String[] args) {
        new Ejercicio10();
    }
}
