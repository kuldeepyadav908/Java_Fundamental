class Lab221
{
	public static void main(String[] args)
	{
		int arr[][] = null;
		arr = new int[3][];
		System.out.println("Len:"+arr.length);
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}
}

/*
Output
======

E:\JLC Fundamental Lab>javac Lab221.java

E:\JLC Fundamental Lab>java Lab221
Len:3
null
null
null
*/