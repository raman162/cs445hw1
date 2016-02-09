compile:
	mkdir -p bin/
	javac -cp lib/junit.jar src/rwalwynv/thing/*.java -d bin/
	
test: compile
	java -cp .:./lib/junit.jar:./lib/hamcrest.jar:./bin org.junit.runner.JUnitCore rwalwynv.thing.CreatureTest rwalwynv.thing.ThingTest

run: compile
	java -cp .:./lib/junit.jar:./lib/hamcrest.jar:./bin rwalwynv.thing.TestCreature

clean:
	rm -rf bin/
