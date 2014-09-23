package com.privacyfix.core;

import java.awt.AWTException;
import java.awt.Desktop;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.imageio.ImageIO;

import org.apache.commons.lang3.builder.ToStringStyle;

public class Logger {

	


	private static BufferedReader br;



	
	public static File createLog(String string, String text) throws Exception {


        File f = new File("Logs/source.html");
        
        if(!f.getAbsoluteFile().exists()) {
            f.createNewFile();}
        FileReader filereader = new FileReader(f.getAbsoluteFile());
        br = new BufferedReader(filereader);
      
        if (br.readLine()== null){
            FileWriter fileWritter = new FileWriter(f.getAbsoluteFile(),true);
            BufferedWriter bw = new BufferedWriter(fileWritter);
            bw.write("<html>");
            bw.write("<body>");
            bw.write("<h1>Log File</h1>");
            bw.write("<textarea cols=75 rows=30>");
            bw.write("<img src="+string+">");
            bw.write("</text" + "area>");
            bw.write("</body>");
            bw.write("</html>");
            bw.close();               
        }
        else {
        FileWriter fileWritter = new FileWriter(f.getAbsoluteFile(),true);
        BufferedWriter bw = new BufferedWriter(fileWritter);
        bw.write("<html>");
        bw.write("<body>");
        bw.write("<img src="+string+">");

        bw.close();
        
   
        }
        Desktop.getDesktop().browse(f.toURI());
        return f;
    }
	
	public static  File createLog(String text) throws Exception {


        File f = new File("Logs/source.html");
        
        if(!f.getAbsoluteFile().exists()) {
            f.createNewFile();}
        FileReader filereader = new FileReader(f.getAbsoluteFile());
        br = new BufferedReader(filereader);
      
        if (br.readLine()== null){
            FileWriter fileWritter = new FileWriter(f.getAbsoluteFile(),true);
            BufferedWriter bw = new BufferedWriter(fileWritter);
            bw.write("<html>");
            bw.write("<body>");
            bw.write("<h1>Log File</h1>");
            bw.write("<P>" +text+"</P>");
            bw.write("<text>");
           
            bw.write("</body>");
            bw.write("</html>");
            bw.close();               
        }
        else {
        FileWriter fileWritter = new FileWriter(f.getAbsoluteFile(),true);
        BufferedWriter bw = new BufferedWriter(fileWritter);
        bw.write("<html>");
        bw.write("<body>");
        bw.write("<P>" +text+"</P>");

        bw.close();
        
   
        }
        Desktop.getDesktop().browse(f.toURI());
        return f;
    }
		
	
//	public static void writeLog(String logMessage) throws Exception {

	//	File f = createLog(f);
		//bw = new BufferedWriter(new FileWriter(f));
     //   bw.write(logMessage);
	//	try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(f, true)))) {
	//	    out.println("logMessage");
	//	}catch (IOException e) {
		    //exception handling left as an exercise for the reader
	//	}
    //    System.out.println(f);
    // //   Desktop.getDesktop().browse(f.toURI());
  //  }
	
	public static String writeScreenLog() throws IOException, AWTException{

		Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
		BufferedImage capture = new Robot().createScreenCapture(screenRect);
		long startTime = System.nanoTime();
		System.out.println(startTime);
		File s;
		ImageIO.write(capture, "jpg", s= new File("Logs/"+(startTime)+".jpg"));
		System.out.println(s);
		String m = (s.toString()).replace("Logs\\","");
		System.out.println(m);		
		return m;
	
	}
	

	
}
	
