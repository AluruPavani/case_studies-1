/*
public class StringToByte {

	public static byte convertStringTobyte(String str) {
		return Byte.parseByte(str);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String stringValue="5";
		byte byteValue=convertStringTobyte(stringValue);
		System.out.println(stringValue+ " after converting into byte = " +byteValue);

	}

}*/
import java.util.Arrays;
public class StringToByte{
	public static void main(String[] args) {
		String str="Hi Hello";
		byte[] b=str.getBytes();
		System.out.println("Array " + b);
		System.out.println("Array as String"+Arrays.toString(b));
	}
}