package br.com.gerenciador.servelet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class removeEmpresaServelet
 */
@WebServlet("/removeEmpresaServelet")
public class removeEmpresaServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		var paramId = request.getParameter("id");
		var id =Integer.valueOf(paramId);
		
		var banco = new Banco();
		try {
		banco.remove(id);
		}catch(Exception ex) {
			response.sendRedirect("ListaEmpresaServelet");
		}
		response.sendRedirect("ListaEmpresaServelet");
	}

}
