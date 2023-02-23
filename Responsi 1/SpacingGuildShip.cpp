#include "SpacingGuildShip.hpp"
#include <iostream>
using namespace std;

float SpacingGuildShip::totalGuildTravel = 0;
int SpacingGuildShip::producedShips = 0;

SpacingGuildShip::SpacingGuildShip(): maxPassengerCap(50), guildNavigatorCount(3), serialNum(SpacingGuildShip::producedShips+1){
	this->passengerCount = 0;
	this->spiceStock = 50; 
	this->operatingGuildNavigator = 3;
	SpacingGuildShip::producedShips +=1;
}

SpacingGuildShip::SpacingGuildShip(int maxPassengerCap, int guildNavigatorCount, int spiceStock): maxPassengerCap(maxPassengerCap), guildNavigatorCount(guildNavigatorCount), serialNum(SpacingGuildShip::producedShips+1){
	this->passengerCount = 0;
	this->spiceStock = spiceStock;
	this-> operatingGuildNavigator = guildNavigatorCount;
	SpacingGuildShip::producedShips +=1;
}

SpacingGuildShip::SpacingGuildShip(const SpacingGuildShip &prevShip): maxPassengerCap(prevShip.maxPassengerCap), guildNavigatorCount(prevShip.guildNavigatorCount), serialNum(prevShip.producedShips+1){
	this->passengerCount = prevShip.passengerCount;
	this->spiceStock = prevShip.spiceStock;
	this->operatingGuildNavigator = prevShip.operatingGuildNavigator;
	this->producedShips+=1;
}

SpacingGuildShip::~SpacingGuildShip(){
	
}

int SpacingGuildShip::getShipSerialNum() const{
    return this->serialNum;
}

int SpacingGuildShip::getPassengerCount() const{
    return this->passengerCount;
}

void SpacingGuildShip::travel(float distance){
	if (this->operatingGuildNavigator > 0){
		float res = distance / (E*E * this->operatingGuildNavigator);
		SpacingGuildShip::totalGuildTravel += res;
		this->operatingGuildNavigator--; 
	}
}

void SpacingGuildShip::boarding(int addedPassengers){
	if (addedPassengers + this->passengerCount > this->maxPassengerCap){
		this->passengerCount = this->maxPassengerCap;
	} else {
		this->passengerCount += addedPassengers;
	}
}

void SpacingGuildShip::dropOff(int droppedPassengers){
	if(this->passengerCount - droppedPassengers < 0){
		this->passengerCount = 0;
	} else {
		this->passengerCount -= droppedPassengers;
	}
}

void SpacingGuildShip::refreshNavigator (int n){
	int notOpr = this->guildNavigatorCount - this->operatingGuildNavigator;
	if (n * GUILD_NAVIGATOR_SPICE_DOSE > this->spiceStock){
		// int multiplier = this->spiceStock/GUILD_NAVIGATOR_SPICE_DOSE;
		// this->spiceStock -= multiplier * GUILD_NAVIGATOR_SPICE_DOSE;
		// this->operatingGuildNavigator += multiplier;
		while (this->spiceStock >= GUILD_NAVIGATOR_SPICE_DOSE){
			this->spiceStock -= GUILD_NAVIGATOR_SPICE_DOSE;
			this->operatingGuildNavigator++;
		}
	} else {
		if (n <= notOpr){
			this->spiceStock -= GUILD_NAVIGATOR_SPICE_DOSE * n;
			this->operatingGuildNavigator += n;
		} else {
			this->spiceStock -= GUILD_NAVIGATOR_SPICE_DOSE * notOpr;
			this-> operatingGuildNavigator += notOpr;
		}
	}
}

void SpacingGuildShip::transitToArrakis(int addedSpice){
	this->spiceStock += addedSpice;
}