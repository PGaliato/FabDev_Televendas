package br.com.ibiagas.entidades;

public class Tipo_cliente {
	private int cod_tipo_cliente; //--> Primary Key
	private String desc_tipo_pessoa;
	
	public String getDesc_tipo_pessoa() {
		return desc_tipo_pessoa;
	}
	public void setDesc_tipo_pessoa(String desc_tipo_pessoa) {
		if (desc_tipo_pessoa == null) {
			throw new RuntimeException("Descri��o do tipo de pessoa n�o pode ser nula");
		}
		this.desc_tipo_pessoa = desc_tipo_pessoa;
	}
	
}
