#include "Rekening.h"
#include "RekeningGiro.h"
// Konstruktor menginisialisi saldo (parameter 1) dan suku bunga (parameter 2)
// Set suku bunga 0.0 apabila suku bunga bernilai negatif
RekeningGiro::RekeningGiro(double saldo, double sukubunga) : Rekening(saldo) {
    if (this->sukuBunga < 0){
        this->sukuBunga = 0.0;
    } else {
        this->sukuBunga = sukubunga;
    }
}

// Getter, Setter
void RekeningGiro::setSukuBunga(double sukubunga) {
    this->sukuBunga = sukubunga;
}
double RekeningGiro::getSukuBunga() const {
    return this->sukuBunga;
}

// Member Function
// Bunga dihitung dari saldo dikali suku bunga
double RekeningGiro::hitungBunga() {
    return Rekening::getSaldo() * this->sukuBunga;
}