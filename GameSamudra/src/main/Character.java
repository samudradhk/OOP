package main;

public class Character implements IAttack,IDamageable{
	protected String name;
	protected HP hp;
	protected int attack;
	protected int defense;
	
	public Character(String name, HP hp, int attack, int defense) {
		this.name = name;
		this.hp = hp;
		this.attack = attack;
		this.defense = defense;
	}

	public String getName() {
		return name;
	}

	public HP getHp() {
		return hp;
	}

	public int getAttack() {
		return attack;
	}

	public int getDefense() {
		return defense;
	}

	@Override
	public int takeDamage(int damage, int defense) {
		int trueDamage = (damage > this.defense) ? damage - this.defense : 0;
		if((hp.getHealthPoint() - trueDamage) > 0 && hp.getHealthPoint() > 0) hp.setHealthPoint(hp.getHealthPoint() - trueDamage);
		else hp.setHealthPoint(0);
		return trueDamage;
	}

	@Override
	public void attack(IDamageable damageable) {
		// TODO Auto-generated method stub
//		Admium attacking Slime
//		Slime is taking damage for 10 point(s)
		System.out.println(name + " attacking " + ((Enemy) damageable).getName());
		System.out.println(((Enemy) damageable).getName() + " is taking damage for" + attack + "point(s)");
		damageable.takeDamage(attack, defense);
	}
	
	
	
}
