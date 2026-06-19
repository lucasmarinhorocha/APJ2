

public class Pessoa {
    private String nome,endereco;

//Construtor
    public Pessoa(String nome){
         this.setNome(nome);
    }
    //Metodos 
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public String getEndereco(){
        return this.endereco;
    }
}
