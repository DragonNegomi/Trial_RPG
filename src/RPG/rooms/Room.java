package RPG.rooms;

import java.util.ArrayList;

/**
 * This class is used to represent a room in the game
 *
 * Each room can contain items and characters
 */
public class Room {
    private String name;
    private ArrayList<Room> rooms;


    /**
     * Constructor for room object
     * @param name Name of the room e.g. Kitchen
     */
    public Room(String name) {
        setName(name);
    }

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
}
