class Lab203
{
	public static void main(String[] args)
	{
		int arr[] = new int[3];
		System.out.println(arr.length);
		arr.length = 30;
		System.out.println(arr.length);
	}
}

/*
Output
======

E:\JLC Fundamental Lab>javac Lab202.java

E:\JLC Fundamental Lab>javac Lab203.java
Lab203.java:7: error: cannot assign a value to final variable length
                arr.length = 30;
                   ^
*/