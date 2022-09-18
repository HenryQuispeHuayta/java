public class ejercicioTema4 {
  public static void main(String[] args) {

    int numeroif = 0;
    if (numeroif > 0) {
      System.out.println("El numeroif es positivo");
    } else if (numeroif < 0) {
      System.out.println("El numeroif es negativo");
    } else {
      System.out.println("El numeroif es 0");
    }

    int numeroWhile = 0;
    while (numeroWhile < 3) {
      numeroWhile++;
      System.out.println(numeroWhile);
    }

    int numeroDoWhile = 0;
    do {
      numeroDoWhile++;
      System.out.println(numeroDoWhile);
    } while (numeroDoWhile < 1);

    for (int numeroFor = 0; numeroFor < 3; numeroFor++) {
      System.out.println(numeroFor);
    }

    String estacion = "invierno";

    switch (estacion) {
      case "invierno":
        System.out.println("La estacion es " + estacion);
        break;
      case "verano":
        System.out.println("La estacion es " + estacion);
        break;
        case "primavera":
        System.out.println("La estacion es " + estacion);
        break;
        case "otoño":
        System.out.println("La estacion es " + estacion);
        break;
        default:
        System.out.println("No es una estacion");
        break;
    }
  }
}
