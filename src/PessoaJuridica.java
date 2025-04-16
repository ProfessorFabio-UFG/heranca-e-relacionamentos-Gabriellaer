public class PessoaJuridica extends Pessoa {
	protected String cnpj;
	protected String razaoSocial;
	
	PessoaJuridica(String cnpj, String razaoSocial, String nome, String endereco, String telefone){
		super(nome, endereco, telefone);
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
}
