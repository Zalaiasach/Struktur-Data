#include <iostream>
#include <string>
using namespace std;
class mobil{
    private:
        string Brand;
        string Type;
        string color;
        int speed;
    public:
        mobil(string B,string T, string c,int s){
            Brand=B;
            Type=T;
            color=c;
            speed=s;
        }
        void myMobil(){
            cout<<Brand<<" "<<Type<<" "<<color<<" dengan kecepatan "<<speed<<endl;
        }
};

int main(){
    mobil mbl("Toyota","Innova","putih",100);
    mbl.myMobil();
    return 0;
}