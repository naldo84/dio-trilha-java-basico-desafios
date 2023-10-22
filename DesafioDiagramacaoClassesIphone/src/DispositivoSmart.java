import AparelhoTelefonico.TelefoneInterface;
import NavegadorInternet.NavegadorInterface;
import ReprodutorMusical.ReprodutorMusicalInterface;

public class DispositivoSmart implements TelefoneInterface, ReprodutorMusicalInterface, NavegadorInterface{

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação");
    }

    @Override
    public void ouvirCorreioVoz() {
        System.out.println("Ouvindo correio de voz");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando a ligação");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibir página da internet");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionar nova página de internet");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizar página");
    }

    @Override
    public void tocarMusica() {
        System.out.println("Mostrando o nome da música");
        System.out.println("Tocando música");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Pausando música");
    }

    @Override
    public void selecionarMusica(String nomeMusica) {
        System.out.println("Selecionando a música: " + nomeMusica);
    }

    @Override
    public void abrirNavegador() {
        System.out.println("Abrir Navegador de internet");
        System.out.println("Digitar Endereço do site");
    }
    
}
