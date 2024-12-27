#include <iostream>
#include <vector>
#include <memory>
#include <cmath>

using namespace std;

class Layer {
public:
	virtual ~Layer() = default;

	// �߷п� ����� forward �޼���
	virtual vector<float> forward(const vector<float>& input) = 0;
};
