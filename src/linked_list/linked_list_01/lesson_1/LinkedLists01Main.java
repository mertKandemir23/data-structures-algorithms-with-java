package linked_list.linked_list_01.lesson_1;

public class LinkedLists01Main {

  public static void main(String[] args) {
    SampleClass a = new SampleClass(); // new anahtar kelimesi kullanılmadan, Bellekte yer ayrılmaz.
    // Şu an bellekte bir düğüm oluşturuldu
    SampleClass b = new SampleClass();
    SampleClass c = new SampleClass();

    a.setNumber(1); // düğümlere değerler atanıyor.
    b.setNumber(2); // düğümlere değerler atanıyor.
    c.setNumber(3);   // düğümlere değerler atanıyor.

    /**
     * Şu an bellekte 3 adet düğüm var ancak bunlar birbirlerine bağlı değil ve birbirinden bağımsız.
     */
    /**
     * Şimdi bu nodeların birbirine bağlanması için, şunu yapmalıyız. Eğer biz bir objenin diğer bir objeyi işaret
     * etmesini istiyorsak bu objenin diğer objenin sınıfından bir nesneyi tutabilmesi gerekir.
     * Bunu da yapmak için ilgili sınıfa gidip, ilgili obje türünden tanımlama yapmamız gerekir.
     *
     * Şimdi a düğümünü b düğümüyle bağlayacağız.
     */

    a.setNext(b);
    b.setNext(c);
    c.setNext(null);

    /**
     * Şimdi bu 3 düğümde düğümler arası geçiş yapalım.
     */

    /**
     * Unutmamak gerekir ki Değişkenler, referans tipli nesnelerin bellekteki adreslerini tutarlar.
     * eğer next değişkenine bir sonraki objenin değişkenini atarsak bu sayede, javada nesneler arası geçiş yapabiliriz.
     * Ve bu nodeları bağlayabiliriz. Bu bir node a eriştiğimiz zaman diğer node'a erişip bunların içindeki değerleri
     * okuyabiliriz.
     *
     */

    SampleClass temp = a; //Düğümün başlangıç adresini verdik. Şimdi travers işlemine geçelim.

    while (temp != null) {
      System.out.println(temp.getNumber()); // Düğümün içindeki bilgiyi okuduk ve konsola yazdırdık.
      temp = temp.getNext(); // Düğümün bi sonraki düğüme geçmesini bu şekilde sağlıyoruz.
    }










  }

}
