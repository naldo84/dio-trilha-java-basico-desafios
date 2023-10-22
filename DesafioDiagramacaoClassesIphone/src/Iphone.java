
public class Iphone {
    public static void main(String[] args) throws Exception {
        DispositivoSmart iphoneNaldo = new DispositivoSmart();

        //Modo Navegador de Internet:
        iphoneNaldo.abrirNavegador();
        iphoneNaldo.exibirPagina();
        iphoneNaldo.adicionarNovaAba();
        iphoneNaldo.atualizarPagina();

        //Modo ReprodutorMusical
        adicionarLinha();
        iphoneNaldo.selecionarMusica("I don't wanna miss a thing");
        iphoneNaldo.tocarMusica();
        iphoneNaldo.pausarMusica();
        iphoneNaldo.tocarMusica();

        //Modo Telefone
        adicionarLinha();
        iphoneNaldo.ligar("1199999999");
        iphoneNaldo.desligar();
        iphoneNaldo.atender();
        iphoneNaldo.desligar();
        iphoneNaldo.ouvirCorreioVoz();
        iphoneNaldo.desligar();

    }

    public static void adicionarLinha(){
        System.out.println("\n------------------------------------");
    }
}
