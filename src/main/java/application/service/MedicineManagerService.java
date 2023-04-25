package application.service;

import application.model.MedicineRecord;
import java.util.List;

public interface MedicineManagerService {
    MedicineRecord add(MedicineRecord medicineRecord);

    List<MedicineRecord> getAll();

    void delete(List<MedicineRecord> medicineRecords);
}
