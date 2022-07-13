public class Calculadora {
    
    public static void soma(double n1, double n2) {
        
        double resultado = n1 + n2;
        System.out.println("A soma do número " + n1 + " mais o número " + n2 + " é = " +resultado);
    }

    public static void subtracao(double s1, double s2) {

        double resultado = s1 - s2;
        System.out.println("A subtração do número " + s1 + " menos o número " + s2 + " é = " +resultado);
    }

    public static void multiplicacao(double m1, double m2) {

        double resultado = m1 * m2;
        System.out.println("A multiplicação do número " + m1 + " vezes o número " + m2 + " é = " +resultado);
    }

    public static void divisao(double d1, double d2) {

        double resultado = d1 / d2;
        System.out.println("A divisão do número " + d1 + " pelo número " + d2 + " é = " +resultado);
    }

}
