package controle;

import java.util.ArrayList;
import modelo.Dados;
import modelo.EquipamentoConstrucao;
import modelo.EquipamentoEletronico;
import modelo.Filial;

public class Main {
    public static void main(String[] args) {
        EquipamentoConstrucao eqc = new EquipamentoConstrucao("FURADEIRA", 1, 1000.00, "TARUS", 2.00, 2022,
                "FERRAMENTA", 1);

        EquipamentoConstrucao eqc2 = new EquipamentoConstrucao("BETONEIRA", 1, 2000.00, "CAT", 500, 2020, "FERRAMENTA",
                0);

        EquipamentoEletronico eqe = new EquipamentoEletronico("CELULAR", 1, 2000, "XIOMI", 400, 12, "ANDROID/MIUI",
                "LITE 8-784", 1);

        Dados d = new Dados();
        Filial f = new Filial("BSA CONSTRUCAO", "123456789-9", "LAGO NORTE", 1);

        d.cadastarEqConstrucao(eqc);
        d.cadastarEqConstrucao(eqc2);
        d.cadastarEqEletronico(eqe);
        d.cadastarFilial(f);
        System.out.println(d.getFilial());

         System.out.println(d.getEqConstrucao());
        System.out.println(d.getEqEletronico());

    }

}
