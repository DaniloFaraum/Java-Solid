package lsr;

public class Vendedor extends Funcionario {
	private Float salario = 200f;
	private Float comissao =  salario * 0.75f;
	public Float getComissao() {
		return comissao;
	}
	public void setComissao(Float comissao) {
		this.comissao = comissao;
	}
	
}
