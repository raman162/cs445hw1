package rwalwynv.thing;

public class TestThing {
	static int CREATURE_COUNT=10;
	static int THING_COUNT=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thing[] thingArray; 
		thingArray= new Thing[THING_COUNT];
		thingArray[0]= new Thing("rasta");
		thingArray[1]=new Thing("chuck");
		thingArray[2]=new Thing("babylon");
		thingArray[3]=new Thing("mitch");
		thingArray[4]=new Thing("renee");
		thingArray[5]=new Thing("dani");
		thingArray[6]=new Thing("zoe");
		thingArray[7]=new Thing("rishi");
		thingArray[8]=new Thing("govind");
		thingArray[9]=new Thing("steph");
		
		
		for (int x=0; x<thingArray.length; x++){
			thingArray[x].toString();
		}
		
	}

}
