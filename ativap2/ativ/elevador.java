package ativ;

public class elevador {
	private int terreo = 0;
	private int total;
	private int cap_pessoas;
	private int pessoas = 0;

	public void set_terreo(int a) {
		this.terreo = a;
	}

	public void set_total(int a1) {
		this.total = a1;
	}

	public void set_cap_pessoas(int cao) {
		this.cap_pessoas = cao;
	}

	public void set_pessoas(int Pessoas) {
		this.pessoas = Pessoas;
	}

	public int get_terreo() {
		return (terreo);
	}

	public int get_total() {
		return (total);
	}

	public int get_cap_pessoas() {
		return (cap_pessoas);
	}

	public int get_pessoas() {
		return (pessoas);
	}

	public void init(int cao, int a1) {
		this.set_cap_pessoas(cao);
		this.set_total(a1);
	}

	public void ent() {
		if (pessoas < cap_pessoas) {
			pessoas = pessoas + 1;
		} else {
			System.out.println("o elevador esta lotado");
		}
	}

	public void sai() {
		if (pessoas > 0) {
			pessoas = pessoas - 1;
		} else {
			System.out.println("o elevador esta vazio");
		}
	}

	public void up() {
		if(terreo < total) {
			terreo = terreo + 1;
		} else {
			System.out.println("voce chegou no ultimo andar");
		}
	}

	public void down() {
		if(terreo > 0){
			terreo = terreo - 1;
		} else {
			System.out.println("vocee chegou ao terreo");
		}
	}
}