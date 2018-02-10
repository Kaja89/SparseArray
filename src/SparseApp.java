import java.util.AbstractList;

class SparseList<T> extends AbstractList<T>{

	Object sparse[][];
	
	public SparseList(){
		sparse = new Object [1000][2];
	}
	

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) {
		if((T) sparse[index][1] == null) {
			System.out.println("This index is empty!");
			return null;
		} else {
			return (T) sparse[index][1];
		}
	}

	@Override
	public int size() {
		return sparse.length;
	}
	
	@Override
    public void add(int index, T element) {
		
		for(int i = 0; i<sparse.length; i++) {
			
			if(sparse[i][0] == null) {
				sparse[i][0] = index;
				sparse[i][1] = element;
				break;
			}
		}
    }
	
}
public class SparseApp {

	public static void main(String[] args) {
		SparseList<String> theList = new SparseList<String>();
		theList.add(3, "Monika");
		theList.add(4, "Adam");
		
		System.out.println("The list size: " + theList.size());
		System.out.println("The list element 2: " + theList.get(2));
		System.out.println("The list element 3: " + theList.get(3));
		System.out.println("The list element 4: " + theList.get(4));
		
	}

}
