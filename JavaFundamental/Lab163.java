class Lab163
{
	public static void main(String[] args)
	{
		int val = 2147483640;

		for(; val>200; val++)
		{
			System.out.println(val);
		}
		System.out.println("After Loop: "+val);
	}
}

/*
Output
======

E:\JLC Fundamental Lab>javac Lab163.java

E:\JLC Fundamental Lab>java Lab163
2147483640
2147483641
2147483642
2147483643
2147483644
2147483645
2147483646
2147483647
After Loop: -2147483648
*/