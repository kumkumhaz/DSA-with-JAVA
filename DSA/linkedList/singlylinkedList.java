// class LL {
//     Node head;

//     class Node {
//         String data;
//         Node next;

//         Node(String data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public void addFirst(String data) {
//         Node newNode = new Node(data);
//         if (head == null) {
//             head = newNode;
//             return;
//         }
//         newNode.next = head;
//         head = newNode;
//     }

//    public void addLast(String data){
//     Node newNode = new Node(data);
//     if(head == null){
//        head = newNode;
//        return; 
//     }
//      Node temp = this.head;
//      while(temp.next != null){
//         temp = temp.next;
//      }
//      temp.next = newNode;
//    }

//     public void printList() {
//         if (head == null) {
//             System.out.println("list is empty");
//             return;
//         }
//         Node temp = head;
//         while (temp != null) {
//             System.out.println(temp.data + "->");
//             temp = temp.next;
//         }
//     }

//     public static void main(String args[]) {
//         LL list = new LL();
//     }
// }