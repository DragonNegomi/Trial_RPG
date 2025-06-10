package RPG.gui;

import RPG.player.Player;

import javax.swing.*;
import java.awt.*;

public class PlayerStatsPanel extends JPanel{

    /**
     * Constructor for PlayerStatsPanel
     * The panel contains labels for each of the variable in Player.
     * It will display all the player information
     * @param player The Player object containing the player information
     */
    public PlayerStatsPanel(Player player){
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        //setBackground(Color.BLUE);
        // Create 2 panels so attributes display in lines
        JPanel playerInformation = new JPanel();
        JPanel playerAttributes = new JPanel();

        // Set layout for panels
        playerInformation.setLayout(new BoxLayout(playerInformation, BoxLayout.X_AXIS));
        playerAttributes.setLayout(new BoxLayout(playerAttributes, BoxLayout.X_AXIS));

        //playerInformation.setBackground(Color.LIGHT_GRAY);
        //playerAttributes.setBackground(Color.LIGHT_GRAY);
        //setBackground(Color.GRAY);

        // Creates labels for each player attribute
        JLabel playerName = new JLabel("Name: " + player.getPlayerName());
        JLabel playerRace = new JLabel("    Race: " + player.getPlayerRace());
        JLabel playerClass = new JLabel("    Class: " + player.getPlayerClass());
        JLabel playerLevel = new JLabel("    Level: " + player.getPlayerLevel());
        JLabel playerExperience = new JLabel("    Experience: " + player.getPlayerExperience());
        JLabel playerHealth = new JLabel("    Health: " + player.getPlayerHealth());
        JLabel playerMoney = new JLabel("    Money: " + player.getPlayerMoney());
        JLabel playerStrength = new JLabel("Strength: " + player.getPlayerActualStrength());
        JLabel playerDexterity = new JLabel("    Dexterity: " + player.getPlayerActualDexterity());
        JLabel playerConstitution = new JLabel("    Constitution: " + player.getPlayerActualConstitution());
        JLabel playerIntelligence = new JLabel("    Intelligence: " + player.getPlayerActualIntelligence());
        JLabel playerWisdom = new JLabel("    Wisdom: " + player.getPlayerActualWisdom());
        JLabel playerCharisma = new JLabel("    Charisma: " + player.getPlayerActualCharisma());
        //playerCharisma.setForeground(Color.ORANGE);
        //playerCharisma.setOpaque(true);
        //playerCharisma.setBackground(Color.BLUE);

        // Adds labels to playerInformation panel
        playerInformation.add(playerName);
        playerInformation.add(playerRace);
        playerInformation.add(playerClass);
        playerInformation.add(playerLevel);
        playerInformation.add(playerExperience);
        playerInformation.add(playerHealth);
        playerInformation.add(playerMoney);

        // Adds labels to playerAttributes panel
        playerAttributes.add(playerStrength);
        playerAttributes.add(playerDexterity);
        playerAttributes.add(playerConstitution);
        playerAttributes.add(playerIntelligence);
        playerAttributes.add(playerWisdom);
        playerAttributes.add(playerCharisma);

        // Changes sizes to fit look
        //playerInformation.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 0));
        //playerAttributes.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 0));
        // Adds separate panels to main panel
        add(Box.createRigidArea(new Dimension(0, 10)));
        add(playerInformation);
        add(playerAttributes);
        add(Box.createRigidArea(new Dimension(0, 30)));
        //setLayout(new FlowLayout(FlowLayout.CENTER, 5, 0));
        //setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

    }
}
