package modelo;

public class Veiculo extends ItemPatrimonio {
	private String tipoVeiculo;
	private String cor;
	private int qtdPortas;
	private int codigo;

	public Veiculo() {
		super();
	}

	public Veiculo(String nomeItem, int quantidade, double valor, String marca, String tipoVeiculo, String cor,
			int qtdPortas, int codigo) {
		this.nomeItem = nomeItem;
		this.quantidade = quantidade;
		this.valor = valor;
		this.tipoVeiculo = tipoVeiculo;
		this.cor = cor;
		this.qtdPortas = qtdPortas;
		this.codigo = codigo;
		this.marca = marca;
	}

	public String getTipoVeiculo() {
		return tipoVeiculo;
	}

	public void setTipoVeiculo(String tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getQtdPortas() {
		return qtdPortas;
	}

	public void setQtdPortas(int qtdPortas) {
		this.qtdPortas = qtdPortas;
	}

	public void setCodigoVeiculo(int numero){
		this.codigo = numero;
	}

	public int getCodigoVeiculo(){
		return codigo;
	}

	@Override
	public String toString() {
		return "\nNOME: " + nomeItem + "\nQUANTIDADE: " + quantidade+ "\nVALOR: "+ valor + "\nMARCA: " + marca + "\nTIPO: " + tipoVeiculo + "\nCOR: " + cor + "\nQUANTIDADE DE PORTAS: " + qtdPortas + "\nCODIGO: " + codigo + "\n";
	}

}
