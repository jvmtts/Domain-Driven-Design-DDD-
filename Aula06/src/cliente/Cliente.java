package cliente;
public class Cliente {
    private String id;
    private String nome;
    private String email;
    private String telefone;

    public Cliente(String nome, String telefone, String email){
        this.id = java.util.UUID.randomUUID().toString();
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;

        System.out.println("Cliente criado: " + nome);
    }

    public String getid(){
        return this.id;
    }
    public String getNome(){
        return this.nome;
    }
    public String getemail(){
        return this.email;
    }
    public String gettelefone(){
        return this.telefone;

    }
}