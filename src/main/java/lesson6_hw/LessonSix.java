package lesson6_hw;

public class LessonSix {
    private static final int MAX_LEVEL = 4;
    private static int balanceFalse;
    private static int balanceTrue;

    public static void main(String[] args) {

        for (int i = 0; i < 20; i++) {
            Tree<Integer> tree = new CreateTree<>(MAX_LEVEL);
            for (int j = 0; j < 50; j++) {
                tree.add((int) (Math.random() * 50 - 25));
            }
            tree.display();

            tree.balance(Tree.BalanceMode.BALANCE);

            if (tree.balance(Tree.BalanceMode.BALANCE)) {
                balanceTrue++;
            } else {
                balanceFalse++;
            }
        }

        System.out.printf("Balanced Trees: %d\nUnbalanced Trees: %d\n", balanceTrue, balanceFalse);

    }
}

/*
1. Создать и запустить программу для построения двоичного дерева.
    В цикле построить двадцать деревьев с глубиной в 4 уровней.
    Данные, которыми необходимо заполнить узлы деревьев, представляются в виде чисел типа int.
    Число, которое попадает в узел, должно генерироваться случайным образом в диапазоне от -25 до 25.

2. Проанализировать, какой процент созданных деревьев являются несбалансированными.
 */
