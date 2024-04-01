package br.com.eduardo.picpaydesafiobackend.wallet;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;

public record Wallet(
        @Id Long id,
        String fullName,
        Long cpf,
        String email,
        String password,
        int type,
        BigDecimal balace

) {

}
