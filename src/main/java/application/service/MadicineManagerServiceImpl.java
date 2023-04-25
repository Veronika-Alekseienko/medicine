package application.service;

import application.dao.MedicineRecordDao;
import application.model.MedicineRecord;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MadicineManagerServiceImpl implements  MedicineManagerService{
    private final MedicineRecordDao medicineRecordDao;

    public MadicineManagerServiceImpl(MedicineRecordDao medicineRecordDao) {
        this.medicineRecordDao = medicineRecordDao;
    }

    @Override
    public MedicineRecord add(MedicineRecord medicineRecord) {
         return medicineRecordDao.add(medicineRecord);
    }

    @Override
    public List<MedicineRecord> getAll() {
        return medicineRecordDao.getAll();
    }

    @Override
    public void delete(List<MedicineRecord> medicineRecords) {
        medicineRecordDao.delete(medicineRecords);
    }
}
