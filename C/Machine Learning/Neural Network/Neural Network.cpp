#include <iostream>
#include <vector>
#include <memory>
#include <cmath>

using namespace std;

class Layer {
public:
	virtual ~Layer() = default;

	// 추론에 사용할 forward 메서드
	virtual vector<float> forward(const vector<float>& input) = 0;
};
