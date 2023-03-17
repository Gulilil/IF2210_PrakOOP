#include "Tool.hpp"
#include "ReinforcedAxe.hpp"
#include "Pickaxe.hpp"

int main () {

    Pickaxe p;
    p.use();
    p.enchant();
    Pickaxe p1 = p;
    Pickaxe p2;
    p2 = p1;
    ReinforcedAxe r1;
    r1.use();
    ReinforcedAxe r2 = r1;
    r2.enchant();
    ReinforcedAxe r3 = r1+ r2;
    r3.repair();
}

/*
tool crafted! 3 2
pickaxe crafted! 3 2
swing! swing! diamonds found!
pickaxe enchanted!
tool copy crafted! 3 2
pickaxe copy crafted! 3 2
tool crafted! 3 2
pickaxe crafted! 3 2
pickaxe copied! 3 2 
tool crafted! 3 4
reinforced axe crafted! 3 4
chip chop chip chop! 3 4
tool crafted! 3 4
reinforced axe copy crafted! 3 4
reinforced axe's grip enchanted! 3 4
tool crafted! 3 4
reinforced axe copy crafted! 3 4
reinforcing axe! 6 8
tool crafted! 6 8
reinforced axe copy crafted! 6 8
reinforced axe is repaired! 6 8
reinforced axe destroyed! 3 4
tool destroyed! 3 4
reinforced axe destroyed! 3 4
tool destroyed! 3 4
reinforced axe destroyed! 6 8
tool destroyed! 6 8
pickaxe destroyed! 3 2
tool destroyed! 3 2
pickaxe destroyed! 3 2
tool destroyed! 3 2
*/