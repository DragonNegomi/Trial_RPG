package RPG.gui.panels;

import RPG.character.NonPlayerCharacter;
import RPG.gui.buttons.NPCButton;
import RPG.room.Room;

import javax.swing.*;
import java.awt.*;
import java.util.Map;

public class RoomInfoPanel extends JPanel{

    public RoomInfoPanel(CardLayout cardLayout, JPanel container, Room room) {
        setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
        setBorder(BorderFactory.createTitledBorder(room.getName()));
        setBackground(Color.CYAN);

        JLabel roomTextInfoLabel;
        JButton roomInfoButton;

        for (Object info : room.getDetail()) {
            if (info instanceof String) {
                roomTextInfoLabel = new JLabel((String) info);
                roomTextInfoLabel.setOpaque(true);
                roomTextInfoLabel.setBackground(Color.PINK);
                add(roomTextInfoLabel);
            }
            else if (info instanceof NonPlayerCharacter) {
                roomInfoButton = new NPCButton((NonPlayerCharacter) info);
                roomInfoButton.addActionListener(e -> {
                    cardLayout.show(container, ((NonPlayerCharacter) info).getName());
                });
                add(roomInfoButton);
            }
        }

        /*for (Map.Entry<String, String> entry : room.getInfo().entrySet()) {
            if (entry.getKey() == "String") {
                roomTextInfoLabel = new JLabel(entry.getValue());
                roomTextInfoLabel.setOpaque(true);
                roomTextInfoLabel.setBackground(Color.PINK);
                add(roomTextInfoLabel);
            }
            else if (entry.getKey() == "NPC") {
                roomInfoButton = new NPCButton(entry.getValue());
                add(roomInfoButton);
            }
            else if (entry.getKey() == "RoomObject") {
                roomInfoButton = new JButton(entry.getValue());
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
         */
    }
}
