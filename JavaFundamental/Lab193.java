class Lab193
{
	public static void main(String[] args)
	{
		int arr[];
		arr = new int[3];
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		for(int i = 0;i<=arr.length;i++)
			System.out.println(arr[i]);	
	}
}

/*
Output
======

E:\JLC Fundamental Lab>javac Lab193.java

E:\JLC Fundamental Lab>java Lab193
0
0
0
10
20
30
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
        at Lab193.main(Lab193.java:14)
*/