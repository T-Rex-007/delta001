package banker;

public class customer {
	
	public void methodone()
	{
		System.out.println("goodmorning");
	}
	
public void methodtwo() {
	
	for (int i = 1; i <= 3; i++) {
        for (int j = 1; j <= 3; j++) {
            System.out.println("i: " + i + ", j: " + j);
        }
    }

    // Example of a nested while loop
    int x = 1;
    while (x <= 3) {
        int y = 1;
        while (y <= 3) {
            System.out.println("x: " + x + ", y: " + y);
            y++;
        }
        x++;
    }

    // Example of a nested do-while loop
    int a = 1;
    do {
        int b = 1;
        do {
            System.out.println("a: " + a + ", b: " + b);
            b++;
        } while (b <= 3);
        a++;
    } while (a <= 3);
}

}
