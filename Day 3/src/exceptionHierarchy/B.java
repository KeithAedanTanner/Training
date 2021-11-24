package exceptionHierarchy;

/**
 * 
 * @author Keith Tanner
 * Title: B.java
 * 
 */
public class B extends A {
	void throwMethod() throws LevelTwoException {
		throw new LevelTwoException();
	}
}