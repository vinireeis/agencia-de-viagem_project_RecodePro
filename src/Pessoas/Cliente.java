package Pessoas;


import Hotelaria.Hospedagem;
import Turismo.Viagem;

import java.util.ArrayList;

abstract class Pessoa {
    public String nome;
    public String cpf;
    private String email;
    private String dtNascimento;

    Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = null;
        this.dtNascimento = null;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNascimento() {
        return this.dtNascimento;
    }

    public void setDtNascimento(String dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
}


public class Cliente extends Pessoa {

    public String cidade;
    public String estado;
    public ArrayList<Object> produtos;

    public Cliente(String nome, String cpf) {
        super(nome, cpf);
        this.nome = nome;
        this.cpf = cpf;
        this.cidade = null;
        this.estado = null;
        this.produtos = new ArrayList<Object>();

    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public double getCompras() {
        double total = 0;
        if (produtos != null) {
            System.out.println("---- Produtos adquiridos ----");
            for (int i = 0; i < produtos.toArray().length; i++) {
                try {
                    Hospedagem x = (Hospedagem) this.produtos.get(i);
                    System.out.println("Uma hospedagem em " + x.nome);
                    total += x.getPrecoHosp();
                    continue;
                } catch (Exception e) {
                }
                try {
                    Viagem x = (Viagem) this.produtos.get(i);
                    System.out.println("Uma viagem para " + x.destino);
                    total += x.getPreco();
                    continue;
                } catch (Exception e) {
                }
            }
            System.out.println("Total dos produtos é: " + total);
        } else {
            System.out.println("Nenhum produto adquirido");
        }
       return total;
    }

    public void comprarProduto(Object produto) {
        produtos.add(produto);
    }

    public void cancelarProduto(Object produto) {
        if (produtos.contains(produto)) {
            produtos.remove(produto);
            System.out.println("Produto removido com sucesso");
        } else {
            System.out.println("Este produto não pode ser cancelado, pois não foi adquirido");
        }
    }

    public void listarDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Estado: " + this.estado);
        System.out.println("Cidade: " + this.cidade);
        getEmail();
        getNascimento();
    }
}

