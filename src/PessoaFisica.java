public class PessoaFisica extends Pessoa {
	protected String cpf;
	protected String sexo;
	protected int estadoCivil;
	PessoaFisica(String cpf, String sexo, int estadoCivil, String nome, String endereco, String telefone) {
		super(nome, endereco, telefone);
		this.cpf = cpf;
		this.sexo = sexo;
		this.estadoCivil = estadoCivil;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(int estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
}
