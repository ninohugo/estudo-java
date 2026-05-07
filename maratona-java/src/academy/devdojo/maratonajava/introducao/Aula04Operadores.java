package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int numero01 = 10;
        int numero02 = 20;

        System.out.println(numero01 - numero02);

        // %
        int resto = 21 % 7;
        System.out.println(resto);

        // < > <= >= == != (Sempre booleanos)
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezigualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 20;
        System.out.println(isDezMaiorQueVinte);
        System.out.println(isDezMenorQueVinte);
        System.out.println(isDezigualVinte);
        System.out.println(isDezIgualDez);
        System.out.println(isDezDiferenteDez);
        System.out.println("**********************");

        // && (AND) || (OR) ! (NOT)
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario > 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario > 3381;
        System.out.println(isDentroDaLeiMaiorQueTrinta);
        System.out.println(isDentroDaLeiMenorQueTrinta);
        System.out.println("***********************");

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000;
        boolean isPlaystation5Compravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println(isPlaystation5Compravel);
        System.out.println("*************************");

        // = += -= *= /= %=
        double bonus = 1800;
        bonus += 1000;
        bonus -= 800;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);
    }
}
