package com.dialforhire.DialForHire;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlElement;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

public class Test {
	
	public static String getPhone(String url) {
		Map<String,String> classes = new HashMap<String,String>();
		classes.put("9d001", "0");
		classes.put("9d002", "1");
		classes.put("9d003", "2");
		classes.put("9d004", "3");
		classes.put("9d005", "4");
		classes.put("9d006", "5");
		classes.put("9d007", "6");
		classes.put("9d008", "7");
		classes.put("9d009", "8");
		classes.put("9d010", "9");
		
		Map<String,String> test = new HashMap<String,String>();
		
		StringBuffer sb = new StringBuffer();
		
		WebClient client = new WebClient();  
		client.getOptions().setCssEnabled(false);  
		client.getOptions().setJavaScriptEnabled(false);  
		try {  
		
		  String searchUrl = url;
		 HtmlPage page = client.getPage(searchUrl);
		 String pageSource = page.asXml();
		 String data[]=pageSource.split("moz-osx-font-smoothing:grayscale");
		 data=data[2].split(".mobilesv");
		 data[0]=data[0].substring(2, data[0].length()-1);
		 data = data[0].split("\\.");
		
		for(int i=0;i<data.length;i++) {
			String tempData[]=data[i].split(":");
			test.put(tempData[0], classes.get(tempData[2].substring(2, tempData[2].length()-2)));	
		}
		
		 List<HtmlElement> element = (List<HtmlElement>) page.getByXPath("//*[@id=\"comp-contact\"]/span[2]/a/span"); 
		  for(int i=0;i<element.size();i++) {
			
			 String tempClass = element.get(i).getAttribute("class").split("\\s+")[1];
			 if(test.get(tempClass)!=null) {
				 sb.append(test.get(tempClass));
			 }
			 
			 if(sb.length()%13==0) {
				 sb.append("&");
			 }
		  }
		  
		}catch(Exception e) {
			System.out.println(e);
			
		}
		return sb.toString();
	}}
		 
	
