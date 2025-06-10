package RPG.gui;

import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.FlowLayout;

/**
 * This class is the gui panel that will contain the buttons for when the main game mode is running
 */
public class ExploreOptionsPanel extends JPanel {

    private JButton moveButton;
    private JButton talkButton;
    private JButton pickupButton;
    private JButton searchButton;

    /**
     * Constructor for ExploreOperationPanel
     * Creates a panel containing buttons for each possible action during main game phase
     */
    public ExploreOptionsPanel() {
        setLayout(new FlowLayout(FlowLayout.CENTER));

        // Initialise the buttons
        moveButton = new JButton("Move");
        talkButton = new JButton("Talk");
        pickupButton = new JButton("Pickup");
        searchButton = new JButton("Search");

        // Add buttons to panel
        add(moveButton);
        add(talkButton);
        add(pickupButton);
        add(searchButton);
    }

    // Getter methods if other classes need access to buttons
    public JButton getMoveButton() {
        return moveButton;
    }
    public JButton getTalkButton() {
        return talkButton;
    }
    public JButton getPickupButton() {
        return pickupButton;
    }
    public JButton getSearchButton() {
        return searchButton;
    }
}
