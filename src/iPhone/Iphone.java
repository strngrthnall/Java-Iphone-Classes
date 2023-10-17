package iPhone;

import iPhone.Funcoes.NavegadorWeb;
import iPhone.Funcoes.ReprodutorMusical;
import iPhone.Funcoes.Telefone;

public class Iphone implements NavegadorWeb, ReprodutorMusical, Telefone{


  public Iphone() {
  }


  public void exibirPagina() {
    System.out.println("Página exibida");
  }

  public void adicionarNovAba() {
    System.out.println("Nova aba adicionda");
  }

  public void atualizarPagina() {
    System.out.println("Página atualizada");
  }
  
  public void tocar() {
    System.out.println("REPRODUZINDO MUSICA");
  }

  public void pausar() {
    System.out.println("MUSICA PAUSADA.");
  }

  public void selecionarMusica(String nome) {
    System.out.println("Musica " + nome + " selecionada.");
  }

  public void ligar(int numero) {
    System.out.println("Ligando para o numero" + numero);
  }

  public void atender() {
    System.out.println("Ligação atendida");
  }

  public void iniciarCorreioVoz() {
    System.out.println("Ligando para o correio de voz");
  }

  public static void main(String[] args) {
    Iphone iphone = new Iphone();

    iphone.exibirPagina();
    iphone.atualizarPagina();
    iphone.adicionarNovAba();

    iphone.atender();
    iphone.ligar(11122333);
    iphone.iniciarCorreioVoz();

    iphone.tocar();
    iphone.pausar();
    iphone.selecionarMusica("Welcome to the jungle - guns n' roses");
    
  }
  
}
