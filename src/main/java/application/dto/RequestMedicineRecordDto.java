package application.dto;

import java.time.LocalDate;

public class RequestMedicineRecordDto {
    private String name;
    private String manufarturer;
    private LocalDate dateOfManufacture;
    private LocalDate expiryDate;
    private boolean verified;
    private LocalDate dateOfEntryToDatabase;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufarturer() {
        return manufarturer;
    }

    public void setManufarturer(String manufarturer) {
        this.manufarturer = manufarturer;
    }

    public LocalDate getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(LocalDate dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    public LocalDate getDateOfEntryToDatabase() {
        return dateOfEntryToDatabase;
    }

    public void setDateOfEntryToDatabase(LocalDate dateOfEntryToDatabase) {
        this.dateOfEntryToDatabase = dateOfEntryToDatabase;
    }
}
