package Moves;
import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove{
    int raised_stats = 0;
    public Swagger() {
        super(Type.NORMAL, 0, 0.85);
    }
    @Override
    protected void applySelfEffects(Pokemon p) {
        Effect.confuse(p);
        if (raised_stats < 6) {
            p.setMod(Stat.ATTACK, +2);
            raised_stats +=2;
        }
        
    }
    @Override
    protected String describe() {
        return "used Swagger";
    }
}