package br.edu.rodrigocoradi.servicos;

import br.edu.rodrigocoradi.entidades.Filme;
import br.edu.rodrigocoradi.entidades.NotaAluguel;
import br.edu.rodrigocoradi.entidades.TipoAluguel;
import br.edu.rodrigocoradi.utils.DateUtils;

public class AluguelService {

	public NotaAluguel alugar(Filme filme, TipoAluguel tipoAluguel) {

		if (filme.getEstoque() == 0) {
			throw new RuntimeException("Filme sem estoque");
		}

		NotaAluguel nota = new NotaAluguel();

		switch (tipoAluguel) {
		case EXTENDIDO:
			nota.setPreco(filme.getAluguel() * 2);
			nota.setDataEntrega(DateUtils.obterDataComDiferencaDeDias(3));
			nota.setPontuacao(2);
			break;

		case SEMANAL:
			nota.setPreco(filme.getAluguel() * 3);
			nota.setDataEntrega(DateUtils.obterDataComDiferencaDeDias(7));
			nota.setPontuacao(3);
			break;

		case COMUM:
			nota.setPreco(filme.getAluguel());
			nota.setDataEntrega(DateUtils.obterDataComDiferencaDeDias(1));
			nota.setPontuacao(1);
			break;
		}

		filme.setEstoque(filme.getEstoque() - 1);
		return nota;
	}

}
