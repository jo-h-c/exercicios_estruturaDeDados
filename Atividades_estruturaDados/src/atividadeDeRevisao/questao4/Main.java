import RegraEmpresa.RegraNegocioEmpresa;
import RegraFuncionario.RegraNegocioFuncionario;

public class Main {

        public static void main(String[] args) {
            Funcionario funcionario1 = new Funcionario("121332423", "joao", "1314r34", "234567876543");
            Empresa empresa1 = new Empresa("13454678", "coca cola", "23456789");
    
    
            RegraFuncionario funcionariosEmpresa1 = new RegraFuncionario();
    
    
            funcionariosEmpresa1.cadastrarFuncionario(funcionario1);
           
            RegraEmpresa listaEmpresas = new RegraEmpresa();
    
    
            listaEmpresas.cadastrarEmpresa(empresa1);
    
    
            System.out.println(funcionariosEmpresa1.listarFuncionario()[0].getNome());
            System.out.println(listaEmpresas.listarEmpresa()[0].getNome());
        }
 }

