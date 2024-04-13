import java.util.Scanner;

class Circulo {
    private int x, y, raio;

    public static final double PI = 3.14159;

    public Circulo(int x, int y, int raio) {
        this.x = x;
        this.y = y;
        this.raio = raio;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

    public double circunferencia() {
        return 2 * PI * raio;
    }
}

public class TestaCirculo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Circulo[] vetor1 = new Circulo[3];
        Circulo[] vetor3 = new Circulo[3];
        for (int i = 0; i < 3; ++i) {
            String[] valores = input.nextLine().split(" ");
            Circulo novoCirculo1 = new Circulo(
                    Integer.parseInt(valores[0]),
                    Integer.parseInt(valores[1]),
                    Integer.parseInt(valores[2])
            );
            Circulo novoCirculo2 = new Circulo(
                    Integer.parseInt(valores[0]),
                    Integer.parseInt(valores[1]),
                    Integer.parseInt(valores[2])
            );
            vetor1[i] = novoCirculo1;
            vetor3[i] = novoCirculo2;
        }

        Circulo[] vetor2 = vetor1;

        for (int i = 0; i < 3; ++i) {
            int raio = input.nextInt();

            vetor1[i].setRaio(raio);
        }

        System.out.println("vetor1:");
        for (Circulo circulo : vetor1) {
            System.out.println(circulo.getX() + " " + circulo.getY() + " " + circulo.getRaio());
        }

        System.out.println("vetor2:");
        for (Circulo circulo : vetor2) {
            System.out.println(circulo.getX() + " " + circulo.getY() + " " + circulo.getRaio());
        }

        System.out.println("vetor3:");
        for (Circulo circulo : vetor3) {
            System.out.println(circulo.getX() + " " + circulo.getY() + " " + circulo.getRaio());
        }
    }
}
