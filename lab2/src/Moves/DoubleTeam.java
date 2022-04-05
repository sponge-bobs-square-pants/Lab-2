package Moves;

import ru.ifmo.se.pokemon.*;

public class DoubleTeam extends StatusMove {
	int statEvaInc = 0 ;
	public DoubleTeam () {
		super (Type.NORMAL,0.0,1.0);
		}
	@Override 
    protected String describe() {
    	return "Used Double Team - Raises the user's Evasiveness by one stage";
    }
    @Override 
    protected void applySelfEffects (Pokemon p) {
    	if (statEvaInc < 6) {
    		p.setMod(Stat.EVASION, 1);
    		statEvaInc +=1 ;
    	}
    }
}
