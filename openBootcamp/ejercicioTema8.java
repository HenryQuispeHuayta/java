public class ejercicioTema8 {
  public static void main(String[] args) {
    Persona persona = new Persona();
    persona.setEdad(20);
    persona.setNombre("Ernesto");
    persona.setTelefono(123456789);

    System.out.println("El nombre de la persona es " + persona.getNombre() + " tiene " + persona.getEdad() + " años y su telefono es "
        + persona.getTelefono());

  }
}

class Persona {
  private int edad;
  private String nombre;
  private int telefono;

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public int getEdad() {
    return this.edad;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getNombre() {
    return nombre;
  }

  public void setTelefono(int telefono) {
    this.telefono = telefono;
  }

  public int getTelefono() {
    return telefono;
  }
}
