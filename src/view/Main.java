package view;

import java.util.concurrent.Semaphore;

import controller.ThreadCalculo;

public class Main {

	public static void main(String[] args) {

		Semaphore semaforo = new Semaphore(1);

		for (int id = 1; id <= 21; id++) {
			Thread tCalc = new ThreadCalculo(id, semaforo);
			tCalc.start();
		}
	}

}
