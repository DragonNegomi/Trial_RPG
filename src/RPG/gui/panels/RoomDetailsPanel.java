package RPG.gui.panels;

import RPG.character.NonPlayerCharacter;
import RPG.item.Item;
import RPG.room.Room;

import javax.swing.*;
import java.awt.*;

public class RoomDetailsPanel extends JPanel {

    public RoomDetailsPanel(Room room) {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        // Create separate panels within
        JPanel nameAndDescriptionPanel = new JPanel();
        JPanel charactersAndItemsPanel = new JPanel();
        JPanel charactersPanel = new JPanel();
        JPanel itemsPanel = new JPanel();
        JPanel adjacentRoomsPanel = new JPanel();
        JPanel northAndSouthPanel = new JPanel();
        JPanel westAndEastPanel = new JPanel();

        // Set layout for panels
        nameAndDescriptionPanel.setLayout(new BoxLayout(nameAndDescriptionPanel, BoxLayout.Y_AXIS));
        //nameAndDescriptionPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        charactersAndItemsPanel.setLayout(new BoxLayout(charactersAndItemsPanel, BoxLayout.X_AXIS));
        charactersPanel.setLayout(new BoxLayout(charactersPanel, BoxLayout.Y_AXIS));
        itemsPanel.setLayout(new BoxLayout(itemsPanel, BoxLayout.Y_AXIS));
        adjacentRoomsPanel.setLayout(new BoxLayout(adjacentRoomsPanel, BoxLayout.X_AXIS));
        northAndSouthPanel.setLayout(new BoxLayout(northAndSouthPanel, BoxLayout.Y_AXIS));
        westAndEastPanel.setLayout(new BoxLayout(westAndEastPanel, BoxLayout.Y_AXIS));

        // Create labels for nameAndDescriptionPanel
        JLabel nameLabel = new JLabel(room.getName());
        JLabel descriptionLabel = new JLabel(room.getDescription());
        // Set labels to align in centre
        nameLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        descriptionLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        // Add labels to panel
        nameAndDescriptionPanel.add(nameLabel);
        nameAndDescriptionPanel.add(descriptionLabel);


        // Create and add title label for charactersPanel
        JLabel charactersTitleLabel = new JLabel("Characters:   ");
        charactersPanel.add(charactersTitleLabel);
        // Create and add labels with each character name
        JLabel characterNameLabel;
        if (!room.getCharacters().isEmpty()) {
            for (NonPlayerCharacter character : room.getCharacters()) {
                characterNameLabel = new JLabel("  -" + character.getName());
                charactersPanel.add(characterNameLabel);
            }
        }
        else {
            characterNameLabel = new JLabel("  No characters");
            charactersPanel.add(characterNameLabel);
        }

        // Create and add title label for itemsPanel
        JLabel itemsTitleLabel = new JLabel("Items:   ");
        itemsPanel.add(itemsTitleLabel);
        // Create and add labels with each item name
        JLabel itemNameLabel;
        if (!room.getItems().isEmpty()) {
            for (Item item : room.getItems()) {
                itemNameLabel = new JLabel("  -" + item.getName());
                itemsPanel.add(itemNameLabel);
            }
        }
        else {
            itemNameLabel = new JLabel("  No items");
            itemsPanel.add(itemNameLabel);
        }

        // Create labels for northAndSouthPanel
        JLabel northLabel = new JLabel("North: " + room.getNorth());
        JLabel southLabel = new JLabel("South: " + room.getSouth());
        // Add labels to panel
        northAndSouthPanel.add(northLabel);
        northAndSouthPanel.add(southLabel);

        // Create labels for eastAndSouthPanel
        JLabel westLabel = new JLabel("West: " + room.getWest());
        JLabel eastLabel = new JLabel("East: " + room.getEast());
        // Add label to panel
        westAndEastPanel.add(westLabel);
        westAndEastPanel.add(eastLabel);

        // Add charactersPanel, gap and itemsPanel to charactersAndItemsPanel
        charactersAndItemsPanel.add(charactersPanel);
        charactersAndItemsPanel.add(Box.createRigidArea(new Dimension(50, 0)));
        charactersAndItemsPanel.add(itemsPanel);

        // Add northAndSouthPanel and eastAndSouthPanel to adjacentRoomsPanel
        adjacentRoomsPanel.add(northAndSouthPanel);
        adjacentRoomsPanel.add(Box.createRigidArea(new Dimension(10, 0)));
        adjacentRoomsPanel.add(westAndEastPanel);

        // Add others panels to main panel with gaps
        add(Box.createRigidArea(new Dimension(0, 10)));
        add(nameAndDescriptionPanel);
        add(Box.createRigidArea(new Dimension(0, 20)));
        add(charactersAndItemsPanel);
        add(Box.createRigidArea(new Dimension(0, 20)));
        add(adjacentRoomsPanel);
        add(Box.createRigidArea(new Dimension(0, 10)));
    }
}
