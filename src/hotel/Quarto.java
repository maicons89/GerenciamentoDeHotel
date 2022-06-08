/**
 * 
 */
package hotel;

/**
 * @author Paraibah89
 *
 */
public class Quarto {

	private int codigoQuarto;
	private int capacidadePessoasQuarto;
	private String nome;
	private String posicao;
	private String fumante;
	private boolean ocupado;
	private Double ValorDaDiaria;

	public int getCodigoQuarto() {
		return codigoQuarto;
	}

	public void setCodigoQuarto(int codigoQuarto) {
		this.codigoQuarto = codigoQuarto;
	}

	public int getCapacidadePessoasQuarto() {
		return capacidadePessoasQuarto;
	}

	public void setCapacidadePessoasQuarto(int capacidadePessoasQuarto) {
		this.capacidadePessoasQuarto = capacidadePessoasQuarto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPosicao() {
		return posicao;
	}

	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}

	public String getFumante() {
		return fumante;
	}

	public void setFumante(String fumante) {
		this.fumante = fumante;
	}

	public boolean isOcupado() {
		return ocupado;
	}

	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}

	public Double getValorDaDiaria() {
		return ValorDaDiaria;
	}

	public void setValorDaDiaria(Double valorDaDiaria) {
		ValorDaDiaria = valorDaDiaria;
	}

}
