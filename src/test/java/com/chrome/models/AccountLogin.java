package com.chrome.models;

public class AccountLogin {
	
	private String EMAILORPHONE;
	
	private String PASSWORD;

	

	public AccountLogin(String eMAILORPHONE, String pASSWORD) {
		EMAILORPHONE = eMAILORPHONE;
		PASSWORD = pASSWORD;
	}

	public String getEMAILORPHONE() {
		return EMAILORPHONE;
	}

	public void setEMAILORPHONE(String eMAILORPHONE) {
		EMAILORPHONE = eMAILORPHONE;
	}

	public String getPASSWORD() {
		return PASSWORD;
	}

	public void setPASSWORD(String pASSWORD) {
		PASSWORD = pASSWORD;
	}

	
}
