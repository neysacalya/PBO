public class Admin extends karyawan{

    @Override
    public void tampilIdentitas(String profesi) {
        // TODO Auto-generated method stub
        super.tampilIdentitas(profesi);

    }
    public void tampilNama(){
        super.nama="Aulia";
        super.jk='p';
        super.nopeg=33333;
        System.out.println(super.nama);
        System.out.println(super.jk);
        System.out.println(super.nopeg);
    }
    public double gaji(double pokok){
        return pokok;
    }

    public int gaji(int tunjangan){
        return tunjangan;
    }
}