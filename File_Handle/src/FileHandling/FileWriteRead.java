package FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteRead {

	public static void main(String[] args) {
		
		//FILEWRITER AND FILEREADER:---------------------------------------
		
//		File file = new File("C:\\Users\\Administrator\\Desktop\\F1\\car.txt");
//		try {
//			file.createNewFile();
//			FileWriter writer = new FileWriter(file);   //constructor
//          writer.write(97); 
//			writer.write(" Hello World !!! ");
//			writer.flush();
//			writer.close();
//			
//			FileReader fileReader = new FileReader(file);
//			int output = fileReader.read();
//			while(output!=-1) {
//				System.out.println(output); 
//				System.out.print((char) output);
//				output = fileReader.read();
//			}
//		} catch(IOException e) {
//			e.printStackTrace();
//		}

		//BUFFERWRITER AND BUFFERREADER:---------------------------------------
		
//		File file = new File("C:\\Users\\Administrator\\Desktop\\F1\\car.txt");
//		FileWriter fWriter;
//		try {
//			fWriter = new FileWriter(file);
//			BufferedWriter bWriter = new BufferedWriter(fWriter);
//			bWriter.write("Tamil");
//			bWriter.newLine();
//			bWriter.write("English");
//			bWriter.newLine();
//			bWriter.write("Maths");
//			bWriter.newLine();
//			bWriter.write("Physics");
//			bWriter.newLine();
//			bWriter.write("Computer Science");
//			bWriter.newLine();
//			bWriter.flush();
//			bWriter.close();
//			
//			FileReader fReader = new FileReader(file);
//			BufferedReader bReader = new BufferedReader(fReader);
//			String line = bReader.readLine();
//			while(line!=null) {
//				System.out.println(line);
//				line = bReader.readLine();  
//			}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
		
	}

}
