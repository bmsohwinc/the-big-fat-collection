package com.bms;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.*;

public class TensServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int k = Integer.parseInt(req.getParameter("k"));
		k = k * 10;
		System.out.println("k * 10 is = " + k);
		PrintWriter out = res.getWriter();
		out.println(k);
	}
}
