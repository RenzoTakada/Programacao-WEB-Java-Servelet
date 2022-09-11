package br.com.gerenciador.servelet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {
	private static List<Empresa> listempresa = new ArrayList<>();;
	private static int chaveSequencial=1;

	public void adiciona(Empresa empresa) {
		empresa.setId(Banco.chaveSequencial++);
		Banco.listempresa.add(empresa);
	
	}
	public List<Empresa> ConsultaEmpresa(){
		return Banco.listempresa;
	}
	public void remove(int id) {
	
		for (Empresa empresa : listempresa) {
			if(empresa.getId() == id) {
				listempresa.remove(empresa);
			}else {
				break;
			}
		}
		
	}
	
}
