class Lab160
{
	public static void main(String[] args)
	{
		boolean b1 = true;
		for(;b1;)
			System.out.println("JLC");
		System.out.println("AFTER");
	}
}


/*
Output
======

JLC
JLC
JLC
infinite loop
*/