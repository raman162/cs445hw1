package rwalwynv.thing;

import static org.junit.Assert.*;

import org.junit.Test;

public class ThingTest {

	Thing thing= new Thing("rasta");
	
	
	@Test
	public void testThing() {
	assertEquals(thing.getName(), "rasta");
	assertEquals(thing.toString(), "rasta Thing");
	}

}
