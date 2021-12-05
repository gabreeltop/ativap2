package ativ;

public class pessoa {

	private String nome;
	private int ano;
	private Float h;

	public void set_nome(String nome) {
		this.nome = nome;
	}

	public void set_n_ano(int n_ano) {
		this.ano = n_ano;
	}

	public void set_height(Float h) {
		this.h = h;
	}

	public String get_nome() {
		return (nome);
	}

	public int get_n_ano() {
		return (ano);
	}

	public Float get_height() {
		return (h);
	}

	public void print() {
		System.out.println(this.nome);
		System.out.println(String.valueOf(this.ano));
		System.out.println(Float.toString(this.h));
	}

	public int calc_idade() {
		return (2021 - this.ano);
	}
}