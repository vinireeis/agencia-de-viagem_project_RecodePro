import java.util.ArrayList;


class AgenciaViagem {
    public String nome;
    private String cnpj;
    public ArrayList<Object> servicos;

    AgenciaViagem(String nome){
        this.nome = nome;
        this.cnpj = null;
        this.servicos = new ArrayList<Object>();
    }
    void getNome(){
        System.out.println("Nome da agencia: " + nome);
    }

    String setCnpj(String cnpj){
        return this.cnpj = cnpj;

    }
    void getCnpj(){
        System.out.println("CNPJ: " + cnpj);
    }
}


class Viagem {
    public String destino;
    public String tipoTransporte;

    Viagem(String destino, String tipoTransporte){
        this.destino = destino;
        this.tipoTransporte = tipoTransporte;
    }

    void getDestino(){
        System.out.println("Viagem para: " + this.destino);
    }

    String alterarTransporte(String tipoTransporte) {
        this.tipoTransporte = tipoTransporte;
        System.out.println("Transporte alterado para: " + tipoTransporte);
        return this.tipoTransporte;
    }
}


class Hospedagem {
    public String nome;
    public int qtdDiarias;

    Hospedagem(String nome){
        this.nome = nome;
        this.qtdDiarias = 1;
    }

    void getNomeHosp(){
        System.out.println("Nome da hospedagem: " + this.nome);
    }

    int incluirDiaria(int qtdDiarias){
       return this.qtdDiarias += qtdDiarias;
    }
}


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

    void getCpf() {
        System.out.println(this.cpf);
    }

    String setCpf(String cpf) {
        return this.cpf = cpf;
    }

    void getEmail() {
        System.out.println("Email: " + this.email);
    }

    String setEmail(String email) {
        return this.email = email;
    }

    void getNascimento() {
        System.out.println("Data de nascimento: " + this.dtNascimento);
    }

    String setDtNascimento(String dtNascimento) {
        return this.dtNascimento = dtNascimento;
    }

    void getNome() {
        System.out.println(this.nome);
    }
    String setNome(String nome){
        return this.nome = nome;
    }
}


    class Cliente extends Pessoa {

        public String cidade;
        public String estado;
        public ArrayList<Object> produtos;

        Cliente(String nome, String cpf) {
            super(nome, cpf);
            this.nome = nome;
            this.cpf = cpf;
            this.cidade = null;
            this.estado = null;
            this.produtos = new ArrayList<Object>();

        }

        String setEstado(String estado) {
            return this.estado = estado;
        }

        String setCidade(String cidade) {
            return this.cidade = cidade;
        }

        void getCompras() {
            if (produtos != null) {
                System.out.println("---- Produtos adquiridos ----");
                for (int i = 0; i < produtos.toArray().length; i++) {
                    try {
                        Hospedagem x = (Hospedagem) this.produtos.get(i);
                        System.out.println("Uma hospedagem em " + x.nome);
                        continue;
                    } catch (Exception e) {
                    }
                    try {
                        Viagem x = (Viagem) this.produtos.get(i);
                        System.out.println("Uma viagem para " + x.destino);
                        continue;
                    } catch (Exception e) {
                    }
                }
            } else {
                System.out.println("Nenhum produto adquirido");
            }
            System.out.println();
        }

        void comprarProduto(Object produto) {
            produtos.add(produto);
        }

        void cancelarProduto(Object produto) {
            if (produtos.contains(produto)) {
                produtos.remove(produto);
                System.out.println("Produto removido com sucesso");
            } else {
                System.out.println("Este produto não pode ser cancelado, pois não foi adquirido");
            }
            System.out.println();
        }

        void listarDados() {
            System.out.println("Nome: " + this.nome);
            System.out.println("CPF: " + this.cpf);
            System.out.println("Estado: " + this.estado);
            System.out.println("Cidade: " + this.cidade);
            getEmail();
            getNascimento();
        }
    }

class Vendedor extends Pessoa {

    private Object agencia;

    Vendedor(String nome, String cpf) {
        super(nome, cpf);
        this.nome = nome;
        this.cpf = cpf;
        this.agencia = null;
    }
    void getAgencia(){
        AgenciaViagem x = (AgenciaViagem) this.agencia;
        x.getNome();
    }

    Object setAgencia(AgenciaViagem agencia) {
        return this.agencia = agencia;
    }

    void listarDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        getEmail();
        System.out.print("Trabalha na Agencia: ");
        AgenciaViagem x = (AgenciaViagem) this.agencia;
        x.getNome();
    }
}


    class CriarObjetos {
        public static void main(String[] args) {

            // Criando Agencia de Viagem e métodos
            System.out.println("------------ DADOS AGENCIA ------------");
            AgenciaViagem agencia1 = new AgenciaViagem("Crazy Turismo");
            agencia1.getNome();
            agencia1.setCnpj("127838712-0001");
            agencia1.getCnpj();

            // Criando Viagens/destinos e métodos
            System.out.println("------------ DADOS VIAGEM ------------");
            Viagem viagem1 = new Viagem("New York", "Avião");
            Viagem viagem2 = new Viagem("Angra dos Reis", "Navio");
            Viagem viagem3 = new Viagem("Miami", "Avião");
            Viagem viagem4 = new Viagem("Fernando de Noronha", "Navio");
            viagem2.getDestino();

            // Criando Hospedagem e métodos
            System.out.println("------------ DADOS HOSPEDAGEM ------------");
            Hospedagem hosp1 = new Hospedagem("Hotel TOP1");
            Hospedagem hosp2 = new Hospedagem("Hotel Beira Mar");
            Hospedagem hosp3 = new Hospedagem("Hotel Luxury");
            hosp1.getNomeHosp();
            hosp3.getNomeHosp();

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
    }
}


