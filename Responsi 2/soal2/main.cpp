#include <iostream>
#include "Rekening.h"
#include "RekeningGiro.h"
#include "RekeningTabungan.h"
using namespace std;

int main (){
    // Rekening r(600);
    // r.setSaldo(500);
    // cout << r.getSaldo() <<endl;
    // r.simpanUang(400);
    // cout << r.getSaldo() <<endl;
    // if (r.tarikUang(1000)){
    //     cout << r.getSaldo() <<endl;
    // }
    // if (r.tarikUang(200)){
    //     cout << r.getSaldo() <<endl;
    // }

    RekeningGiro rg(600, -500);
    cout << rg.getSukuBunga() << endl;
    cout << rg.getSaldo() << endl;
    rg.setSukuBunga(700);
    cout << rg.getSukuBunga() << endl;
    

}