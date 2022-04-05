package Moves;

import ru.ifmo.se.pokemon.*;

public class Venoshock extends SpecialMove {
	public Venoshock () {
		super (Type.POISON,65,1.0); 
		}
	@Override 
	protected String describe () {
		return "Used Venoshock - Inflicts double damage if the target is poisoned"; 
		}
	@Override
	protected void applyOppDamage(Pokemon p, double damage) {
		if (p.getCondition().equals(Status.POISON) ) {
			p.setMod(Stat.HP, (int) Math.round(damage) * 2);
		}
		else {
			p.setMod(Stat.HP, (int) Math.round(damage) );
		}
	}
}
