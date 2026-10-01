public class Box {
    private int numero;
    private Serviço tiposervico;
    private int capacidademax;
    private String localizacao;
    private Mecanico mecanico;

    public Box(int numero, Serviço tiposervico, int capacidademax, String localizacao){
        this.tiposervico = tiposervico;
        this.numero = numero;
        this.capacidademax = capacidademax;
        this.localizacao = localizacao;
    }

    public int getnumero(){
        return numero;
    }
    public  Serviço gettiposervico(){
        return  tiposervico;
    }
    public int getcapacidademax(){
        return capacidademax;
    }
    public String getlocalização(){
        return localizacao;
    }
        public void associarBox(Mecanico mecanico){
        this.mecanico = mecanico;
    }
    public Mecanico getMecanico(){
        return  mecanico;
    }

}
