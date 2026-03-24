package cliente;

public class Endereco {
    private final String rua;
    private final Integer numero;
    private final String bairro;
    private final String cidade;
    private final String cep;

    public Endereco(String pais, String estado, String cidade,
        String rua, Integer numero, String bairro, String cep){

        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getCep() {
        return cep;
    }

    public String mostrarEndereco(){
        return  "Cidade: "  + cidade + "\n" +
                "Bairro: "  + bairro + "\n" +
                "Rua: "  + rua + "\n" +
                "Número: "  + numero + "\n" +
                "CEP: "  + cep + "\n";
                
 
    }

}