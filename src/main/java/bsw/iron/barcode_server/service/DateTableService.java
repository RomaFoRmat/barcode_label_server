package bsw.iron.barcode_server.service;

import bsw.iron.barcode_server.entity.DateTable;

public interface DateTableService {
    DateTable saveAndFlush(DateTable dateTable);
}
