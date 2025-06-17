package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {
    public void somaTresNumeros(){
        System.out.println(15 + 15 + 15);
    }

    public void subtraiDoisNumeros(){   // <-- Sintaxe sem parâmetro
        System.out.println(45 - 15);
    }

    public void multiplicaDoisNumeros(int num1, int num2){   // <-- Sintaxe com parâmetro
        System.out.println(num1 * num2);
    }
}
