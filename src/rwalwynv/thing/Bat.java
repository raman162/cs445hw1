package rwalwynv.thing;

public class Bat extends Creature implements Flyer{

	public Bat (String name){
		super(name);
	}
	@Override
	public void move() {
		// TODO Auto-generated method stub
		this.fly();
	}
	
	@Override
	public void fly(){
		System.out.println(this.toString() +" is swooping though the dark");
		
	}
	@Override
	public void eat(Thing aThing){
		if (aThing.getClass().getClass().getSimpleName() != "Creature"){
			System.out.println(this.toString() + " won't eat a " +aThing.toString());
		}else{
			super.eat(aThing);
			
		}
	}

}
