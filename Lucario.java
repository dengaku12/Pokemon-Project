//Michael Odusanya
public class Lucario extends Pokemon
{
  
  public Lucario(String n, double h, int p) 
  { 
    super(n, "Fighting", h, p);
    addAttack("Double Kick");
    addAttack("Extreme Speed");
    addAttack("Aura Sphere");
    addAttack("Close Combat");
  }
  
  /**Attacks another pokemon
   *@param1 Pokemon other the pokemon being attacked
   *@param2 int choice the attack number the player chooses
   *@return none
   */
  public void attack(Pokemon other, int choice)
  {
    double atk1dmg=15;
    double atk2dmg=25;
    double atk3dmg=34; 
    double atk4dmg=40;
    if(other.getType().equals("Ice")||other.getType().equals("Normal")||other.getType().equals("Rock"))
    {
      atk1dmg *= 2;
      atk2dmg *= 2;
      atk3dmg *= 2;
      atk4dmg *= 2;
    }
    else if(other.getType().equals("Psychic")||other.getType().equals("Flying"))
    {
      atk1dmg /= 2;
      atk2dmg /= 2;
      atk3dmg /= 2;
      atk4dmg /= 2;
    }
    else if(other.getType().equals("Ghost"))
    {
      atk1dmg = 0;
      atk2dmg = 0;
      atk3dmg = 0;
      atk4dmg = 0;
    }
    
    if(choice==1)
    {
      if(getPP()>=1)
      {
        System.out.println(getName() + " used " + getAttackAt(0));
        other.setHP(other.getHP()-atk1dmg); 
        setPP(getPP()-1);
        if(other.getType().equals("Ice")||other.getType().equals("Normal")||other.getType().equals("Rock"))
        {
          System.out.println("It's super effective!");
        }
        else if(other.getType().equals("Psychic")||other.getType().equals("Flying"))
        {
          System.out.println("It's not very effective...");
        }
        else if(other.getType().equals("Ghost"))
        {
          System.out.println("It had no effect...");
        }
      }
      else
      {
        System.out.println("Not enough PP for that move!");
      }
    }
    else if(choice==2)
    {
      if(getPP()>=5)
      {
        System.out.println(getName() + " used " + getAttackAt(1));
        other.setHP(other.getHP()-atk2dmg); 
        setPP(getPP()-2);
        if(other.getType().equals("Ice")||other.getType().equals("Normal")||other.getType().equals("Rock"))
        {
          System.out.println("It's super effective!");
        }
        else if(other.getType().equals("Psychic")||other.getType().equals("Flying"))
        {
          System.out.println("It's not very effective...");
        }
        else if(other.getType().equals("Ghost"))
        {
          System.out.println("It had no effect...");
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
        if(other.getType().equals("Ice")||other.getType().equals("Normal")||other.getType().equals("Rock"))
        {
          System.out.println("It's super effective!");
        }
        else if(other.getType().equals("Psychic")||other.getType().equals("Flying"))
        {
          System.out.println("It's not very effective...");
        }
        else if(other.getType().equals("Ghost"))
        {
          System.out.println("It had no effect...");
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
        if(other.getType().equals("Ice")||other.getType().equals("Normal")||other.getType().equals("Rock"))
        {
          System.out.println("It's super effective!");
        }
        else if(other.getType().equals("Psychic")||other.getType().equals("Flying"))
        {
          System.out.println("It's not very effective...");
        }
        else if(other.getType().equals("Ghost"))
        {
          System.out.println("It had no effect...");
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
    System.out.println("LUCARIO!!!!");
  }
}
