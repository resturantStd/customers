package com.rst.customers.usecase.port;

import com.rst.customers.core.model.Tables;

import java.util.List;
import java.util.Optional;

public interface TablesRepository {

     Optional<Tables> getTable(Long tableId);

     boolean updateTable(Tables table);

     List<Tables> getAll();
}
