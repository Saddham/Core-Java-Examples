package ex4;

class Bike
{
	
}

class MountainBike extends Bike
{
	
}

class MudBike extends Bike 
{
	
}

public class ObjCast3 {
	public static void main(String[] args) {
		Bike bike = new MountainBike();
		
		MudBike mudBike = new MudBike();
		
		bike = mudBike;
		
//		MountainBike mBike = (MountainBike)bike;	//Not Allowed
		
		
	}
}
