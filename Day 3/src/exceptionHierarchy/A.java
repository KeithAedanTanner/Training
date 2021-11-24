package exceptionHierarchy;

/**
 * 
 * @author Keith Tanner
 * Title: A.java
 * 
 */
public class A {
	void throwMethod() throws LevelOneException {
		throw new LevelOneException();
	}
}