package com.dialforhire.DialForHire;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.DomElement;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

public class GetDetails {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebClient client = new WebClient();  
		client.getOptions().setCssEnabled(false);  
		client.getOptions().setJavaScriptEnabled(false);
		
		File file = new File("C:\\DFH\\Delhi");
		File files[]= {};
		if(file.isDirectory()) {
			files = file.listFiles();
		}
		for(int i=0;i<files.length;i++) {
			BufferedReader br = new BufferedReader(new java.io.FileReader(files[i]));
			
			FileWriter fileWriter = new FileWriter(new File(file.getPath()+"\\details"+files[i].getName()));
			PrintWriter printWriter = new PrintWriter(fileWriter);
			
			int count=0;
			
			String currentLine;
			while((currentLine=br.readLine())!=null) {
				String data[] = currentLine.split("\\s+");
				HtmlPage page = client.getPage(data[1]);
				
				
				printWriter.append(count+"||");
				//get phones
				String phones = Test.getPhone(data[1]);
				printWriter.append(phones+"||");
				
				//get title
				DomElement title =  (DomElement) page.getFirstByXPath("//*[@id=\"setbackfix\"]/div[1]/div/div[1]/div[2]/div/div/h1/span/span"); 
				Iterator itr = title.getChildren().iterator();
				while(itr.hasNext()) {
					printWriter.append(itr.next()+"||");
				}
				
				
				//get address
				DomElement address = (DomElement) page.getFirstByXPath("//*[@id=\"fulladdress\"]/span/span"); 
				if(address!=null) {
					Iterator itr1 = address.getChildren().iterator();
					while(itr1.hasNext()) {
						printWriter.append(itr1.next()+"||");
					}
					
				}
				
				printWriter.append(data[1]);
				
				printWriter.println();
				count++;
				
				
			/*	TimeUnit.SECONDS.sleep(1);*/
				
			}
			fileWriter.close();
			br.close();
			printWriter.close();
			System.out.println(files[i]+" done!!!!!!");
		}
		
		client.close();
		
	}

}
