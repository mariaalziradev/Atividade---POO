public class Guitarra {
    // Atributos
    private String modelo;
    private String cor;
    private int numeroDeCordas;

    // Construtor
    public Guitarra(String modelo, String cor, int numeroDeCordas) {
        this.modelo = modelo;
        this.cor = cor;
        this.numeroDeCordas = numeroDeCordas;
    }

    // Métodos
    public void tocar() {
        System.out.println("A guitarra " + modelo + " está tocando.");
    }

    public void afinar() {
        System.out.println("Afinando a guitarra " + modelo + " de cor " + cor + ".");
    }

    // Getters e Setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getNumeroDeCordas() {
        return numeroDeCordas;
    }

    public void setNumeroDeCordas(int numeroDeCordas) {
        this.numeroDeCordas = numeroDeCordas;
    }

    // Método main para testar a classe
    public static void main(String[] args) {
        Guitarra minhaGuitarra = new Guitarra("Fender", "Preta", 6);
        minhaGuitarra.tocar();
        minhaGuitarra.afinar();
    }
}
