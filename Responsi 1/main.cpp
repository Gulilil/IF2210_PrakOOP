#include "A.hpp"
#include <iostream>
using namespace std;

int main () {
	A obj1 = A('1');
	A obj2 = A('2');
	A obj3(obj1);
	obj3.operator=(obj2);
	obj3.show();
	// Seems like destroy dari belakang
	return 0;
} 
