package excepcionesPropias;

public class Computadora {
	private String nombre;
	private double ram;
	private double hd;
	private String mac;
	
	/**
	 * @param nombre
	 * @param ram
	 * @param hd
	 * @param mac
	 * @throws NoMACCorrectaException 
	 */
	public Computadora(String nombre, double ram, double hd, String mac) throws NoMACCorrectaException {
		if(esValidaMAC(mac)){
			this.nombre = nombre;
			this.ram = ram;
			this.hd = hd;
			this.mac = mac;
		}
		else throw new NoMACCorrectaException();
	}
	
	private boolean esValidaMAC(String mac){
		return mac.matches("[\\da-fA-F]{12}");
	}

	@Override
	public String toString() {
		return "Computadora [nombre=" + nombre + ", ram=" + ram + ", hd=" + hd + ", mac=" + formatearMAC() + "]";
	}
	
	private String formatearMAC(){
		String mac="";
		for (int i = 0; i < 12; i++) {
			if(i>0 && i%2 == 0){
				mac+=":";
				
			}
			mac += this.mac.charAt(i);
		}
		return mac;
	}
}
