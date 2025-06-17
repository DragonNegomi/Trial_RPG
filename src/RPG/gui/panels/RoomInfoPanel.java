package RPG.gui.panels;

import RPG.room.Room;

import javax.swing.*;
import java.awt.*;

public class RoomInfoPanel extends JPanel{

    public RoomInfoPanel(Room room) {
        setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
        setBorder(BorderFactory.createTitledBorder(room.getName()));
        setBackground(Color.CYAN);

        JLabel roomTextInfoLabel;
        JButton roomInfoButton;

        for (int i = 0; i < room.getInfo().size(); i++) {
            if (i % 2 == 0) {
                roomTextInfoLabel = new JLabel(room.getInfo().get(i));
                roomTextInfoLabel.setOpaque(true);
                roomTextInfoLabel.setBackground(Color.PINK);
                add(roomTextInfoLabel);
            }
            else {
                roomInfoButton = new JButton(room.getInfo().get(i));
                roomInfoButton.setBorderPainted(false);
                roomInfoButton.setFocusPainted(false);
                roomInfoButton.setContentAreaFilled(false);
                roomInfoButton.setOpaque(true);
                roomInfoButton.setBackground(Color.PINK);
                roomInfoButton.setForeground(Color.BLUE);
                roomInfoButton.setMargin(new Insets(-3, 0, -3, 0));
                add(roomInfoButton);
            }
        }
    }
}
