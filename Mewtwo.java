//Michael Odusanya
public class Mewtwo extends Pokemon 
{
  
  public Mewtwo(String n, double h, int p) 
  { 
    super(n, "Psychic", h, p);
    addAttack("Confusion");
    addAttack("Shadow ball");
    addAttack("Psychic");
    addAttack("Thunderbolt");
  }
  
  /**Attacks another pokemon
   *@param1 Pokemon other the pokemon being attacked
   *@param2 int choice the attack number the player chooses
   *@return none
   */
  public void attack(Pokemon other, int choice)
  {
    double atk1dmg=10;
    double atk2dmg=14;
    double atk3dmg=18; 
    double atk4dmg=20;
    if(other.getType().equals("Fighting") || other.getType().equals("Poison"))
    {
      atk1dmg *= 2;
      atk2dmg *= 2;
      atk3dmg *= 2;
      atk4dmg *= 2;
    }
    else if(other.getType().equals("Psychic"))
    {
      atk1dmg /= 2;
      atk2dmg /= 2;
      atk3dmg /= 2;
      atk4dmg /= 2;
    }
   
    if(choice==1)
    {
      if(getPP()>=1)
      {
        System.out.println(getName() + " used " + getAttackAt(0));
        other.setHP(other.getHP()-atk1dmg); 
        setPP(getPP()-1);
        if(other.getType().equals("Fighting") || other.getType().equals("Poison"))
        {
          System.out.println("It's super effective!");
        }
        else if(other.getType().equals("Psychic"))
        {
          System.out.println("It's not very effective...");
        }
      }
      else
      {
        System.out.println("Not enough PP for that move!");
      }
    }
    else if(choice==2)
    {
      if(getPP()>=2)
      {
        System.out.println(getName() + " used " + getAttackAt(1));
        other.setHP(other.getHP()-atk2dmg); 
        setPP(getPP()-2);
        if(other.getType().equals("Fighting") || other.getType().equals("Poison"))
        {
          System.out.println("It's super effective!");
        }
        else if(other.getType().equals("Psychic"))
        {
          System.out.println("It's not very effective...");
        }
      }
      else
      {
        System.out.println("Not enough PP for that move!");
      }
    }
    else if(choice==3)
    {
      if(getPP()>=3)
      {
        System.out.println(getName() + " used " + getAttackAt(2));
        other.setHP(other.getHP()-atk3dmg); 
        setPP(getPP()-3);
        if(other.getType().equals("Fighting") || other.getType().equals("Poison"))
        {
          System.out.println("It's super effective!");
        }
        else if(other.getType().equals("Psychic"))
        {
          System.out.println("It's not very effective...");
        }
      }
      else
      {
        System.out.println("Not enough PP for that move!");
      }
    }
    else if(choice==4)
    {
      if(getPP()>=4)
      {
        System.out.println(getName() + " used " + getAttackAt(3));
        other.setHP(other.getHP()-atk4dmg); 
        setPP(getPP()-4);
        if(other.getType().equals("Fighting") || other.getType().equals("Poison"))
        {
          System.out.println("It's super effective!");
        }
        else if(other.getType().equals("Psychic"))
        {
          System.out.println("It's not very effective...");
        }
      }
      else
      {
        System.out.println("Not enough PP for that move!");
      }
    }
    else
    {
      System.out.println("There are only four attacks my guy"); 
    }
    if(getPP()<=0)
    {
      System.out.println(getName() + " has no PP left!");
      System.out.println(getName() + " used Struggle!");
      other.setHP(other.getHP()-30);
      setHP(getHP()-20);
    }
  }
  
  /**Prints a phrase that the pokemon says
   *@param none
   *@return none
   */
  public void speak()
  {
    System.out.println("MEWTWO!!!!");
  }
  
}
