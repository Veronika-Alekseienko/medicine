package application.dao;

import application.model.MedicineRecord;

import java.util.List;

public interface MedicineRecordDao {

    MedicineRecord add(MedicineRecord medicineRecord);

    List<MedicineRecord> getAll();

    void delete(List<MedicineRecord> medicineRecords);
}
