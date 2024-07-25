package nandini;

abstract class Character{
	protected String name;
	protected String race;
	protected int level;
	protected int health;
	
	public Character(String name,String race, int level) {
		this.name=name;
		this.race=race;
		this.level=level;
		this.health=100;
		}
	public void attack() {
		this.health-=30;
		if(this.health<0) this.health=0;
	}
	public void drinkPotion() {
		this.health+=50;
		if(this.health>100) this.health=100;
	}
	public String getName() {
		return name;
	}
	public String getRace() {
		return race;
	}
	public int getLevel() {
		return level;
	}
	public  int getHealth() {
		return health;
	}
	
	public abstract void displayUniqueTrait();
}

class Human extends Character{
	public Human(String name, int level) {
		super(name,"Human",level);
	}
	public void displayUniqueTrait() {
		System.out.println("name: "+name);
	}
}

class Elf extends Character{
	public Elf(String name, int level) {
		super(name,"Elf",level);
	}
	public void displayUniqueTrait() {
		System.out.println("name: "+name);
	}
}

class Dwarf extends Character{
	public Dwarf(String name, int level) {
		super(name,"Dwarf",level);
	}
	public void displayUniqueTrait() {
		System.out.println("name: "+name);
	}
}

class Hobbit extends Character{
	public Hobbit(String name, int level) {
		super(name,"Hobbit",level);
	}
	public void displayUniqueTrait() {
		System.out.println("name: "+name);
	}
}

interface CharacterClass{
	void performClassAbility();
	}

class Ranger implements CharacterClass{
	public void performClassAbility() {
		System.out.println("Ranger Tracking");
	}
}
class Wizard implements CharacterClass{
	public void performClassAbility() {
		System.out.println("Wizard spellcasting");
	}
}
class Warrior implements CharacterClass{
	public void performClassAbility() {
		System.out.println("Warrior combat");
	}
}
class Commoner implements CharacterClass{
	public void performClassAbility() {
		System.out.println("Commener tasks");
	}
}


abstract class Creature{
	protected String creatureType;
	protected int attackPower;
	protected String specialAbility;
	
	public Creature(String creatureType, int attackPower, String specialAbility) {
		this.creatureType=creatureType;
		this.attackPower=attackPower;
		this.specialAbility=specialAbility;
	}
	public String getCreatureType() {
		return creatureType;
	}
	public int getAttackPower() {
		return attackPower;
	}
	public String SpecialAbility() {
		return specialAbility;
	}
	public abstract void displayAbility();
}

class Orc extends Creature{
	public Orc() {
		super("Orc",40,"Orcish rage");
	}
	public void displayAbility() {
		System.out.println("Orcish Rage");
	}
}
class Troll extends Creature{
	public Troll() {
		super("Troll",60,"Troll Regeneration");
	}
	public void displayAbility() {
		System.out.println("Troll regeneration");
	}
}
class Dragon extends Creature{
	public Dragon() {
		super("Dragon",100,"Fire breath");
	}
	public void displayAbility() {
		System.out.println("Fire breath");
	}
}
class Nazgul extends Creature{
	public Nazgul() {
		super("Nazgul",80,"Fear aura");
	}
	public void displayAbility() {
		System.out.println("Fear aura");
	}
}

class Combat {
    public void battle(Character character, Creature creature) {
        System.out.println(character.getName() + " the " + character.getRace() + " is battling a " + creature.getCreatureType() + ".");
        
        character.displayUniqueTrait();
        creature.displayAbility();

        while (character.getHealth() > 0 && creature.getAttackPower() > 0) {
            System.out.println(character.getName() + " attacks the " + creature.getCreatureType() + "!");
            creature.attackPower -= 30;
            if (creature.getAttackPower() < 0) creature.attackPower = 0;
            System.out.println(creature.getCreatureType() + " now has " + creature.getAttackPower() + " attack power.");

            if (creature.getAttackPower() > 0) {
                System.out.println(creature.getCreatureType() + " attacks " + character.getName() + "!");
                character.attack();
                System.out.println(character.getName() + " now has " + character.getHealth() + " health.");
            }
        }

        if (character.getHealth() > 0) {
            System.out.println(character.getName() + " has defeated the " + creature.getCreatureType() + "!");
        } else {
            System.out.println(character.getName() + " has been defeated by the " + creature.getCreatureType() + ".");
        }
    }
}
public class LordOfRings {
    public static void main(String[] args) {
        Character aragorn = new Human("Aragorn", 10);
        Character legolas = new Elf("Legolas", 10);
        Character gimli = new Dwarf("Gimli", 10);
        Character frodo = new Hobbit("Frodo", 10);

        CharacterClass ranger = new Ranger();
        CharacterClass wizard = new Wizard();
        CharacterClass warrior = new Warrior();
        CharacterClass commoner = new Commoner();

        Creature orc = new Orc();
        Creature troll = new Troll();
        Creature dragon = new Dragon();
        Creature nazgul = new Nazgul();

        Combat combat = new Combat();
        combat.battle(aragorn, orc);
        combat.battle(legolas, troll);
        combat.battle(gimli, dragon);
        combat.battle(frodo, nazgul);
    }
}








