package rwalwynv.thing;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

public class CreatureTest {
	Thing thing= new Thing("rasta");
	Bat bat = new Bat("kendrick");
	Ant ant = new Ant("Jermaine");
	Tiger tiger= new Tiger("Tigger");
	Fly fly= new Fly("Greg");
	String linesep=System.getProperty("line.separator");
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	
	
	@Before
	public void setUpStreams(){
		System.setOut(new PrintStream(outContent));
		System.setErr(new PrintStream(errContent));
	}
	
	@Test
	public void testBat() {
		assertEquals(bat.getName(), "kendrick");
		bat.whatDidYouEat();
		assertEquals(outContent.toString(), "kendrick Bat has had nothing to eat!" +linesep );
		outContent.reset();
		bat.eat(ant);
		assertEquals(outContent.toString(), "Bat has just eaten Ant" +linesep);
		outContent.reset();
		bat.eat(thing);
		assertEquals(outContent.toString(), "kendrick Bat won't eat a rasta Thing" +linesep);
		outContent.reset();
		bat.whatDidYouEat();
		assertEquals(outContent.toString(), "kendrick Bat has eaten a Jermaine Ant" +linesep);
	}

}
