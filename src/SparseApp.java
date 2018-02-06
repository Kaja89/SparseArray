import java.util.AbstractList;
import java.util.Arrays;

class SparseList<T> extends AbstractList<T>{

	//AbstractList<T> sparse;
	Object sparse[][];
	
	public SparseList(){
		sparse = new Object [5][5];
	}
	
	
	@Override
	public T get(int index) {
		for(int i = 0; i<sparse.length; i++) {
			if(sparse[index][i] != null) {
				return (T) sparse[index][i];
			}
		}
		return null;
	}

	@Override
	public int size() {
		return sparse.length;
	}
	
	@Override
    public void add(int index, T element) {
		/*if(index >= 5) {
			int newSize = sparse.length*2;
			sparse = Arrays.copyOf(sparse, newSize);
		}*/
		for(int i = 0; i<sparse.length; i++) {
			
			if(sparse[index][i] == null) {
				sparse[index][i] = element;
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
		System.out.println("The list element 4: " + theList.get(4));
		System.out.println("The list element 3: " + theList.get(3));
	}

}
