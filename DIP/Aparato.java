
public class Aparato {
	
	public Enchufe conector { get; set; }
	public Aparato() { }

	public void Conectar() {
		if (conector != null) {
			conector.Conectar();
		}
	}

}
