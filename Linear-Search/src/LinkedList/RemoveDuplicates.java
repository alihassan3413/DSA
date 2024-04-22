package LinkedList;

    class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }

        // Method to add new nodes to the end of the list
        void add(int data) {
            ListNode newNode = new ListNode(data);
            ListNode current = this;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }

        // Method to display the list
        void display() {
            ListNode current = this;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }

        // Method to remove duplicates
        void removeDuplicates() {
            ListNode current = this;
            while (current != null) {
                ListNode temp = current;
                while (temp.next != null) {
                    if (temp.next.data == current.data) {
                        temp.next = temp.next.next;
                    } else {
                        temp = temp.next;
                    }
                }
                current = current.next;
            }
        }
    }


// Example usage:



