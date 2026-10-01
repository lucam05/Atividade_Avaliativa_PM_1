public class Serviço {
    private String nome;
    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    private int tempo;
    public int getTempo() {
        return tempo;
    }


    public void setTempo(int tempo) {
        this.tempo = tempo;
    }


    private double valor;
    public double getValor() {
        return valor;
    }


    public void setValor(double valor) {
        this.valor = valor;
    }


    private String categoria;


    public String getCategoria() {
        return categoria;
    }


    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }


    public Serviço(String nome, int tempo, double valor, String categoria){
        this.nome = nome;
        this.tempo = tempo;
        this.valor = valor;
        this.categoria = categoria;
    }

}
