import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nome: Bruno Hernandes oliveira Silva");
        System.out.println("Professor: Brenno Pimenta da Costa");
        System.out.println("Faculdade: UNIFAN - Centro Universitário Alfredo Nasser");
        System.out.println("Tema: Óculos, Lentes e Saúde Visual");
        System.out.println();

        List<Questao> questoes = new ArrayList<>();

        int acertos = 0;

        questoes.add(new Questao("1) Qual é a principal função das lentes dos óculos de grau?",
                "Melhorar a audição",
                "Corrigir problemas de visão",
                "Proteger os olhos do vento",
                "Aumentar o tamanho dos olhos",
                "Alterar a cor dos olhos",
                'B'));

        questoes.add(new Questao("2) Qual profissional é responsável por realizar o exame de refração e prescrever lentes corretivas?",
                "Dentista",
                "Fisioterapeuta",
                "Oftalmologista",
                "Nutricionista",
                "Cardiologista",
                'C'));

        questoes.add(new Questao("3) O que significa uma lente com proteção UV?",
                "Proteção contra vírus",
                "Proteção contra raios ultravioleta",
                "Proteção contra poeira",
                "Proteção contra água",
                "Proteção contra luz de celulares",
                'B'));

        questoes.add(new Questao("4) Para que serve o tratamento antirreflexo em uma lente?",
                "Deixar a lente mais pesada",
                "Diminuir reflexos na superfície da lente",
                "Aumentar o grau",
                "Mudar a cor dos olhos",
                "Aumentar a espessura da lente",
                'B'));

        questoes.add(new Questao("5) Qual material é bastante utilizado na fabricação de lentes de óculos?",
                "Madeira",
                "Vidro e materiais plásticos específicos",
                "Papel",
                "Borracha",
                "Ferro",
                'B'));

        questoes.add(new Questao("6) O que é miopia?",
                "Dificuldade para enxergar objetos próximos",
                "Dificuldade para enxergar objetos distantes",
                "Dificuldade para distinguir cores",
                "Perda completa da visão",
                "Sensibilidade ao som",
                'B'));

        questoes.add(new Questao("7) O que é hipermetropia?",
                "Um problema relacionado à audição",
                "Dificuldade para enxergar objetos próximos",
                "Dificuldade para enxergar somente à noite",
                "Uma doença causada por vírus",
                "Uma alteração na cor dos olhos",
                'B'));

        questoes.add(new Questao("8) Para que servem as lentes fotossensíveis?",
                "Aumentar automaticamente o grau dos óculos",
                "Escurecer de acordo com a exposição à luz UV",
                "Corrigir daltonismo",
                "Aumentar o tamanho da armação",
                "Melhorar a audição",
                'B'));

        questoes.add(new Questao("9) Qual problema de visão está relacionado à dificuldade de focar corretamente devido à curvatura irregular da córnea ou do cristalino?",
                "Miopia",
                "Hipermetropia",
                "Astigmatismo",
                "Presbiopia",
                "Daltonismo",
                'C'));

        questoes.add(new Questao("10) Qual é a principal característica das lentes polarizadas?",
                "Aumentam o grau automaticamente",
                "Reduzem determinados reflexos e o brilho intenso",
                "Mudam a cor dos olhos",
                "Impedem completamente a entrada de luz",
                "Funcionam apenas em ambientes fechados",
                'B'));

        questoes.add(new Questao("11) O que é presbiopia?",
                "Uma dificuldade visual relacionada principalmente à idade, especialmente para enxergar de perto",
                "Uma doença que deixa os olhos vermelhos",
                "Uma alteração na percepção das cores",
                "Uma infecção ocular",
                "Uma dificuldade exclusiva para enxergar à noite",
                'A'));

        questoes.add(new Questao("12) Qual parte dos óculos fica apoiada sobre o nariz?",
                "Haste",
                "Ponte",
                "Aro",
                "Terminal",
                "Parafuso",
                'B'));

        questoes.add(new Questao("13) Qual é a função principal das hastes dos óculos?",
                "Corrigir o grau das lentes",
                "Apoiar e manter os óculos posicionados nas orelhas",
                "Escurecer as lentes",
                "Aumentar a proteção UV",
                "Medir a distância entre as pupilas",
                'B'));

        questoes.add(new Questao("14) O que é uma lente multifocal?",
                "Uma lente que possui diferentes zonas de correção para diferentes distâncias",
                "Uma lente exclusivamente para proteção solar",
                "Uma lente que muda de cor permanentemente",
                "Uma lente sem nenhum tipo de grau",
                "Uma lente utilizada somente por crianças",
                'A'));

        questoes.add(new Questao("15) Qual destas opções representa uma boa prática para conservar os óculos?",
                "Limpar as lentes com qualquer tecido disponível",
                "Colocar as lentes viradas para baixo sobre uma mesa",
                "Guardar os óculos em um estojo quando não estiverem sendo usados",
                "Usar produtos químicos domésticos para limpar as lentes",
                "Deixar os óculos expostos ao calor intenso",
                'C'));

        for (Questao questao : questoes) {
            questao.exibirQuestao();
            System.out.println("Qual a sua resposta: ");

            char resposta = scanner.next().toUpperCase().charAt(0);

            if (questao.verificarRespostaCorreta(resposta)) {
                System.out.println("Resposta Correta!");
                acertos++;
            } else {
                System.out.println("Resposta errada");
            }

            System.out.println();
        }

        System.out.println("Foram " + acertos + " acertos");

        double porcentagem = ((acertos * 100.0) / questoes.size());

        System.out.printf("Porcentagem de acertos: %.2f%% %n", porcentagem);

        System.out.println("Obrigado por participar do quiz");

        scanner.close();
    }
}
