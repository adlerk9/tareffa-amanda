public class PessoaBuilder {
    private String nome;
    private int idade;
    private String email;
    private String telefone;

    public PessoaBuilder(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public PessoaBuilder criacaoEmail(String email) {
        this.email = email;
        return this; // Retorna o próprio objeto para encadear métodos
    }

    public PessoaBuilder criacaoTelefone(String telefone) {
        this.telefone = telefone;
        return this; // Retorna o próprio objeto para encadear métodos
    }

    public Pessoa retorno() {
        return new Pessoa(nome, idade, email, telefone);
    }
}
