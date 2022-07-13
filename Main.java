// Pt1: Calcule as operações basicas com 2 valores (soma, subtraçao, multiplicação e divisão)

//Pt2: A partir da hora do dia, informe a mensagem adequada. "Bom dia, boa tarde ou boa noite"

// Pt3:Calcule um valor final de um emprestimo, a partir do valor solicitado. Taxas e parcelas influenciam. 
// Defina arbitrariamente as faixas que influenciam nos valores. 


public class Main {

    public static void main(String[] args) {
        Calculadora.soma(5, 9);
        Calculadora.divisao(15.5, 2.5);
        Calculadora.subtracao(10, 5);
        Calculadora.multiplicacao(2, 5);


        Mensagem.obterMensagem(24);

        Emprestimo.calculaValorFinal(1000.00, 12);

    }


}
