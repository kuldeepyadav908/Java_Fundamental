class Lab220
{
	public static void main(String[] args)
	{
		int arr[][] = null;
		arr = new int[][];
		arr = new int[][3];
		System.out.println("L:"+arr.length);
	}
}

/*
Output
======

E:\JLC Fundamental Lab>javac Lab220.java
Lab220.java:6: error: array dimension missing
                arr = new int[][];
                                 ^
Lab220.java:7: error: ']' expected
                arr = new int[][3];
                                ^
Lab220.java:7: error: ';' expected
                arr = new int[][3];
                                 ^
3 errors
*/