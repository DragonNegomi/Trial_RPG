package RPG.gui.buttons;

import RPG.room.Room;

import javax.swing.*;
import java.awt.*;

public class RoomButton extends JButton {

    public RoomButton(Room room) {
        super(room.getName());

        // Makes button look like label
        setBorderPainted(false);
        setFocusPainted(false);
        setContentAreaFilled(false);
        setMargin(new Insets(-3, 0, -3, 0));

        // Changes text to blue
        setForeground(Color.RED);

        // Changes background to red
        setOpaque(true);
        setBackground(Color.CYAN);
    }
}
