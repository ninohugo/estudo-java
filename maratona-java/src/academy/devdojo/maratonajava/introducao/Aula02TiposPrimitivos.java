package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int idade = 10;
        double salarioDouble = 2000.0;
        float salarioFloat = 2500;
        float salarioFloat2 = 2500.0F;
        byte idadeByte = 25;
        short idadeShort = 25;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'M';
        // Para criar variável primeiramente é o tipo e depois o nome
        System.out.println(idade);
        System.out.println("A idade é " + idade + " anos");

        // Casting é forçar a conversão de um daod para outro
        int idade2 = (int) 10000000000L;

    }
}
