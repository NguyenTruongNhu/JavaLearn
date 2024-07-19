package Model;

import jakarta.persistence.Entity;

import java.sql.Date;

@Entity
public class SinhVien extends ConNguoi{
    private double diemTB;

    public SinhVien() {
    }

    public SinhVien(double diemTB) {
        this.diemTB = diemTB;
    }

    public SinhVien(String id, String hoVaTen, Date ngaySinh, double diemTB) {
        super(id, hoVaTen, ngaySinh);
        this.diemTB = diemTB;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }
}
