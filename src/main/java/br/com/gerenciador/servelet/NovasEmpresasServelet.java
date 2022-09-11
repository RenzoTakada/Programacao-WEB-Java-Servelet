package br.com.gerenciador.servelet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/NovasEmpresasServelet")
public class NovasEmpresasServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		var nomeEmpresa = request.getParameter("nome");
		var dataDaEmpresa = request.getParameter("dataEmpresa");
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
		var empresa = new Empresa();
		empresa.setNome(nomeEmpresa);
		Date dataFormatada;
		try {
			
			empresa.setDataAbertura( formato.parse(dataDaEmpresa));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		var banco = new Banco();
		banco.adiciona(empresa);
		
		response.sendRedirect("ListaEmpresaServelet");
		
		/*chamando JSP*/
//		RequestDispatcher rd = request.getRequestDispatcher("/ListaEmpresaServelet");
//		request.setAttribute("empresa", empresa.getNome());
//		request.setAttribute("dataformata", empresa.getDataAbertura());
//		rd.forward(request, response);
	}

}
