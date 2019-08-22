package com.chrome.models;

public class AccountInfo {
	
	public static AccountBuilder named(String name) {	
		return new AccountBuilder(name);
	}
	
	public static class AccountBuilder{
		private String name;
		private String phone;
		private String otpCode;
		private String email;
		private String passWord;
		private int day;
		private int month;
		private int year;
		
		public AccountBuilder(String name) {
			this.name = name;
		}
		
		public AccountBuilder withPhone(String phone) {
			this.phone = phone;
			return this;
		}

		public AccountBuilder withOTPCode(String otpCode) {
			this.otpCode = otpCode;
			return this;
		}

		public AccountBuilder withEmail(String email) {
			this.email = email;
			return this;
		}

		public AccountBuilder withPassWord(String passWord) {
			this.passWord = passWord;
			return this;
		}

		public AccountBuilder withDay(int day) {
			this.day = day;
			return this;
		}

		public AccountBuilder withMonth(int month) {
			this.month = month;
			return this;
		}

		public AccountBuilder withYear(int year) {
			this.year = year;
			return this;
		}

		public AccountInfo build() {
			return new AccountInfo(name, phone, otpCode, email, passWord, day, month, year);
		}
		
		
}

	
	private String fullName;
	private String phoneNumber;
	private String otpCode;
	private String email;
	private String passWord;
	private int day;
	private int month;
	private int year;

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int mont) {
		this.month = mont;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public AccountInfo(String fullName, String phoneNumber, String otpCode, String email, String passWord, int day,
			int month, int year) {
		this.fullName = fullName;
		this.phoneNumber = phoneNumber;
		this.otpCode = otpCode;
		this.email = email;
		this.passWord = passWord;
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getOtpCode() {
		return otpCode;
	}

	public void setOtpCode(String otpCode) {
		this.otpCode = otpCode;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}



}
