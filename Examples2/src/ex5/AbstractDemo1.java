/**
 * 
 */
package ex5;

/**
 * @author 389733
 *
 */
abstract class AbstractDemo {
    String RAM;
    String HDD;
    String type;
	/**
	 * @param args
	 **/
    
    public AbstractDemo(String ram, String hdd){
    	System.out.println("PC Constructor");
    	RAM=ram;
    	HDD=hdd;   	
    }
    
    abstract public void setPC(String type);
    public void display(){
    	 System.out.println("Category "+type);
    	 System.out.println("Ram "+RAM+"\nHdd "+HDD);
    }
}
class Laptop extends AbstractDemo{

	public Laptop(String ram, String hdd){
		super(ram, hdd);
	}
	@Override
	public void setPC(String type) {
		// TODO Auto-generated method stub
		this.type=type;
	}
	
	
}
public class AbstractDemo1{
	public static void main(String []args){
		AbstractDemo laptop=new Laptop("4GB", "500GB");
		laptop.setPC("laptop");
		laptop.display();		
	}	
}