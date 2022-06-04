public class DoubleLinkedList {
   node_23 head;
    int size;
    
    public DoubleLinkedList(){
        head = null;
        size = 0;
    }
    
    public boolean isEmpty(){
        return head == null;
    }

    public int getsize(){
        return size;
    }

    public void add(Pembeli input){
        node_23 penerima = new node_23 (null, input, null);
        if(isEmpty()){
            head = penerima;
        }else{
            node_23 tmp = head;
            while (tmp.next != null){
                tmp = tmp.next;
            }
            tmp.next = penerima;
            penerima.prev = tmp;
        }
        size++;
        System.out.println(input.noUrut + " Telah Ditambahkan ke Antrian");
    }
    
    public void remove(){
        if (isEmpty()){
            System.out.println("Antrian Kosong");
        }else{
            node_23 tmp = head;
            if (head.next == null){
                head = null;
            }else{
                head.next.prev = null;
                head = head.next;
            }
            size--;
            System.out.println(tmp.data.namacus + " Sedang melakukan pemesanan");
        }System.out.println("Antrian yang tersisa " + getsize());
    }
    
    public void print(){
        if(isEmpty()){
            System.out.println("Antrian Kosong");
        }else{
            node_23 tmp = head;
            System.out.println("++++++++++++++++++++++++++++++");
            System.out.println("Daftar Antrian Resto Royal Delish");
            System.out.println("++++++++++++++++++++++++++++++");
            System.out.println("|No.  " + " |" + "Nama   |" + " |" 
                    + "NoHP" + " |");
            while(tmp != null){
                System.out.println("|"+ tmp.data.noUrut + "   |" 
                        + tmp.data.namacus + " |" + tmp.data.noHp
                + "   |");
                tmp = tmp.next;
            }
        }System.out.println("Antrian yang tersisa " + getsize());
    }
}