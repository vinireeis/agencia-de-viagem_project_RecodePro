package MainClass;

import Agencia.AgenciaViagem;
import Hotelaria.Hospedagem;
import Pessoas.Cliente;
import Pessoas.Vendedor;
import Turismo.Viagem;

class Main {
    public static void main(String[] args) {

        // Criando Agencia de Viagem e métodos
        System.out.println("------------ DADOS AGENCIA ------------");
        AgenciaViagem agencia1 = new AgenciaViagem("Crazy Turismo");
        System.out.println(agencia1.getNome());
        agencia1.setCnpj("127838712-0001");
        System.out.println(agencia1.getCnpj());

        // Criando Viagens/destinos e métodos
        System.out.println("------------ DADOS VIAGEM ------------");
        Viagem viagem1 = new Viagem("New York", "Avião");
        Viagem viagem2 = new Viagem("Angra dos Reis", "Navio");
        Viagem viagem3 = new Viagem("Miami", "Avião");
        Viagem viagem4 = new Viagem("Fernando de Noronha", "Navio");
        System.out.println(viagem2.getDestino());
        viagem1.setPreco(3500.00);
        viagem2.setPreco(2499.19);
        viagem3.setPreco(4309.00);
        viagem4.setPreco(6999.00);
        System.out.println(viagem4.getPreco());

        // Criando Hospedagem e métodos
        System.out.println("------------ DADOS HOSPEDAGEM ------------");
        Hospedagem hosp1 = new Hospedagem("Hotel TOP1");
        Hospedagem hosp2 = new Hospedagem("Hotel Beira Mar");
        Hospedagem hosp3 = new Hospedagem("Hotel Luxury");
        System.out.println(hosp1.getNomeHosp());
        System.out.println(hosp3.getNomeHosp());
        hosp1.setPreco(1000.00);
        hosp2.setPreco(399.00);
        hosp3.setPreco(1800.00);
        hosp1.listarHosp();
        hosp2.listarHosp();
        hosp3.listarHosp();

        // Criando cliente e métodos //
        System.out.println("------------ DADOS CLIENTE ------------");
        Cliente cli1 = new Cliente("Vinicius Reis", "41588156819");
        Cliente cli2 = new Cliente("Larissa Costa", "86594826819");
        cli1.listarDados();
        System.out.println("------------ DADOS CLIENTE ALTERADOS ------------");
        cli1.setDtNascimento("09/11/1993");
        cli1.setCidade("São Paulo");
        cli1.setEstado("SP");
        cli1.setEmail("vinicius.oliveira@recode.org.br");
        cli1.listarDados();
        cli1.comprarProduto(hosp3);
        cli1.comprarProduto(viagem3);
        cli1.getCompras();
        System.out.println("------------ CANCELANDO PRODUTOS ------------");
        cli1.cancelarProduto(viagem1);
        cli1.cancelarProduto(viagem3);
        cli1.getCompras();
        System.out.println("------------ DADOS CLIENTE 2------------");
        cli2.setCpf("teste123");
        cli2.listarDados();
        System.out.println("------------ DADOS VENDEDOR------------");
        Vendedor vend1 = new Vendedor("Roberto", "89655868925");
        vend1.listarDados();
        System.out.println("------------ DADOS VENDEDOR ALTERADOS------------");
        vend1.setAgencia(agencia1);
        vend1.setEmail("roberto123@gmail.com");
        vend1.listarDados();
        System.out.println("------------ VENDEDOR INCLUINDO VENDAS E APLICANDO DESCONTO ------------");
        vend1.venderViagem(viagem4, cli2);
        vend1.venderHospedagem(hosp1, cli2);
        cli2.listarDados();
        hosp1.incluirDiaria(4);
        cli2.getCompras();
        vend1.descViagem(viagem4, 10);
        cli2.getCompras();
    }
}