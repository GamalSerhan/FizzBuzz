package fizzbuzz;

public class Fizzbuzz {
	
	public static String result(int i)
	{
		if (esMultiplode(i,3) && esMultiplode(i,5))
		{
			return "FizzBuzz";                    
		}
		else 
			if(i % 3 == 0)
			{
				return"Fizz";
			}
			else 
				if(i % 5 == 0)
				{
					return "Buzz";
				}
				else
					return(Integer.toString(i));
		
		
        
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
}
