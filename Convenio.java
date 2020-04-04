
package hireright;

/**
 *
 * @author Charliston Rodrigo Cezar
 */

public class Convenio {
    
    private String nome;
    private String nomeConvenio;
    private int telefone;
    private int numeroCarteira;
    private int id;

      
     public Convenio(String nome, String nomeConvenio, int telefone, int numeroCarteira, int id){
    
         this.nome = nome;
         this.nomeConvenio = nomeConvenio;        
         this.telefone = telefone;
         this.numeroCarteira = numeroCarteira;
         this.id = id;
    }
     
    public Convenio(){   
        
    }
    
    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }
   
    
    public int getTelefone() {
        return telefone;
    }

    
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    
    public int getNumeroCarteira() {
        return numeroCarteira;
    }

    
    public void setNumeroCarteira(int numeroCarteira) {
        this.numeroCarteira = numeroCarteira;
    }
    
    public String getNomeConvenio() {
        return nomeConvenio;
    }

    public void setNomeConvenio(String nomeConvenio) {
        this.nomeConvenio = nomeConvenio;
    }
    
    
    @Override
    public String toString(){
        
        return " Nome : " 
                + nome
                +" \n"
                + " Numero de telefone : "
                + telefone
                +" \n"
                + " Numero de carteirinha : "
                + numeroCarteira
                +" \n"
                +" Nome do convenio : "
                + nomeConvenio
                +" \n"
                +" Numero do id : "
                + id;
    }

    
    public int getId() {
        return id;
    }

  
    public void setId(int id) {
        this.id = id;
    }

}
