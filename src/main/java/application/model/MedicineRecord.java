package application.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class MedicineRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String manufacturer;
    private LocalDate dateOfManufacture;
    private LocalDate expiryDate;
    private boolean verified;
    private LocalDate dateOfEntryToDatabase;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
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

    @Override
    public String toString() {
        return "MedicineRecord{"
                + "id=" + id
                + ", name='" + name + '\''
                + ", manufarturer='" + manufacturer + '\''
                + ", dateOfManufacture=" + dateOfManufacture
                + ", expiryDate=" + expiryDate
                + ", verificationStatus=" + verified
                + ", dateOfEntryToDatabase=" + dateOfEntryToDatabase
                + '}';
    }
}
