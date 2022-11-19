package linked_list.linked_list_01.lesson_1;

public class SampleClass {

  private int number;
  private SampleClass next; //Bir objenin diğer obje türünden nesneyi işaret edebilmesi için bu tanımlamayı yaptık.

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public SampleClass getNext() {
    return next;
  }

  public void setNext(SampleClass next) {
    this.next = next;
  }
}
