package JavaAbstractClasses;

abstract class DongVat {
    protected String ten;

    public DongVat(String ten) {
        this.ten = ten;
    }

    // Phương thức trừu tượng an()
    public abstract void an();

    // Phương thức trừu tượng ngu()
    public abstract void ngu();
}

// Lớp con JavaAbstractClasses.SuTu mở rộng từ JavaAbstractClasses.DongVat
class SuTu extends DongVat {

    public SuTu(String ten) {
        super(ten);
    }

    @Override
    public void an() {
        System.out.println(ten + " dang an thit");
    }

    @Override
    public void ngu() {
        System.out.println(ten + " dang ngu duoi bong cay");
    }
}

// Lớp con JavaAbstractClasses.Ho mở rộng từ JavaAbstractClasses.DongVat
class Ho extends DongVat {

    public Ho(String ten) {
        super(ten);
    }

    @Override
    public void an() {
        System.out.println(ten + " dang an thit va rau");
    }

    @Override
    public void ngu() {
        System.out.println(ten + " dang ngu trong hang dong");
    }
}

// Lớp con JavaAbstractClasses.Nai mở rộng từ JavaAbstractClasses.DongVat
class Nai extends DongVat {

    public Nai(String ten) {
        super(ten);
    }

    @Override
    public void an() {
        System.out.println(ten + " dang an co");
    }

    @Override
    public void ngu() {
        System.out.println(ten + " dang ngu duoi bong cay");
    }
}
