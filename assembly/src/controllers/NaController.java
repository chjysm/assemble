package controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.JsonParser;

import dao.NaverDAO;


@WebServlet("*.log")
public class NaController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String reqUri = request.getRequestURI();
		String ctxPath = request.getContextPath();
		String cmd = reqUri.substring(ctxPath.length());
		NaverDAO na = new NaverDAO();
		Gson g = new Gson();
		JsonParser parse = new JsonParser();
		if(cmd.equals("/login.log")) {
			String apiURL=na.login();
			response.sendRedirect(apiURL);
		}else if(cmd.equals("/callback.log")) {
			String code = request.getParameter("code");
			String state = request.getParameter("state");
			String res = na.getToken(code, state);
			
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
