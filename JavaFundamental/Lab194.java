class Lab194
{
	public static void main(String[] args)
	{
		String arr[];
		arr = new String[3];
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
		System.out.println("*******");
		arr[0] ="Java";
		arr[1] = "Learning";
		arr[2] = "Center";
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}
}

/*
Output
======

E:\JLC Fundamental Lab>javac Lab194.java

E:\JLC Fundamental Lab>java Lab194
null
null
null
*******
Java
Learning
Center
*/