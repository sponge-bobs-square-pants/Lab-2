package Moves;

import ru.ifmo.se.pokemon.*;

public class LeafStorm extends SpecialMove {
	int statSpAttDec = 0 ;
	public LeafStorm () {
		super(Type.GRASS,130,0.9);
	}
	@Override
    protected String describe () {
    	return "Used Leaf Storm - Lowers the user's Special Attack by two stages";
    }
	@Override 
    protected void applySelfEffects(Pokemon p) {
		if (statSpAttDec > -6) {
			p.setMod(Stat.SPECIAL_ATTACK,-2);
			statSpAttDec -= 2;
		}
	}
}
