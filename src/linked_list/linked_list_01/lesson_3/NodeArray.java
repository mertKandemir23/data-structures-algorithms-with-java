package linked_list.linked_list_01.lesson_3;

public class NodeArray {

  Node head = null;
  Node tail = null;

  void addNodeToArray(String name) {
    Node node = new Node(); // Heapte yeni bir node objesi oluşturuldu.
    node.name = name; // Yeni oluşturulan node'un name field'i name olarak setleniyor.
    node.nextNode = null; // Yeni node' şu an herhangi bir node'u işaret etmiyor.
    if (head == null) { // NodeArray objesinin  head alanı bellekte hiçbir şeyi işaret etmiyorsa  içeri gir.
      head = node; // Liste oluşturmak için head değişkeni artık heapte node u işaret ediyor.
      tail = node; // Daha önce hiç obje oluşmadığı için, tail'de yeni node objesini işaret ediyor.
      //Burada node objesinin bir sonraki alan olarak null'ı işaret ettiğini unutmamak gerek.
    } else { // Eğer head objesi daha önceden varsa
      tail.nextNode = node; // kuyruktaki son obje bu yeni objeyi işaret etmeli.
      tail = node; // Artık son yeni obje yeni gelen obje.
      /**
       * Trick şu, Kuyruktaki son objeyi yeni gelen obje olarak atamadan önce, kuyruktaki son obje null'ı işaret
       * ediyordu. Artık null'ı işaret etmemeli çünkü, kendisi artık son obje değil. Önce bu set edilmeli. Daha sonra
       * yeni gelen obje son düğüm olarak atanmalı.
       */
    }
  }

  void print(){
    Node tempNode = head; // Nodelar arası geçebilmek için geçici bir node objesi oluşturuldu
    while (tempNode != null){ // Eğer geçici node null değilse
      System.out.println(tempNode.name); // node'un adını konsola bas.
      tempNode = tempNode.nextNode; // geçici  node'a, geçici node'un işaret ettiği bir sonraki objeyi ata.
    }
  }

  void  addNewHeadToArray(String name) {
    Node node = new Node(); // Yeni bir node objesi oluşturuldu.
    node.name = name; // Node'un adına parametre olarak gelen yeni data atandı.
    if (head == null) { // Eğer head objesi boşsa
      head = node; // Head artık bu yeni nodedur
      tail = node; // Head objesi yoksa ortada listede yok demektir. Bu yüzden ilk ve son obje kendisidir.
    } else { // Eğer bir head objesi varsa
      node.nextNode = head;  // Bu node objesi elimizde bulunan head objesini işaret etmeli. Ancak kendisini hiçbir
      // obje işaret etmemelidir.
      head = node; // artık head objesi yeni gelen objemiz.
    }
  }
  void addNewTailToArray(String name) {
    Node node = new Node(); // Heapte yeni bir node objesi oluştur.
    node.name = name; // Yeni node'un name alanını parametre olarak gelen node alanını setle.
    node.nextNode = null; // Son bir kuyruk objesi eklediğimiz için, bu obje null'a işaret etmeli.
    if (head == null) { // Daha önce hiç liste oluşmamışsa(Oluşsaydı head objesi olurdu.)
      head = node; // Head değişkeni artık node objesni işaret etmeli.
      tail = node; // tail değişkeni artık node objesini işaret etmeli.
    } else{ //Eğer daha önceden  head objesi varsa yani liste yapısı oluşmuşsa
      tail.nextNode = node; // son kuyruk objesi artık yeni oluşturduğumuz node'u işaret etmeli null'ı işaret etmemeli.
      tail = node;
    }
  }
}
