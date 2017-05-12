package com.servlet.tools;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.servlet.utils.MathUtils;

@WebServlet("/MathServlet")
public class MathServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MathServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String action = request.getParameter("action");
		int firstParam = Integer.parseInt(request.getParameter("a"));
		int secondParam = Integer.parseInt(request.getParameter("b"));

		int result = 0;

		switch (action) {
		case "+":
			result = MathUtils.add(firstParam, secondParam);
			break;
		case "*":
			result = MathUtils.mult(firstParam, secondParam);
			break;
		case "-":
			result = MathUtils.sub(firstParam, secondParam);
			break;
		case "/":
			result = MathUtils.div(firstParam, secondParam);
		default:
			break;
		}

		response.getWriter().append("<b>Result: </b>" + result);
		
		PrintWriter out = response.getWriter();
		out.println("<p><button onclick='javascript:history.back();'>Go Back</button></p>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
