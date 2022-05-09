package metodos;

public class main {
    public static void main(String[] args) {

        // Calculadora
        System.out.println("Exercício calculadora:");
        Calculadora.soma(5,2);
        Calculadora.subtracao(5,2);
        Calculadora.multiplicacao(5,2);
        Calculadora.divisao(5,2);

        //Mensagem
        System.out.println("Exercício mensagem:");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(22);

        //Emprestimo
        System.out.println("Exercício empréstimo:");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);
    }
}
