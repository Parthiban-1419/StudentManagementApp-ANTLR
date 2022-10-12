package com.es;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/logs")
public class Logs extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		try {
			LogManager log = new LogManager(request.getParameter("index"));
			String jString = request.getParameter("jArray"), query = request.getParameter("query");

//			else
//				log.luceneSearch(request.getParameter("field"), request.getParameter("query"), request.getParameter("endValue"));

			System.out.println(query);
			if(jString == null) {
				out.print(log.getDataByLucene(query));
			}
			else{
				JSONArray jArray = (JSONArray) new JSONParser().parse(jString);
				for(Object object: jArray)
					log.putLog((JSONObject) object);
			}
		} catch (Exception e) {
			out.print(e);
		}
	}
}
