/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package lab1;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }
    public static void main(String arg[]) {
    	Library lib = new Library();
    	if(lib.someLibraryMethod()) {
    		System.out.println("Hello World");	
    	}
    }
}
