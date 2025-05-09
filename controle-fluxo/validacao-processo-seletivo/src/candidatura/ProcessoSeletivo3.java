package candidatura;

public class ProcessoSeletivo3 {

    public static void main(String[] args) {
        System.out.println("Processo Seletivo");

       imprimirCandidato();
    }

    static void imprimirCandidato() {
        String[] candidatos = {"FELIPE", "MARCIA", "JULIA","PAULO",  "AUGUSTO"};

        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

        for (int indece = 0; indece < candidatos.length; indece++) {
            System.out.println("O candidato de Nº" + (indece + 1)
                            + " é o " + candidatos[indece]);
        }

        System.out.println("Forma abreviada de interacao for each");
        for (String candidato : candidatos) {
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }
}
