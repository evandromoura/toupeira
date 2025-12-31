package br.com.trixti.toupeira.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ServletMedia", urlPatterns = {"/servlet_media"})
public class ServletMedia extends HttpServlet{


		private static final long serialVersionUID = -7973521392708543407L;

		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
			System.out.println("ENTROU NO DO GET");
			// System.out.println("MEDIA: "+req.getParameter("n1"));
			
			int n1 = Integer.parseInt(req.getParameter("n1"));
			int n2 = Integer.parseInt(req.getParameter("n2"));
			int n3 = Integer.parseInt(req.getParameter("n3"));
			int n4 = Integer.parseInt(req.getParameter("n4"));
			
			int media = (n1+n2+n3+n4)/4;
			System.out.println("MEDIA: "+media);
			
			
		}

		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			System.out.println("ENTROU NO DO POST");
			int n1 = Integer.parseInt(req.getParameter("n1"));
			int n2 = Integer.parseInt(req.getParameter("n2"));
			int n3 = Integer.parseInt(req.getParameter("n3"));
			int n4 = Integer.parseInt(req.getParameter("n4"));
			
			int media = (n1+n2+n3+n4)/4;
			System.out.println("MEDIA: "+media);
		}
		
		

}
