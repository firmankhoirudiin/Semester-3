package uts;

public interface OperasiPerbankan {
    void setor(int jumlah);
    void tarik(int jumlah);
    void transfer(int jumlah, String penerima);
    int cekSaldo();
}
