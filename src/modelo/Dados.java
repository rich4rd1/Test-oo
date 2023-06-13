package modelo;

import java.util.ArrayList;

public class Dados {
    private ArrayList<EquipamentoConstrucao> eqConstrucao = new ArrayList<>();
    private ArrayList<EquipamentoEletronico> eqEletronico = new ArrayList<>();
    private ArrayList<Filial> filiais = new ArrayList<>();
    private ArrayList<Veiculo> veiculos = new ArrayList<>();
    private ArrayList<String> patrimonios = new ArrayList<>();

    // BLOCO DE EQUIPAMENTO DE CONSTRUCAO
    // ----------------------------------------------

    public void cadastrarEqConstrucao(EquipamentoConstrucao equipamentoConstrucao) {
        this.eqConstrucao.add(equipamentoConstrucao);
    }

    public ArrayList<EquipamentoConstrucao> getEqConstrucao() {
        return eqConstrucao;
    }

    public EquipamentoConstrucao listarEqConstrucao(int posicao) {
        return eqConstrucao.get(posicao);
    }

    public void removerEqConstrucao(int posicao) {
        eqConstrucao.remove(posicao);
    }

    // BLOCO DE EQUIPAMENTO ELETRONICO
    // -------------------------------------------------

    public void cadastrarEqEletronico(EquipamentoEletronico equipamentoEletronico) {
        this.eqEletronico.add(equipamentoEletronico);
    }

    public ArrayList<EquipamentoEletronico> getEqEletronico() {
        return eqEletronico;
    }

    public EquipamentoEletronico listarEqEletronico(int posicao) {
        return eqEletronico.get(posicao);
    }

    public void removerEqEletronico(int posicao) {
        this.eqEletronico.remove(posicao);
    }

    // BLOCO DE FILIAL ---------------------------------------------------------

    public void cadastrarFilial(Filial filial) {
        this.filiais.add(filial);
    }

    public ArrayList<Filial> getFiliais() {
        return filiais;
    }

    public void removerFilial(int posicao) {
        this.filiais.remove(posicao);
    }

    public Filial listarFilial(int posicao) {
        return filiais.get(posicao);
    }

    public ArrayList<String> vincularPatrimonioVeiculo(Filial filial, Veiculo veiculo) {
        int cv = filial.getCodigoFilial();
        int cf = veiculo.getCodigoVeiculo();
        String veiculoFilial = veiculo.toString();
        if (cv == cf) {
            filial.patrimonioFilial.add(veiculoFilial);
        }
        return filial.patrimonioFilial();
    }

    public ArrayList<String> vincularPatrimonioEquipEletronico(Filial filial, EquipamentoEletronico equipEletronico) {
        int cv = filial.getCodigoFilial();
        int eqpe = equipEletronico.getCodigoEletronico();
        String equipEletronicoFilial = equipEletronico.toString();
        if (cv == eqpe) {
            filial.patrimonioFilial.add(equipEletronicoFilial);
        }
        return filial.patrimonioFilial();
    }

    public ArrayList<String> vincularPatrimonioConstrucao(Filial filial, EquipamentoConstrucao equipconstrucao) {
        int cv = filial.getCodigoFilial();
        int eqpc = equipconstrucao.getCodigoConstrucao();
        String equipConstrucaoFilial = equipconstrucao.toString();
        if (cv == eqpc) {
            filial.patrimonioFilial.add(equipConstrucaoFilial);
        }
        return filial.patrimonioFilial();
    }

    // BLOCO DE VEICULO ----------------------------------------------------------

    public void cadastrarVeiculo(Veiculo veiculo) {
        this.veiculos.add(veiculo);
    }

    public ArrayList<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void removerVeiculo(int posicao) {
        this.veiculos.remove(posicao);
    }

    public Veiculo listarVeiculo(int posicao) {
        return veiculos.get(posicao);
    }

    // BLOCO DE PATRIMONIOS--------------------------------------------------------

    public void adicionarTodosPatrimonios() {
        for (EquipamentoConstrucao eq : eqConstrucao) {
            patrimonios.add(eq.toString());
        }

        for (EquipamentoEletronico eq : eqEletronico) {
            patrimonios.add(eq.toString());
        }

        for (Veiculo veiculo : veiculos) {
            patrimonios.add(veiculo.toString());
        }
    }

    // LISTAR TODOS OS ITENS -------------------------------------
    public ArrayList<String> getPatrimonios() {
        return patrimonios;
    }
}
