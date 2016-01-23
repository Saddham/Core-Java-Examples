/**
 * 
 */
package gex;

/**
 * @author 389733
 *
 */

class Type<T> {
	T data;
	public void setType(T arg){
		data=arg;		
	}
	
	public T getType(){
		return data;
	}
}//type definition


public class GenericsDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Type<Integer> obj=new Type<Integer>();
        obj.setType(23);
        int value=obj.getType();
        System.out.println(value);
        
        Type<String> obj1=new Type<String>();
        obj1.setType("Saddam");
        System.out.println(obj1.getType());
	}

}
