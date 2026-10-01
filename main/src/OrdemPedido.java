import  java.util.Date;

public class OrdemPedido {
    private int cod;
    private String nomeCliente;
    private String modeloVeiculo;
    private String placaVeiculo;
    private Date data;
    private Status status;
    private double valor;
    private Serviço serviço;

    public OrdemPedido (String nomeCliente, String modelo, String placa, Date data, double valor){
        this.nomeCliente = nomeCliente;
        this. modeloVeiculo = modelo;
        this.placaVeiculo = placa;
        this.data = data;
        this.valor = valor;
        this.status = Status.ABERTO;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

        public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    private Box box;
    public Box getBox() {
        return box;
    }

    public void setBox(Box box) {
        this.box = box;
    }
    public int getCod() {
        return cod;
    }
    public void setCod(int cod) {
        this.cod = cod;
    }
     public String getNomeCliente() {
        return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
      public String getModeloVeiculo() {
        return modeloVeiculo;
    }
    public void setModeloVeiculo(String modeloVeiculo) {
        this.modeloVeiculo = modeloVeiculo;
    }
     public String getPlacaVeiculo() {
        return placaVeiculo;
    }
    public void setPlacaVeiculo(String placaVeiculo) {
        this.placaVeiculo = placaVeiculo;
    }
// Parte 3
    public void atribuirBox(Box box){
        if(status!=Status.ABERTO){
            System.out.println("Box ja atribuido");
        }
        if(box.gettiposervico()==serviço){
            this.box=box;
        }
        System.out.println("Tipo de Serviço diferente!");
    }

    public void finalizar(){
        status = Status.FINALIZADO;
    }
        @Override
    public String toString() {
        String textoBox = box == null ? "sem box" : "box " + box.getnumero();
        String textoMecanico = (box == null || box.getMecanico() == null) ? "-" : box.getMecanico().toString();
        return "Atendimento #" + cod
                + "\n  Cliente: " + nomeCliente 
                + "\n  Data: " + data + " | Status: " + status
                + "\n  Valor: " + valor
                + "\n  Observações: " + serviço.getNome()
                + "\n  Box: " + textoBox
                + "\n  Veterinário: " + textoMecanico;
    }

}
