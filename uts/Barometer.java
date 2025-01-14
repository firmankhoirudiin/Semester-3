package uts;

import javax.swing.*;
import java.awt.*;

public class Barometer extends JPanel {
    private int saldo;

    public Barometer() {
        this.saldo = 0;
        setPreferredSize(new Dimension(300, 50));
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
        repaint(); // Memanggil ulang untuk menggambar ulang
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.GREEN);
        int width = (int) ((saldo / 10000.0) * getWidth()); // Misalkan 10000 adalah saldo maksimum
        g.fillRect(0, 0, width, getHeight());
        g.setColor(Color.BLACK);
        g.drawString("Saldo: " + saldo, 10, 20);
    }
}
