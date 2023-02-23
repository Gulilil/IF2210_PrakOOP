#include "ExplodableBarrel.hpp"
#include <iostream>
using namespace std;

ExplodableBarrel::ExplodableBarrel() : Damageable(1), Explodable(){
    this->radius = 5;
}

ExplodableBarrel::ExplodableBarrel(int r, int dmg): Damageable(1), Explodable(dmg){
    this->radius = r;
}

void ExplodableBarrel::takeDamage(int dmg, string elmt){
    if (!this->isDestroyed()){
        Damageable::takeDamage(dmg);
        if (isDestroyed()){
            explode(this->radius);
        }
    }
}