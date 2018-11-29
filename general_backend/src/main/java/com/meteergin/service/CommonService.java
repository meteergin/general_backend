package com.meteergin.service;

import org.springframework.stereotype.Service;

@Service
public class CommonService {

	public int sum(int... args) {
		int sum = 0;
		for (int arg : args) {
			sum += arg;
		}
		return sum;
	}

}
