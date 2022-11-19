package linked_list.linked_list_01.lesson_2;

public class NodeArray {

  Node head = null;
  Node tail = null;
  //Tek yönlü doğrusal bağlı listelerde head objesini kaybedersek bir daha hiçbir objeye ulaşamayız.
  //Tail listedeki son düğümdür(obje)
  void addNode (int data) {
    Node node  = new Node(); // Bir node oluştur
    node.setNext(null); //Bir sonraki node bilinmiyor
    node.setData(data); // Datası parametreden gelen data
    if (head == null) { //Eğer head nullsa bu demektir ki daha önce hiç liste oluşmamış
      head = node;  // Yeni oluşturdugun node'u head'e ata
      tail = node; // Head nullsa o halde ilk düğüm aynı zamanda son düğümdür tail'a da node'u ata.
      System.out.println("Liste oluşturuldu.");
    } else { //Eğer liste oluşmuşssa ve head null değilse
      tail.setNext(node); //Bir önceki tail objesi bu  Yeni  objeyi işaret etmelidir.
      tail = node; // Yeni tail objesi aynı zamanda bu objedir.
      System.out.println("Listenin sonuna yeni bir eleman eklendi.");
    }
  }

  void print() {
    if (head == null) { //Head nullsa liste yapısı hiç oluşmamış demektir.
      System.out.println("Liste yapısı boş");
    } else {
      Node temp = head; //Tüm düğümleri gezmeye head objesinden başlanır.
      while(temp != null) {
        System.out.println(temp.getData()); // İlgili düğümün datasını ekrana bas
        temp = temp.getNext(); // İlgili düğümden bir sonraki düğümün adresini al.
      }
    }
  }


}
