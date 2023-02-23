#include "Kompleks.h"
#include <iostream>
using namespace std;

int Kompleks::n_kompleks = 0;

Kompleks::Kompleks(){
	this->real = 0;
	this->imaginer = 0;
	this->n_kompleks++;
}

Kompleks::Kompleks(int real, int imaginer){
	this->real = real;
	this->imaginer = imaginer;
	this->n_kompleks++;
}

int Kompleks::GetReal() const{
	return this->real;
}

int Kompleks::GetImaginer() const{
	return this->imaginer;
}

void Kompleks::SetReal(int r){
	this->real = r;
}

void Kompleks::SetImaginer(int i){
	this->imaginer = i;
}

Kompleks operator+ (const Kompleks& k1, const Kompleks& k2){
	Kompleks temp;
	temp.real = k1.real + k2.real;
	temp.imaginer = k1.imaginer + k2.imaginer;
	return temp;
}

Kompleks operator-(const Kompleks& k1, const Kompleks& k2){
	Kompleks temp;
	temp.real = k1.real-k2.real;
	temp.imaginer = k1.imaginer - k2.imaginer;
	return temp;
}

Kompleks operator*(const Kompleks& k1, const Kompleks& k2){
	Kompleks temp;
	temp.real = (k1.real*k2.real - k1.imaginer*k2.imaginer);
	temp.imaginer = (k1.imaginer*k2.real + k1.real*k2.imaginer);
	return temp;
}

Kompleks operator*(const Kompleks& k, const int n){
	Kompleks temp;
	temp.real = k.real * n;
	temp.imaginer = k.imaginer * n;
	return temp;
}

Kompleks operator*(const int n, const Kompleks& k){
	Kompleks temp;
	temp.real = k.real * n;
	temp.imaginer = k.imaginer*n;
	return temp;
}

int Kompleks::CountKompleksInstance(){
	return n_kompleks;
}

void Kompleks::Print(){
	if (this->imaginer >= 0 ){
		cout<< this->real <<"+"<< this->imaginer << "i"<<endl;		
	} else {
		cout << this->real << this->imaginer << "i"<< endl;
	}

}

/*
int main (){
	Kompleks k = Kompleks(2,4);
	Kompleks h = Kompleks(3,5);
	cout << k.CountKompleksInstance() << endl;
	Kompleks temp = k+h;
	temp.Print();
	temp = k-h;
	temp.Print();
	temp = k*h;
	temp.Print();
	temp = k*2;
	temp.Print();

	return 0;
}

*/