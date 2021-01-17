package Planetas;

public class Planeta {

	private String nombre;
	private float dia;
	
	public Planeta(String nombre, float dia) {
		this.nombre = nombre;
		this.dia = dia;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getDia() {
		return dia;
	}
	public void setDia(float dia) {
		this.dia = dia;
	}
	
	public float oEdad(float edad){
		float edadPlaneta =(edad * 365) / this.dia;
		return edadPlaneta;
	}
}

