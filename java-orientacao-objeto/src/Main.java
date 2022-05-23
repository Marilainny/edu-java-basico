import pacote.classes.relacionadas.Pessoa;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

         /*
        Modularidade: O código-fonte de um objeto pode ser escrito e mantido independentemente de outros objetos.
        Ocultação de informações: os detalhes de sua implementação interna permanecem ocultos.
        Reutilização de código: Se um objeto já existe você pode usar esse objeto em seu programa.
        Facilidade de conexão e depuração: se um objeto específico se tornar problemático,
        você pode simplesmente removê-lo e substituto por outro.
         */

        /*
        Objeto são uma instância da classe de objetos,
        a partir da classe que os objetos são criados.
        A sintaxe para criar um novo objeto é new;
        pode criar vários objetos, com construtor vazio ou com parâmetros.
         */
        Pessoa pessoa1 = new Pessoa();

        Pessoa pessoa2 = new Pessoa("Maria", 17, 1.60, 60);

        /*
        Objeto pessoa com os atributos da super classe;
         */
        Pessoa pessoaHerdeira = new Pessoa("6789-0","Feminino","Maria", 17, 1.60, 60);

        //Saída de dados
        System.out.println(pessoa1.toString());
        System.out.println(pessoa2.toString());
        System.out.println(pessoaHerdeira.toString());

        //atribuindo valores modificadores pessoa1
        pessoa1.setNome("Mariana");
        pessoa1.setAltura(1.76);
        pessoa1.setIdade(25);
        pessoa1.setDocumento("76980-0");
        pessoa1.setSexo("Feminino");

        //obtendo e imprimindo os valores.
        System.out.println(pessoa1.getNome()+" "+pessoa1.getIdade()+" "+pessoa1.getSexo());
        System.out.println(pessoa1.toString());

        //sobrecarga de todos
        Pessoa herdeiro = new Pessoa();

        System.out.println(herdeiro.imprimir("Paulo","Masculino"));
        System.out.println(herdeiro.imprimir(25));
        System.out.println(herdeiro.imprimir(1.78));

    }
}