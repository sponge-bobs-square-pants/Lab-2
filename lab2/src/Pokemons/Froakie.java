package Pokemons;
import Moves.*;
import ru.ifmo.se.pokemon.*;

public class Froakie extends Pokemon {

	public Froakie(String name, int level){
		super(name,level);
		setStats(41.00d, 56.00d, 40.00d, 62.00d, 44.00d, 71.00d);
		setType(Type.WATER);
		setMove(new Facade(),new Swagger());
	}

}
