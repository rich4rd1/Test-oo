package modelo;

public class EquipamentoEletronico extends ItemPatrimonio {
	private double pesoEquipamento;
	private int voltagem;
	private String sistema;
	private String modelo;
	private String marca;
	private int filialVinculadaE;
	public EquipamentoEletronico() {
		super();
	}

	public EquipamentoEletronico(String nomeItem, int quantidade, double valor, String marca, double pesoEquipamento,
			int voltagem, String sistema, String modelo, int filialVinculada) {
		this.nomeItem = nomeItem;
		this.quantidade = quantidade;
		this.valor = valor;
		this.pesoEquipamento = pesoEquipamento;
		this.voltagem = voltagem;
		this.sistema = sistema;
		this.modelo = modelo;
		this.marca = marca;
		this.filialVinculadaE = filialVinculada;
	}

	public double getPesoEquipamento() {
		return pesoEquipamento;
	}

	public void setPesoEquipamento(double pesoEquipamento) {
		this.pesoEquipamento = pesoEquipamento;
	}

	public int getVoltagem() {
		return voltagem;
	}

	public void setVoltagem(int voltagem) {
		this.voltagem = voltagem;
	}

	public String getSistema() {
		return sistema;
	}

	public void setSistema(String sistema) {
		this.sistema = sistema;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setMarca(String marca){
		this.marca = marca;
	}
	public String getMarca(){
		return marca;
	}

	public void setFilialVinculadaE(int numeroFilial){
		this.filialVinculadaE = numeroFilial;
	}

	public int getFilialVinculadaE(){
		return filialVinculadaE;
	}


	@Override
	public String toString() {
		return "NOME PATRIMONIO: "+  nomeItem + "\nQUANTIDADE: " + quantidade + "\nVALOR: "+ valor +"\nMARCA: " + marca + "\nPESO: " + pesoEquipamento + "\nVOLTAGEM: " + voltagem + "\nSISTEMA: " + sistema
				+ "\nMODELO: " + modelo + "\nFILIAL VINCULADA: " + filialVinculadaE + "\n";
	}

}