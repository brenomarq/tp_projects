import java.util.Scanner;

class Conta {

    private int numeroConta;
    private String nomeCliente;
    private double saldo;
    private int senha;

    public Conta(int numeroConta, String nomeCliente, double saldo, int senha) {
        this.numeroConta = numeroConta;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
        this.senha = senha;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getSaldo(int senha) {
        if (senha == this.senha) {
            return String.format("%.2f", this.saldo).replace(",", ".");
        }

        return "senha incorreta";
    }

    public boolean sacar(double valor, int senha) {
        if (this.saldo - valor >= 0 && senha == this.senha) {
            this.saldo -= valor;
            return true;
        }

        return false;
    }

    public boolean depositar(double valor, int senha) {
        if (valor > 0 && senha == this.senha) {
            this.saldo += valor;
            return true;
        }

        return false;
    }

    public boolean transferir(double valor, int senha, Conta conta2) {
        if (senha == this.senha && valor < this.saldo) {
            this.saldo -= valor;
            conta2.saldo += valor;
            return true;
        }

        return false;
    }
}

public class Banco {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] conta1Info = input.nextLine().split(" ");
        String[] conta2Info = input.nextLine().split(" ");

        Conta conta1 = new Conta(
                Integer.parseInt(conta1Info[0]),
                conta1Info[2],
                Double.parseDouble(conta1Info[3]),
                Integer.parseInt(conta1Info[1])
        );
        Conta conta2 = new Conta(
                Integer.parseInt(conta2Info[0]),
                conta2Info[2],
                Double.parseDouble(conta2Info[3]),
                Integer.parseInt(conta2Info[1])
        );

        int userChoice = input.nextShort();
        input.nextLine();
        while (userChoice != 5) {
            if (userChoice == 1) {
                int senha = input.nextInt();
                String response = conta1.getSaldo(senha);

                System.out.println(response);
            } else if (userChoice == 2) {
                String[] inputs = input.nextLine().split(" ");
                boolean response = conta1.sacar(
                        Double.parseDouble(inputs[0]),
                        Integer.parseInt(inputs[1])
                );

                if (response) {
                    System.out.println("saque realizado");
                } else {
                    System.out.println("saque não realizado");
                }
            } else if (userChoice == 3) {
                String[] inputs = input.nextLine().split(" ");
                boolean response = conta1.depositar(
                        Double.parseDouble(inputs[0]),
                        Integer.parseInt(inputs[1])
                );

                if (response) {
                    System.out.println("depósito realizado");
                } else {
                    System.out.println("depósito não realizado");
                }
            } else if (userChoice == 4) {
                String nome = input.next();
                input.nextLine();

                if (conta2.getNomeCliente().equals(nome)) {
                    String[] inputs = input.nextLine().split(" ");
                    boolean response = conta1.transferir(
                            Double.parseDouble(inputs[0]),
                            Integer.parseInt(inputs[1]),
                            conta2
                    );

                    if (response) {
                        System.out.println("transferência realizada");
                    } else {
                        System.out.println("transferência não realizada");
                    }
                } else {
                    System.out.println("nenhum usuário encontrado");
                }
            }

            userChoice = input.nextShort();
            input.nextLine();
        }
    }
}
