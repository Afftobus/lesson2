package kid.task.lesson2;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class Task2Test {
  @Test
  public void t1(){
    Task2 task2 = new Task2();
    assertThat(task2.getSumm()).isEqualTo(0);
  }

  @Test
  public void t2(){
    Task2 task2 = new Task2();
    task2.setFirst(2);
    assertThat(task2.getSumm()).isEqualTo(2);
  }

  @Test
  public void t3(){
    Task2 task2 = new Task2();
    task2.setSecond(2);
    assertThat(task2.getSumm()).isEqualTo(2);
  }

  @Test
  public void t4(){
    Task2 task2 = new Task2();
    task2.setFirst(2);
    task2.setSecond(2);
    assertThat(task2.getSumm()).isEqualTo(4);
  }

}
