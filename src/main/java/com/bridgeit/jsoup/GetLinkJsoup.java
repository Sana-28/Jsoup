package com.bridgeit.jsoup;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GetLinkJsoup
{
   public static void main(String[] args) throws IOException {
      
      Document document=Jsoup.connect("http://www.javatpoint.com").get();
      Elements links=document.select("a[href]");
      
      for(Element link:links) {
         System.out.println("\nlink : " + link.attr("href"));  
         System.out.println("text : " + link.text());  
      }
      }
}
