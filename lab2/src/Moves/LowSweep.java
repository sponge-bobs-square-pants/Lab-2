package Moves;
import ru.ifmo.se.pokemon.*;

public class LowSweep extends PhysicalMove{
  

  public Bulldoze(){
    super(Type.FIGHT, 65.00d, 100.00d);
    describe();
  }

   
  protected void applyOppEffects(Pokemon p) {
    p.setMod(Stat.SPEED, -1);
  }


}