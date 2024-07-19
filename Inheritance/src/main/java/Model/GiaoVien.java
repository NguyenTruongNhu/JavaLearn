package Model;

import jakarta.persistence.Entity;

import java.sql.Date;
@Entity

public class GiaoVien extends ConNguoi{
    private String monHocPhuTrach;

    public GiaoVien() {
    }

    public GiaoVien(String monHocPhuTrach) {
        this.monHocPhuTrach = monHocPhuTrach;
    }

    public GiaoVien(String id, String hoVaTen, Date ngaySinh, String monHocPhuTrach) {
        super(id, hoVaTen, ngaySinh);
        this.monHocPhuTrach = monHocPhuTrach;
    }

    public String getMonHocPhuTrach() {
        return monHocPhuTrach;
    }

    public void setMonHocPhuTrach(String monHocPhuTrach) {
        this.monHocPhuTrach = monHocPhuTrach;
    }
}
