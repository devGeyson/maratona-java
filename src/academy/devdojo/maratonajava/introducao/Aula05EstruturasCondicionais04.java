package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        // Imprima o dia da semana, considerando 1 como domingo.
        int dia = 3;
        switch (dia) {
            case 1:
                System.out.println("Dom");
                break;
            case 2:
                System.out.println("Seg");
                break;
            case 3:
                System.out.println("Ter");
                break;
            case 4:
                System.out.println("Qua");
                break;
            case 5:
                System.out.println("Qui");
                break;
            case 7:
                System.out.println("Sex");
                break;
            case 8:
                System.out.println("Sab");
                break;
            default:
                System.out.println("Opção inválida");
                break;

        }
    }
}
