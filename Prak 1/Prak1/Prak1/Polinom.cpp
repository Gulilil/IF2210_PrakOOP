#include <iostream>
#include "Polinom.hpp"
using namespace std;

Polinom::Polinom(){
    this->derajat = 0;
    this->koef = new int[this->derajat+1];
}

Polinom::Polinom(int n){
    this->derajat = n;
    this->koef = new int[this->derajat+1];
}

Polinom::Polinom(const Polinom& p){
    this->derajat = p.derajat;
    this->koef = new int[this->derajat+1];
    for (int i = 0; i < this->derajat+1 ; i++){
        this->koef[i] = p.koef[i];
    }
}

Polinom::~Polinom(){
    delete [] this->koef;
}

Polinom& Polinom::operator=(const Polinom& p){
    this->derajat = p.derajat;
    delete [] this->koef;
    this->koef = new int[this->derajat+1];
    for(int i= 0; i < this->derajat+1; i++){
        this->koef[i] = p.koef[i];
    }
}

int Polinom::getKoefAt(int idx) const{
    return this->koef[idx];
}

int Polinom::getDerajat() const{
    return this->derajat;
}

void Polinom::setKoefAt(int idx, int val){
    this->koef[idx] = val;
}

void Polinom::setDerajat(int n){
    this->derajat = n;
}

void Polinom::input(){
    for (int i = 0; i < this->derajat+1; i++){
        cin >> this->koef[i];
    }
}

void Polinom::printKoef(){
    for (int i = 0; i < this->derajat+1; i++){
        cout << this->koef[i] << endl;
    }
}

int Polinom::substitute(int n){
    int res = 0;
    for ( int i = 0; i < this->derajat+1; i++){
        int temp = this->koef[i];
        for (int j = 0; j < i; j++){
            temp *= n;
        }
        res += temp;
    }
    return res;
}

void Polinom::print(){
    bool isAllZero = true;
    for (int i = 0; i< this->derajat+1; i++){
        if (this->koef[i] != 0){
            isAllZero = false;
        }
    }
    if (isAllZero){
        cout << 0 << endl;
    } else {
        int x = 0;
        bool first = true;
        while(x < this->derajat+1){
            if (this->koef[x] != 0){
                if (first){
                    if (x == 0){
                        cout << this->koef[x];
                        first = false;
                    } else {
                        cout<< this->koef[x] << "x^" << x;
                        first = false;
                    }
                } else {
                    if ( this->koef[x] > 0){
                        cout << "+" << this->koef[x] << "x^" << x;
                    } else {
                        cout << this->koef[x] << "x^" << x;
                    }
                }
            }
            x++;
        }
        cout <<endl;
    }
}

// int main (){
//     Polinom p(3);
//     p.input();
//     cout << p.substitute(2) << endl;
//     p.print();
//     p.printKoef();

//     return 0;
// }