package com.bms;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.*;

public class SquareServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int k = (int) req.getAttribute("k");
		k = k * k;
		System.out.println("k is = " + k);
		res.sendRedirect("tens?k=" + k);
	}
}
