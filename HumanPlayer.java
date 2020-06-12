//Michael Odusanya
import java.util.Scanner;
public class HumanPlayer extends Player 
{
  public HumanPlayer(Pokemon p, Item i) 
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
    System.out.println("You cant run away from a trainer battle!!");
  }
  
  /**User makes a decision
   *@param none
   *@return an int representing the decision
   */
  public int choose()
  {
    Scanner inp = new Scanner(System.in);
    System.out.println("Enter a number to make a decision:");
    int choice = inp.nextInt();
    inp.close();
    return choice;
  }
  
}
