package com.novahabitat.dto;

import com.novahabitat.model.Supplier;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MaterialDTO {
    private Integer idMaterial;

    @NotNull
    private String name;

    @NotNull
    private String measurementUnit;

    @NotNull
    private Double unitPrice;

    @NotNull
    private Integer actualStock;

    @NotNull
    private Supplier supplier;
}
