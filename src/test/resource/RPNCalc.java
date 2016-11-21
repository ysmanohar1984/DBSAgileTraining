package test.resource;

public class RPNCalc {

	public int calculateSum(int i, int j) {
		// TODO Auto-generated method stub
		int c = i+j;
		return c;
	}

	public int calculateDifference(int i, int j) {
		// TODO Auto-generated method stub
		int c = i-j;
		return c;		
	}

	public int calculateExponent(int i, int j) 
	{
		int exp = 1;
		for(int k=1;k<=j;k++)
		{
		  exp = exp * i; 	
		}
		// TODO Auto-generated method stub
		return exp;
	}

	public double calculatePercentage(int i) 
	{
		// TODO Auto-generated method stub
		return (i/100);
	}

	
	}
	
	


