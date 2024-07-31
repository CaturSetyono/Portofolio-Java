class DataMhs {
	private int sks;
	private double ipk;
	private String nama;
	private int nim;

	public void setDataMhs(int sks, double ipk, String nama, int nim) {
		this.sks = sks;
		this.ipk = ipk;
		this.nama = nama;
		this.nim = nim;
	}

	public int getSks() {
		return sks;
	}

	public double getIpk() {
		return ipk;
	}

	public String getNama() {
		return nama;
	}

	public int getNim() {
		return nim;
	}

	public void tampil() {
		System.out.println("SKS :" + sks);
		System.out.println("IPK :" + ipk);
		System.out.println("Nama :" + nama);
		System.out.println("NIM :" + nim);
	}
}

class obykMhs {
	public static void main(String[] args) {

		DataMhs mhs1 = new DataMhs();
		mhs1.setDataMhs(4, 3.2, "Catur Setyono", 233210009);
		mhs1.tampil();
	}
}