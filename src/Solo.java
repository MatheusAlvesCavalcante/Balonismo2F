public class Solo {
    // Atrinbutos
    String tipo;
    String cor;
    String substamcias;
    boolean fertil;

    // Métodos
    public Planta gerarPlanta(Semente s1){

    Planta p1 = new Planta(s1);
    return p1;
}
}
