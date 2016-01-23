/**
 * 
 */
package ex8;

/**
 * @author 389733
 *
 */
public class StringDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello Java";
		str=str.concat(" World");
        System.out.println(str);
        
        String str2="saddam";
        StringBuffer sb=new StringBuffer();
        
        for(int i=0;i<str.length();i++){
        	char ch=str.charAt(i);
        	String sch=Character.toString(ch);
        	if(str2.contains(sch))
        		sb.append(sch);
        }
        System.out.println(sb);
        System.out.println(str.contains(str2));
        
        String name="Saddham,Path,an";
        String name1=name.substring(3,5);
        System.out.println(name1);

        String name2=name.replaceAll("dh", "d");
        System.out.println(name2);
        
        System.out.println(name.startsWith("Sa"));
        System.out.println(name.endsWith("an"));
        
        String names[]=name.split(",");
        System.out.println(names[0]);
        
        String names1[]=name.split(",", 3);
        System.out.println(names1[2]);
        
        StringBuffer sb1=new StringBuffer();
        System.out.println(sb1.capacity());
        sb1.append("are wah are wah");     
        System.out.println(sb1.capacity()+" "+sb1.length());
        sb1.append("whd");
        System.out.println(sb1.capacity()+" "+sb1.length());
        sb1.append("deepika saddam deepika");
        System.out.println(sb1.capacity()+" "+sb1.length());
        
	}

}
