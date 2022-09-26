public class ejercicioTema9 {
  public static void main(String[] args) {
    Cliente cliente = new Cliente();
    cliente.setEdad(20);
    cliente.setNombre("Fernando");
    cliente.setTelefono(12345678);
    cliente.setCredito(29999.9);

    System.out.println(cliente.getNombre() + " tiene " + cliente.getEdad() + " años, su numero de telefono es "
        + cliente.getTelefono() + " y tiene un credito de " + cliente.getCredito());

    Trabajador trabajador = new Trabajador();
    trabajador.setEdad(20);
    trabajador.setNombre("Fernando");
    trabajador.setTelefono(12345678);
    trabajador.setSalario(2999.9);

    System.out.println(trabajador.getNombre() + " tiene " + trabajador.getEdad() + " años, su numero de telefono es "
        + trabajador.getTelefono() + " y su salario es " + trabajador.getSalario());

  }
}

class Persona {
  private int edad;
  private String nombre;
  private int telefono;

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getTelefono() {
    return telefono;
  }

  public void setTelefono(int telefono) {
    this.telefono = telefono;
  }
}

class Cliente extends Persona {
  private double credito;

  public double getCredito() {
    return credito;
  }

  public void setCredito(double credito) {
    this.credito = credito;
  }
}

class Trabajador extends Persona {
  private double salario;

  public double getSalario() {
    return salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }
}