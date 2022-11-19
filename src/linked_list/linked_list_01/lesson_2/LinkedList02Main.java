package linked_list.linked_list_01.lesson_2;

public class LinkedList02Main {
  /**
   * Bağlı listeler dörde ayrılır.
   * 1) Tek yönlü doğrusal bağlı liste
   * 2) Çift yönlü doğrusal bağlı liste
   * 3) Tek yönlü dairesel bağlı liste
   * 4) Çift yönlü dairesel bağlı liste.
   */

  /**
   * Tek yönlü doğrusl bağlı listenin yapısı
   * (HEAD) -> (B) ->  (C) -> (D) -> null
   * En önemli düğüm head düğümüdür.
   * Eğer bir düğüm null'ı gösteriyorsa bu son düğümdür.
   * Son düğümede tail denir.
   */

  public static void main(String[] args) {
    Node a = new Node();// Yeni node oluşturuldu.
    Node b = new Node();// Yeni node oluşturuldu.
    Node c = new Node();// Yeni node oluşturuldu.
    Node d = new Node();// Yeni node oluşturuldu.
    a.setData(11); //Node'un içeriği ayarlandı.
    b.setData(22); //Node'un içeriği ayarlandı.
    c.setData(33); //Node'un içeriği ayarlandı.
    d.setData(44); //Node'un içeriği ayarlandı.

    a.setNext(b); // a b'yi işaret ediyor
    b.setNext(c); // b c'yi işaret ediyor
    c.setNext(d); // c d'yi işaret ediyor
    d.setNext(null); // d null işaret ediyor demek ki bu tail objesi.

    NodeArray nodeArray = new NodeArray();
    nodeArray.addNode(1);
    nodeArray.addNode(2);
    nodeArray.addNode(3);
    nodeArray.addNode(4);
    nodeArray.addNode(5);
    nodeArray.addNode(6);
    nodeArray.addNode(7);

    nodeArray.print();



  }

}
