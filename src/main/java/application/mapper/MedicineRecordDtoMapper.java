package application.mapper;

import application.dto.RequestMedicineRecordDto;
import application.dto.ResponseMedicineRecordDto;
import application.model.MedicineRecord;
import org.springframework.stereotype.Component;

@Component
public class MedicineRecordDtoMapper {
    public ResponseMedicineRecordDto parse (MedicineRecord medicineRecord) {
        ResponseMedicineRecordDto responseDto = new ResponseMedicineRecordDto();
        responseDto.setId(medicineRecord.getId());
        responseDto.setName(medicineRecord.getName());
        responseDto.setManufarturer(medicineRecord.getManufacturer());
        responseDto.setDateOfManufacture(medicineRecord.getDateOfManufacture());
        responseDto.setExpiryDate(medicineRecord.getExpiryDate());
        responseDto.setVerificationStatus(medicineRecord.isVerified());
        responseDto.setDateOfEntryToDatabase(medicineRecord.getDateOfEntryToDatabase());
        return responseDto;
    }

    public MedicineRecord toModel(RequestMedicineRecordDto requestDto) {
        MedicineRecord medicineRecord = new MedicineRecord();
        medicineRecord.setName(requestDto.getName());
        medicineRecord.setManufacturer(requestDto.getManufarturer());
        medicineRecord.setDateOfManufacture(requestDto.getDateOfManufacture());
        medicineRecord.setExpiryDate(requestDto.getExpiryDate());
        medicineRecord.setVerified(requestDto.isVerified());
        medicineRecord.setDateOfEntryToDatabase(medicineRecord.getDateOfEntryToDatabase());
        return medicineRecord;
    }
}
