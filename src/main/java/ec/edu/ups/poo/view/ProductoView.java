package ec.edu.ups.poo.view;

import ec.edu.ups.poo.controller.musica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class ProductoView extends JFrame {
    private JPanel panelPrincipal;
    private JLabel lblcodigo;
    private JLabel lblNombre;
    private JTextField txtnombre;
    private JTextField txtcodigo;
    private JLabel lblprecio;
    private JTextField textField1;
    private JButton cancelarButton;
    private JButton agregarButton;

    public ProductoView() {
        setContentPane(panelPrincipal);


        setTitle("Datos del producto");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(500, 500);
        setLocationRelativeTo(null);
        setVisible(true);
        musica c = new musica();
        agregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c.cargarSonido("res/pel.wav");
                c.reproducir();
            }
        });
        cancelarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c.detener();
            }
        });
    }
    public static void main(String[] args) {
        new ProductoView();
    }
}
