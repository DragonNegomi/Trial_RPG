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
    private Integer playerBaseStrength;
    private Integer playerBaseDexterity;
    private Integer playerBaseConstitution;
    private Integer playerBaseIntelligence;
    private Integer playerBaseWisdom;
    private Integer playerBaseCharisma;
    private Integer playerExtraStrength;
    private Integer playerExtraDexterity;
    private Integer playerExtraConstitution;
    private Integer playerExtraIntelligence;
    private Integer playerExtraWisdom;
    private Integer playerExtraCharisma;
    private Item playerHead;
    private Item playerChest;
    private Item playerLegs;
    private Item playerFeet;
    private Item playerHands;
    private ArrayList<Item> inventory;


    // All passed in bar inventory
    public Player(String playerName, String playerRace, String playerClass, Integer playerLevel, Integer playerExperience, Integer playerHealth, Integer playerMoney, Integer playerBaseStrength, Integer playerBaseDexterity, Integer playerBaseConstitution, Integer playerBaseIntelligence, Integer playerBaseWisdom, Integer playerBaseCharisma, Item playerHead, Item playerChest, Item playerLegs, Item playerFeet, Item playerHands) {
        setPlayerName(playerName);
        setPlayerRace(playerRace);
        setPlayerClass(playerClass);
        setPlayerLevel(playerLevel);
        setPlayerExperience(playerExperience);
        setPlayerHealth(playerHealth);
        setPlayerMoney(playerMoney);
        setPlayerBaseStrength(playerBaseStrength);
        setPlayerBaseDexterity(playerBaseDexterity);
        setPlayerBaseConstitution(playerBaseConstitution);
        setPlayerBaseIntelligence(playerBaseIntelligence);
        setPlayerBaseWisdom(playerBaseWisdom);
        setPlayerBaseCharisma(playerBaseCharisma);
        setPlayerExtraStrength(0);
        setPlayerExtraDexterity(0);
        setPlayerExtraConstitution(0);
        setPlayerExtraIntelligence(0);
        setPlayerExtraWisdom(0);
        setPlayerExtraCharisma(0);
        setPlayerHead(playerHead);
        setPlayerChest(playerChest);
        setPlayerLegs(playerLegs);
        setPlayerFeet(playerFeet);
        setPlayerHands(playerHands);
        inventory = new ArrayList<>();
    }

    public Player(String playerName, String playerRace, String playerClass, Integer playerBaseStrength, Integer playerBaseDexterity, Integer playerBaseConstitution, Integer playerBaseIntelligence, Integer playerBaseWisdom, Integer playerBaseCharisma) {
        setPlayerName(playerName);
        setPlayerRace(playerRace);
        setPlayerClass(playerClass);
        setPlayerLevel(1);
        setPlayerExperience(0);
        setPlayerHealth(10);
        setPlayerMoney(0);
        setPlayerBaseStrength(playerBaseStrength);
        setPlayerBaseDexterity(playerBaseDexterity);
        setPlayerBaseConstitution(playerBaseConstitution);
        setPlayerBaseIntelligence(playerBaseIntelligence);
        setPlayerBaseWisdom(playerBaseWisdom);
        setPlayerBaseCharisma(playerBaseCharisma);
        setPlayerExtraStrength(0);
        setPlayerExtraDexterity(0);
        setPlayerExtraConstitution(0);
        setPlayerExtraIntelligence(0);
        setPlayerExtraWisdom(0);
        setPlayerExtraCharisma(0);
        Item empty = new Item("None", "");
        setPlayerHead(empty);
        setPlayerChest(empty);
        setPlayerLegs(empty);
        setPlayerFeet(empty);
        setPlayerHands(empty);
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
        setPlayerBaseStrength(0);
        setPlayerBaseDexterity(0);
        setPlayerBaseConstitution(0);
        setPlayerBaseIntelligence(0);
        setPlayerBaseWisdom(0);
        setPlayerBaseCharisma(0);
        setPlayerExtraStrength(0);
        setPlayerExtraDexterity(0);
        setPlayerExtraConstitution(0);
        setPlayerExtraIntelligence(0);
        setPlayerExtraWisdom(0);
        setPlayerExtraCharisma(0);
        setPlayerHead(null);
        setPlayerChest(null);
        setPlayerLegs(null);
        setPlayerFeet(null);
        setPlayerHands(null);
        setInventory(new ArrayList<>());
    }



    // Getters and setters


    // Base player info

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

    public Integer getPlayerHealth() {
        return playerHealth;
    }
    public void setPlayerHealth(Integer playerHealth) {
        this.playerHealth = playerHealth;
    }

    public Integer getPlayerMoney() {
        return playerMoney;
    }
    public void setPlayerMoney(Integer playerMoney) {
        this.playerMoney = playerMoney;
    }


    // Base stat values

    public Integer getPlayerBaseStrength() {
        return playerBaseStrength;
    }
    public void setPlayerBaseStrength(Integer playerBaseStrength) {
        this.playerBaseStrength = playerBaseStrength;
    }

    public Integer getPlayerBaseDexterity() {
        return playerBaseDexterity;
    }
    public void setPlayerBaseDexterity(Integer playerBaseDexterity) {
        this.playerBaseDexterity = playerBaseDexterity;
    }

    public Integer getPlayerBaseConstitution() {
        return playerBaseConstitution;
    }
    public void setPlayerBaseConstitution(Integer playerBaseConstitution) {
        this.playerBaseConstitution = playerBaseConstitution;
    }

    public Integer getPlayerBaseIntelligence() {
        return playerBaseIntelligence;
    }
    public void setPlayerBaseIntelligence(Integer playerBaseIntelligence) {
        this.playerBaseIntelligence = playerBaseIntelligence;
    }

    public Integer getPlayerBaseWisdom() {
        return playerBaseWisdom;
    }
    public void setPlayerBaseWisdom(Integer playerBaseWisdom) {
        this.playerBaseWisdom = playerBaseWisdom;
    }

    public Integer getPlayerBaseCharisma() {
        return playerBaseCharisma;
    }
    public void setPlayerBaseCharisma(Integer playerBaseCharisma) {
        this.playerBaseCharisma = playerBaseCharisma;
    }


    // Extra stat values including string form

    public Integer getPlayerExtraStrength() {
        return playerExtraStrength;
    }
    public String getPlayerExtraStrengthString() {
        if (getPlayerExtraStrength() >= 0) {
            return "+" + getPlayerExtraStrength();
        }
        else {
            return getPlayerExtraStrength().toString();
        }
    }
    public void setPlayerExtraStrength(Integer playerExtraStrength) {
        this.playerExtraStrength = playerExtraStrength;
    }

    public Integer getPlayerExtraDexterity() {
        return playerExtraDexterity;
    }
    public String getPlayerExtraDexterityString() {
        if (getPlayerExtraDexterity() >= 0) {
            return "+" + getPlayerExtraDexterity();
        }
        else {
            return getPlayerExtraDexterity().toString();
        }
    }
    public void setPlayerExtraDexterity(Integer playerExtraDexterity) {
        this.playerExtraDexterity = playerExtraDexterity;
    }

    public Integer getPlayerExtraConstitution() {
        return playerExtraConstitution;
    }
    public String getPlayerExtraConstitutionString() {
        if (getPlayerExtraConstitution() >= 0) {
            return "+" + getPlayerExtraConstitution();
        }
        else {
            return getPlayerExtraConstitution().toString();
        }
    }
    public void setPlayerExtraConstitution(Integer playerExtraConstitution) {
        this.playerExtraConstitution = playerExtraConstitution;
    }

    public Integer getPlayerExtraIntelligence() {
        return playerExtraIntelligence;
    }
    public String getPlayerExtraIntelligenceString() {
        if (getPlayerExtraIntelligence() >= 0) {
            return "+" + getPlayerExtraIntelligence();
        }
        else {
            return getPlayerExtraIntelligence().toString();
        }
    }
    public void setPlayerExtraIntelligence(Integer playerExtraIntelligence) {
        this.playerExtraIntelligence = playerExtraIntelligence;
    }

    public Integer getPlayerExtraWisdom() {
        return playerExtraWisdom;
    }
    public String getPlayerExtraWisdomString() {
        if (getPlayerExtraWisdom() >= 0) {
            return "+" + getPlayerExtraWisdom();
        }
        else {
            return getPlayerExtraWisdom().toString();
        }
    }
    public void setPlayerExtraWisdom(Integer playerExtraWisdom) {
        this.playerExtraWisdom = playerExtraWisdom;
    }

    public Integer getPlayerExtraCharisma() {
        return playerExtraCharisma;
    }
    public String getPlayerExtraCharismaString() {
        if (getPlayerExtraCharisma() >= 0) {
            return "+" + getPlayerExtraCharisma();
        }
        else {
            return getPlayerExtraCharisma().toString();
        }
    }
    public void setPlayerExtraCharisma(Integer playerExtraCharisma) {
        this.playerExtraCharisma = playerExtraCharisma;
    }


    // Actual stat values (getters only)

    public Integer getPlayerActualStrength() {
        return playerBaseStrength + playerExtraStrength;
    }
    public Integer getPlayerActualDexterity() {
        return playerBaseDexterity + playerExtraDexterity;
    }
    public Integer getPlayerActualConstitution() {
        return playerBaseConstitution + playerExtraConstitution;
    }
    public Integer getPlayerActualIntelligence() {
        return playerBaseIntelligence + playerExtraIntelligence;
    }
    public Integer getPlayerActualWisdom() {
        return playerBaseWisdom + playerExtraWisdom;
    }
    public Integer getPlayerActualCharisma() {
        return playerBaseCharisma + playerExtraCharisma;
    }


    // Equipped items

    public Item getPlayerHead() {
        return playerHead;
    }

    public void setPlayerHead(Item playerHead) {
        this.playerHead = playerHead;
    }

    public Item getPlayerChest() {
        return playerChest;
    }

    public void setPlayerChest(Item playerChest) {
        this.playerChest = playerChest;
    }

    public Item getPlayerLegs() {
        return playerLegs;
    }

    public void setPlayerLegs(Item playerLegs) {
        this.playerLegs = playerLegs;
    }

    public Item getPlayerFeet() {
        return playerFeet;
    }

    public void setPlayerFeet(Item playerFeet) {
        this.playerFeet = playerFeet;
    }

    public Item getPlayerHands() {
        return playerHands;
    }

    public void setPlayerHands(Item playerHands) {
        this.playerHands = playerHands;
    }


    // Inventory including add and remove methods

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
