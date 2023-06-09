package modelo;

public class EquipamentoConstrucao extends ItemPatrimonio {
	private double pesoEquipamento;
	private int anoFabricacao;
	private String material;
	private int codigo;

	public EquipamentoConstrucao() {
		super();
	}

	public EquipamentoConstrucao(String nomeItem, int quantidade, double valor, String marca, double pesoEquipamento,
			int anoFabricacao, String material, int codigo) {
		this.nomeItem = nomeItem;
		this.quantidade = quantidade;
		this.valor = valor;
		this.marca = marca;
		this.pesoEquipamento = pesoEquipamento;
		this.anoFabricacao = anoFabricacao;
		this.material = material;
		this.codigo = codigo;
	}

	public double getPesoEquipamento() {
		return pesoEquipamento;
	}

	public void setPesoEquipamento(double pesoEquipamento) {
		this.pesoEquipamento = pesoEquipamento;
	}

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public void setCodigoConstrucao(int numero){
		this.codigo = numero;
	}

	public int getCodigoConstrucao(){
		return codigo;
	}

	@Override
	public String toString() {
		return "NOME PATRIMONIO: "+  nomeItem + "\nQUANTIDADE: " + quantidade + "\nVALOR: "+ valor +"\nMARCA: " + marca + "\nPESO: " + pesoEquipamento + "\nANO FABRICACAO: " + anoFabricacao + "\nMATERIAL: "+ material+ "\nCODIGO: " + codigo + "\n";
	}

}
