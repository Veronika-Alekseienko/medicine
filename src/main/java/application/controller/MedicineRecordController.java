package application.controller;


import application.dto.RequestMedicineRecordDto;
import application.dto.ResponseMedicineRecordDto;
import application.mapper.MedicineRecordDtoMapper;
import application.model.MedicineRecord;
import application.service.MedicineManagerService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/records")
public class MedicineRecordController {
    private final MedicineManagerService medicineManagerService;
    private final MedicineRecordDtoMapper mapper;

    public MedicineRecordController(MedicineManagerService medicineManagerService, MedicineRecordDtoMapper mapper) {
        this.medicineManagerService = medicineManagerService;
        this.mapper = mapper;
    }

    @PostMapping
    public ResponseMedicineRecordDto create (@RequestBody RequestMedicineRecordDto requestMedicineRecordDto) {
        return mapper.parse(medicineManagerService.add(mapper.toModel(requestMedicineRecordDto)));
    }

    @GetMapping("/available")
    public List<ResponseMedicineRecordDto> getActualRecords() {
       return medicineManagerService.getAll()
                .stream().map(mapper::parse)
                .collect(Collectors.toList());
    }


    @GetMapping("/inject")
    public String injectMockData() {
        MedicineRecord medicineRecordFist = new MedicineRecord();
        medicineRecordFist.setName("Paracetamol");
        medicineRecordFist.setManufacturer("Netherlands");
        medicineRecordFist.setDateOfManufacture(LocalDate.now());
        medicineRecordFist.setExpiryDate(LocalDate.of(2023, 10, 5));
        medicineRecordFist.setVerified(false);
        medicineRecordFist.setDateOfEntryToDatabase(LocalDate.now());
        medicineManagerService.add(medicineRecordFist);
        return "Done!";
    }

    @DeleteMapping("/clear")
    public void delete() {

    }

}
