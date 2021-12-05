package ativ;

public class estacionamento {
	private int h_ent = 0;
	private int h_sai = 0;
	private int placa = 0;
	private String carro = "";

	public void set_ent(int ent) {
		this.h_ent = ent;
	}

	public void set_sai(int sai) {
		this.h_sai = sai;
	}

	public void set_placa(int n) {
		this.placa = n;
	}

	public void set_carro(String c) {
		this.carro = c;
	}

	public int get_ent() {
		return (h_ent);
	}

	public int get_sai() {
		return (h_sai);
	}

	public int get_placa() {
		return (placa);
	}

	public String get_carro() {
		return (carro);
	}

	public void print() {
		System.out.println(this.h_ent);
		System.out.println(this.h_sai);
		System.out.println(this.placa);
		System.out.println(this.carro);
	}

	public float valor_pag() {
		return (float) (1.5 * (h_sai - h_ent));
	}
}