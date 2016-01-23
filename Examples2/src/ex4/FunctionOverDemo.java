package ex4;


class b
{
	protected void makeNoise()
	{
		System.out.println("b");
	}
}

class c extends b
{
	public void makeNoise()
	{
		System.out.println("c");
	}
}

class d extends b
{
	public void makeNoise()
	{
		System.out.println("d");
	}
}


public class FunctionOverDemo {
	public static void main(String[] args) {
		b bc;
		c cc = new c();
		bc=cc;
		bc.makeNoise();
		
		d dd = new d();
		bc = dd;
		dd.makeNoise();
		bc.makeNoise();
	}
}
