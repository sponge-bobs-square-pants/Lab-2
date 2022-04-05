package Moves;
import ru.ifmo.se.pokemon.*;

public class QuiverDance extends StatusMove{
    int raised_stats = 0;
    public Swagger() {
        super(Type.BUG, 0.00d, 100.00d);
    }
    @Override
    protected void applySelfEffects(Pokemon p) {
        if (raised_stats < 6) {
            p.setMod(Stat.SPECIAL_ATTACK, +1);
            p.setMod(Stat.SPECIAL_DEFENCE, +1);
            p.setMod(Stat.SPEED, +1);
            raised_stats +=1;
        }
        
    }
    @Override
    protected String describe() {
        return "used Quiver Dance";
    }
}