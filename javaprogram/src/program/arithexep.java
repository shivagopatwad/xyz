package program;

public class arithexep {

	public static void main(String[] args) {
		System.out.println("1");
	    System.out.println("2");
	    System.out.println("3");
	    try
	    {
	        System.out.println(10/0);
	    }
	    catch(ArithmeticException e)
	    {
	    	System.out.println(e);
	    }
	    System.out.println("4");

	}

}
