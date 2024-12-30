#include <iostream>
#include <vector>
#include <memory>
#include <cmath>

using namespace std;

// ���̾� �������̽�, ���̾� �������� ����Ͽ� ���
class Layer {
public:
	virtual ~Layer() = default;

	virtual vector<float> forward(const vector<float>& input) = 0;
};

// ���� ��
class Linear : public Layer {
private:
	// �� ����� ����ġ�� ������ ���ͷ� ǥ�� weights[i], biases[i]�� i��° ����� ����ġ�� ����
	vector<vector<float>> weights; // n������ �Է¿� ���� ���� ����ġ�� ����
								   // ex) �Է� ������ 3�� �� w00=weights[0][0], w01=weights[0][1], w02=weights[0][2]
	vector<float> biases;

public:
	Linear(unsigned int input_size, unsigned int output_size) {
		// 0.1�� ����ġ�� ������ �ʱ�ȭ (�Ʒ�)
		weights.resize(output_size, vector<float>(input_size, 0.1f));
		biases.resize(output_size, 0.1f);
	}

	// ������, input: �Է�(���� �Է� �Ǵ� ���� �� ����� ���)
	vector<float> forward(const vector<float>& input) override {
		vector<float> output(weights.size(), 0.0f);

		// �� ����� ��� ����, i: ��� �ε���, j: �Է�(�Ǵ� ����ġ) �ε���
		for (unsigned int i = 0; i < weights.size(); i++) {
			// ��� = ������ + ����
			for (unsigned int j = 0; j < input.size(); j++) {
				output[i] += input[j] * weights[i][j];
			}
			output[i] += biases[i];
		}
		return output;
	}
};

// ���� Ȱ��ȭ ��
class ReLU : public Layer {
public:
	vector<float> forward(const vector<float>& input) override {
		vector<float> output(input.size(), 0.0f);

		//�� ��带 ��ȸ�ϸ� ���� �Լ� ����
		for (size_t i = 0; i < input.size(); i++) {
			output[i] = max(0.0f, input[i]);
		}
		return output;
	}
};

class NeuralNetwork {
private:
	// ����Ʈ ������ ���ͷ� �� ��ü ����
	vector<shared_ptr<Layer>> layers;

public:
	void add_layer(const shared_ptr<Layer>& layer) {
		layers.push_back(layer);
	}

	vector<float> predict(const vector<float>& input) {
		vector<float> output = input;
		for (const auto& layer : layers) {
			output = layer->forward(output); // �� Layer�� forward �޼��� ȣ��
		}
		return output;
	}
};