class Lab204
{
	public static void main(String[] args)
	{
		final int arr[] = new int[2];
		System.out.println("Len: "+arr.length);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println();
		arr[0] = 99;
		arr[1] = 88;
		System.out.println(arr[0]);
		System.out.println(arr[1]);

		//arr = new int[4];
		//arr = null;
	}
}

/*
Output
======

E:\JLC Fundamental Lab>javac Lab204.java
Lab204.java:15: error: cannot assign a value to final variable arr
                arr = new int[4];
                ^
Lab204.java:16: error: cannot assign a value to final variable arr
                arr = null;
                ^
2 errors

E:\JLC Fundamental Lab>javac Lab204.java

E:\JLC Fundamental Lab>java Lab204
Len: 2
0
0

99
88
*/