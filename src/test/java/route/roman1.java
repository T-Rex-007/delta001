package route;

public class roman1 {

	public void r1() {
		
		System.out.println("hi world");
		
		public void r2() {
			
			System.out.println("hi world");
			
			System.out.println("r1");
			
			//nest for loop
			for (int i = 1; i <= 3; i++) {
	            System.out.println("Outer loop iteration: " + i);

	            // Inner loop: iterating from 1 to 2
	            for (int j = 1; j <= 2; j++) {
	                System.out.println("    Inner loop iteration: " + j);
	            }
	        }
	}
}
