package Montacargas;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testMontacargas {

	@Test
	public void queSePuedaCrearUnMontacargasYCargarlo() {
		Montacargas mont1 = new Montacargas();
		Carga carga1 = new Carga(700.0);

		mont1.cargar(carga1);

		Double cargaEsperada = 700.0;

		assertEquals(cargaEsperada, mont1.obtenerCargaActual());

	}

	@Test
	public void quePuedaCargarMasDeUnItem() {
		Montacargas mont1 = new Montacargas();
		Carga carga1 = new Carga(700.0);
		Carga carga2 = new Carga(510.0);
		Carga carga3 = new Carga(200.0);

		mont1.cargar(carga1);
		mont1.cargar(carga2);
		mont1.cargar(carga3);

		Double cargaEsperada = 1410.0;

		assertEquals(cargaEsperada, mont1.obtenerCargaActual());

	}

	@Test
	public void queNoPuedaSuperarElPesoMaximo() {
		Montacargas mont1 = new Montacargas();
		Carga carga1 = new Carga(1600.0);

		mont1.cargar(carga1);

		Double cargaEsperada = 0.0;

		assertEquals(cargaEsperada, mont1.obtenerCargaActual());

	}

	@Test
	public void queSePuedaDescargarUnMontacargas() {
		Montacargas mont1 = new Montacargas();
		Carga carga1 = new Carga(1300.0);

		mont1.cargar(carga1);
		mont1.descargar();

		Double cargaEsperada = 0.0;

		assertEquals(cargaEsperada, mont1.obtenerCargaActual());

	}

	@Test
	public void queSePuedaObtenerPromedioDeCargasCompletadas() {
		Montacargas mont1 = new Montacargas();

		Carga carga1 = new Carga(1300.0);
		Carga carga2 = new Carga(700.0);
		Carga carga3 = new Carga(800.0);
		Carga carga4 = new Carga(100.0);

		mont1.cargar(carga1);
		mont1.descargar();
		mont1.cargar(carga2);
		mont1.descargar();
		mont1.cargar(carga3);
		mont1.descargar();
		mont1.cargar(carga4);
		mont1.descargar();

		Double promedioEsperado = 725.0;

		assertEquals(promedioEsperado, mont1.obtenerCargaPromedio());

	}
}
