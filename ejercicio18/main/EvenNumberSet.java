package ar.edu.unlp.info.oo1.ejercicio18;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class EvenNumberSet implements Set<Integer> {
	private Set<Integer> internalSet;
	
	public EvenNumberSet() {
		internalSet = new HashSet<>();		
	}
	
	@Override
	public boolean add(Integer number) {
        if (number != null && number % 2 == 0) {
            return internalSet.add(number);
        }
        return false; // no se agrega si es impar o null
    }

    // El resto de los métodos se delegan al internalSet
    @Override
    public int size() { return internalSet.size(); }

    @Override
    public boolean isEmpty() { return internalSet.isEmpty(); }

    @Override
    public boolean contains(Object o) { return internalSet.contains(o); }

    @Override
    public Iterator<Integer> iterator() { return internalSet.iterator(); }

    @Override
    public Object[] toArray() { return internalSet.toArray(); }

    @Override
    public <T> T[] toArray(T[] a) { return internalSet.toArray(a); }

    @Override
    public boolean remove(Object o) { return internalSet.remove(o); }

    @Override
    public boolean containsAll(Collection<?> c) { return internalSet.containsAll(c); }

    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        boolean modified = false;
        for (Integer n : c) {
            if (n != null && n % 2 == 0) {
                modified |= internalSet.add(n);
            }
        }
        return modified;
    }

    @Override
    public boolean retainAll(Collection<?> c) { return internalSet.retainAll(c); }

    @Override
    public boolean removeAll(Collection<?> c) { return internalSet.removeAll(c); }

    @Override
    public void clear() { internalSet.clear(); }

    @Override
    public String toString() { return internalSet.toString(); }

}