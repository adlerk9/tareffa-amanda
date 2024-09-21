public class Pessoa {
    private String nome;
    private int idade;
    private String email;
    private String telefone;

    public Pessoa(String nome, int idade, String email, String telefone) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return("O nome é: "+nome+"" + "" +
                " A idade é: "+idade+"" +
                " O email é: "+email+"" +
                " O telefone é: "+telefone);
    }
}