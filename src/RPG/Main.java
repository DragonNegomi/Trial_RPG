package RPG;

import RPG.gui.*;
import RPG.player.Player;
import RPG.room.Room;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        createAndDisplayGUI();
    }

    private static void createAndDisplayGUI() {
        JFrame frame = new JFrame("RPG");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create player
        Player player = new Player("Bob", "Human", "Monk", 8, 9, 10, 11, 12, 13);
        player.setPlayerExtraStrength(2);
        player.setPlayerExtraWisdom(-1);
        // Create room
        Room room = new Room("K", "A large kitchen----------------");

        // Create PlayerStatsPanel (requires player)
        PlayerStatsPanel playerStatsPanel = new PlayerStatsPanel(player);
        // Create RoomDetailsPanel (requires room)
        RoomDetailsPanel roomDetailsPanel = new RoomDetailsPanel(room);
        // Create ExploreOptionsPanel
        ExploreOptionsPanel exploreOptionsPanel = new ExploreOptionsPanel();
        // Create PlayerInventoryPanel (requires player)
        PlayerItemPanel playerItemPanel = new PlayerItemPanel(player);

        // Create panel to contain player and room info
        JPanel innerContainerPanel = new JPanel();
        innerContainerPanel.setLayout(new BorderLayout());
        // Create panel to contain all other panels
        JPanel outerContainerPanel = new JPanel();
        outerContainerPanel.setLayout(new BoxLayout(outerContainerPanel, BoxLayout.X_AXIS));

        // Adds player and room  info to inner container panel
        innerContainerPanel.add(playerStatsPanel, BorderLayout.PAGE_START);
        innerContainerPanel.add(roomDetailsPanel);
        //innerContainerPanel.add(exploreOptionsPanel);

        // Adds inventory and inner container to outer container
        outerContainerPanel.add(playerItemPanel);
        outerContainerPanel.add(innerContainerPanel);

        // Adds outer container to frame
        frame.add(outerContainerPanel);

        // Packs frame, sets size and makes visible
        frame.pack();
        frame.setSize(800, 600);
        frame.setVisible(true);
    }
}
