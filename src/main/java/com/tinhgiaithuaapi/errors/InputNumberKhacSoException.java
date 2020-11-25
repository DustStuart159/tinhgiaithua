package com.tinhgiaithuaapi.errors;

public class InputNumberKhacSoException extends RuntimeException{
    public InputNumberKhacSoException(String number){
        super(number + " không là số tự nhiên. Vui lòng nhập lại.");
    }
}
