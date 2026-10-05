public class Questao {

    private String pergunta;
    private String alternativaA;
    private String alternativaB;
    private String alternativaC;
    private String alternativaD;
    private String alternativaE;
    private char respostaCorreta;

    public Questao(String pergunta,
                   String alternativaA,
                   String alternativaB,
                   String alternativaC,
                   String alternativaD,
                   String alternativaE,
                   char respostaCorreta) {

        this.pergunta = pergunta;
        this.alternativaA = alternativaA;
        this.alternativaB = alternativaB;
        this.alternativaC = alternativaC;
        this.alternativaD = alternativaD;
        this.alternativaE = alternativaE;
        this.respostaCorreta = respostaCorreta;
    }

    public void exibirQuestao() {
        System.out.println(pergunta);
        System.out.println("A) " + alternativaA);
        System.out.println("B) " + alternativaB);
        System.out.println("C) " + alternativaC);
        System.out.println("D) " + alternativaD);
        System.out.println("E) " + alternativaE);
    }

    public boolean verificarRespostaCorreta(char resposta) {
        return resposta == respostaCorreta;
    }
}