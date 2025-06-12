package RPG.gui;

import RPG.item.Item;
import RPG.player.Player;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class PlayerItemPanel extends JPanel{

    public PlayerItemPanel(Player player){
        setBackground(Color.GRAY);

        // Creates blank border
        Border blankBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
        // Creates titled border
        Border titleBorder = BorderFactory.createTitledBorder(BorderFactory.createLoweredBevelBorder(), "Player Inventory");
         // Sets blank border around titled border
        setBorder(BorderFactory.createCompoundBorder(blankBorder, titleBorder));

        // Creates and adds title label
        JLabel inventoryLabel = new JLabel("Inventory");
        add(inventoryLabel);

        // Creates and adds labels of all item names
        for (Item item : player.getInventory()){
            JLabel itemLabel = new JLabel(item.getName());
            add(itemLabel);
        }
    }
}
