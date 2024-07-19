package Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class NhanVien {
    @Id
    private String id;
    private String hoVaTen;
    private Date ngaySinh;

    @ManyToMany(mappedBy = "dsNhanVien")
    private Set<CuocHop> dsCuocHop = new HashSet<CuocHop>();

    public NhanVien() {
    }

    public NhanVien(String id, String hoVaTen, Date ngaySinh) {
        this.id = id;
        this.hoVaTen = hoVaTen;
        this.ngaySinh = ngaySinh;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public Set<CuocHop> getDsCuocHop() {
        return dsCuocHop;
    }

    public void setDsCuocHop(Set<CuocHop> dsCuocHop) {
        this.dsCuocHop = dsCuocHop;
    }
}
