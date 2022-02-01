package com.mercadolibre.w4g9projetofinal.dtos.request;

import com.mercadolibre.w4g9projetofinal.entity.Section;
import com.mercadolibre.w4g9projetofinal.entity.Warehouse;
import com.mercadolibre.w4g9projetofinal.entity.enums.RefrigerationType;
import com.mercadolibre.w4g9projetofinal.repository.SectionRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * @author fbontempo
 * @version 0.2
 * @see {@link Section}
 * @see {@link com.mercadolibre.w4g9projetofinal.dtos.response.SectionResponseDTO}
 * */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SectionRequestDTO {
    private Long id;
    private String name;
    private RefrigerationType type;
    private Warehouse warehouse;
    private int stockLimit;
    private int currentStock;
    private float minTeperature;
    private float maxTeperature;

    public Section atualizar(Long id, SectionRepository sectionRepository) {
        Section section = sectionRepository.getById(id);
        section.setName(this.name);
        section.setRefrigerationType(this.type);
        section.setWarehouse(this.warehouse);
        section.setStockLimit(this.stockLimit);
        section.setCurrentStock(this.currentStock);
        section.setMinTeperature(this.minTeperature);
        section.setMaxTeperature(this.maxTeperature);
        return section;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RefrigerationType getType() {
        return type;
    }

    public void setType(RefrigerationType type) {
        this.type = type;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getStockLimit() {
        return stockLimit;
    }

    public void setStockLimit(int stockLimit) {
        this.stockLimit = stockLimit;
    }

    public int getCurrentStock() {
        return currentStock;
    }

    public void setCurrentStock(int currentStock) {
        this.currentStock = currentStock;
    }

    public float getMinTeperature() {
        return minTeperature;
    }

    public void setMinTeperature(float minTeperature) {
        this.minTeperature = minTeperature;
    }

    public float getMaxTeperature() {
        return maxTeperature;
    }

    public void setMaxTeperature(float maxTeperature) {
        this.maxTeperature = maxTeperature;
    }
}
