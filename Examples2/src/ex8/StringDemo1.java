/**
 * 
 */
package ex8;

/**
 * @author 389733
 *
 */
public class StringDemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str1= "Hello World";
        int count=0;
        
        for(int i=0;i<str1.length();i++){
        	char ch=str1.charAt(i);
            if(ch == 'o' || ch == 'a' || ch == 'u' || ch == 'i' || ch == 'e')
            	count++;	
        }
	    System.out.println(count);
        
	    char chs[]=str1.toCharArray();
	    for(char a: chs){
	    	System.out.print(a);
	    }
	    
	    System.out.println();
	    System.out.println(str1.indexOf('l'));
	    System.out.println(str1.indexOf('l', 0));
	    System.out.println(str1.indexOf("or"));
	    
	    int firstIndex=0, lastIndex=0, count1=0;
	    StringBuffer sb=new StringBuffer();
	    
	    for(int i=0;i<str1.length();i++){
	    	char ch=str1.charAt(i);	 
	    	firstIndex=str1.indexOf(ch);
	    	lastIndex=str1.lastIndexOf(ch);	    	
	    	if(firstIndex==lastIndex){
	                sb.append(ch);		
	    		
	    	}
	    	
	    }
	    
	    System.out.println(sb.toString());
	    
	    StringBuffer sb1=new StringBuffer(str1);
	    int len=str1.length();
	    char mch;
	    int max=0;
	    for(int i=0;i<len;i++){
	       	char ch=str1.charAt(i);
	       //	firstIndex=str1.indexOf(ch);
	    	count=0;
	    	lastIndex=0;
	       	for(int j=i+1;j<len;j++){
	    		lastIndex=str1.indexOf(ch, j);
	    		if(lastIndex!=-1 && i!=lastIndex){
	    		   count++;		    		
	    		}
	    	}
	       	System.out.println(count+" "+ch);
	    	if(max<count){
	    		max=count;
	    	    mch=ch;
	    }
	    }
	}

}
