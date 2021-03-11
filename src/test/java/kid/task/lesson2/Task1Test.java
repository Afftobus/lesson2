package kid.task.lesson2;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class Task1Test {
  @Test
  public void t1(){
    int[] a = new int[]{1,1,1,1,0,0,0};
    Task1 task1 = new Task1();
    assertThat(task1.processArray(a)).isEqualTo(4);
  }
  @Test
  public void t2(){
    int[] a = new int[]{};
    Task1 task1 = new Task1();
    assertThat(task1.processArray(a)).isEqualTo(0);
  }
  @Test
  public void t3(){
    int[] a = new int[]{1};
    Task1 task1 = new Task1();
    assertThat(task1.processArray(a)).isEqualTo(1);
  }
  @Test
  public void t4(){
    int[] a = new int[]{1,0,0,1,0,1,1};
    Task1 task1 = new Task1();
    assertThat(task1.processArray(a)).isEqualTo(4);
  }
  @Test
  public void t5(){
    int[] a = new int[]{1,1,1,1,1,1,1};
    Task1 task1 = new Task1();
    assertThat(task1.processArray(a)).isEqualTo(7);
  }
  @Test
  public void t6(){
    int[] a = new int[]{0,0,0,0,0};
    Task1 task1 = new Task1();
    assertThat(task1.processArray(a)).isEqualTo(0);
  }
}
