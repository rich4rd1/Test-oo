package modelo;

import java.util.*;

public class Dados {
    private ArrayList<EquipamentoConstrucao> EqConstrucao = new ArrayList<>();
    private ArrayList<EquipamentoEletronico> EqEletronico = new ArrayList<>();
    private ArrayList<Filial> Filiais = new ArrayList<>();
    private ArrayList<ItemPatrimonio> Patrimonio = new ArrayList<>();
    private ArrayList<Veiculo> Veiculo = new ArrayList<>();

    // BLOCO DE EQUIPAMENTO DE CONSTRUCAO ------------------------------------------
    public void cadastarEqConstrucao(EquipamentoConstrucao eqpc) {
        this.EqConstrucao.add(eqpc);
    }

    public ArrayList<EquipamentoConstrucao> getEqConstrucao() {
        return EqConstrucao;
    }

    public EquipamentoConstrucao listarEqConstucao(int pos) {
        return EqConstrucao.get(pos);
    }

    public void removerEqConstrucao(int posicao) {
        EqConstrucao.remove(posicao);
    }

    // BLOCO DE EQUIPAMENTO
    // ELETRONICO-----------------------------------------------

    public void cadastarEqEletronico(EquipamentoEletronico eqpe) {
        this.EqEletronico.add(eqpe);
    }

    public ArrayList<EquipamentoEletronico> getEqEletronico() {
        return EqEletronico;
    }

    public EquipamentoEletronico listarEqEletronico(int posicao) {
        return EqEletronico.get(posicao);
    }

    public void removerEqEletronico(int posicao) {
        this.EqEletronico.remove(posicao);
    }
    // BLOCO DE FILIAL
    // --------------------------------------------------------------

    public void cadastarFilial(Filial filial) {
        this.Filiais.add(filial);
    }

    public ArrayList<Filial> getFilial() {
        return Filiais;
    }

    public void removerFilial(int posicao) {
        this.Filiais.remove(posicao);
    }

    public Filial listarFilial(int posicao) {
        return Filiais.get(posicao);
    }

}