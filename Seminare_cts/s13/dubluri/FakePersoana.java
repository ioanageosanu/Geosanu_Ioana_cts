package dubluri;

import clase.IPersoana;

public class FakePersoana implements IPersoana {
	private String sex;
	private int varsta;
	private boolean cnp;
	
	

	public boolean isCnp() {
		return cnp;
	}

	public void setCnp(boolean cnp) {
		this.cnp = cnp;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	@Override
	public String getSex() {
		// TODO Auto-generated method stub
		return sex;
	}

	@Override
	public int getVarsta() {
		// TODO Auto-generated method stub
		return varsta;
	}

	@Override
	public boolean checkCNP() {
		// TODO Auto-generated method stub
		return cnp;
	}

}