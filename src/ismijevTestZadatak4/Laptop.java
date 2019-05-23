package ismijevTestZadatak4;

public class Laptop extends Racunar{
	
	// stanja objekta
	int trajanjeBaterije;
	
	public Laptop(int kolicinaRAMa, int kapacitetHD, int brzinaProcesora, int dijagonalaMonitora, int nabavnaCijena,
			int trajanjeBaterije) {
		super(kolicinaRAMa, kapacitetHD, brzinaProcesora, dijagonalaMonitora, nabavnaCijena);
		this.trajanjeBaterije = trajanjeBaterije;
	}

	// ponasanja objekta
	public double izracunajCijenu() {
		double cijena = nabavnaCijena + (nabavnaCijena * 0.15);
		return cijena;
	}

	@Override
	public String toString() {
		return "Laptop [trajanjeBaterije=" + trajanjeBaterije + ", kolicinaRAMa=" + kolicinaRAMa + ", kapacitetHD="
				+ kapacitetHD + ", brzinaProcesora=" + brzinaProcesora + ", dijagonalaMonitora=" + dijagonalaMonitora
				+ ", nabavnaCijena=" + nabavnaCijena + "]";
	}
	
}
