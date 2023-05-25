public class Pessoa extends Animal{

    String nome ;
    String sobrenome;

    public void falar() {System.out.println("falei");
    }
    public String falar(String volume){
        return "falei" + volume;
    }
    // sobrescrito do método
    public void comer(){
        System.out.println("pessoa comeu");
    }
}

