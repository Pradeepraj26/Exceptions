package exceptions;

import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;




public class SampleIoException {
	public static void main(String [] args) throws IOException {
		try {
			File f = new File("D:\\Helo.txt");
		    FileReader fr = new FileReader(f);
		    int temp = 0;
		    while((temp = fr.read())!= -1) {
			       System.out.print((char)(temp));
		}
		}
		catch(Exception eng) {
			eng.printStackTrace(); 
		}
  }

}
