package ex4;



class Car{}
class BMW extends Car{}
class Benz extends Car{}
class B5 extends BMW{}
class Ec extends Benz{}




public class ObjCast4 {
	public static void main(String[] args) {
		Car car=new Ec(); // ok

		BMW bmw=new B5(); // ok 

		Benz benz=(Ec)car; // ok after typecasting

		Car bmw7=bmw; // ok

		Ec eclass=(Ec)benz; // ok after typecasting

		B5 bseries=(B5)bmw7; // ok after typecasting

	//	BMW hybrid=(bmw)eclass; // not ok

//		Benz auto=(B5)bmw; // not ok
	}
}
