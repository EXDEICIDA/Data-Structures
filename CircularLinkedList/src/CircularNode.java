public class CircularNode
{
        private Object data;
        private CircularNode next;
        private CircularNode prev;

        public CircularNode(Object data)
        {
            this.data = data;
            this.next = this; // Initially points to itself
            this.prev = this; // Initially points to itself
        }

        public Object getData() {
            return data;
        }

        public void setData(Object data) {
            this.data = data;
        }

        public CircularNode getNext() {
            return next;
        }

        public void setNext(CircularNode next) {
            this.next = next;
        }

        public CircularNode getPrev() {
            return prev;
        }

        public void setPrev(CircularNode prev) {
            this.prev = prev;
        }
}
