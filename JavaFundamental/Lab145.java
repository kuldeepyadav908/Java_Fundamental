class Lab145
{
	public static void main(String[] args)
	{
		long a = 30;
		switch(a){}

		float f = 30.0f;
		switch(f){}

		double d = 30.0;
		switch(d){}

		boolean b = true;
		switch(b){}
	}
}

/*
Output
======

E:\JLC Fundamental Lab>javac Lab145.java
Lab145.java:6: error: incompatible types: possible lossy conversion from long to
 int
                switch(a){}
                      ^
Lab145.java:9: error: incompatible types: possible lossy conversion from float t
o int
                switch(f){}
                      ^
Lab145.java:12: error: incompatible types: possible lossy conversion from double
 to int
                switch(d){}
                      ^
Lab145.java:15: error: incompatible types: boolean cannot be converted to int
                switch(b){}
                      ^
4 errors
*/