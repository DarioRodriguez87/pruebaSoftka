package prueba.clases;

public class Maletas {
	
	public String nombres;
	public int peso;
	public Double precio;
	
	public Maletas() { }
	
	public Maletas(int peso, Double precio, String nombres) {
		this.peso = peso;
		this.precio = precio;
		this.nombres = nombres;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}		

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	@Override
	public String toString() {
		return "Maletas [nombres=" + nombres + ", peso=" + peso + ", precio=" + precio + "]";
	}			
}
