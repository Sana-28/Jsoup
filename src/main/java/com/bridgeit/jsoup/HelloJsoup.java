package com.bridgeit.jsoup;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class HelloJsoup
{

   public static void main(String[] args) throws IOException
   {
      Document document=Jsoup.connect("http://eclipse.org").get();
      String title=document.title();
      System.out.println("Title->>"+title);

   }

}
