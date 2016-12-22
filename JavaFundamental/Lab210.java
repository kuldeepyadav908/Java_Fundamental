class Lab210
{
	public static void main(String[] args)
	{
		show(new int[]{99,88,66,77});
	}
	static void show(int arr[])
	{
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}
}

/*
Output
======

E:\JLC Fundamental Lab>javac Lab210.java

E:\JLC Fundamental Lab>java Lab210
99
88
66
77
*/