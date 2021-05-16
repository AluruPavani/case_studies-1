import java.io.IOException;
import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class EmployeeDatabase {

	public static void main(String[] args) throws IOException {
		File file=new File("C:\\\\Users\\\\aluru.pavani\\\\OneDrive - HCL Technologies Ltd\\\\Documents\\\\EmployeeData.xlsx");
		/*Path path=Paths.get("C:\\Users\\aluru.pavani\\OneDrive - HCL Technologies Ltd\\Documents\\EmployeeData.xlsx");*/
	
		String code;
		
		Scanner scnr=new Scanner(System.in);
		System.out.println("Enter the number:");
		code=scnr.nextLine();
		Files.lines(path)
		.filter(str->str.contains(code))
		.forEach(System.out::println);
		/*System.out.println("Enter the card number:");
		str2=scnr.nextLine();
		Files.lines(path1)
		.filter(str->str.contains(str2))
		.forEach(System.out::println);*/
		

	}

}
