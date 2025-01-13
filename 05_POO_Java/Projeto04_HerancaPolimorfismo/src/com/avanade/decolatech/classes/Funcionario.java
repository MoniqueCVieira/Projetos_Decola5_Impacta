package com.avanade.decolatech.classes;

public class Funcionario extends Pessoa{
	private String cargo;
	private double salario;
	
	public String getCargo() {
		return cargo;
	}
	
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String getDados() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.getDados()).append("\n\n")
			.append("Cargo: ").append(this.getCargo())
			.append("\nSalário: ").append(this.getSalario());
		
		return builder.toString();
	}
}