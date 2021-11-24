package exceptionHierarchy;

/**
 * 
 * @author Keith Tanner
 * Title: C.java
 * 
 */
public class C extends B {
	void throwMethod() throws LevelThreeException {
		throw new LevelThreeException();
	}
}