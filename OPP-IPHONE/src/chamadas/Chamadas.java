package chamadas;

public interface Chamadas {
    public default void ligar(){
        System.out.println("Ligando");
    };
    public default void atender(){
        System.out.println("Atendendo");
    };
    public default void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de voz");
    };
    
} 

    

