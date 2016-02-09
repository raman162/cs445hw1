package rwalwynv.thing;

public class Ant extends Creature {
	
	public Ant(String name){
		super(name);
	}
	
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println(this.toString() + " is crawling around.");
	}

}
