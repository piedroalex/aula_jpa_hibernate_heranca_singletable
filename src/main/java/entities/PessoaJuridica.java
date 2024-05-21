package entities;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * @author Pedro Alex
 */
@Entity
@DiscriminatorValue("PJ")
public class PessoaJuridica extends Pessoa{

	@Column(length = 100)
    private String razaoSocial;

	@Column(length = 30)
    private String cnpj;

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

}