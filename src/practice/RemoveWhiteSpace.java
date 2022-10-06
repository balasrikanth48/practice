package practice;

public class RemoveWhiteSpace {

	public static void main(String[] args) 
	{
		String str="Selenium Programing    launague";
		str=str.replaceAll("\\s", "");
		System.out.println(str);
		
		
		//2nd methode
		char[] strArray = str.toCharArray();  
        StringBuffer stringBuffer = new StringBuffer();  
        for (int i = 0; i < strArray.length; i++) {  
            if ((strArray[i] != ' ') && (strArray[i] != '\t')) {  
                stringBuffer.append(strArray[i]);  
            }  
        }  
        String noSpaceStr2 = stringBuffer.toString();  
        System.out.println(noSpaceStr2);  
	}

}
