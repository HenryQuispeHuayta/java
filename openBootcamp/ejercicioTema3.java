public class ejercicioTema3 {
  public static void main(String[] args) {
    int resultado = suma(2,3,4);
    System.out.println(resultado);
    coche miCoche = new coche();
    miCoche.masPuertas();
    System.out.println(miCoche.puerta);

  }

  public static int suma(int a, int b, int c) {
    return a + b + c;
  }
}
class coche{
  public int puerta = 0;
  
  public void masPuertas(){
    puerta++;
  }
}  
