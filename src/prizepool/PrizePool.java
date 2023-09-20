package prizepool;

import items.Item;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Random;

public class PrizePool<T extends Item<T>> {
    private ArrayList<T> prizePool; // сюда добавляем и отсюда тянем призы
    private ArrayDeque<T> winningsQueue; // это очередь выдачи призов
    private int weightSum; // суммарный вес призов, увеличивается при добавлении товаров

    public PrizePool() {
        this.prizePool = new ArrayList<>();
        this.winningsQueue = new ArrayDeque<>();
        this.weightSum = 0;
    }

    private void addToPool(T item) {
        prizePool.add(item);
        weightSum += item.getWeightProbability();
    }

    private void rollPrize() {
        if (prizePool.isEmpty()) {
            System.out.println("Список призового пула пуст.");
            return;
        }

        Random rd = new Random();
        int roll = rd.nextInt(1, weightSum + 1);
        int currentWeight = 0;
        for (T item :
                prizePool) {
            currentWeight += item.getWeightProbability();
            if (roll <= currentWeight) {
                winningsQueue.add(item);
            }
        }
    }

}
