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
        Room room = new Room("K", "A large kitchen----------------");
        room.addCharacter(steve);
        room.addItem(sword);
        room.addItem(bucket);
        room.setDetail(new ArrayList<>(Arrays.asList("Behind the", "bar", "is the barkeeper", steve)));


        // Create card layout panel
        CardLayout cardLayout = new CardLayout();
        JPanel infoDisplayPanel = new JPanel(cardLayout);

        // Create container panel
        JPanel containerPanel = new JPanel();
        containerPanel.setLayout(new BoxLayout(containerPanel, BoxLayout.X_AXIS));
        // Create player item panel
        PlayerItemPanel playerItemPanel = new PlayerItemPanel(player);
        // Create room info panel
        RoomInfoPanel roomInfoPanel = new RoomInfoPanel(cardLayout, infoDisplayPanel, room);
        // Create NPC info panel
        NPCInfoPanel steveInfoPanel = new NPCInfoPanel(steve);

        infoDisplayPanel.add(roomInfoPanel, "room");
        infoDisplayPanel.add(steveInfoPanel, "Steve");

        containerPanel.add(playerItemPanel);
        containerPanel.add(infoDisplayPanel);

        frame.add(containerPanel);

        frame.pack();
        frame.setVisible(true);
    }
}
