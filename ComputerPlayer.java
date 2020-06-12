//Michael Odusanya
public class ComputerPlayer extends Player 
{ 
  public ComputerPlayer(Pokemon p, Item i) 
  { 
    super(p,i);
  }
  
  /**Access the pokemon the player owns
   *@param none
   *@return the players pokemon
   */
  public Pokemon getPokemon()
  {
    return poke;
  }
  
  /**Access the item the player owns
   *@param none
   *@return the players item
   */
  public Item getItem()
  {
    return item;
  }
  
  /**Run away from battle
   *@param none
   *@return none
   */
  public void run()
  {
    System.out.println("Your opponent tried to run away, but they failed!!");
  }
  
  /**Computer makes a random decision
   *@param1 int min the minimum random number
   *@param2 int max the maximum random number
   *@return an int representing the decision
   */
  public int choose(int min, int max)
  {
    int choice = (int)(Math.random()*max-min)+min;
    return choice;
  }
  
}
