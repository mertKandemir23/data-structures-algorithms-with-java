package linked_list.linked_list_01.lesson_3;


public class LinkedList03Main {

  public static void main(String[] args) {
  NodeArray nodeArray = new NodeArray(); // Heap'te yeni bir NodeArray oluşturuldu.
  nodeArray.addNodeToArray("AHMET");
  nodeArray.addNodeToArray("BURHAN");
  nodeArray.addNodeToArray("CENGİZ");
  nodeArray.addNodeToArray("DİYAR");
  nodeArray.addNewHeadToArray("BERK");
  nodeArray.addNewHeadToArray("SALİM");
  nodeArray.addNewHeadToArray("VOLKAN");
  nodeArray.addNewHeadToArray("ERGÜN");
  nodeArray.addNewTailToArray("SON GELEN");
  nodeArray.print();
  }

}
