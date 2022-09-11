package br.com.gerenciador.servelet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ListaEmpresaServelet")
public class ListaEmpresaServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		var banco  =new Banco();
		var lista = banco.ConsultaEmpresa();
		
		request.setAttribute("empresas", lista);
		RequestDispatcher rd = request.getRequestDispatcher("/ListaEmpresa.jsp");
		rd.forward(request, response);
	}



}
