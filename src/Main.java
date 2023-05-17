import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
/*
Задачки по стрімах
1. Відфільтрувати колекцію Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10); щоб в ній залишилися лише числа кратні 3
2. Отримати колекцію написану в Upper Case з Arrays.asList("john", "sarah", "tom");
3. Пошук максимального значення з колекції Arrays.asList(1, 2, 3, 3, 4, 5, 5, 5, 6, 7);
4. Отримати кількість всіх унікальних чисел Arrays.asList(1, 2, 3, 3, 4, 5, 5, 5, 6);


 */

public class Main {

    public static void main(String[] args) {
        List<Integer> numbers01 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> numbersFiltered = numbers01.stream().filter(num -> num % 3 == 0).toList();

        List<String> names = Arrays.asList("john", "sarah", "tom");

        List<String> namesUpperCase = names.stream().map(name -> name.toUpperCase()).toList();

        List<Integer> numbers02 = Arrays.asList(1, 2, 3, 3, 4, 5, 5, 5, 6, 7);

        Optional<Integer> numberMax = numbers02.stream().max((num1, num2) -> num1 - num2);
        Optional<Integer> numberMaxAnother = numbers02.stream().reduce(Integer::max);

        List<Integer> numbers03 = Arrays.asList(1, 2, 3, 3, 4, 5, 5, 5, 6);

        List<Integer> countUniqueValues = Collections.singletonList(numbers03.stream().distinct().toList().size());
    }
}