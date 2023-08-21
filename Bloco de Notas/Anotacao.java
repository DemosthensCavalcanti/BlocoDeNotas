import java.time.LocalDate;

public class Anotacao {
    private int id;
    private String conteudo;
    private LocalDate dataCriacao;
    private boolean deletada;

    public Anotacao(int id, String conteudo){
        this.id = id;
        this.conteudo = conteudo;
        this.dataCriacao = LocalDate.now();
        this.deletada = false;
    }

    public int getId() {
        return id;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public boolean isDeletada() {
        return deletada;
    }

    public void marcarComoDeletada() {
        this.deletada = true;
    }
}
