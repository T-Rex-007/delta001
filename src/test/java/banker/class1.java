package banker;

public class class1 {
	
	public void method1 () {
		System.out.println("for loop statement");
	}
	
	public class ForLoopExample {
	    public  void main(String[] args) {
	        // Create an instance of the class to use the loop method
	        ForLoopExample loopExample = new ForLoopExample();

	        // Call the loop method
	        loopExample.demoForLoop();
	    }

	    public void demoForLoop() {
	        // Example: Using a for loop to print numbers from 1 to 5
	        for (int i = 1; i <= 5; i++) {
	            System.out.println("Number: " + i);
	        }
	    }
	}

}
