import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IODemoTest {

	public static void main(String[] args) {
		try {
			FileOutputStream fos= new FileOutputStream("fos.txt");
			fos.write((int)84);
			fos.close();
		}  catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			FileInputStream fis= new FileInputStream("fos.txt");
			System.out.println((char)fis.read());
			fis.close();
		}  catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
