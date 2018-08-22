package br.com.db1.type;

public enum TipoLogradouro {
	
    AEROPORTO("Aeroporto"),
    ALAMEDA("Alameda"),
    AREA("�rea"),
    AVENIDA("Avenida"),
    CAMPO("Campo"),
    CHACARA("Ch�cara"),
    COLONIA("Col�nia"),
    CONDOMINIO("Condom�nio"),
    CONJUNTO("Conjunto"),
    DISTRITO("Distrito"),
    ESPLANADA("Esplanada"),
    ESTACAO("Esta��o"),
    ESTRADA("Estrada"),
    FAZENDA("Fazenda"),
    FAVELA("Favela"),
    FEIRA("Feira"),
    JARDIM("Jardim"),
    LADEIRA("Ladeira"),
    LAGO("Lago"),
    LAGOA("Lagoa"),
    LARGO("Largo"),
    LOTEAMENTO("Loteamento"),
    MORRO("Morro"),
    NUCELO("N�cleo"),
    PARQUE("Parque"),
    PASSARELA("Passarela"),
    PATIO("P�tio"),
    PRACA("Pra�a"),
    QUADRA("Quadra"),
    RECANTO("Recanto"),
    RESIDENCIAL("Residencial"),
    RODOVIA("Rodovia"),
    RUA("Rua"),
    SETOR("Setor"),
    SITIO("S�tio"),
    TRAVESSA("Travessa"),
    TRECHO("Trecho"),
    TREVO("Trevo"),
    VALE("Vale"),
    VEREDA("Vereda"),
    VIA("Via"),
    VIADUTO("Viaduto"),
    VIELA("Viela"),
    VILA("Vila");
	
	private String nomeLogradouro;
	
	TipoLogradouro(String logradouro){
		this.nomeLogradouro = logradouro;
	}
	
	public String getNomeLogradouro() {
		return nomeLogradouro;
	}
	
}
