package iphone;

public class iPhone implements MusicPlayer, Phone, InternetBrowser {
    private MusicPlayer musicPlayer;
    private Phone phone;
    private InternetBrowser internetBrowser;

    public iPhone() {
        this.musicPlayer = new MusicPlayerImpl();
        this.phone = new PhoneImpl();
        this.internetBrowser = new InternetBrowserImpl();
    }

    @Override
    public void tocar() {
        musicPlayer.tocar();
    }

    @Override
    public void pausar() {
        musicPlayer.pausar();
    }

    @Override
    public void selecionarMusica(String musica) {
        musicPlayer.selecionarMusica(musica);
    }

    @Override
    public void ligar(String numero) {
        phone.ligar(numero);
    }

    @Override
    public void atender() {
        phone.atender();
    }

    @Override
    public void iniciarCorreioVoz() {
        phone.iniciarCorreioVoz();
    }

    @Override
    public void exibirPagina(String pagina) {
        internetBrowser.exibirPagina(pagina);
    }

    @Override
    public void adicionarNovaAba(String pagina) {
        internetBrowser.adicionarNovaAba(pagina);
    }

    @Override
    public void atualizarPagina() {
        internetBrowser.atualizarPagina();
    }

    public static void main(String[] args) {
        iPhone iphone = new iPhone();

        iphone.tocar();
        iphone.selecionarMusica("Música 1");
        iphone.pausar();

        iphone.ligar("123456789");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.exibirPagina("www.google.com");
        iphone.adicionarNovaAba("www.yahoo.com");
        iphone.atualizarPagina();
    }
}
