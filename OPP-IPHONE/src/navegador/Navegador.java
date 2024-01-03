package navegador;

public interface Navegador {

    public default void exibirPagina(){
        System.out.println("Exibindo pagina");
    };
    public default void adicionarNovaAba(){
        System.out.println("Adcionando nova aba!");
    };
    public default void atualizarPagina(){
        System.out.println("Atualizando pagina");
    };
}
