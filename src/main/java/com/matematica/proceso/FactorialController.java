/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.matematica.proceso;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author parqu
 */
@RestController
public class FactorialController {
      @GetMapping("/factorial")
    public ResponseEntity<Long> calcularFactorial(@RequestParam int numero) {
        if (numero < 0) return ResponseEntity.badRequest().build();

        long resultado = 1;
        for (int i = 2; i <= numero; i++) {
            resultado *= i;
        }
        return ResponseEntity.ok(resultado);
    }
}
