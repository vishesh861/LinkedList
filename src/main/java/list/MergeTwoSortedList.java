package list;

public class MergeTwoSortedList {

    public Node mergeTwoLists(Node list1, Node list2) {

        Node list = new Node(0);
        Node ptr = list;

        if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        }

        while (list1 != null && list2 != null) {

            if (list1.data <= list2.data) {

                ptr.next = list1;
                ptr = ptr.next;
                list1 = list1.next;
            } else {

                ptr.next = list2;
                ptr = ptr.next;
                list2 = list2.next;
            }
        }

        if (list1 != null) {
            ptr.next = list1;
        }

        if (list2 != null) {
            ptr.next = list2;
        }


        return list.next;
    }
}
