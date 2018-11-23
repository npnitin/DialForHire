package com.dialforhire.DialForHire;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlElement;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

public class GetAllList {
	
	public static void main(String[] args) throws FailingHttpStatusCodeException, MalformedURLException, IOException, InterruptedException {
		
		WebClient client = new WebClient();  
		client.getOptions().setCssEnabled(false);  
		client.getOptions().setJavaScriptEnabled(false);  
		FileWriter fileWriter = new FileWriter("C:\\DFH\\delhi\\trucks.txt");
		PrintWriter printWriter = new PrintWriter(fileWriter);
		int count =1;
		
		
		
		
		
		for(int j=1;;j++) {
			String searchUrl = "https://www.justdial.com/Delhi/Trucks-On-Hire/nct-10499584/page-"+j;
			HtmlPage page = client.getPage(searchUrl);
			if(page == null)
				break;
			List<HtmlElement> element = (List<HtmlElement>) page.getByXPath("//*[@id=\"tab-5\"]/ul/li"); 
			if(element==null || element.isEmpty()) {
				break;
			}
			for(int i=0;i<element.size();i++) {
				HtmlElement e = element.get(i);
				printWriter.append(count+" "+e.getAttribute("data-href"));
				printWriter.println();
				System.out.println(count++);
			}
			TimeUnit.SECONDS.sleep(2);
		}
		
		
		
		
		
		
		
		 printWriter.close();
		 client.close();
	}

}
