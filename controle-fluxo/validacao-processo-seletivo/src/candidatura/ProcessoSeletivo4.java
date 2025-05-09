package candidatura;

import java.util.Random;

public class ProcessoSeletivo4 {

    public static void main(String[] args) {
        System.out.println("Processo Seletivo");
        String[] candidatos = {"FELIPE", "MARCIA", "JULIA","PAULO",  "AUGUSTO"};
        
        for (String candidato : candidatos) {
            entrarEmContato(candidato);
        }
    }

    static void entrarEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            
            if (continuarTentando) {
                System.out.print("Candidato " + candidato);
                System.out.println(" Tentativas " + tentativasRealizadas);
                tentativasRealizadas++;
            }
            else {
                System.out.println("CONTATO COM " + candidato + " REALIZADO COM SUCESSO\n");
            }

            if (tentativasRealizadas > 3) {
                System.out.println("NÃO ATENDIDO\n");
            }

        } while(continuarTentando && tentativasRealizadas <= 3);
    }

    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }
}
