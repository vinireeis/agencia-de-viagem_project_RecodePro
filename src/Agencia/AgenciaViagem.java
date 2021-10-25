package Agencia;

import java.util.ArrayList;

public class AgenciaViagem {
    public String nome;
    private String cnpj;
    public ArrayList<Object> servicos;

    public AgenciaViagem(String nome){
        this.nome = nome;
        this.cnpj = null;
        this.servicos = new ArrayList<Object>();
    }
    public String getNome(){
        //System.out.println("Nome da agencia: " + this.nome);
        return this.nome;
    }

    public void setCnpj(String cnpj){
        this.cnpj = cnpj;

    }
    public String getCnpj(){
        //System.out.println("CNPJ: " + this.cnpj);
        return this.cnpj;
    }
}

