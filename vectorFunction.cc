#include <algorithm>
#include <vector>
#include <iostream>
using namespace std;

int main() {

    vector<int> vec1 = {1, 2, 3};
    vector<int> vec2 = {4, 5, 6};

    // print vec1 and vec2 before swap
    cout << "Before swap:" << endl;
    cout << "vec1: ";
    for(int num : vec1) {
        cout << num << " ";
    }
    cout << endl;

    cout << "vec2: ";
    for(int num : vec2) {
        cout << num << " ";
    }
    cout << endl;

    // swap vec1 and vec2
    swap(vec1, vec2);

    // print vec1 and vec2 after swap
    cout << "After swap:" << endl;
    cout << "vec1: ";
    for(int num : vec1) {
        cout << num << " ";
    }
    cout << endl;

    cout << "vec2: ";
    for(int num : vec2) {
        cout << num << " ";
    }
    cout << endl;
   vector<int> vect1 = {1, 3, 5};
    vector<int> vect2 = {2, 4, 6};
    vector<int> result(6);

    // vec1 and vec2 before merge
    cout << "Before merge:" << endl;
    cout << "vect1: ";
    for(int num : vect1) {
        cout << num << " ";
    }
    cout << endl;

    cout << "vect2: ";
    for(int num : vect2) {
        cout << num << " ";
    }
    cout << endl;

    // perform merge operation
    merge(vect1.begin(), vect1.end(), vect2.begin(), vect2.end(), result.begin());

    // output result after merge
    cout << "After merge:" << endl;
    cout << "result: ";
    for(int num : result) {
        cout << num << " ";
    }
    cout << endl;

    return 0;
}
 
