
public class RoomGeneration
{
    private int tiles;
    private int doors;
    private int monsters;
    private int chests;
    private String size;
    
    public RoomGeneration(char size)
    {
        if(size == 's')
        {
            smallRoom();
        }
        else if(size == 'm')
        {
            mediumRoom();
        }
        else if(size == 'l')
        {
            largeRoom();
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
    public void largeRoom()
    {
        int tiles[] = {8,9,10,11};
        int doors[] = {2,3,4};
        int monsters[] = {0,1,2,3,4};
        int chests[] = {0,1,2,3};
        this.size = "large";
        this.tiles = tiles[(int) (Math.random() * 4 ) ];
        this.doors = doors[(int) (Math.random() * 3 ) ];
        this.monsters = monsters[(int) (Math.random() * 5 ) ];
        this.chests = chests[(int) (Math.random() * 4 ) ];
    }
    
    
    /*
     * Medium Room will be from 6 - 8 tiles in size.
     * Number of Doors will be 2 - 3.
     * Number of monsters will be from 0 - 3.
     * Number of chests will be from 0 - 2.
     */
    public void mediumRoom()
    {
        int tiles[] = {6,7,8};
        int doors[] = {2,3};
        int monsters[] = {0,1,2,3};
        int chests[] = {0,1,2};
        this.size = "medium";
        this.tiles = tiles[(int) (Math.random() * 3 ) ];
        this.doors = doors[(int) (Math.random() * 2 ) ];
        this.monsters = monsters[(int) (Math.random() * 4 ) ];
        this.chests = chests[(int) (Math.random() * 3 ) ];
    }
    
    
    /*
     * Small Room will be from 3 - 6 tiles in size.
     * Number of Doors will be 2.
     * Number of monsters will be from 0 - 2.
     * Number of chests will be from 0 - 2.
     */
    public void smallRoom()
    {
        int tiles[] = {3,4,5,6};
        int doors[] = {2};
        int monsters[] = {0,1,2};
        int chests[] = {0,1,2};
        this.size = "small";
        this.tiles = tiles[(int) (Math.random() * 4 ) ];
        this.doors = doors[(int) (Math.random() * 1 ) ];
        this.monsters = monsters[(int) (Math.random() * 3 ) ];
        this.chests = chests[(int) (Math.random() * 3 ) ];
    }
    


    
    public String toString()
    {
        return "\nYou have entered a " + this.size + " room.\nThe room is " +
                this.tiles + " tiles.\nThere are " + this.doors + " doors in " +
                "the room.\nThere are " + this.monsters + " monster(s) in the"
                + " room.\nThere are " +this.chests + " chest(s) in the room.\n";
    }
}
