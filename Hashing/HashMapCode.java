import java.util.*;

public class HashMapCode {
    static class HashMap<K,V>{
        private class Node {
            K key;
            V value;

            public Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }

        private int n;//nodes
        private int N;
        private LinkedList<Node> buckets[];
        //N = bucket.length

        @SuppressWarnings("unchecked")
        public HashMap(){
            this.N = 4;
            this.buckets = new LinkedList[N];
            for(int i=0 ; i<N; i++){
                //creating 4 empty linked list in the array bucket
                this.bucket[i]= new LinkedLisy<>();
            }
        }

        private int HashFunction(K key){
            int bi = key.hashCode();
           return  Math.abs(bi) % N;
        }

        private int searchInll(K key, int bi){
            LinkedList<Node> ll = buckets[bi]; 
            for(int i =0; i<ll.size(); i++){
                if(ll.get(i).key == key){
                    return i;
                }
            }
            return -1;
        }

        public V remove(K key){
            int bi = HashFunction(key);
            int di = searchInll(key, bi);
            if(di == -1){
                return null;
            }else{
                Node pt = buckets[bi].remove(di);
                n--;
                return node.value;
            }
        }
        public ArrayList<K> keySet(){
            ArrayList<K> AR = new ArrayList<>();
            for(int i= 0; i<buckets.length ; i++){
                LinkedList<Node> ll = buckets[i];
                for(int j=0; j<ll.size(); j++){
                    Node node = ll.get(j);
                    AR.add(node.key);
                }
            }
            return AR;
        }
        public boolean isEmpty(){
            return n ==0 ;
        }

        private void rehash(){
            LinkedList<Node> oldBucket[] = buckets;
            buckets = new LinkedList[N*2];

            for(int i =0; i< buckets.length; i++){
                buckets[i]= new LinkedList<>();
            }

            for(int i= 0; i<oldBucket.length; i++){
                LinkedList<Node> ll = oldbucket[i];
                for(int j =0 ;j< ll.size();j++ ){
                    Node node = ll.get(j);
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value){
            int bi = HashFunction(key);
            int di = searchInll(key, bi);
        if(di == -1){
            buckets[bi].add(new Node(key, value));
            n++;
        }else{
            Node data = buckets[bi].get(di);
            data.value = value;
        }

        double lambda = (double)n/N;
        if(lambda > 2.0){
            //rehashing 
            rehash();
        }

        public boolean containsKey(K key){
            int bi = HashFunction(key);
            int di = searchInll(key, bi);
            if(di ==-1){
                return false;
            }else{
                return true;
            }
        }

        public V get(K key){
            int bi = HashFunction(key);
            int di = searchInll(key, bi);
            if(di == -1){
                System.out.println("Doesn't exist");
                return null;
            }else{
                Node data = buckets[bi].get(di);
                return data.value;
            }
        }
    }
  } 

    public static void main(String args[]){
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 190);
        map.put("USA", 50);
        map.put("China", 200 );
    

    ArraysList<String> Keys = map.keySet();
    for(int i =0; i<Keys.size(); i++){
        System.out.println(Keys.get(i)+ " "+ map.get(Keys.get(i)));
    }
        
    }

}
