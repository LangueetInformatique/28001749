#include "swap.h"

template <typename T>
	void swap(T *a, T *b){

	T c = *a;
	*a = *b;
	*b = c;
}

