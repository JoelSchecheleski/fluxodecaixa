package com.websenior.entradas;

import java.util.Date;

import lombok.Data;

@Data
public class Entrada {
	private int id;
	private String titulo;
	private String descricao;
	private Date dtEntrada;
	private Double valor;
}
