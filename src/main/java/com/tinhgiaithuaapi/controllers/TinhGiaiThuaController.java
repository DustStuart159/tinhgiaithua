package com.tinhgiaithuaapi.controllers;

import com.tinhgiaithuaapi.errors.InputNumberKhacSoException;
import com.tinhgiaithuaapi.errors.SoNhoHon0Exception;
import com.tinhgiaithuaapi.moduls.entities.KetQuaGiaiThuaEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TinhGiaiThuaController {
    // Tính giai thừa
    @GetMapping("/{inputNumber}")
    public KetQuaGiaiThuaEntity ketQua(@PathVariable String inputNumber) throws InputNumberKhacSoException, SoNhoHon0Exception {
        KetQuaGiaiThuaEntity res = new KetQuaGiaiThuaEntity();

        /*Integer number = Integer.parseInt(inputNumber);
        // Check khác số
        if (null == number){
            throw new InputNumberKhacSoException(inputNumber);
        }*/
        // Check < 0

        try{
            Integer number = Integer.parseInt(inputNumber);
            res.setOutputNumber(tinhGiaiThua(number));
        }catch (SoNhoHon0Exception e){
            throw new SoNhoHon0Exception(Integer.parseInt(inputNumber));
        }catch (NumberFormatException e){
            throw new InputNumberKhacSoException(inputNumber);
        }

        return res;
    }

    private long tinhGiaiThua(int number) throws SoNhoHon0Exception {
        if (number<0){
            throw new SoNhoHon0Exception(number);
        }else if (0==number){
            return 1;
        } else {
            long res = 1;
            for (int i=1;i<=number;i++){
                res*=i;
            }

            return res;
        }
    }
}
