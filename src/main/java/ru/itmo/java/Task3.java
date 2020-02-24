package ru.itmo.java;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Task3 {
    /**
     * Напишите функцию, которая принимает массив целых чисел и циклически сдвигает элементы этого массива вправо:
     * A[0] -> A[1], A[1] -> A[2] .. A[length - 1] -> A[0].
     * Если инпут равен null - вернуть пустой массив
     */
    int[] getShiftedArray(int[] inputArray) {
        if (inputArray == null)
            return new int[0];
        int[] result = new int[inputArray.length];
        for (int i = 0; i < result.length; i++) {
            result[(i + 1) % result.length] = inputArray[i];
        }
        return result;
    }

    /**
     * Напишите функцию, которая принимает массив целых чисел и возвращает максимальное значение произведения двух его элементов.
     * Если массив состоит из одного элемента, то функция возвращает этот элемент.
     * <p>
     * Если входной массив пуст или равен null - вернуть 0
     * <p>
     * Пример: 2 4 6 -> 24
     */
    int getMaxProduct(int[] inputArray) {
        if (inputArray == null || inputArray.length < 2)
            return 0;
        var maxValue = Integer.MIN_VALUE;
        var prevMaxValue = Integer.MIN_VALUE;
        for (int i : inputArray) {
            if (maxValue < i) {
                prevMaxValue = maxValue;
                maxValue = i;
            } else if (prevMaxValue < i) {
                prevMaxValue = i;
            }
        }
        return maxValue * prevMaxValue;
    }

    /**
     * Напишите функцию, которая вычисляет процент символов 'A' и 'B' (латиница) во входной строке.
     * Функция не должна быть чувствительна к регистру символов.
     * Результат округляйте путем отбрасывания дробной части.
     * <p>
     * Пример: acbr -> 50
     */
    int getABpercentage(String input) {
        return input != null && input.length() != 0 ?
                (int) input
                        .toLowerCase()
                        .chars()
                        .filter(c -> c == 'a' || c == 'b')
                        .count() * 100 / input.length() :
                0;
    }

    /**
     * Напишите функцию, которая определяет, является ли входная строка палиндромом
     */
    boolean isPalindrome(String input) {
        if (input == null) return false;
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i))
                return false;
        }
        return true;
    }

    /**
     * Напишите функцию, которая принимает строку вида "bbcaaaak" и кодирует ее в формат вида "b2c1a4k1",
     * где группы одинаковых символов заменены на один символ и кол-во этих символов идущих подряд в строке
     */
    String getEncodedString(String input) {
        if (input == null || input.length() == 0)
            return "";
        var builder = new StringBuilder();
        char lastSymbol = input.charAt(0);
        int lastCount = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == lastSymbol) {
                lastCount++;
            } else {
                builder.append(lastSymbol).append(lastCount);
                lastSymbol = input.charAt(i);
                lastCount = 1;
            }
        }
        builder.append(lastSymbol).append(lastCount);
        return builder.toString();
    }

    /**
     * Напишите функцию, которая принимает две строки, и возвращает true, если одна может быть перестановкой (пермутатсией) другой.
     * Строкой является последовательность символов длинной N, где N > 0
     * Примеры:
     * isPermutation("abc", "cba") == true;
     * isPermutation("abc", "Abc") == false;
     */
    boolean isPermutation(String one, String two) {
        if (one == null || two == null || one.length() != two.length() || one.length() == 0)
            return false;
        var firstSorted = one.toCharArray();
        var secondSorted = two.toCharArray();

        Arrays.sort(firstSorted);
        Arrays.sort(secondSorted);

        return Arrays.equals(firstSorted, secondSorted);
    }

    /**
     * Напишите функцию, которая принимает строку и возвращает true, если она состоит из уникальных символов.
     * Из дополнительной памяти (кроме примитивных переменных) можно использовать один массив.
     * Строкой является последовательность символов длинной N, где N > 0
     */
    boolean isUniqueString(String s) {
        if (s == null || s.length() == 0)
            return false;
        char[] hashes = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            int index = Character.hashCode(s.charAt(i)) % s.length();
            while (hashes[index] != 0) {
                if (hashes[index] == s.charAt(i))
                    return false;
                index = (index + 1) % s.length();
            }
            hashes[index] = s.charAt(i);
        }
        return true;
    }

    /**
     * Напишите функцию, которая транспонирует матрицу. Только квадратные могут быть на входе.
     * <p>
     * Если входной массив == null - вернуть пустой массив
     */
    int[][] matrixTranspose(int[][] m) {
        if (m == null || m.length == 0 || m.length != m[0].length)
            return new int[][]{{}, {}};
        var result = new int[m[0].length][m.length];
        for (int i = 0; i < m[0].length; i++) {
            for (int j = 0; j < m.length; j++) {
                result[i][j] = m[j][i];
            }
        }
        return result;
    }

    /**
     * Напиишите функцию, принимающую массив строк и символ-разделитель,
     * а возвращает одну строку состоящую из строк, разделенных сепаратором.
     * <p>
     * Запрещается пользоваться функций join
     * <p>
     * Если сепаратор == null - считайте, что он равен ' '
     * Если исходный массив == null -  вернуть пустую строку
     */
    String concatWithSeparator(String[] inputStrings, Character separator) {
        return inputStrings == null ? "" : Arrays.stream(inputStrings)
                .collect(
                        Collectors.joining(
                                separator != null
                                        ? separator.toString()
                                        : " "
                        )
                );
    }

    /**
     * Напишите функцию, принимающую массив строк и строку-перфикс и возвращающую кол-во строк массива с данным префиксом
     */
    int getStringsStartWithPrefix(String[] inputStrings, String prefix) {
        return inputStrings != null && prefix != null ?
                (int) Arrays
                        .stream(inputStrings)
                        .filter(s -> {
                            if (prefix.length() > s.length())
                                return false;
                            for (int i = 0; i < prefix.length(); i++) {
                                if (s.charAt(i) != prefix.charAt(i))
                                    return false;
                            }
                            return true;
                        })
                        .count() :
                0;
    }
}
