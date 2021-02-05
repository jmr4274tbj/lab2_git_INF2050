
public class FizzBuzz {

	public static final int NB_ITERATION = 200; 
	public static final int DIV_FIZZ = 3;
	public static final int DIV_BUZZ = 5;
	
	public static void main(String[] args) {

		for(int i = 1; i <= NB_ITERATION; i++) {
			if ((i % DIV_FIZZ == 0) && (i % DIV_BUZZ == 0)) {
				System.out.println("FizzBuzz");
		    } else if (i % DIV_FIZZ == 0) {
		    	System.out.println("Fizz");
		    } else if (i % DIV_BUZZ == 0) {
		    	System.out.println("Buzz");
		    } else {
		    	System.out.println(i);
		    }
		}		

	}

}
