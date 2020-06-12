//Michael Odusanya
public abstract class Player 
{
  protected Pokemon poke;
  protected Item item;
  public Player(Pokemon p, Item i) 
  { 
    poke=p;
    item=i;
  }
  /**Access the pokemon the player owns
   *@param none
   *@return the players pokemon
   */
  public abstract Pokemon getPokemon();
  /**Access the item the player owns
   *@param none
   *@return the players item
   */
  public abstract Item getItem();
  /**Run away from battle
   *@param none
   *@return none
   */
  public abstract void run();
}
