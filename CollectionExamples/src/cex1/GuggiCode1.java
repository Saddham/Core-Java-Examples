package cex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;


// this isssss soooo good
public class GuggiCode1 {

	public static void main(String[] args)
	{
		String input="this issss soooooo goodoooooooooooooo ";
		/*HashMap<Character,Integer> inpcharh;
		
		StringTokenizer str=new StringTokenizer(input," ");
		
		while(str.hasMoreTokens())
		{
			inpcharh=new HashMap<Character, Integer>();
			String temp1=str.nextToken();
			
			for(int i=0;i<temp1.length();i++)
			{
				inpcharh.put(temp1.charAt(i), 0);
			}
			for(int i=0;i<temp1.length();i++)
			{
				char c = temp1.charAt(i);
				int val=inpcharh.get(c);
				inpcharh.put(c, val+1);
			}
			
			
		
		}*/
		
		String temp=input;
		StringTokenizer str=new StringTokenizer(input," ");
		String[] splitted=new String[str.countTokens()];
		String[] splwodup=new String[str.countTokens()];
		int i=0;
		while(str.hasMoreTokens())
		{
			splitted[i++]=str.nextToken();
		}
		int j=0;
		StringBuffer sb;
		for(String p: splitted)
		{
			sb=new StringBuffer();
			while(!p.equals(""))
			{
			sb.append(p.charAt(0));
			
			p=p.replaceAll((p.charAt(0)+""), "");
			}
			splwodup[j++]=sb.toString();
			
		}
		
		ArrayList<Integer> diff=new ArrayList<Integer>();
		for(int w=0; w<splitted.length;w++)
		{
			diff.add(splitted[w].length()-splwodup[w].length());
		}
		
		int output=Collections.max(diff)+1;
		System.out.println(output);
	}
}
