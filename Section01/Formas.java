import java.util.Scanner;

class Retangulo {

    private int comprimento = 1;
    private int altura = 1;

    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        if (comprimento > 0 && comprimento < 20) {
            this.comprimento = comprimento;
        }
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        if (altura > 0 && altura < 20) {
            this.altura = altura;
        }
    }

    public int calcularPerimetro() {

        return 2*(comprimento + altura);
    }

    public int calcularArea() {

        return comprimento * altura;
    }
}

public class Formas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Retangulo ret1 = new Retangulo();
        Retangulo ret2 = new Retangulo();

        String[] ret1Info = input.nextLine().split(" ");
        String[] ret2Info = input.nextLine().split(" ");

        ret1.setComprimento(Integer.parseInt(ret1Info[0]));
        ret1.setAltura(Integer.parseInt(ret1Info[1]));
        ret2.setComprimento(Integer.parseInt(ret2Info[0]));
        ret2.setAltura(Integer.parseInt(ret2Info[1]));

        StringBuilder sb1 = new StringBuilder();
        sb1.append(ret1.getComprimento()).append(" ");
        sb1.append(ret1.getAltura()).append(" ");
        sb1.append(ret1.calcularPerimetro()).append(" ");
        sb1.append(ret1.calcularArea());

        System.out.println(sb1);

        StringBuilder sb2 = new StringBuilder();
        sb2.append(ret2.getComprimento()).append(" ");
        sb2.append(ret2.getAltura()).append(" ");
        sb2.append(ret2.calcularPerimetro()).append(" ");
        sb2.append(ret2.calcularArea());

        System.out.println(sb2);
    }
}
