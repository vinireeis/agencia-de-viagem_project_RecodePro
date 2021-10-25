package Hotelaria;

public class Hospedagem {
    public String nome;
    public int qtdDiarias;
    private double preco;

    public Hospedagem(String nome){
        this.nome = nome;
        this.qtdDiarias = 1;
    }

    public String getNomeHosp(){
        //System.out.println("Nome da hospedagem: " + this.nome);
        return this.nome;
    }

    public void incluirDiaria(int qtdDiarias){
        this.preco /= this.qtdDiarias;
        this.qtdDiarias += qtdDiarias;
        this.preco *= qtdDiarias;
    }

   public void setPreco(double preco){
        this.preco = preco;
        this.preco *= qtdDiarias;
    }

    public double getPrecoHosp(){
        return this.preco;
    }

    public void listarHosp(){
        System.out.println("Diárias: " + this.qtdDiarias);
        System.out.println("Total da hospedagem: " + this.preco);
    }
}