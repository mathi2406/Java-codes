class Rectangle extends Thread
{
	float length,breadth,res;
	
	Rectangle(float length,float breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	
	public void run()
	{
        res=length*breadth;
		System.out.println("Area of the Rectangle : "+res);
	}	
}

class Circle extends Thread
{
	float radius;
	float res1;
	Circle(float diameter)
	{
		this.radius=diameter/2;
	}
	
	public void run()
	{
		res1=(float)Math.PI*radius*radius;
		System.out.println("Area of the circle : "+res1);
	}
}

class Square extends Thread
{
	float a,res2;
	
	Square(float a)
	{
		this.a=a;
	}
	
	public void run()
	{
		res2=4*a*a;
		System.out.println("Area of the Square : "+(res2));
	}
}

class Area1 
{
	public static void main(String args[])
	{
		Rectangle r=new Rectangle(35.5f,15.0f);
		Circle c=new Circle(7.5f);
		Square s=new Square(2.0f);
		r.start();
		c.start();
		s.start();
		
		try{
			r.join();
			c.join();
			s.join();
		}catch(Exception e)
		{}
		System.out.println("Area of the shaded part is "+(r.res-(c.res1+s.res2)));
	}
}