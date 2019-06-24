package object;

public class HumanTest {
	public static void main(String args[]) {
		Wizard HarryPotter = new Wizard();
		Ninja NinjaTurtle = new Ninja();
		Samurai SamuraiJack = new Samurai();
		
		//Can't seem to get the names to display properly.
		
		NinjaTurtle.steal(HarryPotter);
		NinjaTurtle.runAway();
		
		HarryPotter.attack(NinjaTurtle);
		HarryPotter.fireball(NinjaTurtle);
		
		SamuraiJack.deathBlow(NinjaTurtle);
		
		HarryPotter.heal(SamuraiJack);
		
		SamuraiJack.meditate();
		SamuraiJack.howMany();
	}
}