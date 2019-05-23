package ismijevTestZadatak4;

public class Racunar {
	
	// stanja objekta
	int kolicinaRAMa;
	int kapacitetHD;
	int brzinaProcesora;
	int dijagonalaMonitora;
	int nabavnaCijena;
	
	// konstruktori
	public Racunar(int kolicinaRAMa, int kapacitetHD, int brzinaProcesora, int dijagonalaMonitora, int nabavnaCijena) {
		this.kolicinaRAMa = kolicinaRAMa;
		this.kapacitetHD = kapacitetHD;
		this.brzinaProcesora = brzinaProcesora;
		this.dijagonalaMonitora = dijagonalaMonitora;
		this.nabavnaCijena = nabavnaCijena;
	}
	
	// ponasanja objekta
	public double izracunajCijenu() {
		double cijena = nabavnaCijena + (nabavnaCijena * 0.10);
		return cijena;
	}

	@Override
	public String toString() {
		return "Racunar [kolicinaRAMa=" + kolicinaRAMa + ", kapacitetHD=" + kapacitetHD + ", brzinaProcesora="
				+ brzinaProcesora + ", dijagonalaMonitora=" + dijagonalaMonitora + ", nabavnaCijena=" + nabavnaCijena
				+ "]";
	}
	
}
