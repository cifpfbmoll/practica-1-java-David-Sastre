import java.util.Scanner;

public class Proyecto1 {
    public static void main (String [] args) {
      Scanner lector = new Scanner (System.in);
      boolean salir = false;
      int opcion; // Introducir Opción

      while (!salir){
        System.out.println("\n" + "1- Almacenar Números.");
        System.out.println("2- Invertir Números");
        System.out.println("3- Media Números tanto positivos cómo negativos y contar números.");
        System.out.println("4- Contar palabras.");
        System.out.println("5- Invertir una frase.");
        System.out.println("6- Quitar espacios de una frase.");
        System.out.println("7- Concatenar dos Cadenas");
        System.out.println("8- Cambiar vocales.");
        System.out.println("9- Codigo Ascii");
        System.out.println("10- Salir");

        try{
          System.out.println("Elige un número correcto");
          opcion = lector.nextInt();
          
          switch (opcion) {
            case 1:
              System.out.println("Vamos a crear una lista");
              almacenarnumeros(args);
              break;
            case 2:
              invertirnumeros(args);
              break;
            case 3:
              medianumeros(args);
              break;
            case 4:
              contarcaracteres(args);
              break;
            case 5:
              textoinvertido(args);
              break;
            case 6:
              textosinespacios(args);
              break;
            case 7:
              concatenarcadenas(args);
              break;
            case 8:
              cambiarvocales(args);
              break;
            case 9:
              codigoascii(args);
              break;
            case 10:
              salir = true;
              break;
            }
        }catch(Exception e) {
          System.out.println("ERROR: el número introducido no es correcto.");
        }
      }
    }

  public static void almacenarnumeros(String[] args) {
    Scanner lector = new Scanner(System.in);
    System.out.println("Introduce cinco números: ");
    int numero[] = new int[5];
    int i;
    for ( i=0; i<numero.length; i++){
      numero[i] = lector.nextInt();
    }
      System.out.println("Los números que has escrito són:");
      for ( i=0; i<numero.length; i++){
        System.out.print(numero[i]+" ");
      }
  }
  public static void invertirnumeros(String[] args){
    Scanner lector = new Scanner(System.in);
    System.out.println("Introduce cinco números: ");
    int numero[] = new int[5];
    int i;
    for ( i=0; i<numero.length; i++){
      numero[i] = lector.nextInt();
    }
      System.out.println("Los números que has escrito en orden inverso són:");
      for (i = numero.length -1; i>=0; i--){
        System.out.print(numero[i]+" ");
      }
  }
  public static void medianumeros(String[] args){
    Scanner lector = new Scanner(System.in);
    System.out.println("Introduce cinco números: ");
    int num[]= new int[5];
    int i;
    int pos=0, neg=0, zero=0;
    int sumaPos = 0;
    int sumaNeg = 0;
    for ( i=0; i<num.length; i++){
      num[i] = lector.nextInt();}
    for ( i=0; i<num.length; i++){
      if (num[i]>0){
        sumaPos += num[i];
        pos++;
      }
      else if (num[i]<0){
        sumaNeg += num[i];
        neg++;
      }
      else {
        zero ++;
      }
      if (pos > 0){
        System.out.println("La media de valores positivos es: " + sumaPos/pos);
      }else{
        System.out.println("No has introducido valores positivos.");
        }
      if (neg > 0){
        System.out.println("La media de valores negativos es: " + sumaNeg/neg);
      }else{
        System.out.println("No has introducido valores negativos.");
      }
      if (zero > 1){
        System.out.println("Has introducido " + zero + " ceros");
      }else{
        System.out.println("Has introduciso " + zero + " cero");
      }
    }
  }
  public static void contarcaracteres (String [] args){
    Scanner lector = new Scanner(System.in);
    String texto;
    System.out.println("Escribe un texto:");
    texto = lector.nextLine();
    int length = texto.length();
    System.out.println("La cantidad de carácteres es: "+ texto.length());
  }
  public static void textoinvertido (String [] args){
    Scanner lector=new Scanner(System.in);
    String texto;
    System.out.println ("Escribe un texto");
    texto = lector.nextLine();
    StringBuilder texto2 = new StringBuilder(texto);
    texto = texto2.reverse().toString();
    System.out.println(texto);
    }
  public static void textosinespacios(String [] args){
    Scanner lector=new Scanner(System.in);
    String texto;
    System.out.println ("Escribe un texto");
    texto = lector.nextLine();
    System.out.println(texto.replace(" ", ""));
  }
  public static void concatenarcadenas (String [] args){
    Scanner lector=new Scanner(System.in);
    String texto;
    System.out.println ("Escribe un texto");
    texto = lector.nextLine();
    String texto2;
    System.out.println ("Escribe otro texto");
    texto2 = lector.nextLine();
    System.out.println(texto +" "+ texto2);
  }
  public static void cambiarvocales (String [] args){
    Scanner lector=new Scanner (System.in);
    String texto;
    System.out.println("Escribe una palabra o texto.");
    texto = lector.nextLine();
    String vocal;
    System.out.println("Elije una vocal.");
    vocal = lector.nextLine();
    String vocales="[aeiouAEIOU]";
    System.out.println(texto.replaceAll(vocales, vocal));
  }
  public static void codigoascii (String [] args){
    Scanner lector=new Scanner (System.in);
    String texto;
    System.out.println("Escribe una palabra o texto.");
    texto = lector.nextLine();
    int i;
    for (i = 0; i<texto.length(); i++){
      char character = texto.charAt(i);
      int codAscii = (int) character;
      System.out.println(codAscii);
    }    
  }
}
