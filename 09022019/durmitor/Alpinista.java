package durmitor;

public class Alpinista extends Planinar {
	private Alpinista partner;



	public Alpinista(String ime, String prezime) {
		super(ime, prezime);

	}

	public Alpinista getPartner() {
		return partner;
	}

	@Override
	public boolean penjeSe(Planina p) {
		return p.getVisina() >= 3000 && partner != null;
	}
	public void setPartner(Alpinista buduciPartner) {
		if (this.partner == null && buduciPartner.partner == null) {
			this.partner = buduciPartner;
			buduciPartner.partner = this;
		}
	}

	public void ukloniPartnera() {
		if (partner != null) {
			partner.partner = null;
			partner = null;
		}
	}

	@Override
	public String toString() {
		return "A_" + super.toString();
	}
}


