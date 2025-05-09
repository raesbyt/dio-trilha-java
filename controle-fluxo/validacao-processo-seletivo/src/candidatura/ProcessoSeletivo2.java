package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo2 {

    public static void main(String[] args) {
        System.out.println("Processo Seletivo");

        selecaoCandidato();
    }

    static void selecaoCandidato() {
        String[] candidatos = {"FELIPE", "MARCIA", "JULIA","PAULO",  "AUGUSTO"
                            , "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};

        int candidatoSelecionado = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.00;

        while (candidatoSelecionado < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();
            System.out.println("O candidato " + candidato 
                            + " Solicitou este valor de salario " 
                            + String.format("%.2f", salarioPretendido));        
            
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato
                                + " foi selecionado para a vaga");

                candidatoSelecionado++;
            }
            candidatoAtual++;
        }

    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800.00, 2200.00);
    }
}
