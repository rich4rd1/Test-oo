package controle;

import java.util.ArrayList;

import modelo.Dados;
import modelo.EquipamentoConstrucao;
import modelo.EquipamentoEletronico;
import modelo.Filial;
import modelo.Veiculo;

public class Main {
        public static void main(String[] args) {
                EquipamentoConstrucao eqc = new EquipamentoConstrucao("FURADEIRA", 1, 1000.00, "TARUS", 2.00, 2022,
                                "FERRAMENTA", 1);

                EquipamentoEletronico eqe = new EquipamentoEletronico("CELULAR", 1, 2000, "XIOMI", 400, 12,
                                "ANDROID/MIUI",
                                "LITE 8-784", 1);

                Filial f = new Filial("BSA CONSTRUCAO", "123456789-9", "LAGO NORTE", 1, 1);

                Veiculo v = new Veiculo("TRATOR-ESCAVADEIRA", 1, 500000, "CAT", "PESADO", "AMARELO", 2, 1);

                Veiculo v2 = new Veiculo("CAMINHAO-TRANSPORTE", 1, 100000,
                                "VOLVO", "PESADO", "PRETO", 2, 1);

                Dados d = new Dados();
                d.cadastrarEqConstrucao(eqc);
                d.cadastrarEqEletronico(eqe);
                d.cadastrarVeiculo(v);
                d.cadastrarVeiculo(v2);
                d.cadastrarFilial(f);
                d.vincularPatrimonioVeiculo(f, v);
                d.vincularPatrimonioVeiculo(f, v2);
                d.vincularPatrimonioConstrucao(f, eqc);
                d.vincularPatrimonioEquipEletronico(f, eqe);
                d.adicionarTodosPatrimonios();
                

                System.out.println(d.getFiliais());
                System.out.println("----------------------------------------------------");           
                System.out.println(d.getPatrimonios());
 
                    
                
        }
}
