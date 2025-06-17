package RPG.gui.panels;

import RPG.character.NonPlayerCharacter;

import javax.swing.*;

public class NPCInfoPanel extends JPanel {

    public NPCInfoPanel(NonPlayerCharacter NPC) {
        setBorder(BorderFactory.createTitledBorder(NPC.getName()));

        JLabel descriptionLabel = new JLabel(NPC.getDescription());
        add(descriptionLabel);
    }
}
