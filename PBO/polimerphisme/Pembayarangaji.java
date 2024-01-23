package polimerphisme;

public class Pembayarangaji {
    public int hitunggaji(Pegawai peg){
    int uang = peg.gaji();
        if (peg instanceof Direktur)
            uang+=((Direktur)peg).tunjangan();
        
        if (peg instanceof Staf)
            uang+=((Staf)peg).Bonus();
        
        return uang;
    }
    public static void main(String[] args) {
        Pembayarangaji pg = new Pembayarangaji();
        Staf ali = new Staf();
        Direktur Tony = new Direktur();
        System.out.println("gaji staf = "+pg.hitunggaji(ali));
        System.out.println("gaji direktur = "+pg.hitunggaji(Tony));
    }
}

