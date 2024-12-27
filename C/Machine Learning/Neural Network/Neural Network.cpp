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


class Dense : public Layer {
private:
	vector<vector<float>> weights; // 가중치
	vector<float> biases; // 편향

public:
	Dense(size_t input_size, size_t output_size) {
		// 임의의 값을 가중치와 편향으로 초기화
		weights.resize(output_size, vector<float>(input_size, 0.1f));
		biases.resize(output_size, 0.1f);
	}

	vector<float> forward(const vector<float>& input) override {
		vector<float> output(weights.size(), 0.0f);
		for (size_t i = 0; i < weights.size(); i++) {
			for (size_t j = 0; j < input.size(); j++) {
				output[i] += input[j] * weights[i][j];
			}
			output[i] += biases[i]; // 편향 합연산
		}
		return output;
	}
};