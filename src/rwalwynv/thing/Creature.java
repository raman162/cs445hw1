package rwalwynv.thing;

public abstract class Creature extends Thing {
	private Thing lastEat;
	
	
	public Creature(String name) {
		super(name);
		setLastEat(null);
		// TODO Auto-generated constructor stub
	}
		public void eat(Thing aThing){
			setLastEat(aThing);
			System.out.println(this.getClass().getSimpleName() + " has just eaten " + aThing.getClass().getSimpleName());
		}
		
		public abstract void move();
		
		public void whatDidYouEat(){
		if (getLastEat()!=null){
			System.out.println(this.toString() +" has eaten a "+this.getLastEat().toString());
		}else{
			System.out.println(this.toString() +" has had nothing to eat!");
			}
		}
		public Thing getLastEat() {
			return lastEat;
		}
		public void setLastEat(Thing lastEat) {
			this.lastEat = lastEat;
		}
		
}
	


