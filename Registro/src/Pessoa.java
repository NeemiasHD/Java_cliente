public abstract class Pessoa {
    //protect só pode ser acessado pela classe filha
    protected static int codigo_st;//o static faz com que o valor dentro da variavel não mude anão ser que seja feito de proposito
    protected int codigo;
    protected String nome, email;

    public Pessoa(String nome, String email) {
        this.codigo = ++codigo_st;
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    

    

    
}
