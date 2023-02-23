#include "BurnableBarrel.hpp"
#include <iostream>
using namespace std;

BurnableBarrel::BurnableBarrel() : Damageable(), Burnable(){

}

BurnableBarrel::BurnableBarrel(int hp): Damageable(hp), Burnable(){

}

void BurnableBarrel::takeDamage(int dmg, string elmt){
    if (!isDestroyed()){
        if (elmt == "fire"){
            this->burn();
        } else if (elmt == "water"){
            this->watered();
        }

        if (isBurned()){
            dmg *= this->multiplier;
        }

        Damageable::takeDamage(dmg);
    }
}