package br.com.gerenciador.servelet;

import java.util.Date;

public class Empresa {
	private int id;
	private String nome;
	private Date dataAbertura;
	
	public Date getDataAbertura() {
		return dataAbertura;
	}
	public void setDataAbertura(Date dataDaEmpresa) {
		this.dataAbertura = dataDaEmpresa;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
