import java.util.ArrayList;
import java.util.List;

class BlocoDeNotas {
    private List<Anotacao> anotacoes;

    public BlocoDeNotas() {
        this.anotacoes = new ArrayList<>();
    }

    public void adicionarAnotacao(String conteudo) {
        int novoId = anotacoes.size() + 1;
        Anotacao novaAnotacao = new Anotacao(novoId, conteudo);
        anotacoes.add(novaAnotacao);
    }

    public void editarAnotacao(int id, String novoConteudo) {
        Anotacao anotacao = encontrarAnotacaoPorId(id);
        if (anotacao != null) {
            anotacao.setConteudo(novoConteudo);
        }
    }

    public void deletarAnotacao(int id) {
        Anotacao anotacao = encontrarAnotacaoPorId(id);
        if (anotacao != null) {
            anotacao.marcarComoDeletada();
        }
    }

    public List<Anotacao> buscarAnotacoes(String termoBusca) {
        List<Anotacao> resultados = new ArrayList<>();
        for (Anotacao anotacao : anotacoes) {
            if (!anotacao.isDeletada() && anotacao.getConteudo() .contains(termoBusca)) {
                resultados.add(anotacao);
            }
        }
        return resultados;
    }
    public List<Anotacao> listarAnotacaos() {
        List<Anotacao> anotacoesVisiveis = new ArrayList<>();
        for (Anotacao anotacao : anotacoes) {
            if (!anotacao.isDeletada()) {
                anotacoesVisiveis.add(anotacao);
            }
        }
        return anotacoesVisiveis;
    }

    private Anotacao encontrarAnotacaoPorId(int id) {
        for (Anotacao anotacao : anotacoes) {
            if (anotacao.getId() == id) {
                return anotacao;
            }
        }
        return null;
    }

}
