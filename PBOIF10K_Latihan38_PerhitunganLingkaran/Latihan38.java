 /**
 * Nama     : M.Hongki Alfikram
 * Kelas    : IF10K
 * NIM      : 10119915
 */
 
class Lingkaran {
    double jari;
    double luas;
    double keliling;
    
    public double jari2Lingkaran(double diameter){
        jari = diameter / 2;
        return jari;
           }
    public double luasLingkaran(double r){
        luas = Math.PI * r * r;
        return luas;
    }
    public double kelilingLingkaran(double r){
        luas = 2*Math.PI * r;
        return luas;
    }
}