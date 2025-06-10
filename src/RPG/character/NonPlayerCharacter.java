package RPG.character;

/**
 * This class represents a character in the game
 */
public class NonPlayerCharacter {
    private String name;


    /**
     * Constructor for character object
     * Sets name of character
     * @param name Name of character
     */
    public NonPlayerCharacter(String name) {
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
