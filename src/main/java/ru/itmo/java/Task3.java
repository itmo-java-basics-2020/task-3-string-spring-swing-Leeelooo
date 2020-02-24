package ru.itmo.java;

public class Task3 {

    /**
     * Напишите функцию, которая принимает массив целых чисел и циклически сдвигает элементы этого массива вправо:
     * A[0] -> A[1], A[1] -> A[2] .. A[length - 1] -> A[0].
     * Если инпут равен null - вернуть пустой массив
     */
    int[] getShiftedArray(int[] inputArray) {
        throw new UnsupportedOperationException(); // TODO solve
    }

    /**
     * Напишите функцию, которая принимает массив целых чисел и возвращает максимальное значение произведения двух его элементов.
     * Если массив состоит из одного элемента, то функция возвращает этот элемент.
     *
     * Если входной массив пуст или равен null - вернуть 0
     *
     * Пример: 2 4 6 -> 24
     */
    int getMaxProduct(int[] inputArray) {
        throw new UnsupportedOperationException(); // TODO solve
    }

    /**
     * Напишите функцию, которая вычисляет процент символов 'A' и 'B' (латиница) во входной строке.
     * Функция не должна быть чувствительна к регистру символов.
     * Результат округляйте путем отбрасывания дробной части.
     *
     * Пример: acbr -> 50
     */
    int getABpercentage(String input) {
        throw new UnsupportedOperationException(); // TODO solve
    }

    /**
     * Напишите функцию, которая определяет, является ли входная строка палиндромом
     */
    boolean isPalindrome(String input) {
        throw new UnsupportedOperationException(); // TODO solve
    }

    /**
     * Напишите функцию, которая принимает строку вида "bbcaaaak" и кодирует ее в формат вида "b2c1a4k1",
     * где группы одинаковых символов заменены на один символ и кол-во этих символов идущих подряд в строке
     */
    String getEncodedString(String input) {
        throw new UnsupportedOperationException(); // TODO solve
    }

    /**
     * Напишите функцию, которая принимает две строки, и возвращает true, если одна может быть перестановкой (пермутатсией) другой.
     * Строкой является последовательность символов длинной N, где N > 0
     * Примеры:
     * isPermutation("abc", "cba") == true;
     * isPermutation("abc", "Abc") == false;
     */
    boolean isPermutation(String one, String two) {
        throw new UnsupportedOperationException(); // TODO solve
    }

    /**
     * Напишите функцию, которая принимает строку и возвращает true, если она состоит из уникальных символов.
     * Из дополнительной памяти (кроме примитивных переменных) можно использовать один массив.
     * Строкой является последовательность символов длинной N, где N > 0
     */
    boolean isUniqueString(String s) {
        throw new UnsupportedOperationException(); // TODO solve
    }

    /**
     * Напишите функцию, которая транспонирует матрицу. Только квадратные могут быть на входе.
     *
     * Если входной массив == null - вернуть пустой массив
     */
    int[][] matrixTranspose(int[][] m) {
        throw new UnsupportedOperationException(); // TODO solve
    }

    /**
     * Напиишите функцию, принимающую массив строк и символ-разделитель,
     * а возвращает одну строку состоящую из строк, разделенных сепаратором.
     *
     * Запрещается пользоваться функций join
     *
     * Если сепаратор == null - считайте, что он равен ' '
     * Если исходный массив == null -  вернуть пустую строку
     */
    String concatWithSeparator(String[] inputStrings, Character separator) {
        return null; // TODO solve
    }

    /**
     * Напишите функцию, принимающую массив строк и строку-перфикс и возвращающую кол-во строк массива с данным префиксом
     */
    int getStringsStartWithPrefix(String[] inputStrings, String prefix) {
        return 0; // TODO solve
    }
}
