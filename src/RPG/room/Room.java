package RPG.room;

import RPG.character.NonPlayerCharacter;
import RPG.item.Item;

import java.util.ArrayList;

/**
 * This class is used to represent a room in the game
 *
 * Each room can contain items and characters
 */
public class Room {
    private String name;
    private String description;
    private ArrayList<String> info;
    private ArrayList<NonPlayerCharacter> characters;
    private ArrayList<Item> items;
    private Room north;
    private Room west;
    private Room south;
    private Room east;


    /**
     * Constructor for room object
     * @param name Name of the room e.g. Kitchen
     */
    public Room(String name) {
        setName(name);
    }

    public Room(String name, String description, ArrayList<NonPlayerCharacter> characters, ArrayList<Item> items, Room north, Room west, Room south, Room east) {
        setName(name);
        setDescription(description);
        setInfo(new ArrayList<>());
        setCharacters(characters);
        setItems(items);
        setNorth(north);
        setWest(west);
        setSouth(south);
        setEast(east);
    }

    public Room(String name, String description) {
        setName(name);
        setDescription(description);
        setInfo(new ArrayList<>());
        setCharacters(new ArrayList<>());
        setItems(new ArrayList<>());
        setNorth(null);
        setWest(null);
        setSouth(null);
        setEast(null);
    }

    public Room(String name, String description, Room north, Room west, Room south, Room east) {
        setName(name);
        setDescription(description);
        setInfo(new ArrayList<>());
        setCharacters(new ArrayList<>());
        setItems(new ArrayList<>());
        setNorth(north);
        setWest(west);
        setSouth(south);
        setEast(east);
    }


    // Getters and setters


    /**
     * Returns the name of the room
     * @return Name of the room
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the room
     * @param name Name of the room
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

    public ArrayList<String> getInfo() {
        return info;
    }

    public void setInfo(ArrayList<String> info) {
        this.info = info;
    }

    public ArrayList<NonPlayerCharacter> getCharacters() {
        return characters;
    }

    public void setCharacters(ArrayList<NonPlayerCharacter> characters) {
        this.characters = characters;
    }

    public void addCharacter(NonPlayerCharacter character) {
        this.characters.add(character);
    }

    public void removeCharacter(NonPlayerCharacter character) {
        this.characters.remove(character);
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void removeItem(Item item) {
        this.items.remove(item);
    }

    public Room getNorth() {
        return north;
    }

    public void setNorth(Room north) {
        this.north = north;
    }

    public Room getWest() {
        return west;
    }

    public void setWest(Room west) {
        this.west = west;
    }

    public Room getSouth() {
        return south;
    }

    public void setSouth(Room south) {
        this.south = south;
    }

    public Room getEast() {
        return east;
    }

    public void setEast(Room east) {
        this.east = east;
    }
}
