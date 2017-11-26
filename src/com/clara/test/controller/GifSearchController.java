package com.clara.test.controller;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.clara.test.pojo.ResponseData;
import com.google.gson.Gson;

@Controller
@EnableAutoConfiguration
public class GifSearchController {

	   @RequestMapping("/hello/")
	    @ResponseBody
	    String home() {
	        return "Hello World!";
	    }
	   @RequestMapping("/search/{querystr}")
	    @ResponseBody
	    String search(@PathVariable("querystr") String querystr) {
//		   System.out.println(getGiphyResponse("test", 5));
		   if(querystr == null )
		   {
			   return "";
		   }
	        return getGiphyResponse(querystr, 5);
	    }
	   
	   String getGiphyResponse(String queryStr, int limit) {
		   HttpURLConnection connection = null;
//		   https://api.giphy.com/v1/gifs/search?api_key=3rvf3F5sV3bFOQH2Uot9ZEDOYHnmOZv5&q=test&limit=25&offset=0&rating=G&lang=en
		   final String giphyURL = "https://api.giphy.com/v1/gifs/search?";
		   final String giphyAppKey = "3rvf3F5sV3bFOQH2Uot9ZEDOYHnmOZv5";
		   try {
		     //Create connection
		     URL url = new URL(giphyURL+"q="+queryStr+"&api_key="+giphyAppKey+"&limit="+limit);
		     System.out.println(url.toString());
		     connection = (HttpURLConnection) url.openConnection();
		     connection.setRequestMethod("GET");

		     connection.setUseCaches(false);
		     connection.setDoOutput(true);


		     //Get Response  
		     InputStream is = connection.getInputStream();
		     BufferedReader rd = new BufferedReader(new InputStreamReader(is));
		     StringBuilder response = new StringBuilder(); // or StringBuffer if Java version 5+
		     String line;

		     while ((line = rd.readLine()) != null) {
		       response.append(line);
		       response.append('\r');
		     }
		     rd.close();
		     Gson gson = new Gson();
		     ResponseData body = gson.fromJson(response.toString(), ResponseData.class);
		     
		     if(body.getData().size() != limit)
		     {
		    	 return "";
		     }		     

	
		     rd.close();
		     return response.toString();
		   } catch (Exception e) {
		     e.printStackTrace();
		     return null;
		   } finally {
		     if (connection != null) {
		       connection.disconnect();
		     }
		   }		
		   
	   }
	   
	   
}
