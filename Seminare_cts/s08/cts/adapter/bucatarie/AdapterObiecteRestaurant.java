package cts.adapter.bucatarie;

import cts.adapter.bar.ISoftBar;

public class AdapterObiecteRestaurant implements ISoftRestaurant{
	private ISoftBar softBar;
	
	
	public AdapterObiecteRestaurant(ISoftBar softBar) {
		super();
		this.softBar = softBar;
	}


	@Override
	public void printeazaNota(double totalSuma) {
		this.softBar.printeazaNotaBauturi(totalSuma);
		
	}

}
