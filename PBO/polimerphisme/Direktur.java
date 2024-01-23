package polimerphisme;

public class Direktur extends Pegawai {

    private static final int gajiDir=100000;
    private static final int tunjangan=50000;
    @Override
    public int gaji() {
        // TODO Auto-generated method stub
        return gajiDir;
    }
    public int tunjangan(){
        return tunjangan;
    }
    
}
