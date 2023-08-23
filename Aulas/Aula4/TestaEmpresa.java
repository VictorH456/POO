package Aula4;

public class TestaEmpresa {
    public static void main(String[] args) {
        Empresa almoco = new Empresa();
        almoco.setQuantidadeF(5);

        String jogadores[][] = {
                {"Al bife", "20000"},
                {"salah da", "2000"},
                {"Fe-jao", "1001"},
                {"A roos", "500"},
                {"Sujiro Kimimame", "2000"}
        };
        for (int i = 0; i < 5; i++) {
            Funcionario f = new Funcionario(jogadores[i][0], Double.parseDouble(jogadores[i][1]));
            almoco.adiciona(f);
        }
        almoco.mostraFuncionario();

        String string = "Sujiro Kimimame";
        almoco.verificarExistencia(string);
    }
}