public class Mecanico {

    private String nome;
    private int cpf;
    private String especialidade;
    private String telefone;


    public Mecanico(String nome, int cpf, String especialidade, String telefone){
        this.nome = nome;
        this.cpf = cpf;
        this.especialidade = especialidade;
        this.telefone = telefone;
    }

    public String getnome(){
        return nome;
    }
    public int getcpf(){
        return cpf;
    }
    public String getespecialidade(){
        return especialidade;
    }
    public String gettelefone(){
        return telefone;
    }


}
