package RPG.gui.panels;

import RPG.character.NonPlayerCharacter;
import RPG.gui.buttons.RoomButton;
import RPG.room.Room;

import javax.swing.*;
import java.awt.*;

public class NPCInfoPanel extends JPanel {

    public NPCInfoPanel(CardLayout cardLayout, JPanel container, NonPlayerCharacter NPC) {
        setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
        setBorder(BorderFactory.createTitledBorder(NPC.getName()));

        JLabel npcInfoLabel;
        JButton npcInfoButton;

        for (Object info : NPC.getInfo()) {
            if (info instanceof String) {
                npcInfoLabel = new JLabel((String) info);
                npcInfoLabel.setOpaque(true);
                npcInfoLabel.setBackground(Color.GREEN);
                add(npcInfoLabel);
            }
            else if (info instanceof Room) {
                npcInfoButton = new RoomButton((Room) info);
                npcInfoButton.addActionListener(e -> {
                    cardLayout.show(container, ((Room) info).getName());
                });
                add(npcInfoButton);
            }
        }
    }
}
