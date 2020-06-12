//Michael Odusanya
public class Elixr implements Item 
{
  private String name;
  private int count;
  public Elixr(String n) 
  { 
    name=n;
    count=1;
  }
  /**Returns the items name
   *@param none
   *@return String name with value of items name
   */
  public String getName()
  {
    return name;
  }
  /**Item is used on a Pokemon
   *@param Pokemon p the pokemon that the item is being used on
   *@return none
   */
  public void use(Pokemon p)
  {
    if(count>0)
    {
      System.out.println("A " + name + " was used on " + p.getName()+"!");
      p.setHP(p.getPP()+10);
      System.out.println(p.getName()+"'s PP increased by 10 points!");
      count--;
    }
    else
    {
      System.out.println("There are no more " + name + "s!");
    }
  }
  
}
