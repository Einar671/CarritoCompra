package ec.edu.ups.poo.view;

import javax.swing.*;

public class CarritoView extends JFrame {

    private JPanel panelPrincipal;
    private JComboBox comboBoxProducto;
    private JTextField txtCantidad;
    private JPanel carritoCompra;
    private JButton guardarButton;
    private JButton cancelarButton;
    private JLabel label1;
    private JLabel carritoLike;

    public CarritoView() {
        add(panelPrincipal);
        setTitle("Carrito");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(350, 500);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    public static void main(String[] args) {
        new CarritoView();
    }
}
