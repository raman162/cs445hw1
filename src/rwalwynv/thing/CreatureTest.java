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
		assertEquals("kendrick",bat.getName() );
		bat.whatDidYouEat();
		assertEquals("kendrick Bat has had nothing to eat!" +linesep , outContent.toString());
		outContent.reset();
		bat.eat(ant);
		assertEquals("Bat has just eaten Ant" +linesep, outContent.toString());
		outContent.reset();
		bat.eat(thing);
		assertEquals("kendrick Bat won't eat a rasta Thing" +linesep, outContent.toString());
		outContent.reset();
		bat.whatDidYouEat();
		assertEquals("kendrick Bat has eaten a Jermaine Ant" +linesep, outContent.toString());
		outContent.reset();
		bat.move();
		assertEquals("kendrick Bat is swooping through the dark" +linesep, outContent.toString());
		outContent.reset();
	}
	
	@Test
	public void testAnt(){
		assertEquals(ant.getName(), "Jermaine");
		ant.whatDidYouEat();
		assertEquals("Jermaine Ant has had nothing to eat!" + linesep, outContent.toString());
		outContent.reset();
		ant.eat(thing);
		assertEquals("Ant has just eaten Thing" +linesep, outContent.toString());
		outContent.reset();
		ant.whatDidYouEat();
		assertEquals( "Jermaine Ant has eaten a rasta Thing" +linesep, outContent.toString());
		outContent.reset();
		ant.eat(bat);
		assertEquals( "Ant has just eaten Bat" +linesep, outContent.toString());
		outContent.reset();
		ant.move();
		assertEquals( "Jermaine Ant is crawling around." + linesep, outContent.toString());
		outContent.reset();
	}
	@Test
	public void testTiger(){
		assertEquals(tiger.getName(), "Tigger");
		tiger.move();
		assertEquals("Tigger Tiger has just pounced." +linesep, outContent.toString());
		outContent.reset();
	}
	@Test
	public void testFly(){
		assertEquals(fly.getName(), "Greg");
		fly.eat(thing);
		assertEquals("Fly has just eaten Thing" +linesep, outContent.toString());
		outContent.reset();
		fly.whatDidYouEat();
		assertEquals("Greg Fly has eaten a rasta Thing"+linesep, outContent.toString());
		outContent.reset();
		fly.eat(bat);
		assertEquals("Greg Fly won't eat a kendrick Bat" +linesep, outContent.toString());
		outContent.reset();
		
	}
	
	@Test
	public void testCreature(){
		TestCreature.main(null);
	}
	
}
