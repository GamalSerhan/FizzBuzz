package fizzbuzz;

public class Fizzbuzz {
	
	public static String result(int i)
	{
		if (esMultiploDe(i,3) && esMultiploDe(i,5))
		{
			return "FizzBuzz";                    
		}
	    if(esMultiploDe(i,3))
		{
			return"Fizz";
		}
		if(esMultiploDe(i,5))
		{
			return "Buzz";
		}
		 return(Integer.toString(i));
    }	
	
	
	public static boolean esMultiploDe(int entrada,int multiplo)
	{
		return entrada % multiplo ==0;
	}
}
