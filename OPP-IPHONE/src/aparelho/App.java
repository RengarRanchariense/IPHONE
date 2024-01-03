package aparelho;

import chamadas.Chamadas;
import navegador.Navegador;
import reprodutor.Reprodutor;

public class App implements Chamadas, Navegador, Reprodutor{
    @Override
    public void pausar() {
        
        Reprodutor.super.pausar();
    }

    @Override
    public void tocar() {
        
        Reprodutor.super.tocar();
    }

    @Override
    public void selecionarMusica() {
        
        Reprodutor.super.selecionarMusica();
    }

    @Override
    public void ligar() {
        
        Chamadas.super.ligar();
    }

    @Override
    public void atender() {
        
        Chamadas.super.atender();
    }

    @Override
    public void iniciarCorreioVoz() {
        
        Chamadas.super.iniciarCorreioVoz();
    }

    @Override
    public void exibirPagina() {
        
        Navegador.super.exibirPagina();
    }

    @Override
    public void atualizarPagina() {
        
        Navegador.super.atualizarPagina();
    }

    @Override
    public void adicionarNovaAba() {
        
        Navegador.super.adicionarNovaAba();
    }
}
