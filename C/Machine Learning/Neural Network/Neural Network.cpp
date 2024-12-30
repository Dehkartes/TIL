#include <iostream>
#include <vector>
#include <memory>
#include <cmath>

using namespace std;

// 레이어 인터페이스, 레이어 구현에서 상속하여 사용
class Layer {
public:
	virtual ~Layer() = default;

	virtual vector<float> forward(const vector<float>& input) = 0;
};

// 선형 층
class Linear : public Layer {
private:
	// 각 노드의 가중치와 편향을 벡터로 표현 weights[i], biases[i]는 i번째 노드의 가중치와 편향
	vector<vector<float>> weights; // n차원의 입력에 대해 각각 가중치를 가짐
								   // ex) 입력 차원이 3일 때 w00=weights[0][0], w01=weights[0][1], w02=weights[0][2]
	vector<float> biases;

public:
	Linear(unsigned int input_size, unsigned int output_size) {
		// 0.1로 가중치와 편향을 초기화 (훈련)
		weights.resize(output_size, vector<float>(input_size, 0.1f));
		biases.resize(output_size, 0.1f);
	}

	// 순전파, input: 입력(최초 입력 또는 이전 층 노드의 출력)
	vector<float> forward(const vector<float>& input) override {
		vector<float> output(weights.size(), 0.0f);

		// 각 노드의 출력 연산, i: 노드 인덱스, j: 입력(또는 가중치) 인덱스
		for (unsigned int i = 0; i < weights.size(); i++) {
			// 출력 = 가중합 + 편향
			for (unsigned int j = 0; j < input.size(); j++) {
				output[i] += input[j] * weights[i][j];
			}
			output[i] += biases[i];
		}
		return output;
	}
};

// 렐루 활성화 층
class ReLU : public Layer {
public:
	vector<float> forward(const vector<float>& input) override {
		vector<float> output(input.size(), 0.0f);

		//각 노드를 순회하며 렐루 함수 적용
		for (size_t i = 0; i < input.size(); i++) {
			output[i] = max(0.0f, input[i]);
		}
		return output;
	}
};

class NeuralNetwork {
private:
	// 스마트 포인터 벡터로 층 객체 관리
	vector<shared_ptr<Layer>> layers;

public:
	void add_layer(const shared_ptr<Layer>& layer) {
		layers.push_back(layer);
	}

	vector<float> predict(const vector<float>& input) {
		vector<float> output = input;
		for (const auto& layer : layers) {
			output = layer->forward(output); // 각 Layer의 forward 메서드 호출
		}
		return output;
	}
};