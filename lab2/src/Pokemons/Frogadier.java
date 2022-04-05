package Pokemons;
import Moves.*;
import ru.ifmo.se.pokemon.*;

public class Frogadier extends Pokemon {

	public Frogadier(String name, int level){
		super(name,level);
		setStats(54.00d, 63.00d, 52.00d, 83.00d, 56.00d, 97.00d);
		setType(Type.WATER);
		setMove(new Facade(),new Swagger(), new Bulldoze());
	}

}
