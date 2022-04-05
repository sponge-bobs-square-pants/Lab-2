package Pokemons;
import Moves.*;
import ru.ifmo.se.pokemon.*;

public class GreenLand extends Pokemon {

	public GreenLand(String name, int level){
		super(name,level);
		setStats(72.00d, 95.00d, 67.00d, 103.00d, 71.00d, 122.00d);
		setType(Type.WATER);
		setMove(new Facade(),new Swagger(), new Bulldoze(), new Swagger());
	}

}
