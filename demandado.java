package delitos;

public class demandado extends persona{

	public demandado() {
		super();
		// TODO Auto-generated constructor stub
	}

	public demandado(String primerNombre, String segundoNombre, String primerApellido, String segundoApellido,
			char genero, int edad) {
		super(primerNombre, segundoNombre, primerApellido, segundoApellido, genero, edad);
		// TODO Auto-generated constructor stub
	}
    
	public void realizarAccion() {
        System.out.println(getPrimerNombre() + getPrimerApellido() + " está demandado.");
    }

}
