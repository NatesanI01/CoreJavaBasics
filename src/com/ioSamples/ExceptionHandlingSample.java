package com.ioSamples;

public class ExceptionHandlingSample {

	public static void main(String[] args) {
//		int a=10,b=0;
//		int []arr=null;
//		
//		int c=0;
//		try{
//			System.out.println(arr[1]);
//			c=a/b;
//		}
//		catch(ArithmeticException e)
//		{
//			System.err.println(e.getMessage());
//		}
//		catch(NullPointerException e)
//		{
//			System.out.println(e.getMessage());
//		}
//		System.out.println(c);
//		System.out.println("End of the program");
		
		double amt=5000;
		double withdraw=700;
		try {
			if(amt<withdraw)
				throw new InSufficientBalance(amt-withdraw); 
			else
				System.out.println("Take the cash "+(amt-withdraw));
		}
		catch(InSufficientBalance e)
		{
			System.out.println("Insufficient balance");
		}

	}

}
