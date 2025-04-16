public class Cliente extends PessoaFisica{
	protected double renda;
	protected String interesses;
	protected String profissao;
	
	Cliente(double renda, String interesses, String profissao, String cpf, char sexo, int estadoCivil, String nome, String endereco, String telefone){
		super(cpf, sexo, estadoCivil, nome, endereco, telefone);
		this.renda = renda;
		this.interesses = interesses;
		this.profissao = profissao;
	}
	
	public double getRenda() {
		return renda;
	}
	public void setRenda(double renda) {
		this.renda = renda;
	}
	public String getInteresses() {
		return interesses;
	}
	public void setInteresses(String interesses) {
		this.interesses = interesses;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
}
