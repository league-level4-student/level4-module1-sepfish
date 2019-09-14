package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	T[] arr;

	public ArrayList() {
		arr = (T[])new Object[0];
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		if (arr.length != 0) {
			return arr[loc];
		} else {
			return null;
		}	
	}
	
	public void add(T val) {
		T[] arr1 = (T[]) new Object[arr.length + 1];
		for (int i = 0; i < arr.length; i++) {
			arr1[i] = arr[i];
		}
		arr1[arr.length] = val;
		arr = arr1;
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		T[] arr1 = (T[]) new Object[arr.length + 1];
		for (int i = 0; i < arr.length; i++) {
			if (i < loc) {
				arr1[i] = arr[i];
			} else if (i == loc) {
				arr1[i] = val;
			} else {
				arr1[i] = arr[i - 1];
			}
		}
		arr1[arr.length] = arr[arr.length - 1]; 
		arr = arr1;
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		arr[loc] = val;
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		T[] arr1 = (T[]) new Object[arr.length - 1];
		for (int i = 0; i < arr.length-1; i++) {
			if (i < loc) {
				arr1[i] = arr[i];
			} else if (i >= loc) {
				arr1[i] = arr[i + 1];
			}
		}
		arr = arr1;
	}
	
	public int size() {
		return arr.length;
	}
	
	public boolean contains(T val) {
		boolean there = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(val)) {
				there = true;
			}
		}
		return there;
	}
}