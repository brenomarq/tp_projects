import java.util.Scanner;

class Impressora {

    String modelo, cor, tipoPapel;
    boolean bluetooth, wifi, colorida, ligada, papel;
    boolean digitalizadora, copiadora;

    public void ligar() {
        if (!ligada) {
            ligada = true;
            System.out.println("ligando...");
        }
    }

    public void desligar() {
        if (ligada) {
            ligada = false;
            System.out.println("desligando...");
        }
    }

    public void imprimir() {
        if (ligada && papel) {
            System.out.println("imprimindo...");
        } else if (ligada) {
            System.out.println("sem papel");
        } else {
            System.out.println("impressora desligada");
        }
    }

    public void digitalizar() {
        if (ligada && digitalizadora) {
            System.out.println("digitalização sendo realizada...");
        } else if (ligada) {
            System.out.println("não é possível digitalizar");
        } else {
            System.out.println("impressora desligada");
        }
    }

    public void copiar() {
        if (ligada && copiadora) {
            System.out.println("cópia sendo realizada...");
        } else if (ligada) {
            System.out.println("não é possível copiar");
        } else {
            System.out.println("impressora desligada");
        }
    }

    public void status() {
        System.out.println(modelo);
        System.out.println(cor);
        System.out.println(tipoPapel);

        if (bluetooth) {
            System.out.println("bluetooth on");
        } else {
            System.out.println("bluetooth off");
        }

        if (wifi) {
            System.out.println("wifi on");
        } else {
            System.out.println("wifi off");
        }

        if (colorida) {
            System.out.println("impressão colorida");
        } else {
            System.out.println("impressão preto e branco");
        }

        if (ligada) {
            System.out.println("impressora on");
        } else {
            System.out.println("impressora off");
        }

        if (papel) {
            System.out.println("tem papel");
        } else {
            System.out.println("não tem papel");
        }

        if (digitalizadora) {
            System.out.println("digitalizadora on");
        } else {
            System.out.println("digitalizadora off");
        }

        if (copiadora) {
            System.out.println("copiadora on");
        } else {
            System.out.println("copiadora off");
        }
    }
}


public class UsaImpressora {
    public static void main(String[] args) {
        Impressora impressora = new Impressora();
        Scanner input = new Scanner(System.in);

        impressora.bluetooth = true;
        impressora.wifi = true;
        impressora.papel = true;
        impressora.colorida = true;
        impressora.digitalizadora = true;

        String[] infoImpressora = input.nextLine().split(" ");
        impressora.modelo = infoImpressora[0];
        impressora.cor = infoImpressora[1];
        impressora.tipoPapel = infoImpressora[2];

        impressora.status();
        impressora.ligar();
        impressora.digitalizar();
        impressora.copiar();
        impressora.desligar();
        impressora.imprimir();
    }
}
