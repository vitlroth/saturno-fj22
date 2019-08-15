package br.edu.saturno.modelo;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public final class Candlestick {

	private final double abertura;
	private final double fechamento;
	private final double minimo;
	private final double maximo;
	private final double volume;
	private final Calendar data;

	public Candlestick(double abertura, double fechamento, double minimo, double maximo, double volume, Calendar data) {
		this.abertura = abertura;
		this.fechamento = fechamento;
		this.minimo = minimo;
		this.maximo = maximo;
		this.volume = volume;
		this.data = data;
	}

	public double getAbertura() {
		return abertura;
	}

	public double getFechamento() {
		return fechamento;
	}

	public double getMinimo() {
		return minimo;
	}

	public double getMaximo() {
		return maximo;
	}

	public double getVolume() {
		return volume;
	}

	public Calendar getData() {
		return data;
	}

	public boolean isAlta() {
		return this.abertura < this.fechamento;
	}

	public boolean isBaixa() {
		return this.abertura > this.fechamento;
	}

	@Override
	public String toString() {

		Calendar c = Calendar.getInstance();
		Date dat = c.getTime();

		DateFormat d = new SimpleDateFormat("dd-MM-yyyy");
		String inter = d.format(dat);
		return "Abertura :" + this.getAbertura() + "Fechamento : " + this.getFechamento() + "Mínima :"
				+ this.getMinimo() + "Máxima :" + this.getMaximo() + "Volume :" + this.getVolume() + "Data :" + inter;

	}

}
