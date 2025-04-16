public class Fornecedor extends PessoaJuridica {
	protected String produtos;
	
	Fornecedor(String produtos, String cnpj, String razaoSocial, String nome, String endereco, String telefone){
		super(cnpj, razaoSocial, nome, endereco , telefone);
		this.produtos = produtos;
	}
	public void setProdutos(String produtos) {
		this.produtos = produtos;
	}
	public String getProdutos() {
		return produtos;
	}
}
