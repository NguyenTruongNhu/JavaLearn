package Model;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
@Entity
public class DonHang {
    @Id
    @GeneratedValue
    private int id;
    private String tenKH;
    private Date ngayMua;


    @OneToMany(mappedBy = "donHang", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<ChiTietDonHang> dsCT = new ArrayList<>();

    public DonHang() {
    }

    public DonHang(int id, String tenKH, Date ngayMua, List<ChiTietDonHang> dsCT) {
        this.id = id;
        this.tenKH = tenKH;
        this.ngayMua = ngayMua;
        this.dsCT = dsCT;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public Date getNgayMua() {
        return ngayMua;
    }

    public void setNgayMua(Date ngayMua) {
        this.ngayMua = ngayMua;
    }

    public List<ChiTietDonHang> getDsCT() {
        return dsCT;
    }

    public void setDsCT(List<ChiTietDonHang> dsCT) {
        this.dsCT = dsCT;
    }

    public void addCTDH(ChiTietDonHang ct){
        this.dsCT.add(ct);
    }

    @Override
    public String toString() {
        return "DonHang{" +
                "id=" + id +
                ", tenKH='" + tenKH + '\'' +
                ", ngayMua=" + ngayMua +
                ", dsCT="  +
                '}';
    }
}
