package rwalwynv.thing;

public class Fly extends Creature implements Flyer{
	
	public Fly (String name){
		super(name);
	}
	@Override
	public void move() {
		// TODO Auto-generated method stub
		this.fly();
	}
	@Override
	public void eat(Thing aThing){
		if (aThing.getClass().getSimpleName().equals("Thing")){
			super.eat(aThing);
		}else{
			System.out.println(this.toString() +" won't eat a " +aThing.toString());
		}
	}
	@Override
	public void fly(){
		System.out.println(this.toString() + " is buzzing aorund in flight.");
	}
	
}
