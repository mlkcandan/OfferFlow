package com.offerflow.components;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Path2D;
import javax.swing.Icon;

public class ActiveListingIcon implements Icon {

    private int size;

    public ActiveListingIcon(int size) {
        this.size = size;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g2.setColor(new Color(60, 100, 200, 50));
        g2.fillRoundRect(x, y, size, size, 15, 15);

        int padding = size / 4;
        int iconSize = size - (padding * 2);

        g2.setColor(new Color(220, 220, 240));

        g2.fillRoundRect(x + padding, y + padding, iconSize, iconSize, 5, 5);

        g2.setColor(new Color(100, 100, 140));
        g2.setStroke(new BasicStroke(2));

        int lineX = x + padding + 4;
        int lineW = iconSize - 8;
        int lineStartY = y + padding + 8;

        g2.drawLine(lineX, lineStartY, lineX + lineW, lineStartY);
        g2.drawLine(lineX, lineStartY + 6, lineX + lineW, lineStartY + 6);
        g2.drawLine(lineX, lineStartY + 12, lineX + (lineW / 2), lineStartY + 12);

        int badgeSize = size / 3;
        int badgeX = x + size - badgeSize - 2;
        int badgeY = y + size - badgeSize - 2;

        g2.setColor(new Color(30, 200, 100));
        g2.fillOval(badgeX, badgeY, badgeSize, badgeSize);

        g2.setColor(Color.WHITE);
        g2.setStroke(new BasicStroke(2, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));

        Path2D check = new Path2D.Float();

        check.moveTo(badgeX + (badgeSize * 0.25), badgeY + (badgeSize * 0.5));
        check.lineTo(badgeX + (badgeSize * 0.45), badgeY + (badgeSize * 0.7));
        check.lineTo(badgeX + (badgeSize * 0.75), badgeY + (badgeSize * 0.3));

        g2.draw(check);

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
