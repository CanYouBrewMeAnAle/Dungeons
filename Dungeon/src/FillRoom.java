//This class is to fill rooms in a fully generated dungeon. Not used for procedural
public class FillRoom
{
    private int monsters;
    private int chests;
    private String size;
    
    public FillRoom(char size)
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
    
    
    /*
     * Number of monsters will be from 0 - 4.
     * Number of chests will be from 0 - 3.
     */
    public void largeRoom()
    {
        int monsters[] = {0,1,2,3,4};
        int chests[] = {0,1,2,3};
        this.size = "large";
        this.monsters = monsters[(int) (Math.random() * 5 ) ];
        this.chests = chests[(int) (Math.random() * 4 ) ];
    }
    
    
    /*
     * Number of monsters will be from 0 - 3.
     * Number of chests will be from 0 - 2.
     */
    public void mediumRoom()
    {
        int monsters[] = {0,1,2,3};
        int chests[] = {0,1,2};
        this.size = "medium";
        this.monsters = monsters[(int) (Math.random() * 4 ) ];
        this.chests = chests[(int) (Math.random() * 3 ) ];
    }
    
    
    /*
     * Number of monsters will be from 0 - 2.
     * Number of chests will be from 0 - 2.
     */
    public void smallRoom()
    {
        int monsters[] = {0,1,2};
        int chests[] = {0,1,2};
        this.size = "small";
        this.monsters = monsters[(int) (Math.random() * 3 ) ];
        this.chests = chests[(int) (Math.random() * 3 ) ];
    }
    
    public String toString()
    {
        return "\nThe room contains " + this.monsters + " monster(s)."
                + "\nThere are " +this.chests + " chest(s) in the room.\n";
    }

}
