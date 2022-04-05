package Pokemons;
import Moves.*;
import ru.ifmo.se.pokemon.*;

public class Dewpider extends Pokemon {

	public Dewpider(String name, int level){
		super(name,level);
		setStats(38.00d, 40.00d, 52.00d, 40.00d, 72.00d, 27.00d);
		setType(Type.WATER);
		setMove(new DowbleTeam(), new Facade(),new Rest(), new LowSweep());
	}

}
