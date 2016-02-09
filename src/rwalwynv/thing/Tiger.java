package rwalwynv.thing;

public class Tiger extends Creature {

	public Tiger(String name){
		super(name);
	}
	
	
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println(this.toString() +" has just pounced.");
	}

}
