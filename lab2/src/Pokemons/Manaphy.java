package Pokemons;
import Moves.*;
import ru.ifmo.se.pokemon.*;

public class Manaphy extends Pokemon {

	public Manaphy(String name, int level){
		super(name,level);
		setStats(100.00d, 100.00d, 100.00d, 100.00d, 100.00d, 100.00d);
		setType(Type.WATER);
		setMove(new QuiverDance(), new Confide(),new Venoshock(),new LeafStorm());
	}

}

