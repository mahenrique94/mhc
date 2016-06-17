package br.com.mhc.parametrosweb;

public class ParametrosWeb {

	private String campo;
	private String parametroInicial;
	private String parametroFinal;
	private String operador;
	private String juncao;
	private String orderBy;
	private Integer limit;
	
	public ParametrosWeb() {
		// TODO Auto-generated constructor stub
	}
	public ParametrosWeb(String campo, String parametroInicial) {
		// TODO Auto-generated constructor stub
		this.campo = campo;
		this.parametroInicial = parametroInicial;
	}
	public ParametrosWeb(String campo, String parametroInicial, String parametroFinal) {
		// TODO Auto-generated constructor stub
		this.campo = campo;
		this.parametroInicial = parametroInicial;
		this.parametroFinal = parametroFinal;
	}
	public ParametrosWeb(String campo, String parametroInicial, String parametroFinal, String operador) {
		// TODO Auto-generated constructor stub
		this.campo = campo;
		this.parametroInicial = parametroInicial;
		this.parametroFinal = parametroFinal;
		this.operador = operador;
	}
	public ParametrosWeb(String campo, String parametroInicial, String parametroFinal, String operador, String juncao) {
		// TODO Auto-generated constructor stub
		this.campo = campo;
		this.parametroInicial = parametroInicial;
		this.parametroFinal = parametroFinal;
		this.operador = operador;
		this.juncao = juncao;
	}
	public ParametrosWeb(String campo, String parametroInicial, String parametroFinal, String operador, String juncao, String orderBy) {
		// TODO Auto-generated constructor stub
		this.campo = campo;
		this.parametroInicial = parametroInicial;
		this.parametroFinal = parametroFinal;
		this.operador = operador;
		this.juncao = juncao;
		this.orderBy = orderBy;
	}
	public ParametrosWeb(String campo, String parametroInicial, String parametroFinal, String operador, String juncao, String orderBy, Integer limit) {
		// TODO Auto-generated constructor stub
		this.campo = campo;
		this.parametroInicial = parametroInicial;
		this.parametroFinal = parametroFinal;
		this.operador = operador;
		this.juncao = juncao;
		this.orderBy = orderBy;
		this.limit = limit;
	}
	
	public String getCampo() {
		return campo;
	}
	public void setCampo(String campo) {
		this.campo = campo;
	}
	public String getParametroInicial() {
		return parametroInicial;
	}
	public void setParametroInicial(String parametroInicial) {
		this.parametroInicial = parametroInicial;
	}
	public String getParametroFinal() {
		return parametroFinal;
	}
	public void setParametroFinal(String parametroFinal) {
		this.parametroFinal = parametroFinal;
	}
	public String getOperador() {
		return operador;
	}
	public void setOperador(String operador) {
		this.operador = operador;
	}
	public String getJuncao() {
		return juncao != null ? juncao : "and";
	}
	public void setJuncao(String juncao) {
		this.juncao = juncao;
	}
	public String getOrderBy() {
		return orderBy != null ? orderBy : "id";
	}
	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}
	public Integer getLimit() {
		return limit != null ? limit : 100;
	}
	public void setLimit(Integer limit) {
		this.limit = limit;
	}
	
}
