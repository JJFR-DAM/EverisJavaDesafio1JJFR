package variables;

public class Developer {
	
	/*
	 * Variables que componen nuestro desarrollador.
	 */
	
	public static final String empresa="EVERIS (An NTT DATA Company)";
	public static final byte MaxEmpleados=127;
	public static int ActualEmpleados=0;
	public int vacaciones=21;
	public String nombre;
	public int id;
	
	/*
	 * Métodos Getters & Setters.
	 */

	public int getId() {
		return id;
	}
	public int getVacaciones() {
		return vacaciones;
	}
	public void setVacaciones(int vacaciones) {
		this.vacaciones = vacaciones;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/*
	 * Método Constructor
	 */

	public Developer(String nombre) {
		super();
		this.nombre = nombre;
		Developer.ActualEmpleados++;
		this.id=ActualEmpleados;
	}
	

}
