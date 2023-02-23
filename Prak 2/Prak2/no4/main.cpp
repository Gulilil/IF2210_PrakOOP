#include "Tool.hpp"
#include "Pickaxe.hpp"
#include "ReinforcedAxe.hpp"

int main () {
    Pickaxe *p = new Pickaxe();
    p->use();
    p->enchant();
    Pickaxe *p1 = new Pickaxe(*p);
    Pickaxe *p2 = new Pickaxe();
    *p2 = *p1;
    ReinforcedAxe *r1 = new ReinforcedAxe();
    r1->use();
    ReinforcedAxe *r2 = new ReinforcedAxe(*r1);
    r2->enchant();
    ReinforcedAxe *r3 = new ReinforcedAxe(*r2 + *r1);
    r3->repair();
    delete r1;
    delete r2;
    delete r3;
    delete p1;
    delete p2;
    return 0;
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