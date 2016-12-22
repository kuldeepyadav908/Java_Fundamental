class Lab146
{
	public static void main(String[] args)
	{
		Course c = Course.CORE;
		switch(c)
		{
			case ADV: 
			System.out.println("100% PLACEMENT GURANTEE");
			case CORE: 
			System.out.println("NO PLACEMENT GURANTEE");
		}
	}
}
enum Course
{
	CORE,ADV;
}

/*
Output
======

E:\JLC Fundamental Lab>javac Lab146.java

E:\JLC Fundamental Lab>java Lab146
NO PLACEMENT GURANTEE
*/