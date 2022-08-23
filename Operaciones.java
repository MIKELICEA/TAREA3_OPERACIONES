public class Operaciones{
    public static void main(String[] args) {
        int suma;
        int resta;
        int multi;
        int divi;

        int i=0;
        while (i < args.length) {
            if ("SUMA".equals(args[i])) {

                suma = Integer.parseInt(args[i + 1]) + Integer.parseInt(args[i + 2]);

                System.out.println(args[i + 1] + " + " + args[i + 2] + " = " + suma);

            } else if ("RESTA".equals(args[i])) {

                resta = Integer.parseInt(args[i + 1]) - Integer.parseInt(args[i + 2]);

                System.out.println(args[i + 1] + " - " + args[i + 2] + " = " + resta);

            } else if ("MULTIPLICACION".equals(args[i])) {
                multi = Integer.parseInt(args[i + 1]) * Integer.parseInt(args[i + 2]);

                System.out.println(args[i + 1] + " * " + args[i + 2] + " = " + multi);

            } else if ("DIVISION".equals(args[i])) {
                divi = Integer.parseInt(args[i + 1]) / Integer.parseInt(args[i + 2]);

                System.out.println(args[i + 1] + " / " + args[i + 2] + " = " + divi);
            }
            i++;
        }
    }
}