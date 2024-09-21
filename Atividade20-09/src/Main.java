public class Main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new PessoaBuilder("Adler", 19)
                .criacaoEmail("adler@email.com")
                .criacaoTelefone("1234-5678")
                .retorno();
        System.out.println(pessoa1);

        Pessoa pessoa2 = new PessoaBuilder("Samuel", 20)
                .criacaoTelefone("9876-5432")
                .retorno();
        System.out.println(pessoa2);
    }
}
