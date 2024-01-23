public class hasil {
    public static void main(String[] args) {
        Admin a = new Admin();
        a.tampilIdentitas("Admin");
        a.tampilNama();
        System.out.println("Gaji Pokok yang diterima:"+a.gaji(2400000));
        System.out.println("Gaji tunjangan yang di terima:"+a.gaji(500000));
    }
}
