package modelo.mundo;

public class Empleado extends Persona{
	
	private String cargo;
	private double sueldo;

	public Empleado(String nombre, int cedula, String cargo, double sueldo) {
		super(nombre, cedula);
		this.cargo = cargo;
		this.sueldo = sueldo;
	}
	public String getCargo() {
		return cargo;
	}

	public double getSueldo() {
		return sueldo;
	}
	@Override
	public String toString() {
		return "Empleado [cargo=" + cargo + ", sueldo=" + sueldo + ", genero=" + ", nombre=" + nombre
				+ ", cedula=" + cedula + "]";
	}

}
