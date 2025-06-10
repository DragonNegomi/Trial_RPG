package RPG.gui;

import RPG.player.Player;

import javax.swing.JPanel;
import javax.swing.JLabel;

public class PlayerStatsPanel extends JPanel{

    /**
     * Constructor for PlayerStatsPanel
     * The panel contains labels for each of the variable in Player.
     * It will display all the player information
     * @param player The Player object containing the player information
     */
    public PlayerStatsPanel(Player player){
        // Creates labels for each player attribute
        JLabel playerName = new JLabel("Name: " + player.getPlayerName());
        JLabel playerRace = new JLabel("Race: " + player.getPlayerRace());
        JLabel playerClass = new JLabel("Class: " + player.getPlayerClass());
        JLabel playerLevel = new JLabel("Level: " + player.getPlayerLevel());
        JLabel playerExperience = new JLabel("Experience: " + player.getPlayerExperience());
        JLabel playerHealth = new JLabel("Health: " + player.getPlayerHealth());
        JLabel playerMoney = new JLabel("Money: " + player.getPlayerMoney());
        JLabel playerStrength = new JLabel("Strength: " + player.getPlayerStrength());
        JLabel playerDexterity = new JLabel("Dexterity: " + player.getPlayerDexterity());
        JLabel playerConstitution = new JLabel("Constitution: " + player.getPlayerConstitution());
        JLabel playerIntelligence = new JLabel("Intelligence: " + player.getPlayerIntelligence());
        JLabel playerWisdom = new JLabel("Wisdom: " + player.getPlayerWisdom());
        JLabel playerCharisma = new JLabel("Charisma: " + player.getPlayerCharisma());

        // Adds labels to panel
        add(playerName);
        add(playerRace);
        add(playerClass);
        add(playerLevel);
        add(playerExperience);
        add(playerHealth);
        add(playerMoney);
        add(playerStrength);
        add(playerDexterity);
        add(playerConstitution);
        add(playerIntelligence);
        add(playerWisdom);
        add(playerCharisma);
    }
}
