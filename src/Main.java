public class Main {
    public static void main(String[] args){
        Pessoa adao = new Pessoa();
                Pessoa eva = new Pessoa();

                // definição do formato
        adao.nome = "Adão";
                adao.sobrenome = "Silva";

                eva.nome = "Eva";
                        eva.sobrenome="Silva";

                        adao.falar();
                        eva.falar();

        // Criar mais objetos
        Pessoa qualquer = new Pessoa();
        //Declarar objeto
        Pessoa rainha;
        // Insraciação do obejeto
        rainha = new Pessoa();
        // Definindo forma de pessoa
        rainha.nome = "Tina";
        rainha.sobrenome= "Tunner";
        // definição de comportamento
        System.out.println(rainha.falar("alto"));



    }
}