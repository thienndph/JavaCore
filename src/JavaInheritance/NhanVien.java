package JavaInheritance;

// Lớp cơ sở JavaInheritance.NhanVien
class NhanVien {
    protected String ten;
    protected String diaChi;
    protected double luong;
    protected String chucVu;

    public NhanVien(String ten, String diaChi, double luong, String chucVu) {
        this.ten = ten;
        this.diaChi = diaChi;
        this.luong = luong;
        this.chucVu = chucVu;
    }

    public double tinhThuong() {
        return luong * 0.10; // Thưởng mặc định là 10% lương
    }

    public String taoBaoCaoHieuSuat() {
        return "Báo cáo hiệu suất cho " + ten + ", Chức vụ: " + chucVu;
    }

    public void quanLyDuAn(String tenDuAn) {
        System.out.println(ten + " đang quản lý dự án: " + tenDuAn);
    }

    @Override
    public String toString() {
        return "Tên: " + ten + ", Địa chỉ: " + diaChi + ", Lương: $" + luong + ", Chức vụ: " + chucVu;
    }
}

// Lớp con JavaInheritance.QuanLy
class QuanLy extends NhanVien {

    public QuanLy(String ten, String diaChi, double luong) {
        super(ten, diaChi, luong, "Quản lý");
    }

    @Override
    public double tinhThuong() {
        return luong * 0.20; // Quản lý được thưởng 20%
    }

    @Override
    public String taoBaoCaoHieuSuat() {
        return super.taoBaoCaoHieuSuat() + "\nChi tiết hiệu suất cụ thể cho Quản lý.";
    }

    @Override
    public void quanLyDuAn(String tenDuAn) {
        System.out.println(ten + " đang quản lý dự án cấp cao: " + tenDuAn);
    }
}

// Lớp con JavaInheritance.LapTrinhVien
class LapTrinhVien extends NhanVien {

    public LapTrinhVien(String ten, String diaChi, double luong) {
        super(ten, diaChi, luong, "Lập trình viên");
    }

    @Override
    public double tinhThuong() {
        return luong * 0.15; // Lập trình viên được thưởng 15%
    }

    @Override
    public String taoBaoCaoHieuSuat() {
        return super.taoBaoCaoHieuSuat() + "\nChi tiết hiệu suất cụ thể cho Lập trình viên.";
    }

    @Override
    public void quanLyDuAn(String tenDuAn) {
        System.out.println(ten + " đang phát triển dự án: " + tenDuAn);
    }
}

// Lớp con JavaInheritance.LậpTrìnhViên
class LậpTrìnhViên extends NhanVien {

    public LậpTrìnhViên(String ten, String diaChi, double luong) {
        super(ten, diaChi, luong, "Lập trình viên");
    }

    @Override
    public double tinhThuong() {
        return luong * 0.12; // Lập trình viên được thưởng 12%
    }

    @Override
    public String taoBaoCaoHieuSuat() {
        return super.taoBaoCaoHieuSuat() + "\nChi tiết hiệu suất cụ thể cho Lập trình viên.";
    }

    @Override
    public void quanLyDuAn(String tenDuAn) {
        System.out.println(ten + " đang viết mã cho dự án: " + tenDuAn);
    }
}