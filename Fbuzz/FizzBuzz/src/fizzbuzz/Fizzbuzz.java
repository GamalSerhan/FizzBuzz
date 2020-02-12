package fizzbuzz;

public class Fizzbuzz {
	
	public static String result(int i)
	{
		if (esMultiplode(i,3) && esMultiplode(i,5))
		{
			return "FizzBuzz";                    
		}
	    if(esMultiplode(i,3))
		{
			return"Fizz";
		}
		if(esMultiplode(i,5))
		{
			return "Buzz";
		}
		 return(Integer.toString(i));
    }	
	
	
	public static boolean esMultiplode(int entrada,int multiplo)
	{
		return entrada % multiplo ==0;
	}
}
