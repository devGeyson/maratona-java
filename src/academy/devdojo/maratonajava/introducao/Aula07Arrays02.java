package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        String[] nomes = new String[3];
        nomes[0] = "Midorya";
        nomes[1] = "Yuji";
        nomes[2] = "Asta";

        for (int i = 0; i < 3; i++) {
            System.out.println(nomes[i]);
        }
    }
}
