package RPG.gui.panels;

import RPG.item.Item;
import RPG.player.Player;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class PlayerItemPanel extends JPanel{

    public PlayerItemPanel(Player player){
        setLayout(new BorderLayout());
        setBackground(Color.GRAY);

        // Creates separate panels for equipped and inventory
        JPanel equippedPanel = new JPanel();
        JPanel inventoryPanel = new JPanel();

        // Sets layout for inner panels
        equippedPanel.setLayout(new BoxLayout(equippedPanel, BoxLayout.Y_AXIS));
        inventoryPanel.setLayout(new BoxLayout(inventoryPanel, BoxLayout.Y_AXIS));

        //equippedPanel.setMinimumSize(new Dimension(500, 100));

        // Adds borders to inner panels
        addTitledBorder(equippedPanel, "Equipped");
        addTitledBorder(inventoryPanel, "Inventory");

        // Creates blank border
        Border blankBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
        // Creates titled border
        Border titleBorder = BorderFactory.createTitledBorder(BorderFactory.createLoweredBevelBorder(), "Player Inventory");
         // Sets blank border around titled border
        setBorder(BorderFactory.createCompoundBorder(blankBorder, titleBorder));

        //TODO remove once inventory actually contain stuff
        JLabel inventoryLabel = new JLabel("Inventory");
        inventoryPanel.add(inventoryLabel);

        addInventory(inventoryPanel, player);
        addEquipped(equippedPanel, player);

        // Adds other panels to main panel
        add(equippedPanel, BorderLayout.PAGE_START);
        add(inventoryPanel);
    }

    public void addTitledBorder(JPanel panel, String title){
        Border blankBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
        Border outerBorder = BorderFactory.createCompoundBorder(blankBorder, BorderFactory.createTitledBorder(BorderFactory.createLoweredBevelBorder(), title));
        Border totalBorder = BorderFactory.createCompoundBorder(outerBorder, blankBorder);
        panel.setBorder(totalBorder);
    }

    public void addInventory(JPanel panel, Player player){
        for (Item item : player.getInventory()){
            JLabel itemLabel = new JLabel(item.getName());
            panel.add(itemLabel);
        }
    }

    public void addEquipped(JPanel panel, Player player){
        JLabel headLabel = new JLabel("Head: " + player.getPlayerHead().getName());
        JLabel chestLabel = new JLabel("Chest: " + player.getPlayerChest().getName());
        JLabel legsLabel = new JLabel("Legs: " + player.getPlayerLegs().getName());
        JLabel feetLabel = new JLabel("Feet: " + player.getPlayerFeet().getName());
        JLabel handsLabel = new JLabel("Hands: " + player.getPlayerHands().getName());

        panel.add(headLabel);
        panel.add(chestLabel);
        panel.add(legsLabel);
        panel.add(feetLabel);
        panel.add(handsLabel);
    }
}
