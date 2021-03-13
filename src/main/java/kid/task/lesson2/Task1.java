package kid.task.lesson2;

// добавь в класс метод processArray, который будет принимать
// массив, в котором есть только единицы и нули
// и возвращает максимально длинную последовательность единиц

public class Task1 {
  public int processArray(int[] array) {
    int maxLength = 0;
    int curLength = 0;
    for (int i = 0; i < array.length; i++) {
      if (array[i] == 1) {
        curLength++;
      }

      if (curLength > maxLength){
        maxLength = curLength;
      }

    }
    return maxLength;
  }
}
