public class node_23 {
    Pembeli data;
    NodeCustomer prev, next;
    
    public node_23(node_23 prev, Pembeli data, node_23 next){
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}