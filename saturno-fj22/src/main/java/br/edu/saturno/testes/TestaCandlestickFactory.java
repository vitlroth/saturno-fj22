package br.edu.saturno.testes;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import br.edu.saturno.modelo.Candlestick;
import br.edu.saturno.modelo.CandlestickFactory;
import br.edu.saturno.modelo.Negociacao;

public class TestaCandlestickFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Calendar hoje = Calendar.getInstance();
		Negociacao negociacao1 = new Negociacao(40.5, 100, hoje);
		Negociacao negociacao2 = new Negociacao(45.0, 100, hoje);
		Negociacao negociacao3 = new Negociacao(39.8, 100, hoje);
		Negociacao negociacao4 = new Negociacao(42.3, 100, hoje);
		
		/*O m�todo asList da classe java.util.Arrays cria uma lista dada uma array. Mas n�o passamos
		nenhuma array como argumento! Isso acontece porque esse m�todo aceita varargs, possibilitando que
		invoquemos esse m�todo separando a array por v�rgula. Algo parecido com um autoboxing de arrays.*/
		List<Negociacao> negociacoes = Arrays.asList(negociacao1, negociacao2,
		negociacao3, negociacao4);
		CandlestickFactory fabrica = new CandlestickFactory();
		Candlestick candle = fabrica.constroiCandleParaData(
		hoje, negociacoes);
/*		System.out.println(candle.getAbertura());
		System.out.println(candle.getFechamento());
		System.out.println(candle.getMinimo());
		System.out.println(candle.getMaximo());
		System.out.println(candle.getVolume());*/
		System.out.println(candle.toString());
		
		
		

	}

}
