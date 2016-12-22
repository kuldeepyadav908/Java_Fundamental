class Lab200
{
	public static void main(String[] args)
	{
		int arr[] = new int[-1];
		System.out.println(arr.length);
	}
}

/*
Output
======

E:\JLC Fundamental Lab>javac Lab200.java

E:\JLC Fundamental Lab>java Lab200
Exception in thread "main" java.lang.NegativeArraySizeException
        at Lab200.main(Lab200.java:5)
*/