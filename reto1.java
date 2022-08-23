import java.util.Scanner;

public class reto1{
    public static void main(String[] args) {

        int n1;
        int n2;
        int r;

        Scanner sc=new Scanner(System.in);
        System.out.println("Captura Operacion: ");
        String operacion = sc.nextLine();

            if ("SUMA".equals(operacion)) {

                System.out.println("Operando 1: ");
                n1=sc.nextInt();
                System.out.println("Operando 2: ");
                n2=sc.nextInt();

                r = n1 + n2;

                System.out.println(n1 + " + " + n2 + " = " + r);

            } else if ("RESTA".equals(operacion)) {

                System.out.println("Operando 1: ");
                n1=sc.nextInt();
                System.out.println("Operando 2: ");
                n2=sc.nextInt();

                r = n1 - n2;

                System.out.println(n1 + " - " + n2 + " = " + r);

            } else if ("MULTIPLICACION".equals(operacion)) {

                System.out.println("Operando 1: ");
                n1=sc.nextInt();
                System.out.println("Operando 2: ");
                n2=sc.nextInt();

                r = n1 * n2;

                System.out.println(n1 + " * " + n2 + " = " + r);

            } else if ("DIVISION".equals(operacion)) {
                System.out.println("Operando 1: ");
                n1=sc.nextInt();
                System.out.println("Operando 2: ");
                n2=sc.nextInt();

                r = n1 / n2;

                System.out.println(n1 + " / " + n2 + " = " + r);
            } else {

                System.out.println("Operacion no soportada");
            }
    }

}
