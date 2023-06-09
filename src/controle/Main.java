package controle;
import modelo.Dados;
import modelo.EquipamentoConstrucao;

public class Main {
    public static void main(String[] args) {
        EquipamentoConstrucao eqc = new EquipamentoConstrucao("FURADEIRA", 1, 1000.00, "TARUS",2.00, 2022, "FERRAMENTA");
            EquipamentoConstrucao eqc2 = new EquipamentoConstrucao("BETONEIRA", 1, 2000.00, "CAT", 500, 2020, "FERRAMENTA");
        
        Dados d = new Dados();
        d.cadastarEqConstrucao(eqc);
        d.cadastarEqConstrucao(eqc2);
        System.out.println(d.getEqConstrucao());

        

        }

    }
