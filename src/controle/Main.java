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
                d.cadastarEqConstrucao(eqc);
                d.cadastarEqEletronico(eqe);
                d.cadastarFilial(f);
                d.cadastrarVeiculo(v);
                d.vinculaPatrimonio(f, v);
                d.vinculaPatrimonio(f, v2);
                
                System.out.println(d.getFilial());
                System.out.println("-----------------------------------------------------------------");
                System.out.println(d.getEqConstrucao());
                System.out.println("-----------------------------------------------------------------");
                System.out.println(d.getEqEletronico());
                System.out.println("-----------------------------------------------------------------");
                System.out.println(d.getVeiculo());
        }

}
