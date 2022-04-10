package MyFindAndReplace;

import java.io.*;
import java.util.*;


public class FindAndReplace 
{
	public static void main(String[] args) 
	{
		//BufferedReader readFile;
        
        //BufferedWriter writeFile;
        String oldData = "";
        FileWriter out;
        String fileName;
        BufferedReader reader = null;
        BufferedWriter writer = null;
        

		
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Name of your file");
		fileName = input.nextLine();
		fileName = fileName + ".txt";
		File dataFile = new File(fileName);
		
		
		System.out.println("What Word or Phrase Would You Like to Find");
		String findWord = input.nextLine();
		
		
		System.out.println("What Word or Phrase Would You Like to Replace " + findWord + " With");
		String replaceWord = input.nextLine();
		
		
		
		
		try 
		{
			//out = new FileWriter(dataFile);
			//writeFile = new BufferedWriter(out);
			reader = new BufferedReader(new FileReader(dataFile));
			
			String currentLine = reader.readLine();
			
			while(currentLine != null) 
			{
				oldData += currentLine + System.lineSeparator();
				currentLine = reader.readLine();
				
				
			}
			
			String newData = oldData.replaceAll(findWord, replaceWord);
			

			
			
			writer = new BufferedWriter(new FileWriter(dataFile));
			
			writer.write(newData);
			
			//writeFile.write(finalWord);
			System.out.println("New Data Written To File");
		}
		
		
		catch(IOException e)
		
		{
			System.out.println("Problem Reading File");
			System.err.println("IO Exception: " + e.getMessage());
		}
		
		finally {
            //10
            try {
                if (reader != null) {
                    reader.close();
                }

                if (writer != null) {
                    writer.close();
                }

            } catch (IOException e) {
                //handle exception
            }
		}
		
	}

}
