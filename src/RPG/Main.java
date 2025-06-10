package RPG;

import RPG.gui.*;
import RPG.player.Player;
import RPG.room.Room;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        createAndDisplayGUI();
    }

    private static void createAndDisplayGUI() {
        JFrame frame = new JFrame("RPG");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // PlayerStatsPanel
        Player player = new Player("Bob", "Human", "Monk", 5, 3, 10, 56, 8, 7, 9, 10, 6, 14, null, null, null, null, null);
        PlayerStatsPanel playerStatsPanel = new PlayerStatsPanel(player);
        // RoomDetailsPanel
        Room room = new Room("K", "A large kitchen----------------");
        RoomDetailsPanel roomDetailsPanel = new RoomDetailsPanel(room);
        // ExploreOptionsPanel
        ExploreOptionsPanel exploreOptionsPanel = new ExploreOptionsPanel();

        JPanel containerPanel = new JPanel();
        containerPanel.setLayout(new BoxLayout(containerPanel, BoxLayout.Y_AXIS));

        containerPanel.add(playerStatsPanel);
        containerPanel.add(roomDetailsPanel);
        //containerPanel.add(exploreOptionsPanel);

        frame.add(containerPanel);

        frame.pack();
        frame.setSize(800, 600);
        frame.setVisible(true);
    }
}
