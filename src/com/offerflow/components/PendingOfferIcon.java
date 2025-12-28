package com.offerflow.components;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.Icon;

public class PendingOfferIcon implements Icon {

    private int size;

    public PendingOfferIcon(int size) {
        this.size = size;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        Graphics2D g2 = (Graphics2D) g.create();

        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);

        g2.setColor(new Color(255, 180, 60, 50));
        g2.fillRoundRect(x, y, size, size, 15, 15);

        int padding = size / 5;
        int iconSize = size - (padding * 2);
        int docX = x + padding;
        int docY = y + padding;

        g2.setColor(new Color(250, 250, 235));
        g2.fillRoundRect(docX, docY, iconSize, iconSize, 5, 5);

        int coinSize = iconSize / 2;
        int coinX = docX + (iconSize - coinSize) / 2;
        int coinY = docY + (iconSize - coinSize) / 2 - 2;

        g2.setColor(new Color(220, 180, 100));
        g2.fillOval(coinX, coinY, coinSize, coinSize);

        g2.setColor(Color.WHITE);
        g2.setStroke(new BasicStroke(2, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        int cx = coinX + coinSize / 2;
        int cy = coinY + coinSize / 2;
        g2.drawLine(cx, cy - coinSize / 4, cx, cy + coinSize / 4); // Dikey çizgi
        g2.drawLine(cx - coinSize / 5, cy - coinSize / 8, cx + coinSize / 5, cy - coinSize / 8); // Yatay çizgi 1

        int badgeSize = size / 3 + 2;
        int badgeX = x + size - badgeSize - 2;
        int badgeY = y + size - badgeSize - 2;

        g2.setColor(new Color(255, 140, 0));
        g2.fillOval(badgeX, badgeY, badgeSize, badgeSize);

        g2.setColor(Color.WHITE);
        g2.setStroke(new BasicStroke(1.5f));
        g2.drawOval(badgeX + 2, badgeY + 2, badgeSize - 4, badgeSize - 4);

        int centerX = badgeX + badgeSize / 2;
        int centerY = badgeY + badgeSize / 2;

        g2.setStroke(new BasicStroke(2f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));

        g2.drawLine(centerX, centerY, centerX + badgeSize / 4, centerY);

        g2.drawLine(centerX, centerY, centerX, centerY - badgeSize / 3);

        g2.dispose();
    }

    @Override
    public int getIconWidth() {
        return size;
    }

    @Override
    public int getIconHeight() {
        return size;
    }
}
