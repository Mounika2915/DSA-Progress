class MyHashMap {
    class Node{
        int key ; 
        int value ;
        Node  next ; 
        Node(int key , int value ) {
            this.key = key ; 
            this.value = value ; 
        }
       
    }
    private static final int DEFAULT_CAPACITY = 16 ; 
    private static final float LOAD_FACTOR = 0.76f ; 

    Node[] buckets ; 
    int size ; 

    public MyHashMap() {
        buckets = new Node[DEFAULT_CAPACITY] ; 
        size = 0 ; 
    }

    private int hash(int key){
        return Math.abs(key) % buckets.length ; 
    }

    private Node find(Node head  , int key){
        Node curr = head ; Node prev = null ; 
        while(curr != null && curr.key != key){
            prev = curr ; 
            curr = curr.next ; 
        }
        return prev ; 
    }
    
    public void put(int key, int value) {
        int hashKey = hash(key) ; 

        if(buckets[hashKey] == null){
            buckets[hashKey] = new Node(-1 , -1) ;
        }

        Node prev = find(buckets[hashKey] , key) ; 

        if(prev.next != null){
            prev.next.value = value ; 
        }else{
            prev.next = new Node(key , value);
            size++;
        }

        if((float) size == (DEFAULT_CAPACITY * LOAD_FACTOR)){
            resize() ; 
        }

    }
    
    public int get(int key) {
        int hashKey = hash(key) ; 

        if(buckets[hashKey] == null){
            return -1; 
        }

        Node prev = find(buckets[hashKey] , key);

        if(prev.next == null){
            return -1 ; 
        }else{
            return prev.next.value ; 
        }
    }
    
    public void remove(int key) {
        int hashKey = hash(key) ; 
        
        if(buckets[hashKey] == null){
            return ; 
        }

        Node prev = find(buckets[hashKey] , key) ; 

        if(prev.next == null){
            return ; 
        }else {
            prev.next = prev.next.next ; 
            size--;
        }
    }
    
    private void resize(){
        Node[] oldBuckets = buckets ; 
        buckets = new Node[oldBuckets.length * 2] ;
        size = 0 ;  

        for(Node head : oldBuckets){
            if(head == null) continue ; 
            Node curr = head ; 
            while(curr != null){
                put(curr.key , curr.value) ; 
                curr = curr.next ; 
            }
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */