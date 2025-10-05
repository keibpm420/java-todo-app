package todo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menuSelect;
        String taskName;
        int removeId;
        TaskManager tm = new TaskManager();

        do {
            System.out.println("""
                    << メニュー >>

                    1 … タスク追加
                    2 … 一覧表示
                    3 … 削除
                    0 … 終了
                    """);

            System.out.print("どの操作をしたいですか？ -> ");
            menuSelect = Integer.parseInt(sc.nextLine());

            if (menuSelect != 0 && menuSelect != 1 && menuSelect != 2 && menuSelect != 3) {
                break;
            }

            switch (menuSelect) {
                case 1:
                    System.out.print("タスクの名前を入力してください -> ");
                    taskName = sc.nextLine();
                    Task t = new Task(taskName);
                    tm.addTask(t);
                    break;
                case 2:
                    tm.printTask();
                    break;
                case 3:
                    System.out.print("削除したいIDを入力してください -> ");
                    removeId = Integer.parseInt(sc.nextLine());
                    tm.validateId(removeId);
                    break;
            }

        } while (menuSelect != 0);

        System.out.println("終了します");
    }
}
