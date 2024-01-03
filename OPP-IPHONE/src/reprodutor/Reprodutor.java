package reprodutor;

public interface Reprodutor {

    public default void tocar(){
        System.out.println("Tocando Musica");
    };
    public default void pausar(){
        System.out.println("Pausando musica");
    };
    public default void selecionarMusica(){
        System.out.println("Selecionando musica");
    };
}