package com.tinhgiaithuaapi.errors;

public class SoNhoHon0Exception extends RuntimeException{
public SoNhoHon0Exception(int number){
    super(number + " nhỏ hơn 0. Không tính được giai thừa. Vui lòng nhập lại số cần tính");
}
}
