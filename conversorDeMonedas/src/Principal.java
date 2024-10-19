
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        System.out.println("**********************************************************");
        System.out.println("Bienvenido/a a mi CONVERSOR DE MONEDAS");
        System.out.println("");

        Scanner scanner=new Scanner(System.in);
        boolean estado=true;

        while(estado) {

            System.out.println("");
            System.out.println("1) Dolar [USD] => Peso argentino [ARS]");
            System.out.println("2) Peso argentino [ARS] => Dolar [USD]");
            System.out.println("3) Dolar [USD] => Real brasileño [BRL]");
            System.out.println("4) Real brasileño [BRL] => Dolar [USD]");
            System.out.println("5) Dolar [USD] => Peso colombiano [COP]");
            System.out.println("6) Peso colombiano [COP] => Dolar [USD]");
            System.out.println("7) Salir");
            System.out.println("");

            System.out.println("Digite una opción de la lista para comenzar una conversion");

            try {

                int opcion = obtenerOpcionValida(scanner);

                switch (opcion) {
                    case 1:
                        try {
                            System.out.println("Ingrese el monto a convertir");
                            double montoConvertir = obtenerMontoValido(scanner);

                            ConsultaMoneda consulta = new ConsultaMoneda();
                            Moneda moneda = consulta.obtenerValoresMoneda("USD");

                            if (moneda == null || moneda.conversion_rates() == null) {
                                System.out.println("Error al obtener la cotización. Inténtelo más tarde.");
                                continue;
                            }

                            double cotizacion = consulta.filtrarMonedas(moneda, "ARS");

                            float resultado = (float) (montoConvertir * cotizacion);

                            System.out.println("----------------------------------------------------------");
                            System.out.println("EL VALOR " + montoConvertir + " [USD] CORRESPONDE AL VALOR FINAL DE => " + resultado + " [ARS]");
                            System.out.println("----------------------------------------------------------");
                        } catch (Exception ex) {
                            System.out.println("Ha ocurrido un error: " + ex.getMessage());
                        }

                        break;

                    case 2:
                        try {
                            System.out.println("Ingrese el monto a convertir");
                            double montoConvertir = obtenerMontoValido(scanner);

                            ConsultaMoneda consulta = new ConsultaMoneda();
                            Moneda moneda = consulta.obtenerValoresMoneda("ARS");

                            if (moneda == null || moneda.conversion_rates() == null) {
                                System.out.println("Error al obtener la cotización. Inténtelo más tarde.");
                                continue;
                            }

                            double cotizacion = consulta.filtrarMonedas(moneda, "USD");

                            float resultado = (float) (montoConvertir * cotizacion);

                            System.out.println("----------------------------------------------------------");
                            System.out.println("EL VALOR " + montoConvertir + " [ARS] CORRESPONDE AL VALOR FINAL DE => " + resultado + " [USD]");
                            System.out.println("----------------------------------------------------------");
                        } catch (Exception ex) {
                            System.out.println("Ha ocurrido un error: " + ex.getMessage());
                        }

                        break;

                    case 3:
                        try {
                            System.out.println("Ingrese el monto a convertir");
                            double montoConvertir = obtenerMontoValido(scanner);

                            ConsultaMoneda consulta = new ConsultaMoneda();
                            Moneda moneda = consulta.obtenerValoresMoneda("USD");

                            if (moneda == null || moneda.conversion_rates() == null) {
                                System.out.println("Error al obtener la cotización. Inténtelo más tarde.");
                                continue;
                            }

                            double cotizacion = consulta.filtrarMonedas(moneda, "BRL");

                            float resultado = (float) (montoConvertir * cotizacion);

                            System.out.println("----------------------------------------------------------");
                            System.out.println("EL VALOR " + montoConvertir + " [USD] CORRESPONDE AL VALOR FINAL DE => " + resultado + " [BRL]");
                            System.out.println("----------------------------------------------------------");
                        } catch (Exception ex) {
                            System.out.println("Ha ocurrido un error: " + ex.getMessage());
                        }

                        break;

                    case 4:
                        try {
                            System.out.println("Ingrese el monto a convertir");
                            double montoConvertir = obtenerMontoValido(scanner);

                            ConsultaMoneda consulta = new ConsultaMoneda();
                            Moneda moneda = consulta.obtenerValoresMoneda("BRL");

                            if (moneda == null || moneda.conversion_rates() == null) {
                                System.out.println("Error al obtener la cotización. Inténtelo más tarde.");
                                continue;
                            }

                            double cotizacion = consulta.filtrarMonedas(moneda, "USD");

                            float resultado = (float) (montoConvertir * cotizacion);

                            System.out.println("----------------------------------------------------------");
                            System.out.println("EL VALOR " + montoConvertir + " [BRL] CORRESPONDE AL VALOR FINAL DE => " + resultado + " [USD]");
                            System.out.println("----------------------------------------------------------");
                        } catch (Exception ex) {
                            System.out.println("Ha ocurrido un error: " + ex.getMessage());
                        }

                        break;

                    case 5:
                        try {
                            System.out.println("Ingrese el monto a convertir");
                            double montoConvertir = obtenerMontoValido(scanner);

                            ConsultaMoneda consulta = new ConsultaMoneda();
                            Moneda moneda = consulta.obtenerValoresMoneda("USD");

                            if (moneda == null || moneda.conversion_rates() == null) {
                                System.out.println("Error al obtener la cotización. Inténtelo más tarde.");
                                continue;
                            }

                            double cotizacion = consulta.filtrarMonedas(moneda, "COP");

                            float resultado = (float) (montoConvertir * cotizacion);

                            System.out.println("----------------------------------------------------------");
                            System.out.println("EL VALOR " + montoConvertir + " [USD] CORRESPONDE AL VALOR FINAL DE => " + resultado + " [COP]");
                            System.out.println("----------------------------------------------------------");
                        } catch (Exception ex) {
                            System.out.println("Ha ocurrido un error: " + ex.getMessage());
                        }

                        break;

                    case 6:
                        try {
                            System.out.println("Ingrese el monto a convertir");
                            double montoConvertir = obtenerMontoValido(scanner);

                            ConsultaMoneda consulta = new ConsultaMoneda();
                            Moneda moneda = consulta.obtenerValoresMoneda("COP");

                            if (moneda == null || moneda.conversion_rates() == null) {
                                System.out.println("Error al obtener la cotización. Inténtelo más tarde.");
                                continue;
                            }

                            double cotizacion = consulta.filtrarMonedas(moneda, "USD");

                            float resultado = (float) (montoConvertir * cotizacion);

                            System.out.println("----------------------------------------------------------");
                            System.out.println("EL VALOR " + montoConvertir + " [COP] CORRESPONDE AL VALOR FINAL DE => " + resultado + " [USD]");
                            System.out.println("----------------------------------------------------------");
                        } catch (Exception ex) {
                            System.out.println("Ha ocurrido un error: " + ex.getMessage());
                        }

                        break;

                    case 7:
                        System.out.println("Gracias por utilizar mi servicio. ¡Nos vemos pronto!");
                        estado = false;
                        break;


                    default:
                        System.out.println("¡ATENCIÓN! Ha digitado una opción incorrecta. Verifique las opciones disponibles y vuelva a intentarlo.");
                        break;
                }
            }catch(InputMismatchException ex){
                System.out.println("");
            }
        }
    }

    public static double obtenerMontoValido(Scanner scanner) {
        double monto = 0;
        boolean montoValido = false;

        while (!montoValido) {
            try {
                monto = scanner.nextDouble();
                if (monto <= 0) {
                    System.out.println("El monto debe ser mayor que 0. Intente nuevamente:");
                } else {
                    montoValido = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Solo se permiten números. Intente nuevamente:");
                scanner.next();
            }catch (Exception e) {
                System.out.println("Ocurrió un error cuando ingresó el monto. Intente nuevamente:");
                scanner.next();
            }
        }

        return monto;
    }

    public static int obtenerOpcionValida(Scanner scanner) {
        int opcion = 0;
        boolean opcionValida = false;

        while (!opcionValida) {
            try {
                opcion = scanner.nextInt();
                if (opcion >= 1 && opcion <= 7) {
                    opcionValida = true;
                } else {
                    System.out.println("Error: La opción debe estar entre 1 y 7. Intente nuevamente:");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Solo se permiten números. Intente nuevamente:");
                scanner.next(); // Limpiar el scanner
            }
        }

        return opcion;
    }

}
