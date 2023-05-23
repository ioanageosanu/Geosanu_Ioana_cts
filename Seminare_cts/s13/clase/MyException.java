package clase;

public class MyException extends IllegalArgumentException{
	private String mesaj;

	public MyException(String mesaj) {
		this.mesaj=mesaj;
		// TODO Auto-generated constructor stub
	}


	public void setMesaj(String mesaj) {
		this.mesaj = mesaj;
	}
}
