
public class RoomGenerationSimple
{
    private int tiles;
    private int doors;
    private String size;
    
    public RoomGenerationSimple(char size)
    {
        if(size == 's')
        {
            smallRoomSimple();
        }
        else if(size == 'm')
        {
            mediumRoomSimple();
        }
        else if(size == 'l')
        {
            largeRoomSimple();
        }
        else
        {
            System.out.println("Invalid room size.");
        }
    }
    
    public static char roomSize()
    {
        char size[] = {'s','s','m','m','m','l'};
        
        return size[(int) (Math.random() * 6)];
        
    }
    
    /*
     * Large Room will be from 8 - 11 tiles in size.
     * Number of Doors will be 2 - 4.
     * Number of monsters will be from 0 - 4.
     * Number of chests will be from 0 - 3.
     */
    // Generates a simple version of a large room
    public void largeRoomSimple()
    {
        int tiles[] = {8,9,10,11};
        int doors[] = {2,3,4};
        this.size = "large";
        this.tiles = tiles[(int) (Math.random() * 4 ) ];
        this.doors = doors[(int) (Math.random() * 3 ) ];
    }
    
    /*
     * Medium Room will be from 6 - 8 tiles in size.
     * Number of Doors will be 2 - 3.
     * Number of monsters will be from 0 - 3.
     * Number of chests will be from 0 - 2.
     */
 // Generates a simple version of a medium room
    public void mediumRoomSimple()
    {
        int tiles[] = {6,7,8};
        int doors[] = {2,3};
        this.size = "medium";
        this.tiles = tiles[(int) (Math.random() * 3 ) ];
        this.doors = doors[(int) (Math.random() * 2 ) ];
    }
    
    /*
     * Small Room will be from 3 - 6 tiles in size.
     * Number of Doors will be 2.
     * Number of monsters will be from 0 - 2.
     * Number of chests will be from 0 - 2.
     */
 // Generates a simple version of a small room
    public void smallRoomSimple()
    {
        int tiles[] = {3,4,5,6};
        int doors[] = {2};
        this.size = "small";
        this.tiles = tiles[(int) (Math.random() * 4 ) ];
        this.doors = doors[(int) (Math.random() * 1 ) ];
    }
    
    
    public String toString()
    {
        return "\nThis is a " + this.size + " room.\nThe room is " +
                this.tiles + " tiles.\nThere are " + this.doors + " doors in " +
                "the room.\n";
    }
}
