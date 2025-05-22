package main;

public class Enemy extends Character {

	public Enemy(String name, HP hp, int attack, int defense) {
		super(name, hp, attack, defense);
	}

	public void showHP() {
		System.out.println(name + " current HP is " + hp.getHealthPoint());
		
	}
	
}
