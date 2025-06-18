package RPG;

import RPG.character.NonPlayerCharacter;
import RPG.gui.panels.*;
import RPG.item.Item;
import RPG.player.Player;
import RPG.room.Room;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class CardLayoutTrial {
    public static void main(String[] args) {
        createAndDisplayGUI();
    }

    public static void createAndDisplayGUI() {
        JFrame frame = new JFrame("RPG");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create player
        Player player = new Player("Bob", "Human", "Monk", 8, 9, 10, 11, 12, 13);
        player.setPlayerExtraStrength(2);
        player.setPlayerExtraWisdom(-1);
        // Create NPCs
        NonPlayerCharacter steve = new NonPlayerCharacter("Steve", "The barkeeper of the tavern");
        // Create items
        Item sword = new Item("Sword", "A sharp sword");
        Item bucket = new Item("Bucket", "A rusty bucket");
        // Create room
        Room kitchen = new Room("Kitchen", "A large kitchen----------------");
        kitchen.addCharacter(steve);
        kitchen.addItem(sword);
        kitchen.addItem(bucket);
        kitchen.setDetail(new ArrayList<>(Arrays.asList("Behind the", "bar", "is the barkeeper", steve)));
        // Add info to characters
        steve.setInfo(new ArrayList<>(Arrays.asList("The barkeeper of the tavern who is in the", kitchen)));


        // Create card layout panel
        CardLayout cardLayout = new CardLayout();
        JPanel infoDisplayPanel = new JPanel(cardLayout);

        // Create container panel
        JPanel containerPanel = new JPanel();
        containerPanel.setLayout(new BoxLayout(containerPanel, BoxLayout.X_AXIS));
        // Create player item panel
        PlayerItemPanel playerItemPanel = new PlayerItemPanel(player);
        // Create room info panel
        RoomInfoPanel roomInfoPanel = new RoomInfoPanel(cardLayout, infoDisplayPanel, kitchen);
        // Create NPC info panel
        NPCInfoPanel steveInfoPanel = new NPCInfoPanel(cardLayout, infoDisplayPanel, steve);

        infoDisplayPanel.add(roomInfoPanel, kitchen.getName());
        infoDisplayPanel.add(steveInfoPanel, steve.getName());

        containerPanel.add(playerItemPanel);
        containerPanel.add(infoDisplayPanel);

        frame.add(containerPanel);

        frame.pack();
        frame.setVisible(true);
    }
}
