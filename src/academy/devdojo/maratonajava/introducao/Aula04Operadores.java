package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
    // + - / * Operadores aritiméticos
        int value01 = 10;
        int value02 = 15;
        int result = value01 * value02;

        System.out.println(result);

        // % Operador de resto
        int rest = 21 % 4;
        System.out.println(rest);

        // < > <= >= == != Operadores relacionais
        boolean isDezMaiorQueQuinze = 10 > 15;
        boolean isDezMenorQueQuinze = 10 < 15;
        boolean isDezIgualQuinze = 10 == 15;
        boolean isDezDiferenteQuinze = 10 != 15;
        System.out.println(isDezMaiorQueQuinze);
        System.out.println(isDezMenorQueQuinze);
        System.out.println(isDezIgualQuinze);
        System.out.println(isDezDiferenteQuinze);

        // && (AND) || (or) ! Operadores lógicos
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3300;
        System.out.println(isDentroDaLeiMaiorQueTrinta);
        System.out.println(isDentroDaLeiMenorQueTrinta);

        double valorContaCorrente = 500;
        double valorContaPoupanca = 8000;
        float valorPc = 5000;
        boolean isPcCompravel = valorContaCorrente >= valorPc || valorContaPoupanca >= valorPc;
        System.out.println(isPcCompravel);

        // = += -= *= /= %= Operadores de atribuição
        double bonus = 1800; //1800
        bonus += 1000; // 2800
        bonus -= 1000; // 1800
        bonus *= 2; // 3600
        bonus /= 2; // 1800
        bonus %= 2; // 0
        System.out.println(bonus);
    }
}
