public class Cliente extends Pessoa {

    // atributos
    private String cpf; 

    // construtores
    public Cliente() {
    }

    public Cliente(String nome, String cpf, String email) {
        super(nome,email);
        this.cpf = cpf;
    }

    // getters and setters
    public String getCpf() {
        return cpf;
    }

    public void setCpf() {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return ("\n\t\t- Cliente: " + codigo + " - \nNome: " + nome + "\nCpf: " + cpf + "\nemail: " + email);
    }
}
