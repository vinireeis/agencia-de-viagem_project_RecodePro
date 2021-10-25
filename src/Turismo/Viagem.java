package Turismo;

public class Viagem {
    public String destino;
    public String tipoTransporte;
    private double preco;

    public Viagem(String destino, String tipoTransporte){
        this.destino = destino;
        this.tipoTransporte = tipoTransporte;
    }

    public String getDestino(){
        //System.out.println("Viagem para: " + this.destino);
        return this.destino;
    }

    public void alterarTransporte(String tipoTransporte) {
        this.tipoTransporte = tipoTransporte;
        System.out.println("Transporte alterado para: " + tipoTransporte);
    }

    public double getPreco(){
        return this.preco;
    }

    public void setDesconto(double desconto){
        this.preco -= desconto;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }
}