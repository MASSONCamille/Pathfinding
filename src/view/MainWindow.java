package view;

import javax.swing.*;

public class MainWindow extends JFrame {

    public MainWindow() {
        this.setTitle("Hexagonal Grid");
        this.setSize(600, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setContentPane(new HexGrid( 1, 10));

        this.setVisible(true);

    }
}
