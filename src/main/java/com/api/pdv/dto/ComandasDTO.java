package com.api.pdv.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class ComandasDTO {
    @NotBlank
    private String codProdutos;

    @NotBlank
    @Size
    private Integer quantidade;


}
