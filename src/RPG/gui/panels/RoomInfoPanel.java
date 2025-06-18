package RPG.gui.panels;

import RPG.character.NonPlayerCharacter;
import RPG.gui.buttons.NPCButton;
import RPG.room.Room;

import javax.swing.*;
import java.awt.*;

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
        
    }
}
