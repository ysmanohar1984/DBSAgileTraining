package test.resource;

import junit.framework.TestCase;

public class testRPN extends TestCase 
{
  
	public void testCase1()
	{
		//String Expr = "3,2,+";
		int res=10;
		 RPNCalc rpnCalc = new RPNCalc();
		 assertEquals(res, rpnCalc.calculateSum(5,5));
	}
	
	public void testCase2()
	{
		//String Expr = "3,2,+";
		int res=10;
		 RPNCalc rpnCalc = new RPNCalc();
		 assertEquals(res, rpnCalc.calculateDifference(15,5));
	}
	
	
	public void testCase3()
	{
		//String Expr = "3,2,+";
		 int res=625;
		 RPNCalc rpnCalc = new RPNCalc();
		 assertEquals(res, rpnCalc.calculateExponent(-5,4));
	}
	
	public void testCase4()
	{
		//String Expr = "3,2,+";
		 double res=0;
		 RPNCalc rpnCalc = new RPNCalc();
		 assertEquals(res, rpnCalc.calculatePercentage(20));
	}
	
	
	public void testCase5()
	{
		//String Expr = "3,2,+";
		 String[] str={"2","3","+"};
		 RPNCalc rpnCalc = new RPNCalc();
		 rpnCalc.PostFixEvaluation(str);
		 //assertEquals(res, rpnCalc.calculatePercentage(20));
	}
	
	
	
	
}
