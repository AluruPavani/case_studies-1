import java.util.*;
public class StringFromUpperToLower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr=new Scanner(System.in);
		String str="";
		System.out.println("Enter any string : ");
		str=scnr.nextLine();
		String lowerCaseString="";
		lowerCaseString=str.toLowerCase();
		System.out.println("Original String : "+str);
		/*System.out.println("Lower Case String after conversion : "+lowerCaseString);*/
		String resultStr="";
		for(int i=0;i<lowerCaseString.length();i++) {
		if(lowerCaseString.charAt(i)>96&&lowerCaseString.charAt(i)<=122) {
			resultStr=resultStr+lowerCaseString.charAt(i);
		}
		}
		System.out.println("String after removing special characters : "+resultStr);
	}

}
