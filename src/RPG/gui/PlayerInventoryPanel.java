package RPG.gui;

import RPG.item.Item;
import RPG.player.Player;

import javax.swing.*;
import java.awt.*;

public class PlayerInventoryPanel extends JPanel{

    public PlayerInventoryPanel(Player player){
        setBackground(Color.GRAY);

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
