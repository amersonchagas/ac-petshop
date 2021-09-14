
package classes;

public abstract class Pessoa {
    protected String nome;
    protected String cpf;
    protected String data_nascimento;
    protected double preco_copia;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }
    
    public double tirarCopia(int qnt_copias){
        double total;
        total = qnt_copias * this.preco_copia;
        return total;
    }
    
   
}
