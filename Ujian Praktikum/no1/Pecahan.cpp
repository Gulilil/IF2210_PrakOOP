#include "Pecahan.hpp"
#include <iostream>
using namespace std;

pecahan::pecahan(){
    this->n = 0;
    this->d = 1;
}

pecahan::pecahan(int _n, int _d){
    this->n = _n;
    this->d = _d;
}

pecahan::pecahan(const pecahan &P) {
    this->n = P.n;
    this->d = P.d;
}

pecahan::~pecahan() {

}

int pecahan::getPemb() {
    return this-> n;
}

int pecahan::getPeny(){
    return this->d;
}

void pecahan::setPemb(int _n){
    this->n = _n;
}

void pecahan::setPeny(int _d){
    this->d = _d;
}

pecahan pecahan::operator+(const pecahan &P){
    pecahan temp(0,0);
    temp.setPemb(this->n * P.d + this->d * P.n);
    temp.setPeny(this->d * P.d);
    return temp;
}

pecahan pecahan::operator-(const pecahan &P){
    pecahan temp(0,0);
    temp.setPemb(this->n * P.d - this->d * P.n);
    temp.setPeny(this->d * P.d);
    return temp;
}

pecahan pecahan::operator*(int x){
    pecahan temp(0,0);
    temp.setPemb(n*x);
    temp.setPeny(d*x);
    return temp;
}

// int gcd(int n, int d){
//     if (d == 0){
//         return n;
//     }
//     else {
//         if (d > n){
//             gcd(d, n);
//         } else {
//             gcd(d, n % d);
//         }
//     }
// }

bool pecahan::operator== (const pecahan &P){
    // int gcd1 = gcd(this->n, this->d);
    // int gcd2 = gcd(P.n , P.d);

    // this->n = this->n /gcd1;
    // this->d = this->d/gcd1;

    // int newPemb = P.n / gcd2;
    // int newPeny = P.d / gcd2;
    float res1 = (float) this->n / (float) P.n;
    float res2 = (float) this->d / (float) P.d;

    return (res1 == res2);
}


float pecahan::RealP(){
    return (float) n/ (float) d;
}

void pecahan::Print(){
    cout << this->n << "/" << this->d;
}