package Model;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;
@Entity
public class CuocHop {
    @Id
    @GeneratedValue
    private int id;
    private String tenCuocHop;
    private String diaDiem;
    private Date thoiGian;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "cuochop_nhanvien",
                joinColumns = {@JoinColumn(name = "cuochop_id")},
            inverseJoinColumns = {@JoinColumn(name = "nhanvien_id")}
    )
    private Set<NhanVien> dsNhanVien = new HashSet<NhanVien>();

    public CuocHop() {
    }

    public CuocHop(int id, String tenCuocHop, String diaDiem, Date thoiGian) {
        this.id = id;
        this.tenCuocHop = tenCuocHop;
        this.diaDiem = diaDiem;
        this.thoiGian = thoiGian;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenCuocHop() {
        return tenCuocHop;
    }

    public void setTenCuocHop(String tenCuocHop) {
        this.tenCuocHop = tenCuocHop;
    }

    public String getDiaDiem() {
        return diaDiem;
    }

    public void setDiaDiem(String diaDiem) {
        this.diaDiem = diaDiem;
    }

    public Date getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(Date thoiGian) {
        this.thoiGian = thoiGian;
    }

    public Set<NhanVien> getDsNhanVien() {
        return dsNhanVien;
    }

    public void setDsNhanVien(Set<NhanVien> dsNhanVien) {
        this.dsNhanVien = dsNhanVien;
    }

    public void addNV(NhanVien nv){
        this.dsNhanVien.add(nv);
    }
}
