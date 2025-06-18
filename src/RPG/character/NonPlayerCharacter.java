package RPG.character;

import java.util.ArrayList;

/**
 * This class represents a character in the game
 */
public class NonPlayerCharacter {
    private String name;
    private String description;
    private ArrayList<Object> info;


    /**
     * Constructor for character object
     * Sets name and description of character
     * @param name Name of character
     * @param description Description about character
     */
    public NonPlayerCharacter(String name, String description) {
        setName(name);
        setDescription(description);
        setInfo(new ArrayList<>());
    }

    public NonPlayerCharacter(String name, String description, ArrayList<Object> info) {
        setName(name);
        setDescription(description);
        setInfo(info);
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Object> getInfo() {
        return info;
    }

    public void setInfo(ArrayList<Object> info) {
        this.info = info;
    }
}
