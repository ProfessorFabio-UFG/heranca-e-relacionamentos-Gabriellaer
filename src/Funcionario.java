public class Funcionario extends PessoaFisica {
	protected int matri;
	protected double salario;
	protected String cargo;
	
	Funcionario(int matri, double salario, String cargo, String cpf, String sexo, int estadoCivil, String nome, String endereco, String telefone){
		super(cpf, sexo, estadoCivil, nome, endereco, telefone);
		this.matri = matri;
		this.salario = salario;
		this.cargo = cargo;
	}
	public int getMatri() {
		return matri;
	}
	public void setMatri(int matri) {
		this.matri = matri;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public String toString() {
		return "\nNome: " + getNome() + " Matricula: " + getMatri() + " Cargo: " + getCargo() + " Salario: " + getSalario();
	}
}
