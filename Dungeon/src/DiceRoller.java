
public class DiceRoller
{
    private int sides;
    private int numbDice;
    public int roll[];
    public String result;
    
    
    /**
     * Constructor for the DiceRoller class.
     * @param sides
     * @param numbDice
     */
    public DiceRoller(int sides, int numbDice)
    {
        this.sides = sides;
        this.numbDice = numbDice;
        this.roll = new int [numbDice];
        roll();
    }
    
    
    /**
     * Constructor for the DiceRoller class.
     * @param numbDice
     */
    public DiceRoller(int numbDice)
    {
        this.numbDice = numbDice;
        this.sides = 6;
        this.roll = new int [numbDice];
        roll();
    }
    
    
    /**
     * Constructor for the DiceRoller class.
     */
    public DiceRoller()
    {
        this.numbDice = 1;
        this.sides = 6;
        this.roll = new int [numbDice];
        roll();
    }
    
    
    /**
     * Purpose: Rolls the dice
     */
    public void roll()
    {
        for ( int i = 0; i < numbDice; i++)
        {
            this.roll[i] = (int) (Math.random() * sides + 1 );
        }
    }
    
    
    /**
     * prints the results of the rolls in a list that is easy to read
     */
    public String toString()
    {
        this.result = "\nYou have rolled " + this.numbDice + " " + this.sides + "-sided dice.";
        for (int i = 0; i < this.numbDice; i++)
        {
            this.result += "\n" + (i +1) + ". \t" + this.roll[i];
        }
        
        if (this.numbDice <= 0)
        {
            result = "You did not roll any dice.";
        }
        else if(this.numbDice >= 50)
        {
            result = "Too many dice, you'll just make a mess of things.";
        }
        
        return this.result;
    }
    
    
}
