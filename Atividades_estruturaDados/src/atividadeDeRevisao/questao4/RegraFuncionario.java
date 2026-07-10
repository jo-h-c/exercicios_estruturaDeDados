
public class RegraFuncionario {
    public class RegraNegocioFuncionario {
        int posisaoLivre = 0;
        Funcionario[] funcionarios = new Funcionario[5];
    
    
        public void cadastrarFuncionario(Funcionario funcionario){
            funcionarios[posisaoLivre] = funcionario;
            posisaoLivre = posisaoLivre + 1;
        }
    
    
        public Funcionario[] listarFuncionario(){
            return funcionarios;
        }
    
    
        public void addPosicao(int posicao, Funcionario funcionario){
            funcionarios[posicao] = funcionario;
        }
    
    
        public void removerPosicao(int posicao){
            funcionarios[posicao] = null;
        }
    
    
        public Funcionario procurar(String nome){
            for(int i = 0; i< posisaoLivre; i++){
                if (funcionarios[i].getNome().equals(nome)) {
                    return funcionarios[i];
                } else {
                    return null;
                }
            }
        }
    
    
        public void aumentarVetor(){
            Funcionario[] novoFuncionarios = new Funcionario[2*posisaoLivre];
            for(int j = 0; j < funcionarios.length; j++){
                funcionarios[j] = novoFuncionarios[j];
            }
            funcionarios = novoFuncionarios;
        }
    }
    
}
