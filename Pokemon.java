//Michael Odusanya
import java.util.ArrayList;
public abstract class Pokemon 
{
  private String name;
  private String type;
  private double hp;
  private int pp;
  private ArrayList<String> attacks;
  public Pokemon(String n, String t, double h, int p) 
  { 
    name=n;
    type=t;
    hp=h;
    pp=p;
    attacks=new ArrayList<String>(4);
  }
  /**Returns the pokemons name
   *@param none
   *@return String name with value of Pokemons name
   */
  public String getName()
  {
    return name;
  }
  
  /**Returns the pokemons type
   *@param none
   *@return String type with value of Pokemons type
   */
  public String getType()
  {
    return type;
  }
  
  /**Returns the pokemons hp
   *@param none
   *@return double hp with value of Pokemons health points
   */
  public double getHP()
  {
    return hp;
  }
  
  /**Changes the pokemons hp value
   *@param double h that will become the new hp value
   *@return none
   */
  public void setHP(double h)
  {
    hp=h;
  }
  
  /**Returns the pokemons pp
   *@param none
   *@return int pp with value of Pokemons power points
   */
  public int getPP()
  {
    return pp;
  }
  
  /**Changes the pokemons pp value
   *@param int p that will become the new pp value
   *@return none
   */
  public void setPP(int p)
  {
    pp=p;
  }
  
  /**Returns an attack at a specific index
   *@param int index the index of the attack in ArrayList attacks
   *@return String the attack at the specified index
   */
  public String getAttackAt(int index)
  {
    return attacks.get(index);
  }
  
  /**Adds an attack to the pokemons list of attacks
   *@param String at that will be added to the list
   *@return none
   */
  public void addAttack(String at)
  {
    attacks.add(at);
  }
  
  /**Prints the pokemons attacks
   *@param none
   *@return none
   */
  public void displayAttacks()
  {
    System.out.println("1." + attacks.get(0) + "\t2." + attacks.get(1));
    System.out.println("3." + attacks.get(2) + "\t4." + attacks.get(3));
  }
  
  public String toString()
  {
    return name + " HP: " + Double.toString(hp) + " PP: " + Integer.toString(pp);
  }
  
  /**Attacks another pokemon
   *@param1 Pokemon other the pokemon being attacked
   *@param2 int choice the attack number the player chooses
   *@return none
   */
  public abstract void attack(Pokemon other, int choice);
  
  /**Prints a phrase that the pokemon says
   *@param none
   *@return none
   */
  public abstract void speak();
}
