package application.dao;

import application.model.MedicineRecord;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class MedicineRecordDaoImpl  implements  MedicineRecordDao{
    private final SessionFactory sessionFactory;

    public MedicineRecordDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public MedicineRecord add(MedicineRecord medicineRecord) {
        Transaction transaction = null;
        Session session = null;
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.save(medicineRecord);
            transaction.commit();
            return medicineRecord;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new RuntimeException("Can't add medicine record ro DB " + medicineRecord, e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public List<MedicineRecord> getAll() {
        Session session = null;
        try {
            session = sessionFactory.openSession();
           return session.createQuery("FROM MedicineRecord mr WHERE mr.dateOfEntryToDatabase " +
                    "BETWEEN CURRENT_DATE() - 7 AND CURRENT_DATE()", MedicineRecord.class).getResultList();
        } catch (Exception e) {
            throw new RuntimeException("Can't get information about last 14 days records from DB", e);
        }
    }

    @Override
    public void delete(List<MedicineRecord> medicineRecords) {

    }
}
