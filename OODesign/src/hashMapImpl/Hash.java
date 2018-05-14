package hashMapImpl;


import java.util.LinkedList;

class Node<K,V>{
	K key;
	V value;
	
	Node(K key ,V value){
		this.key = key;
		this.value = value;
	}
}

public class Hash<K,V> {
	
	private final int MAX_SIZE = 10;
	LinkedList<Node>[] items;
	
	@SuppressWarnings("unchecked")
	Hash(){
		items =  (LinkedList<Node>[ ])  new LinkedList[MAX_SIZE];
	}
	
	public int hashCode(K key){
		return key.toString().length() % items.length;
	}
	
	public void put(K key , V value){
		int x = hashCode(key);
		if(items[x] == null){
			items[x] = new LinkedList<Node>();
		}
		
		items[x].add(new Node(key,value));
	}
	
	public V findMatch(K key){
		int x = hashCode(key);
		if(items[x] == null){
			return null;
		}
		Node head = items[x].getFirst();
		while(head != null){
			if(head.key == key){
				return (V) head.value;
			}
		}
		return null;
	}
	
	public V get(K key){
		return findMatch(key);
	}
}
