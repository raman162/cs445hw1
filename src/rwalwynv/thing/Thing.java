package rwalwynv.thing;

public class Thing {
	private String name;
	
	
	public Thing(String name){
		this.name=name;
	}
	
	public String getName(){
		return this.name;
	}

	public String toString(){
			return this.name +" " +this.getClass().getSimpleName();
	}
}
