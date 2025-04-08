import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nombre = "Tony Stark";
        String tipoDeCuenta = "Corriente";
        double saldo = 1599.99;
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("***************");
        String datosCuenta = """
                Nombre: %s
                Tipo de cuenta: %s
                Saldo: %.2f
                """.formatted(nombre, tipoDeCuenta, saldo);
        System.out.println(datosCuenta);
        String menu = """
                ********************
                MENU - (Ingrese la opción) 
                ********************
                1 - Consultar saldo
                2 - Retirar
                3 - Depositar
                9 - Salir 
                ********************
                """;
        while (opcion != 9) {
            System.out.println(menu);
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Su saldo es: $" + saldo);
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad que quiere retirar:");
                    double saldoRetiro = teclado.nextDouble();
                    if (saldo > saldoRetiro){
                         saldo = saldo - saldoRetiro;
                        System.out.println("Su saldo actualizado es: $" + saldo);
                    } else {
                        System.out.println("Saldo Insuficiente");
                    }
                    break;
                case 3:
                    System.out.println("Ingrese la cantidad que quiere depositar");
                    double saldodeposito = teclado.nextDouble();
                    saldo += saldodeposito;
                    System.out.println("Su saldo actualizado es: $" + saldo);
                    break;
                case 9:
                    System.out.println("Gracias por utilizar el programa!!!");
                    break;
                default:
                    System.out.println("Ingrese la opcion correcta");
            }
        }
    }
}
