import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        
        try (Scanner terminal = new Scanner(System.in)) {

            System.out.println("Digite o primeiro numero");
            int parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo numero");
            int parametroDois = terminal.nextInt();
            
            try {
            	//chamando o método contendo a lógica de contagem
            	contar(parametroUm, parametroDois);
            
            }catch (ParametrosInvalidosException exception) {
            	//imprimir a mensagem
                System.out.println("O segundo parâmetro deve ser maior que o primeiro");
            }
        }
    }

    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }
		
		int contagem = parametroDois - parametroUm;
		//realizar o for para imprimir os números com base na variável contagem
        for (int index = 1; index <= contagem; index++) {
            System.out.println("Imprimindo o número " + index);
        }
	}
}
