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

    public double divideDoisNumeros (double num1, double num2){
        if (num2 == 0){
            return 0;
        }
        return num1/num2;
    }

    public double divideDoisNumeros02 (double num1, double num2){
        if (num2 == 0){
            return 0;
        }else {
        return num1/num2;
        }
    }

    public void imprimeDivisaoDeDoisNumeros (double num1, double num2){
        if (num2 == 0){
            System.out.println("Não existe divisão por 0");
        }
        return;
    }
}
