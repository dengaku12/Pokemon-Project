//Michael Odusanya
public class PokemonRunner 
{
  public static void main(String[] args) 
  { 
    Mewtwo m1 = new Mewtwo("Mewtwo", 150, 50);
    Lucario luca = new Lucario("Lucario" , 100, 30);
    SuperPotion sp = new SuperPotion("Super Potion");
    Elixr ex = new Elixr("Elixr");
    HumanPlayer me = new HumanPlayer(m1, ex);
    ComputerPlayer them = new ComputerPlayer(luca, sp);
    while(m1.getHP()>0||luca.getHP()>0)
    {
      System.out.println(m1 + "\n" + luca);
      System.out.println("");
      System.out.println("1.Fight\t2.Item\n3.Run");
      menu(me, them);
      System.out.println("");
      if(them.getPokemon().getHP()<=0)
      {
        break;
      }
      otherMenu(them,me);
      System.out.println("");
    }
    if(them.getPokemon().getHP()<=0)
    {
      them.getPokemon().speak();
      System.out.println(them.getPokemon().getName() + " is unable to battle!");
      System.out.println(me.getPokemon().getName() + " is the winner!");
    }
    else
    {
      me.getPokemon().speak();
      System.out.println(me.getPokemon().getName() + " is unable to battle!");
      System.out.println(them.getPokemon().getName() + " is the winner!");
    }
  } 
  
  /**Allows the user to choose their battle options (fight, item, run)
    *@param1 HumanPlayer hp the user 
    *@param2 Player other the player that the user is battling
    *@return none
    */
  public static void menu(HumanPlayer hp, Player other)
  {
    int choice = hp.choose();
    if(choice==1)
    {
      hp.getPokemon().displayAttacks();
      hp.getPokemon().attack(other.getPokemon(),hp.choose());
    }
    else if(choice==2)
    {
      hp.getItem().use(hp.getPokemon());
    }
    else if(choice==3)
    {
      hp.run();
    }
    else
    {
      System.out.println("That is not a valid choice");
    }
  }
  
  /**Allows the computer to randomly choose their battle options (fight, item, run)
    *@param1 HumanPlayer hp the user 
    *@param2 Player other the player that the computer is battling
    *@return none
    */
  public static void otherMenu(ComputerPlayer cp, Player other)
  {
    int choice = cp.choose(1,3);
    if(choice==1)
    {
      cp.getPokemon().attack(other.getPokemon(),cp.choose(1,4));
    }
    else if(choice==2)
    {
      cp.getItem().use(cp.getPokemon());
    }
    else if(choice==3)
    {
      cp.run();
    }
    else
    {
      System.out.println("That is not a valid choice");
    }
  }

}
