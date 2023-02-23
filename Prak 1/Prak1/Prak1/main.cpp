#include <iostream>
#include "Paper.hpp"
using namespace std;

int main (){
	Paper a('A'); //ctor A
	Paper b('B'); //ctor B
	Paper c('C'); //ctor C
	Paper d(c); //cctor C
	a.fold(); // fold A(1)
	b.fold(); // fold B(1)
	c.fold(); // fold C(1)
	c.glue(); // glue C
	c.setName('X');
	d.fold();
	d.glue();

	return 0;
}