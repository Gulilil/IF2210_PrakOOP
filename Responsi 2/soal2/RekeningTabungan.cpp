#include "Rekening.h"
#include "RekeningTabungan.h"

// Konstruktor menginisialisi saldo (parameter 1) dan biaya transaksi (parameter 2)
// Set biaya transaksi 0.0 apabila biaya transaksi bernilai negatif
RekeningTabungan::RekeningTabungan(double saldo, double biaya) : Rekening(saldo){
    if (biaya < 0){
        this->biayaTransaksi = 0.0;
    } else {
        this->biayaTransaksi = biaya;
    }
}

void RekeningTabungan::setBiayaTransaksi(double biaya){
    this->biayaTransaksi = biaya;
}

double RekeningTabungan::getBiayaTransaksi() const {
    return this->biayaTransaksi;
}

// Member Function
// Panggil fungsi simpanUang dari parent class
// Kurangkan saldo dengan biaya transaksi
void RekeningTabungan::simpanUang(double amount){
    Rekening::simpanUang(amount - this->biayaTransaksi);
}

// Panggil fungsi tarikUang dari parent class
// Kurangkan saldo dengan biaya transaksi hanya jika penarikan uang berhasil
// Saldo mungkin saja menjadi negatif apabila setelah penarikan, saldo < biaya transaksi
// Kembalikan boolean yang mengindikasikan apakah uang berhasil ditarik atau tidak
bool RekeningTabungan::tarikUang(double amount){
    bool valid = Rekening::tarikUang(amount);
    if (valid){
        Rekening::setSaldo(this->getSaldo() - this->biayaTransaksi);
    } 
    return valid;
}