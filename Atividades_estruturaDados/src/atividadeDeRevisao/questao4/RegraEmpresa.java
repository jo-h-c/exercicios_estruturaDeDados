public class RegraEmpresa {
    public class RegraNegocioEmpresa {
        int posisaoLivre = 0;
        Empresa[] empresas = new Empresa[5];
    
    
        public void cadastrarEmpresa(Empresa empresa){
            empresas[posisaoLivre] = empresa;
            posisaoLivre = posisaoLivre + 1;
        }
    
    
        public Empresa[] listarEmpresa(){
            return empresas;
        }
    
    
        public void addPosicao(int posicao, Empresa empresa){
            empresas[posicao] = empresa;
        }
    
    
        public void removerPosicao(int posicao){
            empresas[posicao] = null;
        }
    
    
        public Empresa procurar(String nome){
            for(int i = 0; i< posisaoLivre; i++){
                if (empresas[i].getNome().equals(nome)) {
                    return empresas[i];
                } else {
                    return null;
                }
            }
        }
    
    
        public void aumentarVetor(){
            Empresa[] novaEmpresas = new Empresa[2*posisaoLivre];
            for(int j = 0; j < empresas.length; j++){
                empresas[j] = novaEmpresas[j];
            }
            empresas = novaEmpresas;
        }
    }
    
}
