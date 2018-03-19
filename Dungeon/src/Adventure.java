import java.util.Scanner;

public class Adventure
{
    
    private static Scanner input = new Scanner(System.in);
    
    /**
     * Purpose: To randomly generate a room in the dungeon
     * @return Composition of the room.
     */
    public static RoomGeneration room()
    {
        RoomGeneration room = new RoomGeneration(RoomGeneration.roomSize());
        
        return room;
    }
    
    
    /**
     * Purpose: To quickly generate all rooms in the dungeon without contents
     * @return Size of room and doors.
     */
    public static RoomGenerationSimple roomS()
    {
        RoomGenerationSimple room = new RoomGenerationSimple(RoomGenerationSimple.roomSize());
        
        return room;
    }
    
    
    /**
     * Purpose: To randomly generate the size of the dungeon.
     * @return The number of rooms in the dungeon.
     */
    public static DungeonSize size()
    {
        DungeonSize size = new DungeonSize(DungeonSize.numbRooms());
        
        return size;
    }
    
    
    /**
     * Purpose: To determine if the object is locked or unlocked
     * @return the state of the lock
     */
    public static CheckLocks lock()
    {
        CheckLocks lock = new CheckLocks();
        
        return lock;
    }
    
    public static DiceRoller roll()
    {
        int sides;
        int numbDice;
        System.out.println("How many sides on the dice?");
        sides = input.nextInt();
        System.out.println("How many dice to roll?");
        numbDice = input.nextInt();
        DiceRoller roll = new DiceRoller(sides, numbDice);

        return roll;
    }
    
    /**
     * Purpose: Used to display the list of choices. Accepts user input to call
     * a method.
     */
    public static void choices()
    {
        char selection;
        do{
            System.out.println("-------------------------------------------------------------");
            System.out.println("What do you need to do?");
            System.out.println("Generate a dungeon. \t\t(g)");
            System.out.println("Generate a room. \t\t(r)");
            System.out.println("Generate room contents. \t(c)");
            //System.out.println("Generate treasure. \t\t(t)");
            System.out.println("Check if locked. \t\t(l)");
            System.out.println("Roll dice. \t\t\t(d)");
            System.out.println("Quit program. \t\t\t(q)");
            System.out.println("-------------------------------------------------------------");
            
            selection = input.next().toLowerCase().charAt(0);
            
            if (selection == 'g')
            {
                Adventure.genDungeon();
            }
            else if (selection == 'r')
            {
                Adventure.genRooms();
            }
            else if (selection == 'l')
            {
                System.out.println(Adventure.lock());
            }
            else if (selection == 'c')
            {
                contents();
            }
            else if (selection == 'd')
            {
                System.out.println(Adventure.roll());
            }
            else
            {
                System.out.println("Invalid selection.");
            }
            
            if (selection != 'q')
            {
                System.out.println("Press enter to return to menu.");
                input.nextLine();
                input.nextLine();
            }
            
            
        }while(selection != 'q');
        
    }
    
    
    /**
     * Purpose: Used to generate the dungeon size.
     */
    public static void genDungeon()
    {
        DungeonSize dungeonGen = size();
        
        System.out.println(dungeonGen);
    }
    
    
    /**
     * Purpose: Used to generate the rooms either one at a time or all at once.
     */
    public static void genRooms()
    {
        /*
         * Procedural will generate the entire room, including monsters
         * All rooms will allow rooms to be generated quickly without 
         * monsters or chests.
         */
        System.out.println("(p) for procedural, (a) for all rooms.");
        char roomS = input.next().toLowerCase().charAt(0);
        if( roomS == 'p')
        {
            System.out.println(room());
        }
        else if( roomS == 'a')
        {
            char next;
            do
            {
                System.out.println(roomS());
                System.out.println("Next room? (y) (n)");
                next = input.next().toLowerCase().charAt(0);
            }while(next == 'y');
        }
        
    }
    
    
    /**
     * Purpose: Used to generate the contents of a room for fully generated
     * dungeons.
     */
    public static void contents()
    {
        char size;
        System.out.println("What size of room have you entered?");
        System.out.println("Small\t\t\t(s)");
        System.out.println("Medium\t\t\t(m)");
        System.out.println("Large\t\t\t(l)");
        
        size = input.next().toLowerCase().charAt(0);
        
        FillRoom contents = new FillRoom(size);
        
        System.out.println(contents);
        
    }
    
    
    public static void main( String[] args )
    { 
        choices();
    }

}
