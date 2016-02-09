package rwalwynv.thing;

public class TestCreature {
	static int CREATURE_COUNT=10;
	static int THING_COUNT=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thing[] thingArray; 
		thingArray= new Thing[THING_COUNT];
		thingArray[0]= new Thing("rasta");
		thingArray[1]=new Thing("chuck");
		thingArray[2]=new Tiger("babylon");
		thingArray[3]=new Thing("mitch");
		thingArray[4]=new Thing("renee");
		thingArray[5]=new Tiger("dani");
		thingArray[6]=new Thing("zoe");
		thingArray[7]=new Thing("rishi");
		thingArray[8]=new Tiger("govind");
		thingArray[9]=new Thing("steph");
		
		System.out.println("Testing the Thing Array");
		for (int x=0; x<thingArray.length; x++){
			System.out.println(thingArray[x].toString());
		}
		
		
		System.out.println("\nTesting the Creature Array");
		Creature[] creatureArray;
		creatureArray=new Creature[CREATURE_COUNT];
		creatureArray[0]= new Bat("beanie");
		creatureArray[1]=new Ant("sean");
		creatureArray[2]=new Tiger("paul");
		creatureArray[3]=new Bat("kendrick");
		creatureArray[4]=new Fly("jermain");
		creatureArray[5]=new Tiger("cole");
		creatureArray[6]=new Ant("lamar");
		creatureArray[7]=new Fly("lady");
		creatureArray[8]=new Tiger("chris");
		creatureArray[9]=new Ant("luda");
		
		for (int x=0; x<creatureArray.length; x++){
			System.out.println(creatureArray[x].toString());
		}
		
		Bat bat=(Bat) creatureArray[0];
		Ant ant=(Ant) creatureArray[1];
		Tiger tiger=(Tiger) creatureArray[2];
		Fly fly=(Fly) creatureArray[4];
		Thing thing=thingArray[0];
		
		System.out.println("\n");
		tiger.eat(ant);
		bat.eat(thing);
		
	}

}
