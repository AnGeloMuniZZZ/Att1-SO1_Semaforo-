package controller;

import java.util.concurrent.Semaphore;

public class ThreadCalculo extends Thread {

	private int id;
	private Semaphore semaforo;
	private int tempo;

	public ThreadCalculo(int id, Semaphore semaforo) {
		this.id = id;
		this.semaforo = semaforo;
	}

	@Override
	public void run() {

		try {
			switch (id%3) {
			case (1):
				tempo = (int) ((Math.random() * 801) + 200);
				System.out.println("#" + id + " está calculando");
				sleep(tempo);
				semaforo.acquire();
				System.out.println("#" + id + " está em transação com o BD");
				sleep(1000);
				semaforo.release();
				System.out.println("#" + id + " está calculando");
				sleep(tempo);
				semaforo.acquire();
				System.out.println("#" + id + " está em transação com o BD");
				sleep(1000);
				semaforo.release();
				break;
			case (2):
				tempo = (int) ((Math.random() * 1001) + 500);
				System.out.println("#" + id + " está calculando");
				sleep(tempo);
				semaforo.acquire();
				System.out.println("#" + id + " está em transação com o BD");
				sleep(1500);
				semaforo.release();
				System.out.println("#" + id + " está calculando");
				sleep(tempo);
				semaforo.acquire();
				System.out.println("#" + id + " está em transação com o BD");
				sleep(1500);
				semaforo.release();
				System.out.println("#" + id + " está calculando");
				sleep(tempo);
				semaforo.acquire();
				System.out.println("#" + id + " está em transação com o BD");
				sleep(1500);
				semaforo.release();
				break;
			case (0):
				tempo = (int) ((Math.random() * 1001) + 1000);
				System.out.println("#" + id + " está calculando");
				sleep(tempo);
				semaforo.acquire();
				System.out.println("#" + id + " está em transação com o BD");
				sleep(1500);
				semaforo.release();
				System.out.println("#" + id + " está calculando");
				sleep(tempo);
				semaforo.acquire();
				System.out.println("#" + id + " está em transação com o BD");
				sleep(1500);
				semaforo.release();
				System.out.println("#" + id + " está calculando");
				sleep(tempo);
				semaforo.acquire();
				System.out.println("#" + id + " está em transação com o BD");
				sleep(1500);
				semaforo.release();
				break;
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
