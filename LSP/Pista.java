
public class Pista {
	
	Avion[] = arrayAviones = {
		new Avioneta();
		new Comercial();
		new Fumigacion();
	};

	public static void imprimirNumMotores(Avion[] arrrayAviones) {
		for (Avion avion: arrayAviones) {
			if (Avion instanceof Avioneta) {
				System.out.println(printNumeroMotores(avion));
			}
			if (Avion instanceof Comercial) {
				System.out.println(printNumeroMotores(avion));
			}
			if (Avion instanceof Fumigacion) {
				System.out.println(printNumeroMotores(avion));
			}
		}
	}

}
