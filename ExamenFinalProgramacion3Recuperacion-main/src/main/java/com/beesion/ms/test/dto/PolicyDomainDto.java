package com.beesion.ms.test.dto;


import lombok.Data;

@Data
public class PolicyDomainDto {
	private String rulesApplyTo;
	private Boolean allowWebAddExternalAuthenticationUsers;
	private Boolean restrictMinDigits;
	private Integer minDigits;
	private Boolean restrictMinUpperCaseLetters;
	private Integer minUpperCaseLetters;
	private Boolean restrictMinLowerCaseLetters;
	private Integer minLowerCaseLetters;
	private Boolean restrictMinNonAlphanumericCharacters;
	private Integer minNonAlphanumericCharacters;
	private Integer minLength;

    public int getMinLength() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public boolean getRestrictMinLowerCaseLetters() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getMinLowerCaseLetters() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public boolean getRestrictMinUpperCaseLetters() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getMinUpperCaseLetters() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public boolean getRestrictMinDigits() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getMinDigits() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public boolean getRestrictMinNonAlphanumericCharacters() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getMinNonAlphanumericCharacters() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
