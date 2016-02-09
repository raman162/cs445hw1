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
			System.out.println("This " + this.toString() + " has just eaten " + aThing.toString());
		}
		
		public abstract void move();
		
		public void whatDidYouEat(){
		if (getLastEat()!=null){
			System.out.println("The last thing I ate was " +this.getLastEat().toString());
		}else{
			System.out.println("I have not eaten anything");
			}
		}
		public Thing getLastEat() {
			return lastEat;
		}
		public void setLastEat(Thing lastEat) {
			this.lastEat = lastEat;
		}
		
}
	


