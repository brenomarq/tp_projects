import java.util.Scanner;

class Veiculo {
    String placa, marca, modelo, cor;
    int ano;

    public Veiculo(String placa, String marca, String modelo, String cor, int ano) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }
}

class Motorista {
    int id;
    String nome, telefone, cnh;

    public Motorista(int id, String nome, String telefone, String cnh) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.cnh = cnh;
    }
}

class Cliente {
    int id;
    String rg, cpf, nome, telefone;

    public Cliente(int id, String rg, String cpf, String nome, String telefone) {
        this.id = id;
        this.rg = rg;
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
    }
}

class Chamado {
    int id;
    String data, tipo, origem, destino;
    float partida, retorno;
    double quilometragemInicial, quilometragemFinal, valorTotal;
    Veiculo veiculo;
    Motorista motorista;
    Cliente cliente;

    public Chamado(int id, String data, String tipo, String origem, String destino, float partida,
                   float retorno, double quilometragemInicial, double quilometragemFinal, double valorTotal,
                   Veiculo veiculo, Motorista motorista, Cliente cliente) {
        this.id = id;
        this.data = data;
        this.tipo = tipo;
        this.origem = origem;
        this.destino = destino;
        this.partida = partida;
        this.retorno = retorno;
        this.quilometragemInicial = quilometragemInicial;
        this.quilometragemFinal = quilometragemFinal;
        this.valorTotal = valorTotal;
        this.veiculo = veiculo;
        this.motorista = motorista;
        this.cliente = cliente;
    }

    public int getId() {
        return id;
    }

    public String getDestino() {
        return destino;
    }

    public String getPlaca() {
        return veiculo.placa;
    }

    public String getRG() {
        return cliente.rg;
    }

    public String getNomeMotorista() {
        return motorista.nome;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] veiculoInfo = input.nextLine().split(" ");
        Veiculo veiculo = new Veiculo(
                veiculoInfo[0],
                veiculoInfo[1],
                veiculoInfo[2],
                veiculoInfo[3],
                Integer.parseInt(veiculoInfo[4])
        );

        String[] motoristaInfo = input.nextLine().split(" ");
        Motorista motorista = new Motorista(
                Integer.parseInt(motoristaInfo[0]),
                motoristaInfo[1],
                motoristaInfo[2],
                motoristaInfo[3]
        );

        String[] clienteInfo = input.nextLine().split(" ");
        Cliente cliente = new Cliente(
                Integer.parseInt(clienteInfo[0]),
                clienteInfo[3],
                clienteInfo[4],
                clienteInfo[1],
                clienteInfo[2]
        );

        String[] chamadoInfo = input.nextLine().split(" ");
        Chamado chamado = new Chamado(
                Integer.parseInt(chamadoInfo[0]),
                chamadoInfo[1],
                chamadoInfo[2],
                chamadoInfo[3],
                chamadoInfo[4],
                Float.parseFloat(chamadoInfo[5]),
                Float.parseFloat(chamadoInfo[6]),
                Double.parseDouble(chamadoInfo[7]),
                Double.parseDouble(chamadoInfo[8]),
                Double.parseDouble(chamadoInfo[9]),
                veiculo,
                motorista,
                cliente
        );

        System.out.println(chamado.getId());
        System.out.println(chamado.getDestino());
        System.out.println(chamado.getPlaca());
        System.out.println(chamado.getRG());
        System.out.println(chamado.getNomeMotorista());
    }
}
