package Project1;
/**
 
* This class holds a generic Key-value pair implementation with the compareTo
 * method from the Comparable class implemented as well. The purpose of this
 * class is the hold generic KVPair object which will be stored in the SkipList.
 * There is also a toString method for easily translating the objects contained
 * in the KVPair into a human readable string.
 * 
 * @author CS Staff (Patrick)
 * 
 * @version 2024.1
 * @param <K> Key to be used, must be a Comparable
 * @param <V> Value to be associated with the key
 */

public class KVPair<K extends Comparable<K>, V> implements Comparable<KVPair<K, V>> {

	private K key; // the object to be a key
	private V value; // the object to be the value paired to the key

	/**
	 * The constructor assigns value to the key and value fields from user specified
	 * objects.
	 * 
	 * @param strKey the key for the KVPair
	 * @param val    the value for the KVPair
	 */
	public KVPair(K key, V val) {
		this.key = key;
		this.value = val;
	}

	/**
	 * Returns the key of this KVPair
	 * 
	 * @return the key of the KVPair
	 */
	public K getKey() {
		return key;
	}

	/**
	 * Returns the value of this KVPair
	 * 
	 * @return the value that the KVPair holds
	 */
	public V getValue() {
		return value;
	}

	/**
	 * Implements the compareTo method from the Comparable interface. This will be
	 * used to easily compare two KVPair objects.
	 *
	 * @param pair2 the KVPair to compare to
	 * @return negative if the invoking KVPair is before pair2, zero if they are
	 *         equal in position and positive if the invoking string is after pair2,
	 *         all lexicoragraphically
	 */
	@Override
	public int compareTo(KVPair<K, V> pair2) {
		return this.key.compareTo(pair2.key);
	}
	public int compareTo(K oKey) {
		return this.key.compareTo(oKey);
	}

	/**
	 * Returns the KVPair in a human readable format.
	 * 
	 * @return A human readable string representing the KVPair object
	 */
	public String toString() {
		return String.format("(%s, %s)", this.key, this.value);
	}
}
