package iphone;


public class InternetBrowserImpl implements InternetBrowser {
    private String paginaAtual;

    @Override
    public void exibirPagina(String pagina) {
        System.out.println("Exibindo página: " + pagina);
        paginaAtual = pagina;
    }

    @Override
    public void adicionarNovaAba(String pagina) {
        System.out.println("Adicionando nova aba com página: " + pagina);
    }

    @Override
    public void atualizarPagina() {
        if (paginaAtual != null) {
            System.out.println("Atualizando página: " + paginaAtual);
        } else {
            System.out.println("Nenhuma página aberta para atualizar.");
        }
    }
}


