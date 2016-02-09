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
//		System.out.println(aThing.getClass().getSuperclass().getSimpleName());
		if (aThing.getClass().getSuperclass().getSimpleName().equals("Creature")){
			super.eat(aThing);
		}else{
			System.out.println(this.toString() + " won't eat a " +aThing.toString());
		}
	}

}
