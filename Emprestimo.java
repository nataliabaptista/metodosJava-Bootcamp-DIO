public class Emprestimo {
    
    public static double getTaxaAteTresPcs(){
        return 0.35;
    }
    public static double getTaxaAteSeisPcs(){
        return 0.50;
    }
    public static double getTaxaAteNovePcs(){
        return 0.65;
    }
    public static double getTaxaAteDozePcs(){
        return 0.80;
    }

    public static void calculaValorFinal(double valorEmprestado, int parcelas) {
        if (parcelas >1 && parcelas <=3){
            double valorFinal = valorEmprestado + (valorEmprestado * getTaxaAteTresPcs());
            System.out.println("O valor final desse empréstimo de " +parcelas+ " parcelas será de: R$ " +valorFinal);

        }

        else if (parcelas <=6){
            double valorFinal = valorEmprestado + (valorEmprestado * getTaxaAteSeisPcs());   
            System.out.println("O valor final desse empréstimo de " +parcelas+ " parcelas será de: R$ " +valorFinal);
         
        }

        else if (parcelas <=9){
            double valorFinal = valorEmprestado + (valorEmprestado * getTaxaAteNovePcs());
            System.out.println("O valor final desse empréstimo de " +parcelas+ " parcelas será de: R$ " +valorFinal);

        }

        else if (parcelas <=12){
            double valorFinal = valorEmprestado + (valorEmprestado * getTaxaAteDozePcs());
            System.out.println("O valor final desse empréstimo de " +parcelas+ " parcelas será de: R$ " +valorFinal);
        }

        else {
            System.out.println("Só parcelamos empréstimos em até 12x. Digite um número de parcelas válido.");
        }
            
        }
        
    }
