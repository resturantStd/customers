package com.rst.customers.usecase;

import com.rst.customers.core.model.Customers;
import com.rst.customers.core.model.TableStatusType;
import com.rst.customers.core.model.Tables;
import com.rst.customers.usecase.port.TablesRepository;

import java.util.Optional;

public class CustomerTableSittingUseCase {

    private final TablesRepository tablesRepository;

    public CustomerTableSittingUseCase(TablesRepository tablesRepository) {
        this.tablesRepository = tablesRepository;
    }

    public Long execute(Customers customer, Long tableId) {
        Optional<Tables> table = tablesRepository.getTable(tableId);
        table.ifPresent(t -> {
            if (customer.getClientNumbers() > t.getSeatsNumbers()) {
                throw new RuntimeException("Not enough seats");
            }

            if (t.getStatus() != TableStatusType.FREE) {
                throw new RuntimeException("Table is not free");
            }

            t.setStatus(TableStatusType.OCCUPIED);
            tablesRepository.updateTable(t);
        });
        return table.map(Tables::getId).orElseThrow(RuntimeException::new);
    }
}
