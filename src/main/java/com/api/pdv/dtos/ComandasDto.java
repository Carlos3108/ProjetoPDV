package com.api.pdv.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class ComandasDto {
    @NotBlank
    private int codProdutos;

    @NotBlank
    @Size
    private float quantidade;


}
