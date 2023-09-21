package ui;

import items.Prize;
import prizepool.PrizePool;

import java.util.Collection;
import java.util.Scanner;

public class Menu {
    private boolean runStatus;
    private PrizePool<Prize> pool;
    private TextUI text;
    private Scanner sc;

    public Menu() {
        this.pool = new PrizePool<>();
        this.runStatus = true;
        this.text = new TextUI();
        this.sc = new Scanner(System.in);
    }

    public void start() {
        System.out.println(text.hello);

        while (runStatus) {
            System.out.println(text.menuPrompt);
            System.out.println(text.menuList);
            String choice = sc.nextLine();
            switch (choice) {
                case "1" -> {
                    pool.addToPool(inputPrize());
                    System.out.println(text.addConfirm);
                }
                case "2" -> pool.rollPrize();
                case "3" -> pool.issuePrize();
                case "4" -> printList(pool.getPrizePool());
                case "5" -> printList(pool.getWinningsQueue());
                case "6" -> {
                    System.out.println(text.goodbye);
                    runStatus = false;
                }
            }
        }
    }

    private void printList(Collection<Prize> list) {
        if (list.isEmpty()) {
            System.out.println(text.listEmpty);
            return;
        }
        for (Prize item :
                list) {
            System.out.println(item);
        }
        System.out.println();
    }

    private Prize inputPrize() {
        System.out.println(text.promptName);
        String name = sc.nextLine();
        System.out.println(text.promptWeight);
        int weight = Integer.parseInt(sc.nextLine());
        return new Prize(name, weight);
    }
}
