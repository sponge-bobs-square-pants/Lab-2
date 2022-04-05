package Moves;
import ru.ifmo.se.pokemon.*;

public class Confide extends StatusMove {
	int statSpAttDec = 0 ;
	public Confide () {
		super(Type.NORMAL,0.0,1.0);
	}
	@Override 
	protected String describe( ) {
		return "Used Confide - Lowers the target's Special Attack by one stage";
	}
	@Override 
    protected void applyOppEffects (Pokemon p) {
    	if (statSpAttDec > -6) {
    		p.setMod(Stat.SPECIAL_ATTACK,-1);
    		statSpAttDec -=2 ;
    	}	
    }
}

