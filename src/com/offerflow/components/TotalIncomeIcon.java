package com.offerflow.components;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Path2D;
import javax.swing.Icon;

public class TotalIncomeIcon implements Icon {

    private int size;

    public TotalIncomeIcon(int size) {
        this.size = size;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        Graphics2D g2 = (Graphics2D) g.create();

        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g2.setColor(new Color(150, 100, 255, 50));
        g2.fillRoundRect(x, y, size, size, 15, 15);

        int padding = size / 5;
        int iconW = size - (padding * 2);
        int iconH = size - (padding * 2);
        int startX = x + padding;
        int startY = y + padding;

        g2.setColor(new Color(46, 204, 113));

        g2.fillRoundRect(startX + 5, startY, iconW - 10, iconH, 4, 4);

        g2.setColor(new Color(30, 130, 70));
        g2.setStroke(new BasicStroke(2));
        g2.drawLine(startX + 10, startY + 5, startX + iconW - 10, startY + 5);

        g2.setColor(new Color(80, 60, 120));

        int walletY = startY + (iconH / 3);
        int walletH = iconH - (iconH / 3);
        g2.fillRoundRect(startX, walletY, iconW, walletH, 8, 8);

        g2.setColor(new Color(100, 80, 140));
        g2.setStroke(new BasicStroke(1));
        g2.drawRoundRect(startX + 2, walletY + 2, iconW - 4, walletH - 4, 6, 6);

        g2.setColor(new Color(241, 196, 15));
        int btnSize = size / 8;
        g2.fillOval(startX + (iconW / 2) - (btnSize / 2), walletY + (walletH / 2) - (btnSize / 2), btnSize, btnSize);

        int badgeSize = size / 3;
        int badgeX = x + size - badgeSize;
        int badgeY = y + size - badgeSize;

        g2.setColor(new Color(52, 152, 219));
        g2.fillOval(badgeX, badgeY, badgeSize, badgeSize);

        g2.setColor(Color.WHITE);
        g2.setStroke(new BasicStroke(2, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));

        Path2D arrow = new Path2D.Float();

        float ax = badgeX + (badgeSize * 0.3f);
        float ay = badgeY + (badgeSize * 0.7f);
        float bx = badgeX + (badgeSize * 0.7f);
        float by = badgeY + (badgeSize * 0.3f);

        arrow.moveTo(ax, ay);
        arrow.lineTo(bx, by);

        arrow.moveTo(bx - (badgeSize * 0.25f), by);
        arrow.lineTo(bx, by);
        arrow.lineTo(bx, by + (badgeSize * 0.25f));

        g2.draw(arrow);

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
