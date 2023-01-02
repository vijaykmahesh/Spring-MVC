package com.express.lc.dto;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserInfoDTO {
	
	@NotBlank(message=" * UserName should not be empty")
	@Size(min = 2,message = "Username should be having atleast 2 characters")
	private String userName;
	
	@NotBlank(message=" * CrushName should not be empty")
	private String crushName;
	
	@AssertTrue(message = "Agree to our terms")
	private boolean termAndCondition;
	
	

	public UserInfoDTO() {
		
		System.out.println("UserInfoDTO Constructor Called");
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getCrushName() {
		return crushName;
	}

	public void setCrushName(String crushName) {
		this.crushName = crushName;
	}
	
	

	public boolean isTermAndCondition() {
		return termAndCondition;
	}

	public void setTermAndCondition(boolean termAndCondition) {
		this.termAndCondition = termAndCondition;
	}

	@Override
	public String toString() {
		return "UserInfoDTO [userName=" + userName + ", crushName=" + crushName + "]";
	}
	
	

}
