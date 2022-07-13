public class Mensagem {
    
    public static void obterMensagem(int hora) {

        if (hora >= 0 && hora <= 24){
            if (hora <= 12){
                System.out.println("Bom dia! :)");
            }

            else if (hora >12 && hora <=18){
                System.out.println("Boa tarde! :)");
            }
            
            else {
                System.out.println("Boa noite! :)");
            }
    }
        else {
            System.out.println("Digite uma hora válida!");
        }
    }

}
