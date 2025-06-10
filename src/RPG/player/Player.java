package RPG.player;

import RPG.item.Item;

import java.util.ArrayList;

public class Player {

    private String playerName;
    private String playerRace;
    private String playerClass;
    private Integer playerLevel;
    private Integer playerExperience;
    private Integer playerHealth;
    private Integer playerMoney;
    private Integer playerStrength;
    private Integer playerDexterity;
    private Integer playerIntelligence;
    private Integer playerCharisma;
    private Integer playerConstitution;
    private Integer playerWisdom;
    private Item playerHead;
    private Item playerBody;
    private Item playerLegs;
    private Item playerShoes;
    private Item playerHands;
    private ArrayList<Item> inventory;


    public Player(String playerName, String playerRace, String playerClass, Integer playerLevel, Integer playerExperience, Integer playerHealth, Integer playerMoney, Integer playerStrength, Integer playerDexterity, Integer playerIntelligence, Integer playerCharisma, Integer playerConstitution, Integer playerWisdom, Item playerHead, Item playerBody, Item playerLegs, Item playerShoes, Item playerHands) {
        setPlayerName(playerName);
        setPlayerRace(playerRace);
        setPlayerClass(playerClass);
        setPlayerLevel(playerLevel);
        setPlayerExperience(playerExperience);
        setPlayerHealth(playerHealth);
        setPlayerMoney(playerMoney);
        setPlayerStrength(playerStrength);
        setPlayerDexterity(playerDexterity);
        setPlayerIntelligence(playerIntelligence);
        setPlayerCharisma(playerCharisma);
        setPlayerConstitution(playerConstitution);
        setPlayerWisdom(playerWisdom);
        setPlayerHead(playerHead);
        setPlayerBody(playerBody);
        setPlayerLegs(playerLegs);
        setPlayerShoes(playerShoes);
        setPlayerHands(playerHands);
        inventory = new ArrayList<>();
    }


    /**
     * Resets all variables to "", 0 or null
     */
    public void initialize() {
        setPlayerName("");
        setPlayerRace("");
        setPlayerClass("");
        setPlayerLevel(0);
        setPlayerExperience(0);
        setPlayerHealth(0);
        setPlayerMoney(0);
        setPlayerStrength(0);
        setPlayerDexterity(0);
        setPlayerIntelligence(0);
        setPlayerCharisma(0);
        setPlayerConstitution(0);
        setPlayerWisdom(0);
        setPlayerHead(null);
        setPlayerBody(null);
        setPlayerLegs(null);
        setPlayerShoes(null);
        setPlayerHands(null);
    }


    // Getters and setters


    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerRace() {
        return playerRace;
    }

    public void setPlayerRace(String playerRace) {
        this.playerRace = playerRace;
    }

    public String getPlayerClass() {
        return playerClass;
    }

    public void setPlayerClass(String playerClass) {
        this.playerClass = playerClass;
    }

    public Integer getPlayerCharisma() {
        return playerCharisma;
    }

    public void setPlayerCharisma(Integer playerCharisma) {
        this.playerCharisma = playerCharisma;
    }

    public Integer getPlayerIntelligence() {
        return playerIntelligence;
    }

    public void setPlayerIntelligence(Integer playerIntelligence) {
        this.playerIntelligence = playerIntelligence;
    }

    public Integer getPlayerDexterity() {
        return playerDexterity;
    }

    public void setPlayerDexterity(Integer playerDexterity) {
        this.playerDexterity = playerDexterity;
    }

    public Integer getPlayerStrength() {
        return playerStrength;
    }

    public void setPlayerStrength(Integer playerStrength) {
        this.playerStrength = playerStrength;
    }

    public Integer getPlayerMoney() {
        return playerMoney;
    }

    public void setPlayerMoney(Integer playerMoney) {
        this.playerMoney = playerMoney;
    }

    public Integer getPlayerHealth() {
        return playerHealth;
    }

    public void setPlayerHealth(Integer playerHealth) {
        this.playerHealth = playerHealth;
    }

    public Integer getPlayerLevel() {
        return playerLevel;
    }

    public void setPlayerLevel(Integer playerLevel) {
        this.playerLevel = playerLevel;
    }

    public Integer getPlayerExperience() {
        return playerExperience;
    }

    public void setPlayerExperience(Integer playerExperience) {
        this.playerExperience = playerExperience;
    }

    public Integer getPlayerConstitution() {
        return playerConstitution;
    }

    public void setPlayerConstitution(Integer playerConstitution) {
        this.playerConstitution = playerConstitution;
    }

    public Integer getPlayerWisdom() {
        return playerWisdom;
    }

    public void setPlayerWisdom(Integer playerWisdom) {
        this.playerWisdom = playerWisdom;
    }

    public Item getPlayerHead() {
        return playerHead;
    }

    public void setPlayerHead(Item playerHead) {
        this.playerHead = playerHead;
    }

    public Item getPlayerBody() {
        return playerBody;
    }

    public void setPlayerBody(Item playerBody) {
        this.playerBody = playerBody;
    }

    public Item getPlayerLegs() {
        return playerLegs;
    }

    public void setPlayerLegs(Item playerLegs) {
        this.playerLegs = playerLegs;
    }

    public Item getPlayerShoes() {
        return playerShoes;
    }

    public void setPlayerShoes(Item playerShoes) {
        this.playerShoes = playerShoes;
    }

    public Item getPlayerHands() {
        return playerHands;
    }

    public void setPlayerHands(Item playerHands) {
        this.playerHands = playerHands;
    }

    public ArrayList<Item> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Item> inventory) {
        this.inventory = inventory;
    }

    public void addToInventory(Item item) {
        inventory.add(item);
    }

    public void removeFromInventory(Item item) {
        inventory.remove(item);
    }
}
