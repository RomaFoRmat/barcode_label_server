package bsw.iron.barcode_server.service;

import bsw.iron.barcode_server.entity.DateTable;

public interface DateTableService {
    public DateTable saveAndFlush(DateTable dateTable);
}
