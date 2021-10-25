package Pessoas;

import Agencia.AgenciaViagem;
import Hotelaria.Hospedagem;
import Turismo.Viagem;

public class Vendedor extends Pessoa {

    private Object agencia;

    public Vendedor(String nome, String cpf) {
        super(nome, cpf);
        this.nome = nome;
        this.cpf = cpf;
        this.agencia = null;
    }

    public String getNomeAgencia() {
        AgenciaViagem x = (AgenciaViagem) this.agencia;
        return x.getNome();
    }

    public void setAgencia(AgenciaViagem agencia) {
        this.agencia = agencia;
    }

    public void listarDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        getEmail();
        System.out.print("Trabalha na Agencia: ");
        AgenciaViagem x = (AgenciaViagem) this.agencia;
        if( x != null){
            System.out.println(x.getNome());
        }
        else{
            System.out.println("Sem cadastro");
        }

    }

    public void venderViagem(Viagem viagem, Cliente cliente) {
        cliente.comprarProduto(viagem);
    }

    public void venderHospedagem(Hospedagem hospedagem, Cliente cliente) {
        cliente.comprarProduto(hospedagem);
    }

    public void descViagem(Object viagem, int porcent){
        Viagem x = (Viagem) viagem;
        double preco = x.getPreco();
        double desconto = preco * porcent / 100;
        x.setPreco(preco - desconto);
    }
    public void descHosp(Object hosp, int porcent){
        Hospedagem x = (Hospedagem) hosp;
        double preco = x.getPrecoHosp();
        double desconto = preco * porcent / 100;
        x.setPreco(preco - desconto);
    }
}
