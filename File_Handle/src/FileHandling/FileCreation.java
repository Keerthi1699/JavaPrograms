package FileHandling;

import java.io.File;
import java.io.IOException;

public class FileCreation {

	public static void main(String[] args) {

		//FOLDER CREATION:----------------------------------------
		
//		File folder = new File("C:\\Users\\Administrator\\Desktop\\F1\\html\\webpage");
//		boolean present = folder.exists();
//		System.out.println("Folder present: " + present);
//		if(present == false)
//			folder.mkdirs();
//		
//		present = folder.exists();
//		System.out.println("Folder present: " + present);

		//FILE CREATION:------------------------------------------
		
//		File file = new File("C:\\Users\\Administrator\\Desktop\\F1\\FlowerS.txt");
//		boolean present = file.exists();
//		if(present == false)
//			try {
//				boolean created = file.createNewFile();
//				System.out.println("File Created  " + created);
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
		
		//FILE DELETION:------------------------------------------
		
//		File file = new File("C:\\Users\\Administrator\\Desktop\\F1\\FlowerS.txt");
//		file.delete();
//		boolean present = file.exists();
//		System.out.println("File present: " + present);
		
		//FILE RENAME:--------------------------------------------
		
//		File file = new File("C:\\Users\\Administrator\\Desktop\\F1\\Car.txt");
//		try {
//			file.createNewFile();
//			boolean present = file.exists();
//			System.out.println(" File Present:  " + present);
//		} catch (IOException e) {
//		    	e.printStackTrace();
//		}
//		File newFileName = new File("C:\\Users\\Administrator\\Desktop\\F1\\Flow.txt");
//		boolean renameSuccess = file.renameTo(newFileName);
//		System.out.println(" Rename Success " + renameSuccess);		
		
    	//PRINT FILE NAME:----------------------------------------- 
	
//		System.out.println(" File Name:  " + newFileName.getName());
//		System.out.println(file.canExecute());
//		System.out.println(file.canRead());
//		System.out.println(file.canWrite());
		
		//LISTING ALL FILE AND FOLDER IN DIRECTORY:-----------------
		
//		File file = new File("C:\\Users\\Administrator\\Desktop");
//		String[] listofFileFold = file.list();
//		for(int i=0; i<listofFileFold.length; i++)
//			System.out.println(listofFileFold[i]);
		
		//LISTING ONLY FILES IN A DIRECTORY:------------------------
		
//		File file = new File("C:\\Users\\Administrator\\Desktop");
//		File[] fileFolderList = file.listFiles();
//		for(File f : fileFolderList)
//			if(f.isFile())
//				System.out.println(f.getName());
		
		//LISTING ONLY FOLDERS IN A DIRECTORY:-----------------------

//		File file = new File("C:\\Users\\Administrator\\Desktop");
//		File[] fileFolderList = file.listFiles();
//		for(File f : fileFolderList)
//			if(f.isDirectory())
//				System.out.println(f.getName());
		
		//LISTING ONLY .TXT FILES:-----------------------------------
		
//		File file = new File("C:\\Users\\Administrator\\Desktop\\F1");
//		File[] fileFolderArray = file.listFiles();
//		for(File f: fileFolderArray)
//		{
//			if(f.isFile())
//			{
//				String fileName = f.getName();
//				int lastDot = fileName.lastIndexOf(".");
//				String extension = fileName.substring(lastDot+1);
//				if(extension.equals("txt"))
//				{
//					System.out.println(fileName);
//				}
//			}
//		}

		
	}

}
