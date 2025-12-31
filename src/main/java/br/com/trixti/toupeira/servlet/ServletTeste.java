package br.com.trixti.toupeira.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ServletTeste", urlPatterns = {"/servlet_teste"})
public class ServletTeste extends HttpServlet{

	private static final long serialVersionUID = -7973521392708543407L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("ENTROU NO DO GET");
		System.out.println("NOME: "+req.getParameter("nome"));
		System.out.println("IDADE:"+req.getParameter("idade"));
		
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("ENTROU NO DO POST");
		System.out.println("NOME: "+req.getParameter("nome"));
		System.out.println("IDADE:"+req.getParameter("idade"));
	}
	
	
}
