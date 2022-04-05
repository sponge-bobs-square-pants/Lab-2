package Moves;

import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove 
{
	public Facade () {
		super(Type.NORMAL,70,1.0);
	}
	@Override 
	protected String describe () {
		return "Used Facade - Hits with double power if the user is burned, poisoned or paralyzed";
	}
	@Override
	protected void applySelfEffects (Pokemon p) {
		if (p.getCondition().equals(Status.BURN) || p.getCondition().equals(Status.PARALYZE) || p.getCondition().equals(Status.POISON) ) {
			this.power = 140 ;
		}
		else {
			this.power = 70 ;
		}
	}
}
