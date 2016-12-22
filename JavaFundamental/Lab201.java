class Lab201
{
	public static void main(String[] args)
	{
		int arr[] = new int[1];
		System.out.println("Len:"+arr.length);
		System.out.println(arr[0]);

		int arr1[] = new int[0];
		System.out.println("Len:"+arr1.length);
		System.out.println(arr1[0]);
	}
}

/*
Output
======

E:\JLC Fundamental Lab>javac Lab201.java

E:\JLC Fundamental Lab>java Lab201
Len:1
0
Len:0
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 0
        at Lab201.main(Lab201.java:11)
        */