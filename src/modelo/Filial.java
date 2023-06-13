package modelo;

import java.util.ArrayList;

public class Filial {
    private String nome;
    private String cnpj;
    private String endereco;
    ArrayList<String> patrimonioFilial = new ArrayList<String>();
    private int codigo;
    

    public Filial(String nome, String cnpj, String endereco, int numeroFilial, int codigo ) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.codigo = codigo;
    }

    public ArrayList<String> patrimonioFilial(){
        return patrimonioFilial;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public ArrayList<String> getPatrimonio() {
        return patrimonioFilial;
    }

    public void setPatrimonio(ArrayList<String> patrimonio) {
        this.patrimonioFilial = patrimonio;
    }

    public void setCodigoFilial(int numero){
		this.codigo = numero;
	}

	public int getCodigoFilial(){
		return codigo;
	}

    public String toString() {
        return "\nNOME FILIAL: " + nome + "\nCNPJ: " + cnpj + "\nENDERECO: " + endereco + "\nPATRIMONIO: " + "\nCODIGO: " + codigo +"\n" + getPatrimonio();
    }
}
