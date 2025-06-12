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

        // Sets blank border
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Create 2 panels so attributes display in lines
        JPanel playerInformation = new JPanel();
        JPanel playerAttributes = new JPanel();

        // Changes colour of all panels for consistent look
        setBackground(Color.LIGHT_GRAY);
        playerInformation.setBackground(Color.LIGHT_GRAY);
        playerAttributes.setBackground(Color.LIGHT_GRAY);

        // Set layout for panels
        playerInformation.setLayout(new BoxLayout(playerInformation, BoxLayout.X_AXIS));
        playerAttributes.setLayout(new BoxLayout(playerAttributes, BoxLayout.X_AXIS));

        // Creates labels for each player base info
        JLabel playerName = new JLabel("Name: " + player.getPlayerName());
        JLabel playerRace = new JLabel("Race: " + player.getPlayerRace());
        JLabel playerClass = new JLabel("Class: " + player.getPlayerClass());
        JLabel playerLevel = new JLabel("Level: " + player.getPlayerLevel());
        JLabel playerExperience = new JLabel("Experience: " + player.getPlayerExperience());
        JLabel playerHealth = new JLabel("Health: " + player.getPlayerHealth());
        JLabel playerMoney = new JLabel("Money: " + player.getPlayerMoney());
        // Creates strength label including extra if any
        JLabel playerStrength;
        if (player.getPlayerExtraStrength()==0) {
            playerStrength = new JLabel("Strength: " + player.getPlayerActualStrength());
        }
        else {playerStrength = new JLabel("Strength: " + player.getPlayerActualStrength() + " (" + player.getPlayerExtraStrengthString() + ")");}
        // Creates dexterity label including extra if any
        JLabel playerDexterity;
        if (player.getPlayerExtraDexterity()==0) {
            playerDexterity = new JLabel("Dexterity: " + player.getPlayerActualDexterity());
        }
        else {playerDexterity = new JLabel ("Dexterity: " + player.getPlayerActualDexterity() + " (" + player.getPlayerExtraDexterityString() + ")");}
        // Creates constitution label including extra if any
        JLabel playerConstitution;
        if (player.getPlayerExtraConstitution()==0) {
            playerConstitution = new JLabel("Constitution: " + player.getPlayerActualConstitution());
        }
        else {playerConstitution = new JLabel("Constitution: " + player.getPlayerActualConstitution() + " (" + player.getPlayerExtraConstitutionString() + ")");}
        // Creates intelligence label including extra if any
        JLabel playerIntelligence;
        if (player.getPlayerExtraIntelligence()==0) {
            playerIntelligence = new JLabel("Intelligence: " + player.getPlayerActualIntelligence());
        }
        else {playerIntelligence = new JLabel("Intelligence: " + player.getPlayerActualIntelligence() + " (" + player.getPlayerExtraIntelligenceString() + ")");}
        // Creates wisdom label including extra if any
        JLabel playerWisdom;
        if (player.getPlayerExtraWisdom()==0) {
            playerWisdom = new JLabel("Wisdom: " + player.getPlayerActualWisdom());
        }
        else {playerWisdom = new JLabel("Wisdom: " + player.getPlayerActualWisdom() + " (" + player.getPlayerExtraWisdomString() + ")");}
        // Creates charisma label including extra if any
        JLabel playerCharisma;
        if (player.getPlayerExtraCharisma()==0) {
            playerCharisma = new JLabel("Charisma: " + player.getPlayerActualCharisma());
        }
        else {playerCharisma = new JLabel("Charisma: " + player.getPlayerActualCharisma() + " (" + player.getPlayerExtraCharismaString() + ")");}
        //playerCharisma.setForeground(Color.ORANGE);
        //playerCharisma.setOpaque(true);
        //playerCharisma.setBackground(Color.BLUE);

        // Creates blank component
        // Adds labels to playerInformation panel
        playerInformation.add(playerName);
        playerInformation.add(Box.createRigidArea(new Dimension(15, 0)));
        playerInformation.add(playerRace);
        playerInformation.add(Box.createRigidArea(new Dimension(15, 0)));
        playerInformation.add(playerClass);
        playerInformation.add(Box.createRigidArea(new Dimension(15, 0)));
        playerInformation.add(playerLevel);
        playerInformation.add(Box.createRigidArea(new Dimension(15, 0)));
        playerInformation.add(playerExperience);
        playerInformation.add(Box.createRigidArea(new Dimension(15, 0)));
        playerInformation.add(playerHealth);
        playerInformation.add(Box.createRigidArea(new Dimension(15, 0)));
        playerInformation.add(playerMoney);

        // Adds labels to playerAttributes panel
        playerAttributes.add(playerStrength);
        playerAttributes.add(Box.createRigidArea(new Dimension(15, 0)));
        playerAttributes.add(playerDexterity);
        playerAttributes.add(Box.createRigidArea(new Dimension(15, 0)));
        playerAttributes.add(playerConstitution);
        playerAttributes.add(Box.createRigidArea(new Dimension(15, 0)));
        playerAttributes.add(playerIntelligence);
        playerAttributes.add(Box.createRigidArea(new Dimension(15, 0)));
        playerAttributes.add(playerWisdom);
        playerAttributes.add(Box.createRigidArea(new Dimension(15, 0)));
        playerAttributes.add(playerCharisma);

        // Adds separate panels to main panel
        add(playerInformation);
        add(playerAttributes);
    }
}
