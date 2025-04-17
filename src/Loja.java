import java.util.ArrayList;

public class Loja {
    ArrayList<Funcionario> funcionarios;
    ArrayList<Cliente> clientes;
    ArrayList<Fornecedor> fornecedores;
    Funcionario f;
    Fornecedor f1;
    Cliente c1;
    Loja(ArrayList<Funcionario> funcionarios, ArrayList<Cliente> clientes, ArrayList<Fornecedor> fornecedores){
        this.funcionarios = funcionarios;
        this.clientes = clientes;
        this.fornecedores = fornecedores;
    }
    public void setF1(Fornecedor f1) {
        this.f1 = f1;
    }
    public void setC1(Cliente c1) {
        this.c1 = c1;
    }
    public void setF(Funcionario f) {
        this.f = f;
    }
    public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }
    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }
    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
    public void setFornecedores(ArrayList<Fornecedor> fornecedores) {
        this.fornecedores = fornecedores;
    }
    public ArrayList<Fornecedor> getFornecedores() {
        return fornecedores;
    }

    public String listFuncionarios(ArrayList<Funcionario> funcionarios){
        return "Funcionarios: " + funcionarios;
    }
    public String listFornecedores(ArrayList<Fornecedor> fornecedores){
        return "Fornecedores: " + fornecedores;
    }
    public String listClientes(ArrayList<Cliente> clientes){
        return "Clientes: " + clientes;
    }

    public void demitir(int matri){
        for (int i = 0; i < funcionarios.size(); i++) {
            if(funcionarios.get(i).getMatri() == matri){
                funcionarios.remove(i);
            }
        }
    }
    public void empregar(ArrayList<Funcionario> funcionarios,Funcionario f){
        funcionarios.add(f);
    }
    public void cadastrarFornecedor(ArrayList<Fornecedor> fornecedores, Fornecedor f1){
        fornecedores.add(f1);
    }
    public void cadastrarCliente(ArrayList<Cliente> clientes, Cliente c1){
        clientes.add(c1);
    }
}
