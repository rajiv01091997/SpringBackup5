package com.glo;


public class search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String content="Hello this is";
String text="is";
		content=content.trim();
        content=content.replace("\\s+"," ");
        System.out.println(content);
        for(int i=0;i<content.length();i++)
        {
            String temp="";
            while(content.charAt(i)!=' ' && i<content.length())
            {
                temp=temp+content.charAt(i);
                
                if(i<content.length()-1)
                    i++;
                else
                    break;
            }
             System.out.print(temp+" ");
            if(text.equalsIgnoreCase(temp))
                System.out.println("yes");
        }


}
}