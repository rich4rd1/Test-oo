package modelo;

import java.util.*;

public class Dados {
    private ArrayList<EquipamentoConstrucao> EqConstrucao = new ArrayList<>();
    private ArrayList<EquipamentoEletronico> EqEletronico = new ArrayList<>();
    private ArrayList<Filial> Filial = new ArrayList<>();
    private ArrayList<ItemPatrimonio> Patrimonio = new ArrayList<>();
    private ArrayList<Veiculo> Veiculo = new ArrayList<>();
    int tamanho = 0 ;

    public ArrayList<EquipamentoConstrucao> getEqConstrucao() {
        return EqConstrucao;
    }

    public EquipamentoConstrucao listarEqConstucao(int pos) {
        return EqConstrucao.get(pos);
    }

    public void cadastarEqConstrucao(EquipamentoConstrucao eqpc) {
        this.EqConstrucao.add(eqpc);
    }

    public void removerEqConstuncao(int posicao) {
        this.EqConstrucao.remove(posicao);
    }

}
