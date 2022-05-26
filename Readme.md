# Задача 1. Генератор словаря

Условие задачи осталось непонятным. Также не описано, в каком виде должен быть результат программы. Сообщения с вопросами в телеграмм, почему-то, не доставляются. Поэтому используем это условие из описания задания: 
>"Программа должна разбить текст на слова и отсортировать их в естесственном порядке."

## Отличительные черты функционального стиля в данном коде:
* использование неизменяемых переменных и объектов:
```
public static final String START_TEXT = "Segnibus et ignavis nihil non difficile industriis atque impigris nihil non facile est";
    public static final Function<String[], List<String>> DICTIONARY = Main::convertTextToDictionary;
```

* использование функции высшего порядка:

```
public static void main(String[] args) {
        DICTIONARY.apply(START_TEXT.split(" "));
    }

    public static List<String> convertTextToDictionary(String[] arrayWords) {
        return Arrays.stream(arrayWords)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }
```

* функция ```convertTextToDictionary(String[] arrayWords)``` является чистой, т.к. она детерминирована и не использует побочных эффектов