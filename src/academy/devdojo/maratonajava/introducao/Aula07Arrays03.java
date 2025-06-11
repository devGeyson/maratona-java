package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int[] numeros = new int[3]; // Forma de declarar array
        int[] numeros02 = {1,2,3,4}; //Forma simplificada de chamar um array
        int[] numeros03 = new int[]{1,2,3,4,5}; //Mais uma forma de chamar array

        //for (int i = 0; i < numeros02.length; i++) {
        //    System.out.println(numeros02[i]);
        //}

        for (int num : numeros02){       // forma simplicada do for i
            System.out.println(num);    // porém não consegue acessar um item especifico do indice
        }
    }
}
