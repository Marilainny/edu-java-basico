package pacote.classes.relacionadas;
/*
Classe foi criada com o objetivo,
de fornecer atributos e funções que podem ser herdadas por outras classes.
 */
public class Heranca {

    private String documento;
    private String sexo;

    public Heranca() {
    }

    public Heranca(String documento, String sexo) {
        this.documento = documento;
        this.sexo = sexo;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Heranca{" +
                "documento='" + documento + '\'' +
                ", sexo='" + sexo + '\'' +
                '}';
    }
}
