package RPG.gui.buttons;

import RPG.character.NonPlayerCharacter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class NPCButton extends JButton{

    public NPCButton(NonPlayerCharacter NPC){
        super(NPC.getName());

        // Makes button look like label
        setBorderPainted(false);
        setFocusPainted(false);
        setContentAreaFilled(false);
        setMargin(new Insets(-3, 0, -3, 0));

        // Changes text to blue
        setForeground(Color.BLUE);

        // Changes background to red
        setOpaque(true);
        setBackground(Color.RED);
    }
}
