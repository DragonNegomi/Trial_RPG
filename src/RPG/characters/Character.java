package RPG.characters;

/**
 * This class represents a character in the game
 */
public class Character {
    private String name;


    /**
     * Constructor for character object
     * Sets name of character
     * @param name Name of character
     */
    public Character(String name) {
        setName(name);
    }

    /**
     * Returns name of character
     * @return Name of character
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name of character
     * @param name Name of character
     */
    public void setName(String name) {
        this.name = name;
    }
}
