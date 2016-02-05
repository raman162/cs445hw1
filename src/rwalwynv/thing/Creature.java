package rwalwynv.thing;

public abstract class Creature extends Thing {

	public Creature(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		
		public void eat(Thing aThing){
			System.out.println("This " + this.toString() + " has just eaten " + aThing.toString());
		}
		
		public abstract void move()
		
		public void whatDidYouEat()
	}

}
