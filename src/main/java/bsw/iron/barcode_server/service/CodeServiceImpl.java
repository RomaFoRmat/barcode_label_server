package bsw.iron.barcode_server.service;

import bsw.iron.barcode_server.repository.CodeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CodeServiceImpl implements CodeService {

    private final CodeRepository codeRepository;

    public CodeServiceImpl(CodeRepository codeRepository) {
        this.codeRepository = codeRepository;
    }

    @Override
    public List<String> findAllByConversionIdConversion() {
        return codeRepository.findAllByConversionIdConversion();
    }
}
