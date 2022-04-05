import Pokemons.*;
import ru.ifmo.se.pokemon.Battle;

class Warzone {
    public static void main(String[] args) {

        Manaphy manaphy = new Manaphy("Manaphy", 100);
        GreenLand greenland = new GreenLand("GreenLand", 100);
        Frogadier frogadier = new Frogadier("Frogadier", 100);
        Froakie froakie = new Froakie("Froakie", 100);
        Dewpider dewpider = new Dewpider("Dewpider", 100);
        Araquanid araquanid = new Araquanid("Araquanid", 100);
        
        Battle b = new Battle();
        b.addAlly(manaphy);
        b.addAlly(greenland);
        b.addAlly(frogadier);
        b.addFoe(froakie);
        b.addFoe(dewpider);
        b.addFoe(araquanid);

        b.go();
    }
}
