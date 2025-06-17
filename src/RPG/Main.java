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
import java.util.LinkedHashMap;
import java.util.Map;

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
        /*room.setInfo(new LinkedHashMap<>(Map.of(
                "String","Behind the",
                "RoomObject", "bar",
                "String", "is the barkeeper",
                "NPC", "Steve"
        )));*/

        // Create PlayerStatsPanel (requires player)
        PlayerStatsPanel playerStatsPanel = new PlayerStatsPanel(player);
        // Create RoomDetailsPanel (requires room)
        RoomDetailsPanel roomDetailsPanel = new RoomDetailsPanel(room);
        // Create ExploreOptionsPanel
        ExploreOptionsPanel exploreOptionsPanel = new ExploreOptionsPanel();
        // Create PlayerInventoryPanel (requires player)
        PlayerItemPanel playerItemPanel = new PlayerItemPanel(player);
        // Create RoomInfoPanel
        RoomInfoPanel roomInfoPanel = new RoomInfoPanel(new CardLayout(), new JPanel(), room);

        // Create panel to contain player and room info
        JPanel innerContainerPanel = new JPanel();
        innerContainerPanel.setLayout(new BorderLayout());
        // Create panel to contain all other panels
        JPanel outerContainerPanel = new JPanel();
        outerContainerPanel.setLayout(new BoxLayout(outerContainerPanel, BoxLayout.X_AXIS));

        // Adds player and room  info to inner container panel
        innerContainerPanel.add(playerStatsPanel, BorderLayout.PAGE_START);
        innerContainerPanel.add(roomInfoPanel);
        //innerContainerPanel.add(roomDetailsPanel);
        //innerContainerPanel.add(exploreOptionsPanel);

        // Adds inventory and inner container to outer container
        outerContainerPanel.add(playerItemPanel);
        outerContainerPanel.add(innerContainerPanel);
        //outerContainerPanel.add(roomInfoPanel);

        // Adds outer container to frame
        frame.add(outerContainerPanel);

        // Packs frame, sets size and makes visible
        frame.pack();
        //frame.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        frame.setSize(800, 600);
        //frame.setMinimumSize(new Dimension(800, 600));
        //frame.setResizable(false);

        /*frame.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e){
                Dimension d= frame.getSize();
                Dimension minD=frame.getMinimumSize();
                if(d.width<minD.width)
                    d.width=minD.width;
                if(d.height<minD.height)
                    d.height=minD.height;
                frame.setSize(d);             }
        });*/

        frame.setVisible(true);
    }
}
