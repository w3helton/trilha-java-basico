## SOLUÇÂO
## Diagrama de Classes
![Diagrama](https://github.com/w3helton/trilha-java-basico/blob/main/desafios/poo/iphone/img/iphone%20UML.png)

Neste diagrama de classes:

**iPhone** é a classe principal que implementa as **interfaces MusicPlayer, Phone e InternetBrowser**.

As interfaces MusicPlayer, Phone e InternetBrowser têm métodos relevantes para suas respectivas funcionalidades.

**MusicPlayerImpl, PhoneImpl e InternetBrowserImpl** são classes que implementam as interfaces correspondentes.

No construtor iPhone(), são inicializados os atributos musicaAtual, numeroLigacao e paginaAtual.

Os métodos tocar, pausar, selecionarMusica, ligar, atender, iniciarCorreioVoz, exibirPagina, adicionarNovaAba e atualizarPagina são implementações dos métodos das interfaces MusicPlayer, Phone e InternetBrowser. Cada método imprime uma mensagem para indicar a ação realizada.

Em resumo, o arquivo iPhone.java define a classe iPhone que atua como um dispositivo simulado com funcionalidades de reprodutor de música, telefone e navegador na internet. Ele implementa essas funcionalidades por meio das interfaces e dos métodos definidos nelas, imprimindo mensagens informativas para cada ação executada.
