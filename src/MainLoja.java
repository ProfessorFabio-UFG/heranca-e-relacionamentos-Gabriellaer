import java.util.ArrayList;

public class MainLoja {
    public static void main(String[] args){
        Loja loja = new Loja(null, null, null);
        ArrayList<Cliente> clientList = new ArrayList<Cliente>();
        Cliente cliente = new Cliente(0, null, null, null, null, 0, null, null, null);
        Fornecedor fornecedor = new Fornecedor(null, null, null, null, null, null);
        ArrayList<Fornecedor> fornecedoreList = new ArrayList<Fornecedor>();
        ArrayList<Funcionario> funcionariosList = new ArrayList<Funcionario>();
        Funcionario funcionario = new Funcionario(0, 0, null, null, null, 0, null, null, null);

        //Adicionando Cliente 1
        cliente.setRenda(10000);
        cliente.setInteresses("Dinheiro");
        cliente.setProfissao("trabalho");
        cliente.setCpf("111111");
        cliente.setSexo("F");
        cliente.setEstadoCivil(1);
        cliente.setNome("Gil");
        cliente.setEndereco("Rua Norte 123");
        cliente.setTelefone("99999999");
        loja.cadastrarCliente(clientList, cliente);
        cliente = new Cliente(0, null, null, null, null, 0, null, null, null);
        //Adicionando Cliente 2
        cliente.setRenda(10000);
        cliente.setInteresses("Dolar");
        cliente.setProfissao("trabalho");
        cliente.setCpf("2222");
        cliente.setSexo("M");
        cliente.setEstadoCivil(1);
        cliente.setNome("Alber");
        cliente.setEndereco("Rua Sul 123");
        cliente.setTelefone("888888888");
        loja.cadastrarCliente(clientList, cliente);
        cliente = new Cliente(0, null, null, null, null, 0, null, null, null);
        //Fornecedor
        fornecedor.setCnpj("121212");
        fornecedor.setRazaoSocial("Vinils Dolar");
        fornecedor.setEndereco("Centro Oeste E");
        fornecedor.setTelefone("70707070");
        fornecedor.setProdutos("VINIL");
        fornecedoreList.add(fornecedor);
        //Funcionario 1
        funcionario.setCargo("Caixa");
        funcionario.setCpf("888888");
        funcionario.setEndereco("RUA DIAS");
        funcionario.setEstadoCivil(2);
        funcionario.setMatri(121212);
        funcionario.setNome("Jose Al");
        funcionario.setSalario(12000);
        funcionario.setSexo("F");
        funcionario.setTelefone("4000000");
        loja.empregar(funcionariosList, funcionario);
        funcionario = new Funcionario(0, 0, null, null, null, 0, null, null, null);
        //Funcionario 2
        funcionario.setCargo("Gerente:");
        funcionario.setCpf("12345");
        funcionario.setEndereco("RUA Noite");
        funcionario.setEstadoCivil(2);
        funcionario.setMatri(131313);
        funcionario.setNome("Esoj Al");
        funcionario.setSalario(52000);
        funcionario.setSexo("F");
        funcionario.setTelefone("5000000");
        loja.empregar(funcionariosList, funcionario);
        funcionario = new Funcionario(0, 0, null, null, null, 0, null, null, null);
        //funcionariosList.add(funcionario);
        //Adicionando Fornecedores/Funcionarios/Clientes na loja
        loja.setFornecedores(fornecedoreList);
        loja.setFuncionarios(funcionariosList);
        loja.setClientes(clientList);
        System.out.println("----------------------------------------");
        System.out.println(loja.listFornecedores(fornecedoreList));
        System.out.println("----------------------------------------");
        System.out.println(loja.listFuncionarios(funcionariosList));
        System.out.println("----------------------------------------");
        System.out.println(loja.listClientes(clientList));
        System.out.println("----------------------------------------");
        //Lista de Funcionarios apos demição
        System.out.println("Demitindo a matricula 131313");
        loja.demitir(131313);
        System.out.println(loja.listFuncionarios(funcionariosList));
    }
}
