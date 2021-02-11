class Solution {
    HashMap<Node, Node> map = new HashMap<>();
    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        else if (map.containsKey(head)) {
            return map.get(head);
        } else {
            Node copy = new Node(head.val);
            map.put(head, copy);
            copy.next = copyRandomList(head.next);
            copy.random = copyRandomList(head.random);
            return copy;
        }
    }
}
