#include "Calculator.hpp"
#include "CException.hpp"

int main () {
    Calculator c;
    int res = c.Evaluate("9/2");
    cout << res << endl;
}