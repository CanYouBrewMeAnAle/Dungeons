
public class DungeonSize
{
    private int rooms;
    private String dungeonSize;
    
    public DungeonSize(char size)
    {
        if(size == 's')
        {
            smallDungeon();
        }
        else if(size == 'm')
        {
            mediumDungeon();
        }
        else if(size == 'l')
        {
            largeDungeon();
        }
        else
        {
            System.out.println("Invalid room size.");
        }
    }
    
    public static char numbRooms()
    {
        char size[] = {'s','s','m','m','m','l'};
        
        return size[(int) (Math.random() * 6)];
        
    }
    
    /*
     * Large Dungeons will contain 25 - 35 rooms.
     */
    public void largeDungeon()
    {
        int rooms[] = {25,26,27,28,29,30,31,32,33,34,35};
        this.dungeonSize = "large dungeon";
        this.rooms = rooms[(int)(Math.random() * 11)];
    }
    
    /*
     * Medium Dungeons will contain 20 - 25 rooms.
     */
    public void mediumDungeon()
    {
        int rooms[] = {20,21,22,23,24,25};
        this.dungeonSize = "medium dungeon";
        this.rooms = rooms[(int)(Math.random() * 6)];
    }
    
    /*
     * Medium Dungeons will contain 10 - 20 rooms.
     */
    public void smallDungeon()
    {
        int rooms[] = {10,11,12,13,14,15,16,17,18,19,20};
        this.dungeonSize = "small dungeon";
        this.rooms = rooms[(int)(Math.random() * 11)];
    }
    
    
    public String toString()
    {
        return "\nYou have entered a " + this.dungeonSize + ".\nThere are " +
                this.rooms + " rooms in the dungeon.\n";
    }
}
