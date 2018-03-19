
public class CheckLocks
{
    public String lock;
    
    
    public CheckLocks()
    {
        if(isLocked())
        {
            this.lock = "It is locked.";
        }
        else
        {
            this.lock = "It is unlocked.";
        }
    }
    /*
     * Determines if chest or door is locked. 33% chance of being locked
     */
    public boolean isLocked()
    {
        int locked = (int)(Math.random() * 100 + 1);
        
        if( locked > 33)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    
    public String toString()
    {
        return "\n" + lock + "\n";
    }
}
