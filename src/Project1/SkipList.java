package Project1;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.Random;

//import SkipList.SkipNode;
import student.TestableRandom;

/**
 * The class containing methods for SkipList data structure.
 *
 * @author <your_name>
 * @version <version_no>
 */

public class SkipList<K extends Comparable<K>> implements Iterable<K> {

	private SkipNode<K> head;
	private Random rng;

	public SkipList() {
		this.rng = new TestableRandom();
	}
	
	/** returns a random level (using geometric distribution), minimum of 1 */
	// TODO Ideally, you should call this method inside other methods 
	// keep this method private. Since, we do not have any methods to call
	// this method at this time, we keep this publicly accessible and testable.  
	public int randomLevel() {
		int level = 1;
		while (rng.nextBoolean())
			level++;
		return level;
	}
	
	@Override
	public Iterator<K> iterator() {
		return new AllElementsIterator();
	}

	protected class AllElementsIterator implements Iterator<K> {
		private SkipNode<K> curr;

		public AllElementsIterator() {
			this.curr = head;
		}

		@Override
		public boolean hasNext() {
			return curr.skips[0] != null;
		}

		@Override
		public K next() {
			curr = curr.skips[0];
			return curr.ele;
		}
	}

	protected class SkipNode<T extends Comparable<T>> {
		protected int level;
		protected T ele;
		protected SkipNode<T>[] skips;

		public SkipNode(T ele, int level) {
			this.ele = ele;
			this.level = level;
			skips = this.buildGenArray(level);
		}
		
		/** Builds and returns an array of generics with a size, like a static method */
		@SuppressWarnings("unchecked")
		protected SkipNode<T>[] buildGenArray(int size) {
			return (SkipNode<T>[]) Array.newInstance(SkipNode.class, size);
		}

		public String toString() {
			return String.format("Node with depth %s, value %s", level, ele);
		}
	}
}
