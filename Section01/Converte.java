import java.util.Scanner;

class Temperatura {

    private double temperatura;
    private String graus = "celsius";

    public Temperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public String toString() {
        return "temperatura: " + temperatura + " graus " + graus;
    }

    public void celsiusFarenheit() {
        this.graus = "fahrenheit";
        this.temperatura = (temperatura * 9/5 + 32);
    }

    public void farenheitCelsius() {
        this.graus = "celsius";
        this.temperatura = (temperatura - 32) * 5/9;
    }
}

public class Converte {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double cTemp = input.nextDouble();

        Temperatura temp = new Temperatura(cTemp);
        temp.celsiusFarenheit();
        System.out.println(temp);

        temp.farenheitCelsius();
        System.out.println(temp);
    }
}
