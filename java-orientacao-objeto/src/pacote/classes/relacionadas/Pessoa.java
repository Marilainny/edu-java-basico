package pacote.classes.relacionadas;
/*
Classe modelo formado por propriedades (atributos) e operações (métodos);
Através da herança pode herdar métodos de outra classe.
 */

public class Pessoa extends Heranca {

    /*
    Os atributos são o estado do objeto;
    Encapsular os métodos: public, private, protected;
     */
    private String nome;
    private int idade;
    private double altura;
    private double peso;

    /* Construtor vazio,são de objetos que não demandam valores obrigatórios,
    para existirem quando são instanciados.
     */
    public Pessoa() {
    }

    /*
    Métodos construtor é chamado para inicializar um objeto da classe.
    O construtor tem o mesmo nome da classe;
    */

    //Parâmetro é a variável que irá receber um valor em uma função.
    public Pessoa(String nome, int idade, double altura, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    //Construtor com os atributos herdados de outra classe.
    public Pessoa(String documento, String sexo, String nome, int idade, double altura, double peso) {
        super(documento, sexo); //super é a sintaxe chamando os atributos da super classe.
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    /*
    Métodos são funções da classe.
    Método de acesso que retorna o atributo.
    */
    public String getNome() {
        return nome;
    }

    /*
    Método modificador.
    Pega o parâmetro e seta no método da classe.
    Não retorna valores = void
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    //os métodos herdados da super classe.
    @Override
    public String getDocumento() {
        return super.getDocumento();
    }

    @Override
    public String getSexo() {
        return super.getSexo();
    }

    @Override
    public void setDocumento(String documento) {
        super.setDocumento(documento);
    }

    //sobrecarga de metodos
    public String imprimir(String nome, String sexo) {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                "} " + sexo;
    }

    public int imprimir(int idade) {
        return idade;
    }

    public double imprimir(double altura) {
        return altura;
    }

    @Override
    public void setSexo(String sexo) {
        super.setSexo(sexo);
    }

    //To String concatenando com os métodos da super classe.
    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                ", peso=" + peso +
                "} " + super.toString();
    }
}
