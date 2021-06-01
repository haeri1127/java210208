package haeri.ui;

public class UserListVO {
	private String FID = null;
	private String FWD = null;
	private String FNAME = null;
	private String FDATE = null;

	
	UserListVO(){}
	
	UserListVO(String FID,String FWD,String FNAME,String FDATE){
		
	}

	public String getFID() {
		return FID;
	}

	public void setFID(String fID) {
		FID = fID;
	}

	public String getFWD() {
		return FWD;
	}

	public void setFWD(String fWD) {
		FWD = fWD;
	}

	public String getFNAME() {
		return FNAME;
	}

	public void setFNAME(String fNAME) {
		FNAME = fNAME;
	}

	public String getFDATE() {
		return FDATE;
	}

	public void setFDATE(String fDATE) {
		FDATE = fDATE;
	}
	
	
	
}
