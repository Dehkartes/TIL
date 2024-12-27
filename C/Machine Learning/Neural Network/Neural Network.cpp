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


class Dense : public Layer {
private:
	vector<vector<float>> weights; // ����ġ
	vector<float> biases; // ����

public:
	Dense(size_t input_size, size_t output_size) {
		// ������ ���� ����ġ�� �������� �ʱ�ȭ
		weights.resize(output_size, vector<float>(input_size, 0.1f));
		biases.resize(output_size, 0.1f);
	}

	vector<float> forward(const vector<float>& input) override {
		vector<float> output(weights.size(), 0.0f);
		for (size_t i = 0; i < weights.size(); i++) {
			for (size_t j = 0; j < input.size(); j++) {
				output[i] += input[j] * weights[i][j];
			}
			output[i] += biases[i]; // ���� �տ���
		}
		return output;
	}
};