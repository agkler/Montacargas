package Montacargas;

import java.util.LinkedList;

public class Montacargas {
	private final Double PESO_MAXIMO = 1500.0;
	private LinkedList<Carga> cargas = new LinkedList<>();
	private LinkedList<Carga> historico = new LinkedList<>();

	public Montacargas() {

	}

	public Boolean cargar(Carga carga) {
		if (carga.getPeso() <= PESO_MAXIMO) {
			return this.cargas.add(carga);
		} else {
			return false;
		}

	}

	public void descargar() {
		this.historico.addAll(cargas);
		this.cargas.clear();
	}

	public Double obtenerCargaActual() {
		Double sumatoria = 0.0;
		for (Carga carga : cargas) {
			sumatoria += carga.getPeso();
		}
		
		return sumatoria;
	}

	public Double obtenerCargaPromedio() {
		Double promedio = 0.0;
		for (Carga carga : historico) {
			promedio += carga.getPeso();
		}

		return promedio / historico.size();
	}

}
