#include <iostream>
#include "Neural Network.cpp"

using namespace std;

int main() {
	NeuralNetwork nn;

	nn.add_layer(make_shared<Dense>(3, 5));
	nn.add_layer(make_shared<ReLU>());
	nn.add_layer(make_shared<Dense>(5, 2));

	vector<float> input = { 1.0f, 2.0f, 3.0f };

	vector<float> output = nn.predict(input);

	cout << "Output: ";
	for (const auto& val : output) {
		cout << val << " ";
	}
	cout << endl;

	return 0;
}