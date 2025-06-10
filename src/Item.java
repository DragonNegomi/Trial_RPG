/**
 * This class represents an item in the game
 */
public class Item {
    private String name;
    private String description;


    /**
     * Constructor for item object
     * @param name Name of item
     * @param description Detail about the item
     */
    public Item(String name, String description) {
        setName(name);
        setDescription(description);
    }

    /**
     * Returns the items name
     * @return Name of item
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the items description
     * @return Detail about the item
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the items name
     * @param name Name of item
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the items description
     * @param description Detail about the item
     */
    public void setDescription(String description) {
        this.description = description;
    }
}
